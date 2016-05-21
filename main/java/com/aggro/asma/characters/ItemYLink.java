package com.aggro.asma.characters;

import com.aggro.asma.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.world.World;

public class ItemYLink extends Item {

	public ItemYLink()
	{
	this.setUnlocalizedName("characterylink"); 
	this.setCreativeTab(CreativeTabs.tabMisc); 
	this.setTextureName(Main.MODID + ":" + "CharYLink"); 
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player)
	{
		if (!par2World.isRemote)
		{
			Main.chara = "ylink";
			player.height = 1.4f;
		}
	return par1ItemStack;
	
	}
}
