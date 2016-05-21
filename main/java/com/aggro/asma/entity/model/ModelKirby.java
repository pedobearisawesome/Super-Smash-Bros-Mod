package com.aggro.asma.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKirby extends ModelBase
{
  //fields
    ModelRenderer Bottom;
    ModelRenderer Body;
    ModelRenderer Left;
    ModelRenderer Back;
    ModelRenderer Front;
    ModelRenderer Top;
    ModelRenderer LeftArm;
    ModelRenderer Right;
    ModelRenderer LeftLeg;
    ModelRenderer RightArm;
    ModelRenderer RightLeg;
  
  public ModelKirby()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      Bottom = new ModelRenderer(this, 0, 24);
      Bottom.addBox(0.5F, 7.5F, 0.5F, 7, 1, 7);
      Bottom.setRotationPoint(-4F, 4F, -4.033333F);
      Bottom.setTextureSize(512, 256);
      Bottom.mirror = true;
      setRotation(Bottom, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 8, 8, 8);
      Body.setRotationPoint(-4F, 4F, -4F);
      Body.setTextureSize(512, 256);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Left = new ModelRenderer(this, 48, 0);
      Left.addBox(7.5F, 0.5F, 0.5F, 1, 7, 7);
      Left.setRotationPoint(-4F, 4F, -4F);
      Left.setTextureSize(512, 256);
      Left.mirror = true;
      setRotation(Left, 0F, 0F, 0F);
      Back = new ModelRenderer(this, 32, 8);
      Back.addBox(0.5F, 0.5F, 7.5F, 7, 7, 1);
      Back.setRotationPoint(-4F, 4F, -4F);
      Back.setTextureSize(512, 256);
      Back.mirror = true;
      setRotation(Back, 0F, 0F, 0F);
      Front = new ModelRenderer(this, 32, 0);
      Front.addBox(0.5F, 0.5F, -0.5F, 7, 7, 1);
      Front.setRotationPoint(-4F, 4F, -4F);
      Front.setTextureSize(512, 256);
      Front.mirror = true;
      setRotation(Front, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 0, 16);
      Top.addBox(0.5F, -0.5F, 0.5F, 7, 1, 7);
      Top.setRotationPoint(-4F, 4F, -4F);
      Top.setTextureSize(512, 256);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      LeftArm = new ModelRenderer(this, 56, 14);
      LeftArm.addBox(0F, 0F, 0F, 2, 3, 2);
      LeftArm.setRotationPoint(3.4F, 9F, -1.5F);
      LeftArm.setTextureSize(512, 256);
      LeftArm.mirror = true;
      setRotation(LeftArm, 0F, 0F, -1.012291F);
      Right = new ModelRenderer(this, 28, 16);
      Right.addBox(-0.5F, 0.5F, 0.5F, 1, 7, 7);
      Right.setRotationPoint(-4F, 4F, -4F);
      Right.setTextureSize(512, 256);
      Right.mirror = true;
      setRotation(Right, 0F, 0F, 0F);
      LeftLeg = new ModelRenderer(this, 44, 25);
      LeftLeg.addBox(0F, 0F, 0F, 3, 2, 4);
      LeftLeg.setRotationPoint(1.5F, 12.5F, -2F);
      LeftLeg.setTextureSize(512, 256);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 0F, 0F, 0F);
      RightArm = new ModelRenderer(this, 48, 14);
      RightArm.addBox(0F, 0F, 0F, 2, 3, 2);
      RightArm.setRotationPoint(-4.5F, 7.5F, -1.5F);
      RightArm.setTextureSize(512, 256);
      RightArm.mirror = true;
      setRotation(RightArm, 0F, 0F, 1.012291F);
      RightLeg = new ModelRenderer(this, 44, 19);
      RightLeg.addBox(0F, 0F, 0F, 3, 2, 4);
      RightLeg.setRotationPoint(-4.5F, 12.5F, -2F);
      RightLeg.setTextureSize(512, 256);
      RightLeg.mirror = true;
      setRotation(RightLeg, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Bottom.render(f5);
    Body.render(f5);
    Left.render(f5);
    Back.render(f5);
    Front.render(f5);
    Top.render(f5);
    LeftArm.render(f5);
    Right.render(f5);
    LeftLeg.render(f5);
    RightArm.render(f5);
    RightLeg.render(f5);
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
