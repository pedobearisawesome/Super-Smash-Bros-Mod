package com.aggro.asma.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMarth extends ModelBase
{
  //fields
    ModelRenderer ArmrightShoulder;
    ModelRenderer ArmLeftShoulder;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer Sheeth;
    ModelRenderer Cape;
    ModelRenderer rightarm;
  
  public ModelMarth()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      ArmrightShoulder = new ModelRenderer(this, 37, 0);
      ArmrightShoulder.addBox(-4F, -3F, -2F, 5, 2, 6);
      ArmrightShoulder.setRotationPoint(-5F, 2F, -1F);
      ArmrightShoulder.setTextureSize(128, 64);
      ArmrightShoulder.mirror = true;
      setRotation(ArmrightShoulder, 0F, 0F, 0F);
      ArmLeftShoulder = new ModelRenderer(this, 62, 0);
      ArmLeftShoulder.addBox(-1F, -3F, -2F, 5, 2, 6);
      ArmLeftShoulder.setRotationPoint(5F, 2F, -1F);
      ArmLeftShoulder.setTextureSize(128, 64);
      ArmLeftShoulder.mirror = true;
      setRotation(ArmLeftShoulder, 0F, 0F, -0.260246F);
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
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.setTextureSize(128, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, -0.3717861F);
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
      Sheeth = new ModelRenderer(this, 0, 36);
      Sheeth.addBox(0F, -3F, -2F, 2, 9, 2);
      Sheeth.setRotationPoint(4F, 10F, 0F);
      Sheeth.setTextureSize(128, 64);
      Sheeth.mirror = true;
      setRotation(Sheeth, 0.2974289F, 0F, 0F);
      Cape = new ModelRenderer(this, 17, 35);
      Cape.addBox(-5F, 0F, 0F, 10, 15, 1);
      Cape.setRotationPoint(0F, 0F, 2F);
      Cape.setTextureSize(128, 64);
      Cape.mirror = true;
      setRotation(Cape, 0.5205006F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-5F, 2F, 0F);
      rightarm.setTextureSize(128, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    ArmrightShoulder.render(f5);
    ArmLeftShoulder.render(f5);
    head.render(f5);
    body.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
    Sheeth.render(f5);
    Cape.render(f5);
    rightarm.render(f5);
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
