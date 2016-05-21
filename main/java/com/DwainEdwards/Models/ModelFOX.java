package com.DwainEdwards.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelFOX extends ModelBase
{
  //fields
    ModelRenderer Snout;
    ModelRenderer Jaw;
    ModelRenderer VisorGlas;
    ModelRenderer VisorLeft;
    ModelRenderer VisorRight;
    ModelRenderer EarLeft;
    ModelRenderer EarRight;
    ModelRenderer Deflector;
    ModelRenderer Tail;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
  
  public ModelFOX()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Snout = new ModelRenderer(this, 34, 0);
      Snout.addBox(-2F, -3F, -7F, 4, 2, 3);
      Snout.setRotationPoint(0F, 0F, 0F);
      Snout.setTextureSize(128, 64);
      Snout.mirror = true;
      setRotation(Snout, 0F, 0F, 0F);
      Jaw = new ModelRenderer(this, 35, 7);
      Jaw.addBox(-1F, -1F, -7F, 2, 1, 3);
      Jaw.setRotationPoint(0F, 0F, 0F);
      Jaw.setTextureSize(128, 64);
      Jaw.mirror = true;
      setRotation(Jaw, 0F, 0F, 0F);
      VisorGlas = new ModelRenderer(this, 62, 0);
      VisorGlas.addBox(-4F, -6F, -6F, 4, 2, 1);
      VisorGlas.setRotationPoint(0F, 0F, 0F);
      VisorGlas.setTextureSize(128, 64);
      VisorGlas.mirror = true;
      setRotation(VisorGlas, 0F, 0F, 0F);
      VisorLeft = new ModelRenderer(this, 60, 9);
      VisorLeft.addBox(-5F, -6F, -5F, 1, 2, 10);
      VisorLeft.setRotationPoint(0F, 0F, 0F);
      VisorLeft.setTextureSize(128, 64);
      VisorLeft.mirror = true;
      setRotation(VisorLeft, 0F, 0F, 0F);
      VisorRight = new ModelRenderer(this, 83, 0);
      VisorRight.addBox(-4F, -6F, -1F, 9, 2, 6);
      VisorRight.setRotationPoint(0F, 0F, 0F);
      VisorRight.setTextureSize(128, 64);
      VisorRight.mirror = true;
      setRotation(VisorRight, 0F, 0F, 0F);
      EarLeft = new ModelRenderer(this, 61, 23);
      EarLeft.addBox(2F, -11F, 0F, 2, 3, 1);
      EarLeft.setRotationPoint(0F, 0F, 0F);
      EarLeft.setTextureSize(128, 64);
      EarLeft.mirror = true;
      setRotation(EarLeft, 0F, 0F, 0F);
      EarRight = new ModelRenderer(this, 61, 23);
      EarRight.addBox(-4F, -11F, 0F, 2, 3, 1);
      EarRight.setRotationPoint(0F, 0F, 0F);
      EarRight.setTextureSize(128, 64);
      EarRight.mirror = true;
      setRotation(EarRight, 0F, 0F, 0F);
      Deflector = new ModelRenderer(this, 26, 37);
      Deflector.addBox(2F, 0F, -2F, 1, 3, 3);
      Deflector.setRotationPoint(2F, 12F, 0F);
      Deflector.setTextureSize(128, 64);
      Deflector.mirror = true;
      setRotation(Deflector, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 0, 34);
      Tail.addBox(-1F, 9F, 2F, 2, 2, 8);
      Tail.setRotationPoint(0F, 0F, 0F);
      Tail.setTextureSize(128, 64);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 50, 0);
      Shape1.addBox(-1F, -4F, -8F, 2, 2, 2);
      Shape1.setRotationPoint(0F, 0F, 0F);
      Shape1.setTextureSize(128, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 52);
      Shape2.addBox(-2F, 8F, 4F, 4, 4, 4);
      Shape2.setRotationPoint(0F, 0F, 0F);
      Shape2.setTextureSize(128, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-5F, 2F, 0F);
      rightarm.setTextureSize(128, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.setTextureSize(128, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(128, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(128, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5,entity);
    Snout.render(f5);
    Jaw.render(f5);
    VisorGlas.render(f5);
    VisorLeft.render(f5);
    VisorRight.render(f5);
    EarLeft.render(f5);
    EarRight.render(f5);
    Deflector.render(f5);
    Tail.render(f5);
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
    super.setRotationAngles(f, f1, f2, f3, f4, f5,entity);
    this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.Shape1.rotateAngleY = head.rotateAngleY;
    this.Shape1.rotateAngleX = head.rotateAngleX;
    this.Jaw.rotateAngleY = head.rotateAngleY;
    this.Jaw.rotateAngleX = head.rotateAngleX;
    this.VisorGlas.rotateAngleY = head.rotateAngleY;
    this.VisorGlas.rotateAngleX = head.rotateAngleX;
    this.VisorLeft.rotateAngleY = head.rotateAngleY;
    this.VisorLeft.rotateAngleX = head.rotateAngleX;
    this.VisorRight.rotateAngleY = head.rotateAngleY;
    this.VisorRight.rotateAngleX = head.rotateAngleX;
    this.EarLeft.rotateAngleY = head.rotateAngleY;
    this.EarLeft.rotateAngleX = head.rotateAngleX;
    this.EarRight.rotateAngleY = head.rotateAngleY;
    this.EarRight.rotateAngleX = head.rotateAngleX;
    this.Snout.rotateAngleY = head.rotateAngleY;
    this.Snout.rotateAngleX = head.rotateAngleX;
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
