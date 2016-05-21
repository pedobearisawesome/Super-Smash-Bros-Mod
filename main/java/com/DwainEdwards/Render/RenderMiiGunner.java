package com.DwainEdwards.Render;

import java.util.Random;

import com.DwainEdwards.Entity.EntityDonkey;
import com.DwainEdwards.Entity.EntityMiiGunner;
import com.DwainEdwards.Models.ModelDONKEY;
import com.DwainEdwards.Models.ModelMIIGUNNER;
import com.aggro.asma.Main;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderMiiGunner extends RenderLiving {

	Random r = new Random();
	int i = (r.nextInt(2));
	

protected ModelMIIGUNNER modelEntity;
	
	public RenderMiiGunner(ModelBase p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
		
		modelEntity = ((ModelMIIGUNNER) mainModel);
		
	}
	
	public void renderMiiGunner(EntityMiiGunner entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}
	
	
	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderMiiGunner((EntityMiiGunner)entityLiving, x, y, z, u, v);
	}
	
	public void doRender(Entity entity, double x, double y, double z, float u, float v) {
		renderMiiGunner((EntityMiiGunner)entity, x, y, z, u, v);
	}
	
	protected ResourceLocation getEntityTexture(EntityMiiGunner miigunner)
    {
    	return miigunner.getresource();

    }
	
	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		
		 return this.getEntityTexture((EntityMiiGunner)p_110775_1_);}
		
	}
