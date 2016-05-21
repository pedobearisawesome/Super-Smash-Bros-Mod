package com.DwainEdwards.TESR;

import org.lwjgl.opengl.GL11;

import com.DwainEdwards.Blocks.ModelATM;
import com.DwainEdwards.Blocks.TileEntityssbATM;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class RenderssbATM extends TileEntitySpecialRenderer {
	// The model of your block
	private final ModelATM model;

	public RenderssbATM() {
		this.model = new ModelATM();
	}

	private void adjustRotatePivotViaMeta(World world, int x, int y, int z) {
		int meta = world.getBlockMetadata(x, y, z);
		GL11.glPushMatrix();
		GL11.glRotatef(meta * (-90), 0.0F, 0.0F, 1.0F);
		GL11.glPopMatrix();
	}

	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y,
			double z, float scale) {
		GL11.glPushMatrix();

		GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		ResourceLocation textures = (new ResourceLocation(
				"asma:textures/models/ssbATM.png"));
		Minecraft.getMinecraft().renderEngine.bindTexture(textures);
		GL11.glPushMatrix();
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		TileEntityssbATM tile = (TileEntityssbATM) tileentity;
		int direction = tile.direction;
		GL11.glRotatef(direction * 90, 0.0F, 1.0F, 0.0F);

		this.model.render((Entity) null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
}
