package com.aggro.asma.entity;

import java.util.List;

import com.aggro.asma.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.command.ICommandSender;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3;
import net.minecraft.util.WeightedRandom;
import net.minecraft.util.WeightedRandomFishable;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class EntityDisc extends EntityThrowable{
	
	
	public EntityDisc(World par1World, double par2, double par4, double par6)
	{
	super(par1World, par2, par4, par6);
	}
	public EntityDisc(World par1World, EntityLivingBase par2EntityLivingBase)
	{
	super(par1World, par2EntityLivingBase);
	}
	public EntityDisc(World par1World)
	{
	super(par1World);
	
	
	}
	@Override
	protected void onImpact(MovingObjectPosition mop)
	{
		
		
		if(mop.typeOfHit == MovingObjectType.ENTITY)
		{
			
			
		}
		
		if(mop.typeOfHit == MovingObjectType.BLOCK)
		{
		
		switch(mop.sideHit)
		{
		case 0: //BOTTOM
		mop.blockY--;
		break;
		case 1: //TOP
		mop.blockY++;
		break;
		case 2: //EAST
		mop.blockZ--;
		break;
		case 3: //WEST
		mop.blockZ++;
		break;
		case 4: //NORTH
		mop.blockX--;
		break;
		case 5: //SOUTH
		mop.blockX++;
		break;
		}
		
		
		
		}
		
		if (!this.worldObj.isRemote)
		{
			
		this.setDead();
		}
	}
	
}
