package com.aggro.asma.item;

import com.aggro.asma.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class SwordSmash extends ItemSword{

	public SwordSmash(Item.ToolMaterial mat){
		super(mat);
		this.setUnlocalizedName("swordSmash");
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setNoRepair();
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
			this.itemIcon = reg.registerIcon(Main.MODID + ":" + "itemBeamSword");
	}
	public boolean hasEffect(ItemStack par1ItemStack, int pass)
	{
	
	return true;
	}
}
