package com.aggro.asma.entity.render;

import com.aggro.asma.Main;
import com.aggro.asma.entity.EntityLakitu;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import com.aggro.asma.entity.EntityLakitu;
import com.aggro.asma.entity.model.ModelLakitu;
public class RenderLakitu extends RenderLiving {
		private static final ResourceLocation textureLocation = new ResourceLocation(Main.MODID + ":" + "textures/models/lakitu/lakitu_" + EntityLakitu.isSpecies + ".png");

		public RenderLakitu(ModelLakitu lakitu, float shadow) {
		super(lakitu, 1F);
		
	}

	

	
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return textureLocation;
	}

}
