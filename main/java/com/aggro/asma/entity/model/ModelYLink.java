package com.aggro.asma.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelYLink extends ModelBase
{
	public int heldItemLeft;
    public int heldItemRight;
    public boolean isSneak;
    public boolean aimedBow;
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer rightleg;
    ModelRenderer leftarm;
    ModelRenderer leftleg;
    ModelRenderer Sword_Sheeth;
    ModelRenderer Tunic_Back;
    ModelRenderer Sword_1;
    ModelRenderer Sword_2;
    ModelRenderer Sheild;
    ModelRenderer Sword_3;
    ModelRenderer Sword_4;
  
  public ModelYLink()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -11F, -2F, 7, 7, 7);
      head.setRotationPoint(0F, 6F, -2F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 7, 9, 3);
      body.setRotationPoint(0F, 6F, 0F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 3, 9, 3);
      rightarm.setRotationPoint(-4F, 8F, 0F);
      rightarm.setTextureSize(128, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0.4833219F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 3, 9, 3);
      rightleg.setRotationPoint(-2F, 15F, 0F);
      rightleg.setTextureSize(128, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 3, 9, 3);
      leftarm.setRotationPoint(4F, 8F, 0F);
      leftarm.setTextureSize(128, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, -0.4833219F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 3, 9, 3);
      leftleg.setRotationPoint(2F, 15F, 0F);
      leftleg.setTextureSize(128, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      Sword_Sheeth = new ModelRenderer(this, 0, 34);
      Sword_Sheeth.addBox(-1F, -5F, 1F, 2, 12, 2);
      Sword_Sheeth.setRotationPoint(0F, 7F, 0F);
      Sword_Sheeth.setTextureSize(128, 64);
      Sword_Sheeth.mirror = true;
      setRotation(Sword_Sheeth, 0F, -0.0371786F, 0.8922867F);
      Tunic_Back = new ModelRenderer(this, 29, 0);
      Tunic_Back.addBox(-3F, -12F, 1F, 5, 7, 8);
      Tunic_Back.setRotationPoint(0F, 6F, -2F);
      Tunic_Back.setTextureSize(128, 64);
      Tunic_Back.mirror = true;
      setRotation(Tunic_Back, 0F, 0F, 0F);
      Sword_1 = new ModelRenderer(this, 16, 33);
      Sword_1.addBox(0F, 3F, 5F, 1, 7, 1);
      Sword_1.setRotationPoint(4F, 8F, 0F);
      Sword_1.setTextureSize(128, 64);
      Sword_1.mirror = true;
      setRotation(Sword_1, -1.623156F, 0F, -0.4833166F);
      Sword_2 = new ModelRenderer(this, 17, 45);
      Sword_2.addBox(0F, 1F, 5F, 1, 2, 1);
      Sword_2.setRotationPoint(4F, 8F, 0F);
      Sword_2.setTextureSize(128, 64);
      Sword_2.mirror = true;
      setRotation(Sword_2, -1.623156F, 0F, -0.4833166F);
      Sheild = new ModelRenderer(this, 58, 0);
      Sheild.addBox(-4F, 1F, -4F, 1, 8, 8);
      Sheild.setRotationPoint(-4F, 8F, 0F);
      Sheild.setTextureSize(128, 64);
      Sheild.mirror = true;
      setRotation(Sheild, 0F, 0F, 0.4833166F);
      Sword_3 = new ModelRenderer(this, 23, 44);
      Sword_3.addBox(0F, 2F, 4F, 1, 2, 1);
      Sword_3.setRotationPoint(4F, 8F, 0F);
      Sword_3.setTextureSize(128, 64);
      Sword_3.mirror = true;
      setRotation(Sword_3, -1.623156F, 0F, -0.4833166F);
      Sword_4 = new ModelRenderer(this, 23, 44);
      Sword_4.addBox(0F, 2F, 6F, 1, 2, 1);
      Sword_4.setRotationPoint(4F, 8F, 0F);
      Sword_4.setTextureSize(128, 64);
      Sword_4.mirror = true;
      setRotation(Sword_4, -1.623156F, 0F, -0.4833166F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    rightleg.render(f5);
    leftarm.render(f5);
    leftleg.render(f5);
    Sword_Sheeth.render(f5);
    Tunic_Back.render(f5);
    Sword_1.render(f5);
    Sword_2.render(f5);
    Sheild.render(f5);
    Sword_3.render(f5);
    Sword_4.render(f5);
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
    this.Tunic_Back.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.Tunic_Back.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
    this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
    this.rightarm.rotateAngleZ = 0.0F;
    this.leftarm.rotateAngleZ = 0.0F;
    this.rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.rightleg.rotateAngleY = 0.0F;
    this.leftleg.rotateAngleY = 0.0F;

    if (this.isRiding)
    {
        this.rightarm.rotateAngleX += -((float)Math.PI / 5F);
        this.leftarm.rotateAngleX += -((float)Math.PI / 5F);
        this.rightleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
        this.leftleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
        this.rightleg.rotateAngleY = ((float)Math.PI / 10F);
        this.leftleg.rotateAngleY = -((float)Math.PI / 10F);
    }

    if (this.heldItemLeft != 0)
    {
        this.leftarm.rotateAngleX = this.leftarm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemLeft;
    }

    if (this.heldItemRight != 0)
    {
        this.rightarm.rotateAngleX = this.rightarm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemRight;
    }

    this.rightarm.rotateAngleY = 0.0F;
    this.leftarm.rotateAngleY = 0.0F;
    float f6;
    float f7;

    if (this.onGround > -9990.0F)
    {
        f6 = this.onGround;
        this.body.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
        this.rightarm.rotationPointZ = MathHelper.sin(this.body.rotateAngleY) * 5.0F;
        this.rightarm.rotationPointX = -MathHelper.cos(this.body.rotateAngleY) * 5.0F;
        this.leftarm.rotationPointZ = -MathHelper.sin(this.body.rotateAngleY) * 5.0F;
        this.leftarm.rotationPointX = MathHelper.cos(this.body.rotateAngleY) * 5.0F;
        this.rightarm.rotateAngleY += this.body.rotateAngleY;
        this.leftarm.rotateAngleY += this.body.rotateAngleY;
        this.leftarm.rotateAngleX += this.body.rotateAngleY;
        f6 = 1.0F - this.onGround;
        f6 *= f6;
        f6 *= f6;
        f6 = 1.0F - f6;
        f7 = MathHelper.sin(f6 * (float)Math.PI);
        float f8 = MathHelper.sin(this.onGround * (float)Math.PI) * -(this.head.rotateAngleX - 0.7F) * 0.75F;
        this.rightarm.rotateAngleX = (float)((double)this.rightarm.rotateAngleX - ((double)f7 * 1.2D + (double)f8));
        this.rightarm.rotateAngleY += this.body.rotateAngleY * 2.0F;
        this.rightarm.rotateAngleZ = MathHelper.sin(this.onGround * (float)Math.PI) * -0.4F;
    }

    if (this.isSneak)
    {
        this.body.rotateAngleX = 0.5F;
        this.rightarm.rotateAngleX += 0.4F;
        this.leftarm.rotateAngleX += 0.4F;
        this.rightleg.rotationPointZ = 4.0F;
        this.leftleg.rotationPointZ = 4.0F;
        this.rightleg.rotationPointY = 9.0F;
        this.leftleg.rotationPointY = 9.0F;
        this.head.rotationPointY = 1.0F;

    }
    else
    {
        this.body.rotateAngleX = 0.0F;
        this.rightleg.rotationPointZ = 0.1F;
        this.leftleg.rotationPointZ = 0.1F;
        this.rightleg.rotationPointY = 12.0F;
        this.leftleg.rotationPointY = 12.0F;
        this.head.rotationPointY = 0.0F;

    }

    this.rightarm.rotateAngleZ += MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
    this.leftarm.rotateAngleZ -= MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
    this.rightarm.rotateAngleX += MathHelper.sin(f2 * 0.067F) * 0.05F;
    this.leftarm.rotateAngleX -= MathHelper.sin(f2 * 0.067F) * 0.05F;

    if (this.aimedBow)
    {
        f6 = 0.0F;
        f7 = 0.0F;
        this.rightarm.rotateAngleZ = 0.0F;
        this.leftarm.rotateAngleZ = 0.0F;
        this.rightarm.rotateAngleY = -(0.1F - f6 * 0.6F) + this.head.rotateAngleY;
        this.leftarm.rotateAngleY = 0.1F - f6 * 0.6F + this.head.rotateAngleY + 0.4F;
        this.rightarm.rotateAngleX = -((float)Math.PI / 2F) + this.head.rotateAngleX;
        this.leftarm.rotateAngleX = -((float)Math.PI / 2F) + this.head.rotateAngleX;
        this.rightarm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        this.leftarm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        this.rightarm.rotateAngleZ += MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
        this.leftarm.rotateAngleZ -= MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
        this.rightarm.rotateAngleX += MathHelper.sin(f2 * 0.067F) * 0.05F;
        this.leftarm.rotateAngleX -= MathHelper.sin(f2 * 0.067F) * 0.05F;
    }
  }

}
