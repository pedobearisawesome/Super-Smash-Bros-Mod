package com.aggro.asma.entity.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelGreninja extends ModelBiped
{
  //fields
    ModelRenderer EarRight;
    ModelRenderer EarLeft;
    ModelRenderer Tongue;
    ModelRenderer FootRight;
    ModelRenderer FootLeft;
    ModelRenderer Frill;
    ModelRenderer FrillLeft;
    ModelRenderer FrillRight;
    ModelRenderer rightarm;
    ModelRenderer body;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer rightlegbottom;
    ModelRenderer leftlegbottom;
    ModelRenderer leftleg;
    ModelRenderer Tail;
    ModelRenderer head;
  
  public ModelGreninja()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      EarRight = new ModelRenderer(this, 86, 0);
      EarRight.addBox(-4F, -7F, 1F, 1, 3, 11);
      EarRight.setRotationPoint(0F, 0F, 0F);
      EarRight.setTextureSize(128, 64);
      EarRight.mirror = true;
      setRotation(EarRight, 0.0698132F, -0.2443461F, 0F);
      EarLeft = new ModelRenderer(this, 57, 0);
      EarLeft.addBox(3F, -7F, 1F, 1, 3, 11);
      EarLeft.setRotationPoint(0F, 0F, 0F);
      EarLeft.setTextureSize(128, 64);
      EarLeft.mirror = true;
      setRotation(EarLeft, 0.0698132F, 0.2443461F, 0F);
      Tongue = new ModelRenderer(this, 39, 0);
      Tongue.addBox(2F, 1F, 2F, 4, 13, 1);
      Tongue.setRotationPoint(0F, 0F, 0F);
      Tongue.setTextureSize(128, 64);
      Tongue.mirror = true;
      setRotation(Tongue, 0.1570796F, 0F, -0.2094395F);
      FootRight = new ModelRenderer(this, 0, 39);
      FootRight.addBox(-2F, 11F, -6F, 4, 1, 7);
      FootRight.setRotationPoint(-2F, 12F, 0F);
      FootRight.setTextureSize(128, 64);
      FootRight.mirror = true;
      setRotation(FootRight, 0F, 0F, 0F);
      FootLeft = new ModelRenderer(this, 0, 39);
      FootLeft.addBox(-2F, 11F, -6F, 4, 1, 7);
      FootLeft.setRotationPoint(2F, 12F, 0F);
      FootLeft.setTextureSize(128, 64);
      FootLeft.mirror = true;
      setRotation(FootLeft, 0F, 0F, 0F);
      Frill = new ModelRenderer(this, 86, 17);
      Frill.addBox(-1F, -6F, 0F, 2, 2, 10);
      Frill.setRotationPoint(0F, 0F, 0F);
      Frill.setTextureSize(128, 64);
      Frill.mirror = true;
      setRotation(Frill, 0.122173F, 0F, 0F);
      FrillLeft = new ModelRenderer(this, 59, 20);
      FrillLeft.addBox(-4F, -6F, 0F, 3, 1, 8);
      FrillLeft.setRotationPoint(0F, 0F, 0F);
      FrillLeft.setTextureSize(128, 64);
      FrillLeft.mirror = true;
      setRotation(FrillLeft, 0.0698132F, 0F, 0F);
      FrillRight = new ModelRenderer(this, 59, 20);
      FrillRight.addBox(1F, -6F, 0F, 3, 1, 8);
      FrillRight.setRotationPoint(0F, 0F, 0F);
      FrillRight.setTextureSize(128, 64);
      FrillRight.mirror = true;
      setRotation(FrillRight, 0.0698132F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-2F, -2F, -2F, 3, 12, 3);
      rightarm.setRotationPoint(-4F, 2F, 0F);
      rightarm.setTextureSize(128, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0.2268928F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-3F, 0F, -2F, 6, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 3, 12, 3);
      leftarm.setRotationPoint(4F, 2F, 0F);
      leftarm.setTextureSize(128, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, -0.2792527F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 6, 4);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(128, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      rightlegbottom = new ModelRenderer(this, 0, 28);
      rightlegbottom.addBox(-1F, 4F, 3F, 2, 6, 2);
      rightlegbottom.setRotationPoint(-2F, 12F, 0F);
      rightlegbottom.setTextureSize(128, 64);
      rightlegbottom.mirror = true;
      setRotation(rightlegbottom, -0.4014257F, 0F, 0F);
      leftlegbottom = new ModelRenderer(this, 0, 28);
      leftlegbottom.addBox(-1F, 4F, 3F, 2, 6, 2);
      leftlegbottom.setRotationPoint(2F, 12F, 0F);
      leftlegbottom.setTextureSize(128, 64);
      leftlegbottom.mirror = true;
      setRotation(leftlegbottom, -0.4014257F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 6, 4);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(128, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 26, 40);
      Tail.addBox(-1F, 11F, 2F, 2, 2, 4);
      Tail.setRotationPoint(0F, 0F, 0F);
      Tail.setTextureSize(128, 64);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -5F, -5F, 8, 5, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    EarRight.render(f5);
    EarLeft.render(f5);
    Tongue.render(f5);
    FootRight.render(f5);
    FootLeft.render(f5);
    Frill.render(f5);
    FrillLeft.render(f5);
    FrillRight.render(f5);
    rightarm.render(f5);
    body.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftlegbottom.render(f5);
    leftlegbottom.render(f5);
    leftleg.render(f5);
    Tail.render(f5);
    head.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
    this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.Tongue.rotateAngleX = this.head.rotateAngleX;
    this.Tongue.rotateAngleY = this.head.rotateAngleY;
    this.Frill.rotateAngleY = this.head.rotateAngleY;
    this.Frill.rotateAngleX = this.head.rotateAngleX;
    this.FrillLeft.rotateAngleY = this.head.rotateAngleY;
    this.FrillLeft.rotateAngleX = this.head.rotateAngleX;
    this.FrillRight.rotateAngleY = this.head.rotateAngleY;
    this.FrillRight.rotateAngleX = this.head.rotateAngleX;
    this.EarRight.rotateAngleY = this.head.rotateAngleY;
    this.EarRight.rotateAngleX = this.head.rotateAngleX;
    this.EarLeft.rotateAngleY = this.head.rotateAngleY;
    this.EarLeft.rotateAngleX = this.head.rotateAngleX;
    this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
    this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f * 0.5F;
    this.rightarm.rotateAngleZ = 0.0F;
    this.leftarm.rotateAngleZ = 0.0F;
    this.rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.rightleg.rotateAngleY = 0.0F;
    this.leftleg.rotateAngleY = 0.0F;
    
   
  }

}
