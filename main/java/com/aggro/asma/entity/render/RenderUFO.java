package com.aggro.asma.entity.render;

import org.lwjgl.opengl.GL11;

import com.aggro.asma.Main;
import com.aggro.asma.entity.EntityUFO;
import com.aggro.asma.entity.model.ModelUFO;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.util.ResourceLocation;
@SideOnly(Side.CLIENT)
public class RenderUFO extends RenderLiving {

	private static final ResourceLocation ufoFXTextures = new ResourceLocation(Main.MODID + ":" + "textures/model/ufo/entityUFO_overlay.png");
    private static final ResourceLocation ufoTextures = new ResourceLocation(Main.MODID + ":" + "textures/model/ufo/entityUFO.png");
	
	public RenderUFO(ModelUFO modelUFO, float shadowsize) {
		super(new ModelUFO(), 1.0F);
        this.setRenderPassModel(new ModelUFO());

	}

	protected int shouldRenderPass(EntitySpider p_77032_1_, int p_77032_2_, float p_77032_3_)
    {
        if (p_77032_2_ != 0)
        {
            return -1;
        }
        else
        {
            this.bindTexture(ufoFXTextures);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);

            if (p_77032_1_.isInvisible())
            {
                GL11.glDepthMask(false);
            }
            else
            {
                GL11.glDepthMask(true);
            }

            char c0 = 61680;
            int j = c0 % 65536;
            int k = c0 / 65536;
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j / 1.0F, (float)k / 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            return 1;
        }
    }
	
	protected int shouldRenderPass(EntityLiving p_77032_1_, int p_77032_2_, float p_77032_3_)
    {
        return this.shouldRenderPass((EntityUFO)p_77032_1_, p_77032_2_, p_77032_3_);
    }
	
	protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntityUFO)p_110775_1_);
    }
}
