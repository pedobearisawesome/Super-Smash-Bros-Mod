package com.DwainEdwards.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelLink extends ModelBase
{
  //fields
    ModelRenderer TunicHat;
    ModelRenderer ShieldMain;
    ModelRenderer ShieldFront;
    ModelRenderer ShieldBack;
    ModelRenderer ShieldTBack;
    ModelRenderer SwordHilt;
    ModelRenderer SwordHilt2;
    ModelRenderer SwordHilt3;
    ModelRenderer SwordHilt4;
    ModelRenderer SwordBase;
    ModelRenderer SwordMid;
    ModelRenderer SwordTip;
    ModelRenderer TunicBelt;
    ModelRenderer Sheath;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
  
  public ModelLink()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      TunicHat = new ModelRenderer(this, 59, 0);
      TunicHat.addBox(-3F, -9F, -3F, 6, 8, 8);
      TunicHat.setRotationPoint(0F, 0F, 0F);
      TunicHat.setTextureSize(128, 64);
      TunicHat.mirror = true;
      setRotation(TunicHat, 0F, 0F, 0F);
      ShieldMain = new ModelRenderer(this, 45, 37);
      ShieldMain.addBox(3F, 3F, -4F, 1, 8, 8);
      ShieldMain.setRotationPoint(5F, 2F, 0F);
      ShieldMain.setTextureSize(128, 64);
      ShieldMain.mirror = true;
      setRotation(ShieldMain, 0F, 0F, 0F);
      ShieldFront = new ModelRenderer(this, 39, 44);
      ShieldFront.addBox(3F, 4F, -5F, 1, 6, 1);
      ShieldFront.setRotationPoint(5F, 2F, 0F);
      ShieldFront.setTextureSize(128, 64);
      ShieldFront.mirror = true;
      setRotation(ShieldFront, 0F, 0F, 0F);
      ShieldBack = new ModelRenderer(this, 65, 46);
      ShieldBack.addBox(3F, 4F, 4F, 1, 6, 1);
      ShieldBack.setRotationPoint(5F, 2F, 0F);
      ShieldBack.setTextureSize(128, 64);
      ShieldBack.mirror = true;
      setRotation(ShieldBack, 0F, 0F, 0F);
      ShieldTBack = new ModelRenderer(this, 39, 57);
      ShieldTBack.addBox(3F, 5F, 5F, 1, 4, 1);
      ShieldTBack.setRotationPoint(5F, 2F, 0F);
      ShieldTBack.setTextureSize(128, 64);
      ShieldTBack.mirror = true;
      setRotation(ShieldTBack, 0F, 0F, 0F);
      SwordHilt = new ModelRenderer(this, 97, 0);
      SwordHilt.addBox(-1F, 8F, -4F, 1, 1, 7);
      SwordHilt.setRotationPoint(-5F, 2F, 0F);
      SwordHilt.setTextureSize(128, 64);
      SwordHilt.mirror = true;
      setRotation(SwordHilt, 0F, 0F, 0F);
      SwordHilt2 = new ModelRenderer(this, 103, 11);
      SwordHilt2.addBox(-1F, 6F, -5F, 1, 5, 1);
      SwordHilt2.setRotationPoint(-5F, 2F, 0F);
      SwordHilt2.setTextureSize(128, 64);
      SwordHilt2.mirror = true;
      setRotation(SwordHilt2, 0F, 0F, 0F);
      SwordHilt3 = new ModelRenderer(this, 94, 21);
      SwordHilt3.addBox(-1F, 8.7F, -9.5F, 1, 1, 2);
      SwordHilt3.setRotationPoint(-5F, 2F, 0F);
      SwordHilt3.setTextureSize(128, 64);
      SwordHilt3.mirror = true;
      setRotation(SwordHilt3, 0.296706F, 0F, 0F);
      convertToChild(SwordHilt2, SwordHilt3);
      SwordHilt4 = new ModelRenderer(this, 94, 21);
      SwordHilt4.addBox(-1F, 6.5F, -4.5F, 1, 1, 2);
      SwordHilt4.setRotationPoint(-5F, 2F, 0F);
      SwordHilt4.setTextureSize(128, 64);
      SwordHilt4.mirror = true;
      setRotation(SwordHilt4, -0.296706F, 0F, 0F);
      convertToChild(SwordHilt2, SwordHilt4);
      SwordBase = new ModelRenderer(this, 102, 20);
      SwordBase.addBox(-1F, 8F, -8F, 1, 1, 3);
      SwordBase.setRotationPoint(-5F, 2F, 0F);
      SwordBase.setTextureSize(128, 64);
      SwordBase.mirror = true;
      setRotation(SwordBase, 0F, 0F, 0F);
      SwordMid = new ModelRenderer(this, 92, 28);
      SwordMid.addBox(-1F, 7F, -17F, 1, 3, 9);
      SwordMid.setRotationPoint(-5F, 2F, 0F);
      SwordMid.setTextureSize(128, 64);
      SwordMid.mirror = true;
      setRotation(SwordMid, 0F, 0F, 0F);
      SwordTip = new ModelRenderer(this, 100, 44);
      SwordTip.addBox(-1F, 8F, -18F, 1, 1, 1);
      SwordTip.setRotationPoint(-5F, 2F, 0F);
      SwordTip.setTextureSize(128, 64);
      SwordTip.mirror = true;
      setRotation(SwordTip, 0F, 0F, 0F);
      TunicBelt = new ModelRenderer(this, 18, 35);
      TunicBelt.addBox(-4F, -3F, -3F, 1, 16, 6);
      TunicBelt.setRotationPoint(0F, 0F, 0F);
      TunicBelt.setTextureSize(128, 64);
      TunicBelt.mirror = true;
      setRotation(TunicBelt, 0F, 0F, -0.6283185F);
      Sheath = new ModelRenderer(this, 0, 34);
      Sheath.addBox(-5F, -4F, 3F, 3, 19, 2);
      Sheath.setRotationPoint(0F, 0F, 0F);
      Sheath.setTextureSize(128, 64);
      Sheath.mirror = true;
      setRotation(Sheath, 0F, 0F, -0.4363323F);
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
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    TunicHat.render(f5);
    ShieldMain.render(f5);
    ShieldFront.render(f5);
    ShieldBack.render(f5);
    ShieldTBack.render(f5);
    SwordHilt.render(f5);
    SwordHilt2.render(f5);
    SwordBase.render(f5);
    SwordMid.render(f5);
    SwordTip.render(f5);
    TunicBelt.render(f5);
    Sheath.render(f5);
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
  
  protected void convertToChild(ModelRenderer parParent, ModelRenderer parChild)
  {
     // move child rotation point to be relative to parent
     parChild.rotationPointX -= parParent.rotationPointX;
     parChild.rotationPointY -= parParent.rotationPointY;
     parChild.rotationPointZ -= parParent.rotationPointZ;
     // make rotations relative to parent
     parChild.rotateAngleX -= parParent.rotateAngleX;
     parChild.rotateAngleY -= parParent.rotateAngleY;
     parChild.rotateAngleZ -= parParent.rotateAngleZ;
     // create relationship
     parParent.addChild(parChild);
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.TunicHat.rotateAngleY = head.rotateAngleY;
    this.TunicHat.rotateAngleX = head.rotateAngleX;
    this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
    this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
    this.rightarm.rotateAngleZ = 0.0F;
    this.leftarm.rotateAngleZ = 0.0F;
    this.rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.rightleg.rotateAngleY = 0.0F;
    this.leftleg.rotateAngleY = 0.0F;
    this.ShieldMain.rotateAngleY = leftarm.rotateAngleY;
    this.ShieldMain.rotateAngleX = leftarm.rotateAngleX;
    this.ShieldFront.rotateAngleY = leftarm.rotateAngleY;
    this.ShieldFront.rotateAngleX = leftarm.rotateAngleX;
    this.ShieldBack.rotateAngleY = leftarm.rotateAngleY;
    this.ShieldBack.rotateAngleX = leftarm.rotateAngleX;
    this.ShieldTBack.rotateAngleY = leftarm.rotateAngleY;
    this.ShieldTBack.rotateAngleX = leftarm.rotateAngleX;
    this.SwordHilt.rotateAngleX = rightarm.rotateAngleX;
    this.SwordHilt2.rotateAngleX = rightarm.rotateAngleX;
    this.SwordBase.rotateAngleX = rightarm.rotateAngleX;
    this.SwordMid.rotateAngleX = rightarm.rotateAngleX;
    this.SwordTip.rotateAngleX = rightarm.rotateAngleX;
    this.SwordHilt.rotateAngleY = rightarm.rotateAngleY;
    this.SwordHilt2.rotateAngleY = rightarm.rotateAngleY;
    this.SwordBase.rotateAngleY = rightarm.rotateAngleY;
    this.SwordMid.rotateAngleY = rightarm.rotateAngleY;
    this.SwordTip.rotateAngleY = rightarm.rotateAngleY;
  }

}
