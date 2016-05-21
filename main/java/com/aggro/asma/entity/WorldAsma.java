package com.aggro.asma.entity;

import net.minecraft.entity.Entity;
import net.minecraft.profiler.Profiler;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.storage.ISaveHandler;

public abstract class WorldAsma extends World{
	public WorldAsma(ISaveHandler p_i45368_1_, String p_i45368_2_,
			WorldProvider p_i45368_3_, WorldSettings p_i45368_4_,
			Profiler p_i45368_5_) {
		super(p_i45368_1_, p_i45368_2_, p_i45368_3_, p_i45368_4_, p_i45368_5_);
		// TODO Auto-generated constructor stub
	}

	public Explosion createSmash(Entity p_72876_1_, double p_72876_2_, double p_72876_4_, double p_72876_6_, float p_72876_8_, boolean p_72876_9_)
    {
        return this.newSmash(p_72876_1_, p_72876_2_, p_72876_4_, p_72876_6_, p_72876_8_, false, p_72876_9_);
    }

    /**
     * returns a new explosion. Does initiation (at time of writing Explosion is not finished)
     */
    public Explosion newSmash(Entity p_72885_1_, double p_72885_2_, double p_72885_4_, double p_72885_6_, float p_72885_8_, boolean p_72885_9_, boolean p_72885_10_)
    {
        Explosion explosion = new Explosion(this, p_72885_1_, p_72885_2_, p_72885_4_, p_72885_6_, p_72885_8_);
        explosion.isFlaming = p_72885_9_;
        explosion.isSmoking = p_72885_10_;
        explosion.doExplosionA();
        explosion.doExplosionB(true);
        return explosion;
    }
}
