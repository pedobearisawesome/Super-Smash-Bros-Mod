package com.DwainEdwards.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDONKEY extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
  
  public ModelDONKEY()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Shape1 = new ModelRenderer(this, 36, 4);
      Shape1.addBox(-1F, -11F, 1F, 2, 3, 1);
      Shape1.setRotationPoint(0F, 5F, -8F);
      Shape1.setTextureSize(128, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 19);
      Shape2.addBox(-4F, -3F, -5F, 8, 3, 3);
      Shape2.setRotationPoint(0F, 5F, -8F);
      Shape2.setTextureSize(128, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -2F, 8, 8, 8);
      head.setRotationPoint(0F, 5F, -8F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 35, 16);
      body.addBox(-4F, -2F, -2F, 11, 14, 6);
      body.setRotationPoint(-2F, 6F, -4F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0.5410521F, 0F, 0F);
      rightarm = new ModelRenderer(this, 76, 1);
      rightarm.addBox(-4F, -2F, -2F, 5, 21, 5);
      rightarm.setRotationPoint(-7F, 6F, -3F);
      rightarm.setTextureSize(128, 64);
      rightarm.mirror = true;
      setRotation(rightarm, -0.1047198F, 0F, 0F);
      leftarm = new ModelRenderer(this, 76, 1);
      leftarm.addBox(-1F, -2F, -2F, 5, 20, 5);
      leftarm.setRotationPoint(6F, 6F, -3F);
      leftarm.setTextureSize(128, 64);
      leftarm.mirror = true;
      setRotation(leftarm, -0.1047198F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 29);
      rightleg.addBox(-3F, 0F, -2F, 5, 8, 4);
      rightleg.setRotationPoint(-3F, 16F, 1F);
      rightleg.setTextureSize(128, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 29);
      leftleg.addBox(-2F, 0F, -2F, 5, 8, 4);
      leftleg.setRotationPoint(2F, 16F, 1F);
      leftleg.setTextureSize(128, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
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
    this.Shape1.rotateAngleY = head.rotateAngleY;
    this.Shape2.rotateAngleY = head.rotateAngleY;
    this.Shape1.rotateAngleX = head.rotateAngleX;
    this.Shape2.rotateAngleX = head.rotateAngleX;
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
