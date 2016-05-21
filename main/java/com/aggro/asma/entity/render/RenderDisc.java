package com.aggro.asma.entity.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAnvil;
import net.minecraft.block.BlockDragonEgg;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import com.aggro.asma.Main;
import com.aggro.asma.entity.EntityLakitu;
import com.aggro.asma.entity.model.ModelDisc;
import com.aggro.asma.entity.model.ModelLakitu;

@SideOnly(Side.CLIENT)
public class RenderDisc extends Render
{
	private static final ResourceLocation textureLocation = new ResourceLocation(Main.MODID + ":" + "textures/models/zapper/clayP.png");


    public RenderDisc(ModelDisc disc, float shadow)
    {
        super();
    }

    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return textureLocation;
    }

	@Override
	public void doRender(Entity p_76986_1_, double p_76986_2_,
			double p_76986_4_, double p_76986_6_, float p_76986_8_,
			float p_76986_9_) {
		// TODO Auto-generated method stub
		
	}

	

	

}