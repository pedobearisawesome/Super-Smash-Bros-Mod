package com.DwainEdwards.Entity;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
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
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.DwainEdwards.Items.SmashItems;
import com.aggro.asma.Main;

public class EntityLink extends EntityMob {

private float heightOffset = 0.5f;
private static final String __OBFID = "CL_00001682";

public EntityLink(World par1World) {
	super(par1World);
	 this.tasks.addTask(0, new EntityAISwimming(this));
	 this.targetTasks.addTask(2, (EntityAIBase)new EntityAIMoveTowardsRestriction((EntityCreature)this, 0.6));   
	 this.targetTasks.addTask(2, (EntityAIBase)new EntityAIWander((EntityCreature)this, 0.6));
	 this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPikachu.class, 1.0D, false));
	 this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityMario.class, 1.0D, false));
	 this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityDonkey.class, 1.0D, false));
	 this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityLuigi.class, 1.0D, false));
	 this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityMiiGunner.class, 1.0D, false));
	 this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityFox.class, 1.0D, false));
	 this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityYoshi.class, 1.0D, false));
	 this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityLink.class, 1.0D, false));
	 this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityJigglypuff.class, 1.0D, false));
	 this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPikachu.class, 8.0F));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityMario.class, 8.0F));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityDonkey.class, 8.0F));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityLuigi.class, 8.0F));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityMiiGunner.class, 8.0F));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityFox.class, 8.0F));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityYoshi.class, 8.0F));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityLink.class, 8.0F));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityJigglypuff.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPikachu.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityMario.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityDonkey.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLuigi.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityMiiGunner.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityFox.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityYoshi.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLink.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityJigglypuff.class, 0, true));
        this.setSize(0.6F, 1.8F);
	 
    
}

protected String getLivingSound()
{
    return Main.MODID + ":link_Living";
}

/**
 * Returns the sound this mob makes when it is hurt.
 */
protected String getHurtSound()
{
    return Main.MODID + ":link_Hurt";
}

/**
 * Returns the sound this mob makes on death.
 */
protected String getDeathSound()
{
    return Main.MODID + ":link_Death";
}

protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
{
    this.playSound("mob.zombie.step", 0.15F, 1.0F);
}
    
    protected Item getDropItem()
    {
        return SmashItems.LinkHat;
    }


protected void applyEntityAttributes() {
	super.applyEntityAttributes();
	this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
	this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
	this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.0D);
	this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.0D);
	}

 protected boolean isAIEnabled()
    {
        return true;
    }
 
}
