package com.aggro.asma.entity.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.aggro.asma.Main;
import com.aggro.asma.entity.model.ModelGreninja;
import com.aggro.asma.entity.model.ModelROB;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderPlayerN extends RenderPlayer {
	
	
	private static final ResourceLocation Normal= new ResourceLocation(Main.MODID + ":textures/models/chars/steve0.png");

	public RenderPlayer parent;
	
	public ModelRenderer replacement;
	
	public ResourceLocation resourceLoc;
	
  public RenderManager renderManager;

 public RenderPlayerN()
    {
        super();
        this.mainModel = new ModelBiped();
        this.modelArmorChestplate = (ModelBiped)this.mainModel;
        this.modelArmor = (ModelBiped)this.mainModel;
        this.renderManager = RenderManager.instance;
        }
      
   protected void preRenderCallback(EntityPlayer kirby, float size)
    {
        GL11.glScalef(0.5f, 0.5f, 0.5f);
    }
   
	public static int getModelHeight(ModelRenderer model) 
	{
		int height = 0;//Y1 lower than Y2
		for(int i = 0; i < model.cubeList.size(); i++)
		{
			ModelBox box = (ModelBox)model.cubeList.get(i);
			if((int)Math.abs(box.posY2 - box.posY1) > height)
			{
				height = (int)Math.abs(box.posY2 - box.posY1);
			}
		}
		return height;
	}
   
	protected void rotateCorpse(AbstractClientPlayer p_77043_1_, float p_77043_2_, float p_77043_3_, float p_77043_4_)
    {
        if (p_77043_1_.isEntityAlive() && p_77043_1_.isPlayerSleeping())
        {
            GL11.glRotatef(p_77043_1_.getBedOrientationInDegrees(), 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(this.getDeathMaxRotation(p_77043_1_), 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
        }
        else
        {
            super.rotateCorpse(p_77043_1_, p_77043_2_, p_77043_3_, p_77043_4_);
        }
    }
	
	
    protected void preRenderCallback(EntityLivingBase entity, float size)
    {
        this.preRenderCallback((EntityPlayer)entity, size);
    }
    
    protected void rotateCorpse(EntityLivingBase p_77043_1_, float p_77043_2_, float p_77043_3_, float p_77043_4_)
    {
        this.rotateCorpse((AbstractClientPlayer)p_77043_1_, p_77043_2_, p_77043_3_, p_77043_4_);
    }
 

 @Override
 protected ResourceLocation getEntityTexture(Entity p_110775_1_)
{
    return Normal;
}
 
 
 
 
}