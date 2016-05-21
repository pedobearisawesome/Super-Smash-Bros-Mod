package com.aggro.asma.characters;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.aggro.asma.Main;

public class ItemRob extends Item{
	
	public ItemRob()
	{
	this.setUnlocalizedName("characterrob"); 
	this.setCreativeTab(CreativeTabs.tabMisc);
	this.setTextureName(Main.MODID + ":" + "CharRob"); 
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (!par2World.isRemote)
		{
			Main.chara = "rob";
			
		}
	return par1ItemStack;
	
	}
}
