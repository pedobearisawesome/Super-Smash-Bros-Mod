package com.aggro.asma.entity;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.minecart.MinecartCollisionEvent;

public class EntityLakitu extends EntityMob{
public static int isSpecies = 0;
	 public EntityLakitu(World world)
	    {
	        super(world);
	        this.setSize(0.9F, 0.8F);
	        this.getNavigator().setAvoidsWater(true);
	        this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
	        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, Items.wheat, false));
	        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
	        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(7, new EntityAILookIdle(this));
	    }
	 public boolean isAIEnabled()
	    {
	        return true;
	    }

	    protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(4.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4D);
	    }
	 public void isMobNear(int p_71018_1_, int p_71018_2_, int p_71018_3_, EntityCow ufo){
	 double d0 = 8.0D;
     double d1 = 5.0D;
     List list = this.worldObj.getEntitiesWithinAABB(EntityCow.class, AxisAlignedBB.getBoundingBox((double)p_71018_1_ - d0, (double)p_71018_2_ - d1, (double)p_71018_3_ - d0, (double)p_71018_1_ + d0, (double)p_71018_2_ + d1, (double)p_71018_3_ + d0));
     if (!list.isEmpty() && ufo.riddenByEntity == null && this.ridingEntity == null)
     {
         this.mountEntity(ufo);
     }
}
}
