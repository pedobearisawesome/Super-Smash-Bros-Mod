package com.aggro.asma.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.aggro.asma.Main;

public class ItemStockP extends Item
{
	
	public String mode = "standby";
	public static int res = 16;
	public ItemStockP()
	{
	this.setUnlocalizedName("stockp"); 
	this.setCreativeTab(CreativeTabs.tabCombat);
	this.setTextureName(Main.MODID + ":" + "centerpiece"); 
	}

	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (!par2World.isRemote)
		{
			this.mode = "out";
			
			
		
		 
		}
	return par1ItemStack;
	
	}
	public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
     
		return EnumAction.bow;
    }
	
	
	public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 72000;
    }
	
}
