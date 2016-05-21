package com.DwainEdwards.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelPIKACHU extends ModelBase
{
  //fields
    ModelRenderer EarRight;
    ModelRenderer EarLeft;
    ModelRenderer TailMainPiece;
    ModelRenderer TailCurve;
    ModelRenderer TailEnd;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
  
  public ModelPIKACHU()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      EarRight = new ModelRenderer(this, 0, 32);
      EarRight.addBox(-3F, -9F, -1F, 1, 4, 1);
      EarRight.setRotationPoint(0F, 17F, 0F);
      EarRight.setTextureSize(128, 64);
      EarRight.mirror = true;
      setRotation(EarRight, 0.122173F, 0F, 0F);
      EarLeft = new ModelRenderer(this, 0, 32);
      EarLeft.addBox(1F, -9F, -1F, 1, 4, 1);
      EarLeft.setRotationPoint(0F, 17F, 0F);
      EarLeft.setTextureSize(128, 64);
      EarLeft.mirror = true;
      setRotation(EarLeft, 0.122173F, 0F, 0F);
      TailMainPiece = new ModelRenderer(this, 9, 32);
      TailMainPiece.addBox(1F, 0F, 2F, 2, 4, 1);
      TailMainPiece.setRotationPoint(1F, 16F, 0F);
      TailMainPiece.setTextureSize(128, 64);
      TailMainPiece.mirror = true;
      setRotation(TailMainPiece, -0.0872665F, 0.0872665F, 0.9948377F);
      TailCurve = new ModelRenderer(this, 12, 39);
      TailCurve.addBox(1F, -2F, 2F, 4, 2, 1);
      TailCurve.setRotationPoint(1F, 16F, 0F);
      TailCurve.setTextureSize(128, 64);
      TailCurve.mirror = true;
      setRotation(TailCurve, -0.0872665F, 0.0872665F, 0.9948377F);
      TailEnd = new ModelRenderer(this, 17, 32);
      TailEnd.addBox(3F, -6F, 2F, 2, 4, 1);
      TailEnd.setRotationPoint(1F, 16F, 0F);
      TailEnd.setTextureSize(128, 64);
      TailEnd.mirror = true;
      setRotation(TailEnd, -0.0872665F, 0.0872665F, 0.9948377F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-3F, -5F, -2F, 5, 4, 4);
      head.setRotationPoint(0F, 17F, 0F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 5, 5, 4);
      body.setRotationPoint(1F, 16F, 0F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-2F, -1F, -2F, 2, 4, 2);
      rightarm.setRotationPoint(-3F, 17F, 0F);
      rightarm.setTextureSize(128, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0.0872665F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(0F, -1F, -2F, 2, 4, 2);
      leftarm.setRotationPoint(2F, 17F, 0F);
      leftarm.setTextureSize(128, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, -0.1396263F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -1F, 2, 3, 2);
      rightleg.setRotationPoint(-1F, 21F, 0F);
      rightleg.setTextureSize(128, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -1F, 2, 3, 2);
      leftleg.setRotationPoint(2F, 21F, 0F);
      leftleg.setTextureSize(128, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    EarRight.render(f5);
    EarLeft.render(f5);
    TailMainPiece.render(f5);
    TailCurve.render(f5);
    TailEnd.render(f5);
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
    this.EarRight.rotateAngleX = this.head.rotateAngleX;
    this.EarLeft.rotateAngleX = this.head.rotateAngleX;
    this.EarRight.rotateAngleY = this.head.rotateAngleY;
    this.EarLeft.rotateAngleY = this.head.rotateAngleY;
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
