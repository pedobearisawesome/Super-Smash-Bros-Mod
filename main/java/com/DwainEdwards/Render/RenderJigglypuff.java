package com.DwainEdwards.Render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import com.DwainEdwards.Entity.EntityFox;
import com.DwainEdwards.Entity.EntityJigglypuff;
import com.DwainEdwards.Models.ModelFOX;
import com.DwainEdwards.Models.ModelJIGGLYPUFF;
import com.aggro.asma.Main;

public class RenderJigglypuff extends RenderLiving {
	public static final ResourceLocation texture = new ResourceLocation(Main.MODID + ":" + "textures/models/JIGGLYPUFF.png");
	
	protected ModelJIGGLYPUFF modelEntity;
	
	public RenderJigglypuff(ModelBase p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
		
		modelEntity = ((ModelJIGGLYPUFF) mainModel);
		
	}
	
	public void renderJigglypuff(EntityJigglypuff entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}
	
	
	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderJigglypuff((EntityJigglypuff)entityLiving, x, y, z, u, v);
	}
	
	public void doRender(Entity entity, double x, double y, double z, float u, float v) {
		renderJigglypuff((EntityJigglypuff)entity, x, y, z, u, v);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
	return texture;
	}


}
