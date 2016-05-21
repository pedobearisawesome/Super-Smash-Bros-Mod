package com.DwainEdwards.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelYoshi extends ModelBase
{
  //fields
    ModelRenderer headTop;
    ModelRenderer headMiddle;
    ModelRenderer headBottom;
    ModelRenderer Nose;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Shell;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
  
  public ModelYoshi()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      headTop = new ModelRenderer(this, 46, 0);
      headTop.addBox(-1F, -9F, 3F, 2, 2, 2);
      headTop.setRotationPoint(0F, 4F, 0F);
      headTop.setTextureSize(128, 64);
      headTop.mirror = true;
      setRotation(headTop, 0F, 0F, 0F);
      headMiddle = new ModelRenderer(this, 36, 6);
      headMiddle.addBox(-1F, -6F, 4F, 2, 2, 2);
      headMiddle.setRotationPoint(0F, 4F, 0F);
      headMiddle.setTextureSize(128, 64);
      headMiddle.mirror = true;
      setRotation(headMiddle, 0F, 0F, 0F);
      headBottom = new ModelRenderer(this, 35, 0);
      headBottom.addBox(-1F, -2F, 4F, 2, 2, 2);
      headBottom.setRotationPoint(0F, 4F, 0F);
      headBottom.setTextureSize(128, 64);
      headBottom.mirror = true;
      setRotation(headBottom, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 58, 0);
      Nose.addBox(-4F, -4F, -7F, 8, 4, 3);
      Nose.setRotationPoint(0F, 4F, 0F);
      Nose.setTextureSize(128, 64);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 27, 33);
      Tail1.addBox(-3F, 1F, 10F, 6, 6, 6);
      Tail1.setRotationPoint(0F, 4F, 0F);
      Tail1.setTextureSize(128, 64);
      Tail1.mirror = true;
      setRotation(Tail1, 0F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 19, 19);
      Tail2.addBox(-2F, 2F, 16F, 4, 4, 5);
      Tail2.setRotationPoint(0F, 4F, 0F);
      Tail2.setTextureSize(128, 64);
      Tail2.mirror = true;
      setRotation(Tail2, 0F, 0F, 0F);
      Shell = new ModelRenderer(this, 28, 48);
      Shell.addBox(-5F, -2F, 7F, 10, 5, 6);
      Shell.setRotationPoint(0F, 4F, 0F);
      Shell.setTextureSize(128, 64);
      Shell.mirror = true;
      setRotation(Shell, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 4F, 0F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 59, 16);
      body.addBox(-4F, 0F, -2F, 8, 8, 12);
      body.setRotationPoint(0F, 4F, 0F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 10, 4);
      rightarm.setRotationPoint(-5F, 6F, 1F);
      rightarm.setTextureSize(128, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 10, 4);
      leftarm.setRotationPoint(5F, 6F, 1F);
      leftarm.setTextureSize(128, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      rightleg.setRotationPoint(-2F, 12F, 2F);
      rightleg.setTextureSize(128, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(2F, 12F, 2F);
      leftleg.setTextureSize(128, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    headTop.render(f5);
    headMiddle.render(f5);
    headBottom.render(f5);
    Nose.render(f5);
    Tail1.render(f5);
    Tail2.render(f5);
    Shell.render(f5);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
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
    this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.Nose.rotateAngleY = head.rotateAngleY;
    this.Nose.rotateAngleX = head.rotateAngleX;
    this.headTop.rotateAngleX = head.rotateAngleX;
    this.headTop.rotateAngleY = head.rotateAngleY;
    this.headBottom.rotateAngleX = head.rotateAngleX;
    this.headBottom.rotateAngleY = head.rotateAngleY;
    this.headMiddle.rotateAngleX = head.rotateAngleX;
    this.headMiddle.rotateAngleY = head.rotateAngleY;
    this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
    this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
    this.rightarm.rotateAngleZ = 0.0F;
    this.leftarm.rotateAngleZ = 0.0F;
    this.rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.rightleg.rotateAngleY = 0.0F;
    this.leftleg.rotateAngleY = 0.0F;
  }

}
