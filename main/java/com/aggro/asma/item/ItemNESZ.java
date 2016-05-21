package com.aggro.asma.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.aggro.asma.Main;

public class ItemNESZ extends Item
{
	
	public String mode = "standby";
	public static int res = 16;
	public ItemNESZ()
	{
	this.setUnlocalizedName("zapper"); 
	this.setCreativeTab(CreativeTabs.tabCombat); 
	this.setTextureName(Main.MODID + ":" + "NESZapper"); 
	}

	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (!par2World.isRemote)
		{
			this.mode = "out";
			
			
		
		 par1ItemStack.damageItem(1, par3EntityPlayer);
		}
	return par1ItemStack;
	
	}
	public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
     
		return EnumAction.bow;
    }
	
	public boolean onLeftClickEntity(ItemStack itemstack, EntityPlayer player, Entity entity){
		entity.setFire(1);
		entity.motionY = 0.5;
		entity.motionX = 0;
		entity.motionZ = 0;
		entity.performHurtAnimation();
		
		player.worldObj.newExplosion(player, entity.posX, entity.posY, entity.posZ, 0.0F, false, false);
		return true;
		
		
	}
	public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 72000;
    }
	
}
