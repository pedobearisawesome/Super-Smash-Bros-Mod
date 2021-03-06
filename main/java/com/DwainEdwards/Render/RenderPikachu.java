package com.DwainEdwards.Render;

import com.DwainEdwards.Entity.EntityPikachu;
import com.DwainEdwards.Models.ModelPIKACHU;
import com.aggro.asma.Main;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderPikachu extends RenderLiving {

public static final ResourceLocation texture = new ResourceLocation(Main.MODID + ":" + "textures/models/PIKACHU.png");
	
	protected ModelPIKACHU modelEntity;
	
	public RenderPikachu(ModelBase p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
		
		modelEntity = ((ModelPIKACHU) mainModel);
		
	}
	
	public void renderPikachu(EntityPikachu entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}
	
	
	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderPikachu((EntityPikachu)entityLiving, x, y, z, u, v);
	}
	
	public void doRender(Entity entity, double x, double y, double z, float u, float v) {
		renderPikachu((EntityPikachu)entity, x, y, z, u, v);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
	return texture;
	}

}
