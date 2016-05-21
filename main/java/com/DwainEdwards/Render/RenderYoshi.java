package com.DwainEdwards.Render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import com.DwainEdwards.Entity.EntityDonkey;
import com.DwainEdwards.Entity.EntityYoshi;
import com.DwainEdwards.Models.ModelDONKEY;
import com.DwainEdwards.Models.ModelYoshi;
import com.aggro.asma.Main;

public class RenderYoshi extends RenderLiving {

	public static final ResourceLocation texture = new ResourceLocation(Main.MODID + ":" + "textures/models/YOSHI.png");
	
	protected ModelYoshi modelEntity;
	
	public RenderYoshi(ModelBase p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
		
		modelEntity = ((ModelYoshi) mainModel);
		
	}
	
	public void renderYoshi(EntityYoshi entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}
	
	
	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderYoshi((EntityYoshi)entityLiving, x, y, z, u, v);
	}
	
	public void doRender(Entity entity, double x, double y, double z, float u, float v) {
		renderYoshi((EntityYoshi)entity, x, y, z, u, v);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
	return texture;
	}
	
}

