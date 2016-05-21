package com.aggro.asma.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRyu extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer leftleg;
    ModelRenderer FirstLeft;
    ModelRenderer BeltTie;
    ModelRenderer FistRight;
    ModelRenderer rightleg;
    ModelRenderer BeltString2;
    ModelRenderer BackNot;
    ModelRenderer BeltString1;
    ModelRenderer BackString1;
    ModelRenderer BackString2;
  
  public ModelRyu()
  {
    textureWidth = 128;
    textureHeight = 64;
    
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
      setRotation(rightarm, 0F, 0F, 0.2443461F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.setTextureSize(128, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, -0.2443461F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(128, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      FirstLeft = new ModelRenderer(this, 36, 0);
      FirstLeft.addBox(-2F, 5F, -3F, 6, 6, 6);
      FirstLeft.setRotationPoint(5F, 2F, 0F);
      FirstLeft.setTextureSize(128, 64);
      FirstLeft.mirror = true;
      setRotation(FirstLeft, 0F, 0F, -0.2443461F);
      BeltTie = new ModelRenderer(this, 10, 35);
      BeltTie.addBox(-1F, 10F, -3F, 2, 2, 1);
      BeltTie.setRotationPoint(0F, 0F, 0F);
      BeltTie.setTextureSize(128, 64);
      BeltTie.mirror = true;
      setRotation(BeltTie, 0F, 0F, 0F);
      FistRight = new ModelRenderer(this, 37, 0);
      FistRight.addBox(-4F, 5F, -3F, 6, 6, 6);
      FistRight.setRotationPoint(-5F, 2F, 0F);
      FistRight.setTextureSize(128, 64);
      FistRight.mirror = true;
      setRotation(FistRight, 0F, 0F, 0.2443461F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(128, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      BeltString2 = new ModelRenderer(this, 10, 40);
      BeltString2.addBox(-1F, 12F, -3F, 1, 3, 1);
      BeltString2.setRotationPoint(0F, 0F, 0F);
      BeltString2.setTextureSize(128, 64);
      BeltString2.mirror = true;
      setRotation(BeltString2, 0F, 0.2443461F, 0F);
      BackNot = new ModelRenderer(this, 1, 35);
      BackNot.addBox(-1F, -5F, 4F, 2, 2, 1);
      BackNot.setRotationPoint(0F, 0F, 0F);
      BackNot.setTextureSize(128, 64);
      BackNot.mirror = true;
      setRotation(BackNot, 0F, 0F, 0F);
      BeltString1 = new ModelRenderer(this, 10, 40);
      BeltString1.addBox(0F, 12F, -3F, 1, 3, 1);
      BeltString1.setRotationPoint(0F, 0F, 0F);
      BeltString1.setTextureSize(128, 64);
      BeltString1.mirror = true;
      setRotation(BeltString1, 0F, -0.2094395F, 0F);
      BackString1 = new ModelRenderer(this, 0, 40);
      BackString1.addBox(0F, -3F, 4F, 1, 3, 1);
      BackString1.setRotationPoint(0F, 0F, 0F);
      BackString1.setTextureSize(128, 64);
      BackString1.mirror = true;
      setRotation(BackString1, 0F, 0.0698132F, 0F);
      BackString2 = new ModelRenderer(this, 0, 39);
      BackString2.addBox(-1F, -3F, 4F, 1, 3, 1);
      BackString2.setRotationPoint(0F, 0F, 0F);
      BackString2.setTextureSize(128, 64);
      BackString2.mirror = true;
      setRotation(BackString2, 0F, -0.0698132F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    leftleg.render(f5);
    FirstLeft.render(f5);
    BeltTie.render(f5);
    FistRight.render(f5);
    rightleg.render(f5);
    BeltString2.render(f5);
    BackNot.render(f5);
    BeltString1.render(f5);
    BackString1.render(f5);
    BackString2.render(f5);
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
  }

}
