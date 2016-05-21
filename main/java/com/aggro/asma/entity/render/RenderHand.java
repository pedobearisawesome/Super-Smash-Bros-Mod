package com.aggro.asma.entity.render;

import com.aggro.asma.Main;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.aggro.asma.entity.EntityHand;
import com.aggro.asma.entity.model.ModelHand;

public class RenderHand extends RenderLiving{
	private static final ResourceLocation textureLocation = new ResourceLocation(Main.MODID + ":" + "textures/models/entityHandW.png");

	
	public RenderHand(ModelHand modelHand, float shadowSize) {
	super(modelHand, 1F);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		
		return textureLocation;
	
		
	}

	
}
