package com.DwainEdwards.Render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import com.DwainEdwards.Entity.EntityLink;
import com.DwainEdwards.Models.ModelLink;
import com.aggro.asma.Main;

public class RenderLink extends RenderLiving {

	public static final ResourceLocation texture = new ResourceLocation(Main.MODID + ":" + "textures/models/Link.png");
	
	protected ModelLink modelEntity;
	
	public RenderLink(ModelBase p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
		
		modelEntity = ((ModelLink) mainModel);
		
	}
	
	public void renderLink(EntityLink entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}
	
	
	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderLink((EntityLink)entityLiving, x, y, z, u, v);
	}
	
	public void doRender(Entity entity, double x, double y, double z, float u, float v) {
		renderLink((EntityLink)entity, x, y, z, u, v);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
	return texture;
	}


}
