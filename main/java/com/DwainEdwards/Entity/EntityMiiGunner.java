package com.DwainEdwards.Entity;

import java.util.Random;

import com.aggro.asma.Main;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityMiiGunner extends EntityMob implements IRangedAttackMob {
	
	 Random r = new Random();
	 	int i = (r.nextInt(2)); 
	
	private float heightOffset = 0.5f;
	private static final String __OBFID = "CL_00001682";
    
	public EntityMiiGunner(World par1World) {
		super(par1World);
		 this.tasks.addTask(0, new EntityAISwimming(this));
		 this.targetTasks.addTask(2, (EntityAIBase)new EntityAIMoveTowardsRestriction((EntityCreature)this, 0.6));   
		 this.targetTasks.addTask(2, (EntityAIBase)new EntityAIWander((EntityCreature)this, 0.6));
		 this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPikachu.class, 1.0D, false));
		 this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityMario.class, 1.0D, false));
		 this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityDonkey.class, 1.0D, false));
		 this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityLuigi.class, 1.0D, false));
		 this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityMiiGunner.class, 1.0D, false));
	        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
	        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPikachu.class, 8.0F));
	        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityMario.class, 8.0F));
	        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityDonkey.class, 8.0F));
	        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityLuigi.class, 8.0F));
	        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityMiiGunner.class, 8.0F));
	        this.tasks.addTask(8, new EntityAILookIdle(this));
	        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPikachu.class, 0, true));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityMario.class, 0, true));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityDonkey.class, 0, true));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLuigi.class, 0, true));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityMiiGunner.class, 0, true));
	        this.setSize(0.6F, 1.8F);
	        this.tasks.addTask(1, new EntityAIArrowAttack(this, 1.25D, 20, 10.0F));
		 
	    
	}
	
	public static final ResourceLocation Male = new ResourceLocation(Main.MODID + ":" + "textures/models/miigunner_male.png");
	public static final ResourceLocation Female = new ResourceLocation(Main.MODID + ":" + "textures/models/miigunner_female.png"); 
	

    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
    {
        this.playSound("mob.zombie.step", 0.15F, 1.0F);
    }
	    
	    protected Item getDropItem()
	    {
	        return Main.fludd;
	    }

	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(70.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.6D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.0D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(45.0D);
		}
	
	 protected boolean isAIEnabled()
	    {
	        return true;
	    }
	 
	 public ResourceLocation getresource(){
		 if (i== 1) {
 			return Male;
 		}
 		if (i==2){
 			return Female;
	 } else {
		   return Female; 
	   }
	}

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase p_82196_1_,
			float p_82196_2_) {
	      EntityMiiBullet entitymiibullet = new EntityMiiBullet(this.worldObj, this);
	        double d0 = p_82196_1_.posX - this.posX;
	        double d1 = p_82196_1_.posY + (double)p_82196_1_.getEyeHeight() - 1.100000023841858D - entitymiibullet.posY;
	        double d2 = p_82196_1_.posZ - this.posZ;
	        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
	        entitymiibullet.setThrowableHeading(d0, d1 + (double)f1, d2, 1.6F, 12.0F);
	        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
	        this.worldObj.spawnEntityInWorld(entitymiibullet);
	   
		
	}
}
