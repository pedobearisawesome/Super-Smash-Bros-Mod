package com.aggro.asma.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;

public class EntityYoyo extends EntityThrowable{

	public EntityYoyo(World par1World, double par2, double par4, double par6)
	{
	super(par1World, par2, par4, par6);
	}
	public EntityYoyo(World par1World, EntityLivingBase par2EntityLivingBase)
	{
	super(par1World, par2EntityLivingBase);
	}
	public EntityYoyo(World par1World)
	{
	super(par1World);
	}
	@Override
	protected void onImpact(MovingObjectPosition mop)
	{
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
		if(mop.typeOfHit == MovingObjectType.ENTITY && mop.entityHit instanceof EntityLiving)
		{
			mop.entityHit.attackEntityFrom(DamageSource.causeMobDamage(this.getThrower()),  6.0F);
		}
		
		this.worldObj.newExplosion(this, mop.blockX, mop.blockY, mop.blockZ, 0.35F, false, false);
		
		}
		
		if (!this.worldObj.isRemote)
		{
			
		this.setDead();
		}
	}
	
}
