package com.DwainEdwards.Blocks;

import java.util.ArrayList;
import java.util.Random;

import com.DwainEdwards.TESR.RenderssbATM;
import com.aggro.asma.Main;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ssbATM extends BlockContainer {

	private static final String name = "Bank";

	private final Random rand = new Random();

	public ssbATM(Material material) {
		super(material.wood);
		this.setResistance(5.0F);
		this.setHardness(3.5F);

	}

	public int getRenderType() {
		return -1;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,
			EntityPlayer player, int side, float lx, float ly, float lz) {
		if (world.isRemote)
			return true;
		TileEntity te = world.getTileEntity(x, y, z);
		if (te != null && te instanceof TileEntityssbATM) {
			player.openGui(Main.instance, 0, world, x, y, z);
			return true;
		}
		return false;
	}

	@Override
	public void breakBlock(World world, int x, int y, int z, Block block,
			int par6) {
		if (world.isRemote)
			return;

		ArrayList drops = new ArrayList();

		TileEntity teRaw = world.getTileEntity(x, y, z);

		if (teRaw != null && teRaw instanceof TileEntityssbATM) {
			TileEntityssbATM te = (TileEntityssbATM) teRaw;

			for (int i = 0; i < te.getSizeInventory(); i++) {
				ItemStack stack = te.getStackInSlot(i);

				if (stack != null)
					drops.add(stack.copy());
			}
		}

		for (int i = 0; i < drops.size(); i++) {
			EntityItem item = new EntityItem(world, x + 0.5, y + 0.5, z + 0.5);
			item.setVelocity((rand.nextDouble() - 0.5) * 0.25,
					rand.nextDouble() * 0.5 * 0.25,
					(rand.nextDouble() - 0.5) * 0.25);
			world.spawnEntityInWorld(item);
		}
	}

	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z,
			EntityLivingBase entity, ItemStack stack) {
		if (entity == null) {
			return;
		}

		TileEntityssbATM tile = (TileEntityssbATM) world.getTileEntity(x, y, z);
		tile.direction = MathHelper
				.floor_double((double) (entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
	}

	public void registerIcons(IIconRegister icon) {
		this.blockIcon = icon
				.registerIcon(Main.MODID + ":blocks/ssbATMM");
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityssbATM();
	}

}
