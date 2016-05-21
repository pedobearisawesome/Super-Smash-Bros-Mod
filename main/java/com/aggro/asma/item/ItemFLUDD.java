package com.aggro.asma.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.aggro.asma.Main;
import com.aggro.asma.entity.EntityDisc;

public class ItemFLUDD extends Item {
	public String mode = "water";
	public int dir = 1;
	public static double fuel = 160;
	public ItemFLUDD()
	{
	this.setUnlocalizedName("fludd"); 
	this.setCreativeTab(CreativeTabs.tabCombat); 
	this.setTextureName(Main.MODID + ":" + "FLUDD_" + this.mode + "_" + this.dir); 
	}

	public void FuelProcess(EntityPlayer player, ItemStack stack, World world){
		if (this.fuel < 160){
			this.fuel = this.fuel + 0.5;
		}
		
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer entityplayer)
	{
		if (!par2World.isRemote)
		{
			if (entityplayer.isSneaking()){
				if (this.dir == 3){
					this.dir = 1;
				}else{
					this.dir++;
				}
			}else{
			if (this.fuel > 0){
			if (this.mode == "water"){
			if (this.dir == 3){
			entityplayer.motionY = 1.5;
			this.fuel = this.fuel - 2;
			}else{
				if (this.dir == 2){
					this.fuel = this.fuel - 2;
					par2World.spawnParticle("splash", entityplayer.posX, entityplayer.posY + 0.5D, entityplayer.posZ,(double)(-MathHelper.sin(entityplayer.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(entityplayer.rotationPitch / 180.0F * (float)Math.PI) * 0.4F), (double)(-MathHelper.sin((entityplayer.rotationPitch + 0.0F) / 180.0F * (float)Math.PI) * 0.4F),(double)(MathHelper.cos(entityplayer.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(entityplayer.rotationPitch / 180.0F * (float)Math.PI) * 0.4F));
					//par2World.spawnEntityInWorld(new EntityStuSwoopin(par2World, entityplayer));
				}else{
					if (this.dir == 1){
						this.fuel = this.fuel - 3;	
						par2World.spawnParticle("splash", entityplayer.posX, entityplayer.posY + 0.5D, entityplayer.posZ,(double)(-MathHelper.sin(entityplayer.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(entityplayer.rotationPitch / 180.0F * (float)Math.PI) * 0.4F), (double)(-MathHelper.sin((entityplayer.rotationPitch + 0.0F) / 180.0F * (float)Math.PI) * 0.4F),(double)(MathHelper.cos(entityplayer.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(entityplayer.rotationPitch / 180.0F * (float)Math.PI) * 0.4F));
						entityplayer.setInWeb();
					}else{
						
					}
				}
			}
			
			}
			
			if (this.mode == "hot"){
				if (this.dir == 3){
					entityplayer.motionY = 3;
					this.fuel = this.fuel - 5;
				}else{
					if (this.dir == 2){
						
					}else{
						if (this.dir == 1){
							
						}else{
							
						}
					}
				}
				//par2World.spawnEntityInWorld(new EntityStuSwoopin(par2World, entityplayer));
				}
			
			if (this.mode == "graffiti"){
				if (this.dir == 3){
					entityplayer.motionY = 1.5;
					this.fuel = this.fuel - 2;
				}else{
					if (this.dir == 2){
						
					}else{
						if (this.dir == 1){
							
						}else{
							
						}
					}
				}
				//par2World.spawnEntityInWorld(new EntityStuSwoopin(par2World, entityplayer));
				}
			}
			}
		}
	return par1ItemStack;
	
	}
	public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
     
		return EnumAction.bow;
    }
	
	public boolean onLeftClickEntity(ItemStack itemstack, EntityPlayer player, Entity entity){
		
		
		
		entity.extinguish();
		return true;
	}
}
