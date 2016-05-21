package com.aggro.asma.entity;

import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityUFO extends EntityMob{

	public EntityUFO(World par1world) {
		super(par1world);
        this.setSize(0.5F, 0.25F);
        this.isImmuneToFire = true;
        
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        
	}
	
	public boolean isAIEnabled()
    {
        return true;
    }
	public void RidingLaki(){
	if (this.riddenByEntity instanceof EntityLakitu)
    {
     
    	 ((EntityLakitu)this.riddenByEntity).isSpecies = 1;
    
    }}
	
	
			
	
	 
	    
	 
	 
}
