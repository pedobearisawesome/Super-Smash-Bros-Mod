package com.aggro.asma.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelROB extends ModelBiped
{
  //fields
    ModelRenderer Bottom;
    ModelRenderer Torso;
    ModelRenderer Chest;
    ModelRenderer Neck;
    ModelRenderer Head;
    ModelRenderer Armright1;
    ModelRenderer ArmLeft1;
    ModelRenderer Armright2;
    ModelRenderer Armleft2;
    ModelRenderer Armright3;
    ModelRenderer Armright4;
  
  public ModelROB()
  {
    textureWidth = 128;
    textureHeight = 256;
    
      Bottom = new ModelRenderer(this, 0, 92);
      Bottom.addBox(0F, 0F, 0F, 16, 5, 16);
      Bottom.setRotationPoint(-8F, 19F, -8F);
      Bottom.setTextureSize(128, 256);
      Bottom.mirror = true;
      setRotation(Bottom, 0F, 0F, 0F);
      Torso = new ModelRenderer(this, 0, 61);
      Torso.addBox(0F, 0F, 0F, 4, 19, 6);
      Torso.setRotationPoint(-2F, 0F, -3F);
      Torso.setTextureSize(128, 256);
      Torso.mirror = true;
      setRotation(Torso, 0F, 0F, 0F);
      Chest = new ModelRenderer(this, 0, 26);
      Chest.addBox(0F, 0F, 0F, 10, 3, 12);
      Chest.setRotationPoint(-5F, -3F, -6F);
      Chest.setTextureSize(128, 256);
      Chest.mirror = true;
      setRotation(Chest, 0F, 0F, 0F);
      Neck = new ModelRenderer(this, 0, 17);
      Neck.addBox(0F, 0F, 0F, 4, 4, 4);
      Neck.setRotationPoint(-2F, -7F, -2F);
      Neck.setTextureSize(128, 256);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 1);
      Head.addBox(0F, 0F, 0F, 10, 5, 10);
      Head.setRotationPoint(-5F, -12F, -5F);
      Head.setTextureSize(128, 256);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Armright1 = new ModelRenderer(this, 23, 18);
      Armright1.addBox(0F, 0F, 0F, 5, 2, 4);
      Armright1.setRotationPoint(-10F, -3F, -1F);
      Armright1.setTextureSize(128, 256);
      Armright1.mirror = true;
      setRotation(Armright1, 0F, 0F, 0F);
      ArmLeft1 = new ModelRenderer(this, 23, 18);
      ArmLeft1.addBox(0F, 0F, 0F, 5, 2, 4);
      ArmLeft1.setRotationPoint(5F, -3F, -1F);
      ArmLeft1.setTextureSize(128, 256);
      ArmLeft1.mirror = true;
      setRotation(ArmLeft1, 0F, 0F, 0F);
      Armright2 = new ModelRenderer(this, 48, 15);
      Armright2.addBox(0F, 2F, 1F, 3, 9, 3);
      Armright2.setRotationPoint(-10F, -3F, -1F);
      Armright2.setTextureSize(128, 256);
      Armright2.mirror = true;
      setRotation(Armright2, 0F, 0F, 0F);
      Armleft2 = new ModelRenderer(this, 48, 15);
      Armleft2.addBox(2F, 2F, 1F, 3, 9, 3);
      Armleft2.setRotationPoint(5F, -3F, -1F);
      Armleft2.setTextureSize(128, 256);
      Armleft2.mirror = true;
      setRotation(Armleft2, 0F, 0F, 0F);
      Armright3 = new ModelRenderer(this, 46, 30);
      Armright3.addBox(0F, 11F, 1F, 6, 3, 3);
      Armright3.setRotationPoint(-10F, -3F, -1F);
      Armright3.setTextureSize(128, 256);
      Armright3.mirror = true;
      setRotation(Armright3, 0F, 0F, 0F);
      Armright4 = new ModelRenderer(this, 46, 30);
      Armright4.addBox(-1F, 11F, 1F, 6, 3, 3);
      Armright4.setRotationPoint(5F, -3F, -1F);
      Armright4.setTextureSize(128, 256);
      Armright4.mirror = true;
      setRotation(Armright4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Bottom.render(f5);
    Torso.render(f5);
    Chest.render(f5);
    Neck.render(f5);
    Head.render(f5);
    Armright1.render(f5);
    ArmLeft1.render(f5);
    Armright2.render(f5);
    Armleft2.render(f5);
    Armright3.render(f5);
    Armright4.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    float f6 = MathHelper.sin(this.onGround * (float)Math.PI);
    float f7 = MathHelper.sin((1.0F - (1.0F - this.onGround) * (1.0F - this.onGround)) * (float)Math.PI);
    this.Armright1.rotateAngleZ = 0.0F;
    this.ArmLeft1.rotateAngleZ = 0.0F;
    this.Armright1.rotateAngleY = -(0.1F - f6 * 0.6F);
    this.ArmLeft1.rotateAngleY = 0.1F - f6 * 0.6F;
    this.Armright1.rotateAngleX = -((float)Math.PI / 2F);
    this.ArmLeft1.rotateAngleX = -((float)Math.PI / 2F);
    this.Armright1.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
    this.ArmLeft1.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
    this.Armright1.rotateAngleZ += MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
    this.ArmLeft1.rotateAngleZ -= MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
    this.Armright1.rotateAngleX += MathHelper.sin(f2 * 0.067F) * 0.05F;
    this.ArmLeft1.rotateAngleX -= MathHelper.sin(f2 * 0.067F) * 0.05F;
    this.Armright2.rotateAngleZ = 0.0F;
    this.Armleft2.rotateAngleZ = 0.0F;
    this.Armright2.rotateAngleY = -(0.1F - f6 * 0.6F);
    this.Armleft2.rotateAngleY = 0.1F - f6 * 0.6F;
    this.Armright2.rotateAngleX = -((float)Math.PI / 2F);
    this.Armleft2.rotateAngleX = -((float)Math.PI / 2F);
    this.Armright2.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
    this.Armleft2.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
    this.Armright2.rotateAngleZ += MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
    this.Armleft2.rotateAngleZ -= MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
    this.Armright2.rotateAngleX += MathHelper.sin(f2 * 0.067F) * 0.05F;
    this.Armleft2.rotateAngleX -= MathHelper.sin(f2 * 0.067F) * 0.05F;
    this.Armright3.rotateAngleZ = 0.0F;
    this.Armright4.rotateAngleZ = 0.0F;
    this.Armright3.rotateAngleY = -(0.1F - f6 * 0.6F);
    this.Armright4.rotateAngleY = 0.1F - f6 * 0.6F;
    this.Armright3.rotateAngleX = -((float)Math.PI / 2F);
    this.Armright4.rotateAngleX = -((float)Math.PI / 2F);
    this.Armright3.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
    this.Armright4.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
    this.Armright3.rotateAngleZ += MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
    this.Armright4.rotateAngleZ -= MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
    this.Armright3.rotateAngleX += MathHelper.sin(f2 * 0.067F) * 0.05F;
    this.Armright4.rotateAngleX -= MathHelper.sin(f2 * 0.067F) * 0.05F;
  }

}
