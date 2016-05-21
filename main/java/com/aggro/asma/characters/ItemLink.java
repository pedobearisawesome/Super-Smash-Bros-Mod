package com.aggro.asma.characters;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.aggro.asma.Main;

public class ItemLink extends Item{
	
	public ItemLink()
	{
	this.setUnlocalizedName("characterlink"); 
	this.setCreativeTab(CreativeTabs.tabMisc); 
	this.setTextureName(Main.MODID + ":" + "CharLink"); 
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (!par2World.isRemote)
		{
			Main.chara = "link";
			
		}
	return par1ItemStack;
	
	}
}
