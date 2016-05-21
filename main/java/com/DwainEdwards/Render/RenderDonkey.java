package com.DwainEdwards.Render;

import com.DwainEdwards.Entity.EntityDonkey;
import com.DwainEdwards.Models.ModelDONKEY;
import com.aggro.asma.Main;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderDonkey extends RenderLiving {

		public static final ResourceLocation texture = new ResourceLocation(Main.MODID + ":" + "textures/models/DONKEY.png");
		
		protected ModelDONKEY modelEntity;
		
		public RenderDonkey(ModelBase p_i1262_1_, float p_i1262_2_) {
			super(p_i1262_1_, p_i1262_2_);
			
			modelEntity = ((ModelDONKEY) mainModel);
			
		}
		
		public void renderDonkey(EntityDonkey entity, double x, double y, double z, float u, float v) {
			super.doRender(entity, x, y, z, u, v);
		}
		
		
		public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
			renderDonkey((EntityDonkey)entityLiving, x, y, z, u, v);
		}
		
		public void doRender(Entity entity, double x, double y, double z, float u, float v) {
			renderDonkey((EntityDonkey)entity, x, y, z, u, v);
		}
		
		@Override
		protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return texture;
		}


	}
