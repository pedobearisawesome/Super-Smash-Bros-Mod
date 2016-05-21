package com.aggro.asma.entity.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.ResourceLocation;

import com.aggro.asma.Main;
import com.aggro.asma.entity.EntityMii;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderMii extends RenderLiving {
	

	private static final ResourceLocation miiTextures = new ResourceLocation(Main.MODID + ":" + "textures/models/mii/emptyMii.png");
    
    private static final ResourceLocation miiSuitTextures = new ResourceLocation(Main.MODID + ":" + "textures/entity/models/mii/miiArmor_" + EntityMii.Suit + ".png");


	public RenderMii(ModelBiped p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
        this.setRenderPassModel(p_i1262_1_);
	}

	
	protected int shouldRenderPass(EntityMii ent, int p_77032_2_, float p_77032_3_)
    {
	if (p_77032_2_ == 0 && ent.isTamed())
    {
        this.bindTexture(miiSuitTextures);
        int j = ent.getSuitColor();
        GL11.glColor3f(EntitySheep.fleeceColorTable[j][0], EntitySheep.fleeceColorTable[j][1], EntitySheep.fleeceColorTable[j][2]);
        return 1;
    }
    else
    {
        return -1;
    }}
	
	protected ResourceLocation getEntityTexture(EntityMii ent) {
		
		return ent.isTamed() ? miiTextures : (ent.isAngry() ? miiTextures : miiTextures);
	}
	
protected int shouldRenderPass(EntityLivingBase p_77032_1_, int p_77032_2_, float p_77032_3_)
    {
        
	return this.shouldRenderPass((EntityMii)p_77032_1_, p_77032_2_, p_77032_3_);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		
		return this.getEntityTexture((EntityMii)p_110775_1_);
	}
	
	

}
