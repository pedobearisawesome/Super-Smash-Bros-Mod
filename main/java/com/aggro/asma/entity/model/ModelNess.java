package com.aggro.asma.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNess extends ModelBase
{
  //fields
    ModelRenderer HatTop;
    ModelRenderer Backpack;
    ModelRenderer rightleg;
    ModelRenderer rightarm;
    ModelRenderer leftleg;
    ModelRenderer HatBottom;
    ModelRenderer leftarm;
    ModelRenderer body;
    ModelRenderer head;
  
  public ModelNess()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      HatTop = new ModelRenderer(this, 32, 0);
      HatTop.addBox(-3F, -10F, -3F, 5, 2, 5);
      HatTop.setRotationPoint(0F, 9F, 0F);
      HatTop.setTextureSize(128, 64);
      HatTop.mirror = true;
      setRotation(HatTop, 0F, 0F, 0F);
      Backpack = new ModelRenderer(this, 0, 30);
      Backpack.addBox(-4F, 0F, 1F, 7, 8, 4);
      Backpack.setRotationPoint(0F, 8F, 0F);
      Backpack.setTextureSize(128, 64);
      Backpack.mirror = true;
      setRotation(Backpack, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 3, 8, 3);
      rightleg.setRotationPoint(-2F, 16F, 0F);
      rightleg.setTextureSize(128, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 3, 8, 3);
      rightarm.setRotationPoint(-4F, 10F, 0F);
      rightarm.setTextureSize(128, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 3, 8, 3);
      leftleg.setRotationPoint(2F, 16F, 0F);
      leftleg.setTextureSize(128, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      HatBottom = new ModelRenderer(this, 55, 0);
      HatBottom.addBox(-6F, -8F, -4F, 2, 1, 7);
      HatBottom.setRotationPoint(0F, 9F, 0F);
      HatBottom.setTextureSize(128, 64);
      HatBottom.mirror = true;
      setRotation(HatBottom, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 3, 8, 3);
      leftarm.setRotationPoint(4F, 10F, 0F);
      leftarm.setTextureSize(128, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 7, 8, 3);
      body.setRotationPoint(0F, 8F, 0F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 7, 7, 7);
      head.setRotationPoint(0F, 9F, 0F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    HatTop.render(f5);
    Backpack.render(f5);
    rightleg.render(f5);
    rightarm.render(f5);
    leftleg.render(f5);
    HatBottom.render(f5);
    leftarm.render(f5);
    body.render(f5);
    head.render(f5);
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
