package com.aggro.asma.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRoy extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer leftarm;
    ModelRenderer rightarm;
    ModelRenderer Cape;
    ModelRenderer BackTie1;
    ModelRenderer BackString1;
    ModelRenderer BackString2;
    ModelRenderer Sheeth;
    ModelRenderer Shoulderleft;
    ModelRenderer Shoulderright;
    ModelRenderer FrontBody;
  
  public ModelRoy()
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
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.setTextureSize(128, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-5F, 2F, 0F);
      rightarm.setTextureSize(128, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0.3490659F);
      Cape = new ModelRenderer(this, 0, 38);
      Cape.addBox(-7F, 1F, 2F, 14, 21, 1);
      Cape.setRotationPoint(0F, 0F, 0F);
      Cape.setTextureSize(128, 64);
      Cape.mirror = true;
      setRotation(Cape, 0.296706F, 0F, 0F);
      BackTie1 = new ModelRenderer(this, 37, 1);
      BackTie1.addBox(0F, -4F, 4F, 2, 2, 1);
      BackTie1.setRotationPoint(0F, 0F, 0F);
      BackTie1.setTextureSize(128, 64);
      BackTie1.mirror = true;
      setRotation(BackTie1, 0F, 0F, 0F);
      BackString1 = new ModelRenderer(this, 38, 6);
      BackString1.addBox(0F, -2F, 4F, 1, 7, 1);
      BackString1.setRotationPoint(0F, 0F, 0F);
      BackString1.setTextureSize(128, 64);
      BackString1.mirror = true;
      setRotation(BackString1, 0F, 0F, 0.0872665F);
      BackString2 = new ModelRenderer(this, 38, 6);
      BackString2.addBox(1F, -2F, 4F, 1, 7, 1);
      BackString2.setRotationPoint(0F, 0F, 0F);
      BackString2.setTextureSize(128, 64);
      BackString2.mirror = true;
      setRotation(BackString2, 0F, 0F, -0.1047198F);
      Sheeth = new ModelRenderer(this, 33, 40);
      Sheeth.addBox(-5F, 9F, -6F, 1, 3, 15);
      Sheeth.setRotationPoint(0F, 0F, 0F);
      Sheeth.setTextureSize(128, 64);
      Sheeth.mirror = true;
      setRotation(Sheeth, 0F, 0.3665191F, 0F);
      Shoulderleft = new ModelRenderer(this, 46, 4);
      Shoulderleft.addBox(-1F, -3F, -3F, 5, 3, 6);
      Shoulderleft.setRotationPoint(5F, 2F, 0F);
      Shoulderleft.setTextureSize(128, 64);
      Shoulderleft.mirror = true;
      setRotation(Shoulderleft, 0F, 0F, 0F);
      Shoulderright = new ModelRenderer(this, 46, 4);
      Shoulderright.addBox(-4F, -3F, -3F, 5, 3, 6);
      Shoulderright.setRotationPoint(-5F, 2F, 0F);
      Shoulderright.setTextureSize(128, 64);
      Shoulderright.mirror = true;
      setRotation(Shoulderright, 0F, 0F, 0.3490659F);
      FrontBody = new ModelRenderer(this, 60, 19);
      FrontBody.addBox(-4F, 1F, -3F, 8, 4, 1);
      FrontBody.setRotationPoint(0F, 0F, 0F);
      FrontBody.setTextureSize(128, 64);
      FrontBody.mirror = true;
      setRotation(FrontBody, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
    leftarm.render(f5);
    rightarm.render(f5);
    Cape.render(f5);
    BackTie1.render(f5);
    BackString1.render(f5);
    BackString2.render(f5);
    Sheeth.render(f5);
    Shoulderleft.render(f5);
    Shoulderright.render(f5);
    FrontBody.render(f5);
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
