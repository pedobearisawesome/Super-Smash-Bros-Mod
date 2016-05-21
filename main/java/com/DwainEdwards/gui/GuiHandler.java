package com.DwainEdwards.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.DwainEdwards.Blocks.TileEntityssbATM;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);

		if (te instanceof TileEntityssbATM) {
			if (ID == 0) // Gui ID for storage block, will add later
			{
				return new ContainerssbATM((TileEntityssbATM) te, player);
			}
		}
		return null;
	}

	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);

		if (te instanceof TileEntityssbATM) {
			if (ID == 0) // Gui ID for storage block, will add later
			{
				return new GuissbATM((TileEntityssbATM) te, player);
			}
		}
		return null;
	}
}
