package com.aggro.asma.item;

import java.util.Random;

import com.aggro.asma.Main;
import com.aggro.asma.entity.EntityYoyo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;

public class ItemYoyo extends Item
{
	
	public String mode = "standby";
	public static int res = 16;
	public ItemYoyo()
	{
	this.setUnlocalizedName("yoyo");
	this.setCreativeTab(CreativeTabs.tabCombat); 
	this.setTextureName(Main.MODID + ":" + "yoyo_" + mode + res);
	}

	/**
	 * Render Pass sensitive version of hasEffect()
	 */
	public boolean hasEffect(ItemStack par1ItemStack, int pass)
	{
	//This means it will look "special" in the inventory
	return true;
	}
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (!par2World.isRemote)
		{
			this.mode = "out";
		par2World.spawnEntityInWorld(new EntityYoyo(par2World, par3EntityPlayer));
		
		 par1ItemStack.damageItem(1, par3EntityPlayer);
		}
	return par1ItemStack;
	
	}
	
}