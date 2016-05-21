package com.aggro.asma.entity.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.RenderSheep;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;

import org.lwjgl.opengl.GL11;

import com.DwainEdwards.Entity.EntityFox;
import com.aggro.asma.Main;
import com.aggro.asma.entity.model.ModelGreninja;
import com.aggro.asma.entity.model.ModelROB;

import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class OverridePlayer extends RenderPlayer {
	static ModelGreninja modelgreninja = new ModelGreninja();
	static ModelROB modelrob = new ModelROB();
	static ModelBiped modelbi = new ModelBiped();
	private static final ResourceLocation rob= new ResourceLocation(Main.MODID + ":" + "textures/models/chars/rob0.png");
	private static final ResourceLocation steve= new ResourceLocation(Main.MODID + ":" + "textures/models/chars/steve0.png");
	private static final ResourceLocation grenin= new ResourceLocation(Main.MODID + ":" + "textures/models/chars/grenin0.png");
	
	final RenderPlayerN rpn = new RenderPlayerN();
	
	static RenderSheep rs;
	private ModelBiped value;

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void onRenderPlayerPre(RenderLivingEvent.Pre event) {
		
		if(event.entity instanceof EntityPlayer && Main.chara == "rob") {
			event.setCanceled(true);
			GL11.glPushMatrix();
			GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
			float f = 1.0f;
			GL11.glColor3f(f, f, f);
			Minecraft.getMinecraft().getTextureManager().bindTexture(rob);
			GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
			modelrob.render(event.entity, (float)event.x, (float)event.y, (float)event.z, 0F, 0F, 0.0625F);
			
			
			
			//rpn.doRender(event.entity, event.x, event.y, event.z, 0F, 0F);
			GL11.glDisable(GL11.GL_DEPTH_TEST);
			GL11.glColor4f(1, 1, 1, 1);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glPopMatrix();
		}
		
		if(event.entity instanceof EntityPlayer && Main.chara == "grenin") {
			event.setCanceled(true);
			GL11.glPushMatrix();
			GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
			float f = 1.0f;
			GL11.glColor3f(f, f, f);
			Minecraft.getMinecraft().getTextureManager().bindTexture(grenin);
			GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
			modelgreninja.render(event.entity, (float)event.x, (float)event.y, (float)event.z, 0F, 0F, 0.0625F);
			
			//rpn.doRender(event.entity, event.x, event.y, event.z, 0F, 0F);
			GL11.glDisable(GL11.GL_DEPTH_TEST);
			GL11.glColor4f(1, 1, 1, 1);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glPopMatrix();
		}
		
		if(event.entity instanceof EntityPlayer && Main.chara == "steve") {
			event.setCanceled(true);
			GL11.glPushMatrix();
			GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
			float f = 1.0f;
			GL11.glColor3f(f, f, f);
			Minecraft.getMinecraft().getTextureManager().bindTexture(steve);
			GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
			modelbi.render(event.entity, (float)event.x, (float)event.y, (float)event.z, 0F, 0F, 0.0625F);
			
			//rpn.doRender(event.entity, event.x, event.y, event.z, 0F, 0F); 
			GL11.glDisable(GL11.GL_DEPTH_TEST);
			GL11.glColor4f(1, 1, 1, 1);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glPopMatrix();
		}
		
		
		
	}
	
	protected void preRenderCallback(EntityPlayer kirby, float size)
    {
        GL11.glScalef(1.0f, 1.0f, 1.0f);
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
    protected void preRenderCallback(EntityLivingBase entity, float size)
    {
        this.preRenderCallback((EntityPlayer)entity, size);
    }
	@SubscribeEvent
public void onRenderPlayerPost(RenderPlayerEvent.Post post) {
		ObfuscationReflectionHelper.setPrivateValue(RendererLivingEntity.class, post.renderer, value, new String[] { "mainModel", "field_77045_g" });
	}
}
