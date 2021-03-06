package com.stek101.projectzulu.common.mobs.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelAntRavager extends ModelBase
{
	  //fields
	    ModelRenderer HEAD;
	    ModelRenderer segment1;
	    ModelRenderer thorax;
	    ModelRenderer segment2;
	    ModelRenderer Abdomen;
	    ModelRenderer leg6;
	    ModelRenderer leg62;
	    ModelRenderer leg63;
	    ModelRenderer leg5;
	    ModelRenderer leg52;
	    ModelRenderer leg53;
	    ModelRenderer leg4;
	    ModelRenderer leg42;
	    ModelRenderer leg43;
	    ModelRenderer leg3;
	    ModelRenderer leg32;
	    ModelRenderer leg33;
	    ModelRenderer leg2;
	    ModelRenderer leg22;
	    ModelRenderer leg23;
	    ModelRenderer leg1;
	    ModelRenderer leg12;
	    ModelRenderer leg13;
	    ModelRenderer eyeRight;
	    ModelRenderer eyeLeft;
	    ModelRenderer mandibleRight;
	    ModelRenderer mandibleLeft;
	    ModelRenderer antennaeRightA;
	    ModelRenderer antennaeLeftA;
	    ModelRenderer antennaeRightB;
	    ModelRenderer antennaeLeftB;
	    ModelRenderer leg5B;
	    ModelRenderer leg3B;
	    ModelRenderer leg1B;
	    ModelRenderer leg6B;
	    ModelRenderer leg4B;
	    ModelRenderer leg2B;
	  
	  public ModelAntRavager()
	  {
	    textureWidth = 64;
	    textureHeight = 128;
	    
	    HEAD = new ModelRenderer(this, 1, 1);
	      HEAD.addBox(-5F, -4F, -8F, 9, 6, 8);
	      HEAD.setRotationPoint(1.5F, 10.5F, -7F);
	      HEAD.setTextureSize(64, 128);
	      HEAD.mirror = true;
	      setRotation(HEAD, 0.1919862F, 0F, 0F);
	      antennaeRightA = new ModelRenderer(this, 42, 77);
	      antennaeRightA.addBox(-1F, -7F, 0F, 1, 7, 1);
	      //antennaeRightA.setRotationPoint(-1F, 11F, -12F);
	      antennaeRightA.setRotationPoint(-1.5F, -2.5F, -5F);
	      antennaeRightA.setTextureSize(64, 128);
	      antennaeRightA.mirror = true;
	      setRotation(antennaeRightA, 0.5235988F, 0F, -0.1745329F);
	      HEAD.addChild(antennaeRightA);
	      antennaeRightB = new ModelRenderer(this, 42, 88);
	      antennaeRightB.addBox(-1F, -7F, 0F, 1, 7, 1);
	      //antennaeRightB.setRotationPoint(-2F, 6F, -15F);
	      antennaeRightB.setRotationPoint(0F, -6.5F, 0F);
	      antennaeRightB.setTextureSize(64, 128);
	      antennaeRightB.mirror = true;
	      setRotation(antennaeRightB, 0.5235988F, 0F, 0F);
	      antennaeRightA.addChild(antennaeRightB);
	      antennaeLeftA = new ModelRenderer(this, 36, 77);
	      antennaeLeftA.addBox(0F, -7F, 0F, 1, 7, 1);
	      //antennaeLeftA.setRotationPoint(3F, 11F, -12F);
	      antennaeLeftA.setRotationPoint(1.5F, -2.5F, -5F);
	      antennaeLeftA.setTextureSize(64, 128);
	      antennaeLeftA.mirror = true;
	      setRotation(antennaeLeftA, 0.5235988F, 0F, 0.1745329F);
	      HEAD.addChild(antennaeLeftA);
	      antennaeLeftB = new ModelRenderer(this, 36, 88);
	      antennaeLeftB.addBox(0F, -7F, 0F, 1, 7, 1);
	      //antennaeLeftB.setRotationPoint(4F, 6F, -15F);
	      antennaeLeftB.setRotationPoint(0F, -6.5F, 0F);
	      antennaeLeftB.setTextureSize(64, 128);
	      antennaeLeftB.mirror = true;
	      setRotation(antennaeLeftB, 0.5235988F, 0F, 0F);
	      antennaeLeftA.addChild(antennaeLeftB);
	      mandibleRight = new ModelRenderer(this, 45, 39);
	      mandibleRight.addBox(-2F, 0F, -5F, 2, 1, 5);
	      //mandibleRight.setRotationPoint(-1F, 13F, -14F);
	      mandibleRight.setRotationPoint(-2.5F, -2F, -7F);
	      mandibleRight.setTextureSize(64, 128);
	      mandibleRight.mirror = true;
	      setRotation(mandibleRight, 0F, -0.2617994F, 0F);
	      HEAD.addChild(mandibleRight);
	      mandibleLeft = new ModelRenderer(this, 45, 28);
	      mandibleLeft.addBox(0F, 0F, -5F, 2, 1, 5);
	      //mandibleLeft.setRotationPoint(3F, 13F, -14F);
	      mandibleLeft.setRotationPoint(1.5F, -2F, -7F);
	      mandibleLeft.setTextureSize(64, 128);
	      mandibleLeft.mirror = true;
	      setRotation(mandibleLeft, 0F, 0.2617994F, 0F);
	      HEAD.addChild(mandibleLeft);	      
	      eyeRight = new ModelRenderer(this, 45, 15);
	      eyeRight.addBox(-2F, -1F, -3F, 1, 2, 3);
	      //eyeRight.setRotationPoint(-2.5F, 12F, -11F);
	      eyeRight.setRotationPoint(-4.0F, -2F, -4F);
	      eyeRight.setTextureSize(64, 128);
	      eyeRight.mirror = true;
	      setRotation(eyeRight, 0F, 0F, 0F);
	      HEAD.addChild(eyeRight);
	      eyeLeft = new ModelRenderer(this, 45, 3);
	      eyeLeft.addBox(0F, -1F, -2F, 1, 2, 3);
	      //eyeLeft.setRotationPoint(5.5F, 12F, -12F);
	      eyeLeft.setRotationPoint(4.0F, -2F, -4F);
	      eyeLeft.setTextureSize(64, 128);
	      eyeLeft.mirror = true;
	      setRotation(eyeLeft, 0F, 0F, 0F);
	      HEAD.addChild(eyeLeft);
	      segment1 = new ModelRenderer(this, 1, 109);
	      segment1.addBox(-2F, -2F, -2F, 5, 5, 5);
	      segment1.setRotationPoint(0F, 10F, -8F);
	      segment1.setTextureSize(64, 128);
	      segment1.mirror = true;
	      setRotation(segment1, 0F, 0F, 0F);
	      thorax = new ModelRenderer(this, 1, 22);
	      thorax.addBox(-3F, -3F, -3F, 8, 7, 11);
	      thorax.setRotationPoint(0F, 11.5F, -3F);
	      thorax.setTextureSize(64, 128);
	      thorax.mirror = true;
	      setRotation(thorax, -0.2974289F, 0F, 0F);
	      segment2 = new ModelRenderer(this, 23, 109);
	      segment2.addBox(-2F, -2F, 0F, 6, 6, 7);
	      segment2.setRotationPoint(0F, 13F, 2F);
	      segment2.setTextureSize(64, 128);
	      segment2.mirror = true;
	      setRotation(segment2, 0F, 0F, 0F);
	      Abdomen = new ModelRenderer(this, 1, 49);
	      Abdomen.addBox(-4F, -4F, -7F, 10, 9, 14);
	      Abdomen.setRotationPoint(0F, 13F, 13.5F);
	      Abdomen.setTextureSize(64, 128);
	      Abdomen.mirror = true;
	      setRotation(Abdomen, 0F, 0F, 0F);
	      leg5B = new ModelRenderer(this, 1, 77);
	      leg5B.addBox(-3F, -1F, -1F, 3, 2, 2);
	      leg5B.setRotationPoint(-2F, 13F, -3F);
	      leg5B.setTextureSize(64, 128);
	      leg5B.mirror = true;
	      setRotation(leg5B, 0F, 0F, 0F);
	      leg3B = new ModelRenderer(this, 1, 77);
	      leg3B.addBox(-3F, -1F, -1F, 3, 2, 2);
	      leg3B.setRotationPoint(-2F, 13F, 1F);
	      leg3B.setTextureSize(64, 128);
	      leg3B.mirror = true;
	      setRotation(leg3B, 0F, 0F, 0F);
	      leg1B = new ModelRenderer(this, 1, 77);
	      leg1B.addBox(-3F, -1F, -1F, 3, 2, 2);
	      leg1B.setRotationPoint(-2F, 13F, 5F);
	      leg1B.setTextureSize(64, 128);
	      leg1B.mirror = true;
	      setRotation(leg1B, 0F, 0F, 0F);
	      leg6B = new ModelRenderer(this, 1, 94);
	      leg6B.addBox(0F, -1F, -1F, 3, 2, 2);
	      leg6B.setRotationPoint(4F, 13F, -3F);
	      leg6B.setTextureSize(64, 128);
	      leg6B.mirror = true;
	      setRotation(leg6B, 0F, 0F, 0F);
	      leg4B = new ModelRenderer(this, 1, 94);
	      leg4B.addBox(0F, -1F, -1F, 3, 2, 2);
	      leg4B.setRotationPoint(4F, 13F, 1F);
	      leg4B.setTextureSize(64, 128);
	      leg4B.mirror = true;
	      setRotation(leg4B, 0F, 0F, 0F);
	      leg2B = new ModelRenderer(this, 1, 94);
	      leg2B.addBox(0F, -1F, -1F, 3, 2, 2);
	      leg2B.setRotationPoint(4F, 13F, 5F);
	      leg2B.setTextureSize(64, 128);
	      leg2B.mirror = true;
	      setRotation(leg2B, 0F, 0F, 0F);
	      leg6 = new ModelRenderer(this, 1, 94);
	      leg6.addBox(0F, -1F, -1F, 8, 2, 2);
	      //leg6.setRotationPoint(6F, 16F, -3F);
	      leg6.setRotationPoint(3F, 0F, 0F);
	      leg6.setTextureSize(64, 128);
	      leg6.mirror = true;
	      setRotation(leg6, 0F, 0F, -0.7679449F);
	      leg6B.addChild(leg6);
	      leg62 = new ModelRenderer(this, 1, 102);
	      leg62.addBox(0F, -1F, -1F, 10, 2, 2);
	      //leg62.setRotationPoint(12F, 11F, -3F);
	      leg62.setRotationPoint(8F, 0F, 0F);
	      leg62.setTextureSize(64, 128);
	      leg62.mirror = true;
	      setRotation(leg62, 0F, 0F, 1.047198F);
	      leg6.addChild(leg62);
	      leg63 = new ModelRenderer(this, 23, 92);
	      leg63.addBox(0F, -1F, -1F, 3, 2, 2);
	      leg63.setRotationPoint(9F, 0F, 0F);
	      leg63.setTextureSize(64, 128);
	      leg63.mirror = true;
	      setRotation(leg63, 0F, 0F, 0.3839724F);
	      leg62.addChild(leg63);
	      leg5 = new ModelRenderer(this, 1, 77);
	      leg5.addBox(-8F, -1F, -1F, 8, 2, 2);
	      //leg5.setRotationPoint(-4F, 16F, -3F);
	      leg5.setRotationPoint(-3F, 0F, 0F);
	      leg5.setTextureSize(64, 128);
	      leg5.mirror = true;
	      setRotation(leg5, 0F, 0F, 0.6108652F);
	      leg5B.addChild(leg5);
	      leg52 = new ModelRenderer(this, 1, 84);
	      leg52.addBox(-10F, -1F, -1F, 10, 2, 2);
	      leg52.setRotationPoint(-7.5F, 0F, 0F);
	      leg52.setTextureSize(64, 128);
	      leg52.mirror = true;
	      setRotation(leg52, 0F, 0F, -1.047198F);
	      leg5.addChild(leg52);
	      leg53 = new ModelRenderer(this, 23, 76);
	      leg53.addBox(-3F, -1F, -1F, 3, 2, 2);
	      leg53.setRotationPoint(-8.5F, 0F, 0F);
	      leg53.setTextureSize(64, 128);
	      leg53.mirror = true;
	      setRotation(leg53, 0F, 0F, -0.3839724F);
	      leg52.addChild(leg53);
	      leg4 = new ModelRenderer(this, 1, 94);
	      leg4.addBox(0F, -1F, -1F, 8, 2, 2);
	      //leg4.setRotationPoint(6F, 16F, 1F);
	      leg4.setRotationPoint(3F, 0F, 0F);
	      leg4.setTextureSize(64, 128);
	      leg4.mirror = true;
	      setRotation(leg4, 0F, 0F, -0.5235988F);
	      leg4B.addChild(leg4);
	      leg42 = new ModelRenderer(this, 1, 102);
	      leg42.addBox(0F, -1F, -1F, 10, 2, 2);
	      leg42.setRotationPoint(8.5F, 0F, 0F);
	      leg42.setTextureSize(64, 128);
	      leg42.mirror = true;
	      setRotation(leg42, 0F, 0F, 1.099557F);
	      leg4.addChild(leg42);
	      leg43 = new ModelRenderer(this, 23, 92);
	      leg43.addBox(0F, -1F, -1F, 3, 2, 2);
	      leg43.setRotationPoint(8.5F, 0F, 0F);
	      leg43.setTextureSize(64, 128);
	      leg43.mirror = true;
	      setRotation(leg43, 0F, 0F, 0.0174533F);
	      leg42.addChild(leg43);
	      leg3 = new ModelRenderer(this, 1, 77);
	      leg3.addBox(-8F, -1F, -1F, 8, 2, 2);
	      leg3.setRotationPoint(-3F, 0F, 0F);
	      leg3.setTextureSize(64, 128);
	      leg3.mirror = true;
	      setRotation(leg3, 0F, 0F, 0.5235988F);
	      leg3B.addChild(leg3);
	      leg32 = new ModelRenderer(this, 1, 84);
	      leg32.addBox(-10F, -1F, -1F, 10, 2, 2);
	      leg32.setRotationPoint(-8F, 0F, 0F);
	      leg32.setTextureSize(64, 128);
	      leg32.mirror = true;
	      setRotation(leg32, 0F, 0F, -1.099557F);
	      leg3.addChild(leg32);
	      leg33 = new ModelRenderer(this, 23, 76);
	      leg33.addBox(-3F, -1F, -1F, 3, 2, 2);
	      leg33.setRotationPoint(-7.5F, 0F, 0F);
	      leg33.setTextureSize(64, 128);
	      leg33.mirror = true;
	      setRotation(leg33, 0F, 0F, -0.0174533F);
	      leg32.addChild(leg33);
	      leg2 = new ModelRenderer(this, 1, 94);
	      leg2.addBox(0F, -1F, -1F, 8, 2, 2);
	      //leg2.setRotationPoint(6F, 16F, 5F);
	      leg2.setRotationPoint(3F, 0F, 0F);
	      leg2.setTextureSize(64, 128);
	      leg2.mirror = true;
	      setRotation(leg2, 0F, 0F, -0.7853982F);
	      leg2B.addChild(leg2);
	      leg22 = new ModelRenderer(this, 1, 102);
	      leg22.addBox(0F, -1F, -1F, 10, 2, 2);
	      leg22.setRotationPoint(8F, 0F, 0F);
	      leg22.setTextureSize(64, 128);
	      leg22.mirror = true;
	      setRotation(leg22, 0F, 0F, 1.073532F);
	      leg2.addChild(leg22);
	      leg23 = new ModelRenderer(this, 23, 92);
	      leg23.addBox(0F, -1F, -1F, 3, 2, 2);
	      leg23.setRotationPoint(9F, 0F, 0F);
	      leg23.setTextureSize(64, 128);
	      leg23.mirror = true;
	      setRotation(leg23, 0F, 0F, 0.3839724F);
	      leg22.addChild(leg23);
	      leg1 = new ModelRenderer(this, 1, 77);
	      leg1.addBox(-8F, -1F, -1F, 8, 2, 2);
	      leg1.setRotationPoint(-3F, 0F, 0F);
	      leg1.setTextureSize(64, 128);
	      leg1.mirror = true;
	      setRotation(leg1, 0F, 0F, 0.5235988F);
	      leg1B.addChild(leg1);
	      leg12 = new ModelRenderer(this, 1, 84);
	      leg12.addBox(-10F, -1F, -1F, 10, 2, 2);
	      leg12.setRotationPoint(-7.5F, 0F, 0F);
	      leg12.setTextureSize(64, 128);
	      leg12.mirror = true;
	      setRotation(leg12, 0F, 0F, -1.000724F);
	      leg1.addChild(leg12);
	      leg13 = new ModelRenderer(this, 23, 76);
	      leg13.addBox(-3F, -1F, -1F, 3, 2, 2);
	      leg13.setRotationPoint(-8.5F, 0F, 0F);
	      leg13.setTextureSize(64, 128);
	      leg13.mirror = true;
	      setRotation(leg13, 0F, 0F, -0.3839724F);
	      leg12.addChild(leg13);

	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
		  super.render(entity, f, f1, f2, f3, f4, f5);
		    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		    HEAD.render(f5);
		    segment1.render(f5);
		    thorax.render(f5);
		    segment2.render(f5);
		    Abdomen.render(f5);
		    leg5B.render(f5);
		    leg3B.render(f5);
		    leg1B.render(f5);
		    leg6B.render(f5);
		    leg4B.render(f5);
		    leg2B.render(f5);
		    //leg6.render(f5);
		    //leg62.render(f5);
		    //leg63.render(f5);
		    //leg5.render(f5);
		    //leg52.render(f5);
		    //leg53.render(f5);
		    //leg4.render(f5);
		    //leg42.render(f5);
		    //leg43.render(f5);
		    //leg3.render(f5);
		    //leg32.render(f5);
		    //leg33.render(f5);
		    //leg2.render(f5);
		    //leg22.render(f5);
		    //leg23.render(f5);
		    //leg1.render(f5);
		    //leg12.render(f5);
		    //leg13.render(f5);
		    //eyeRight.render(f5);
		    //eyeLeft.render(f5);
		    //mandibleRight.render(f5);
		    //mandibleLeft.render(f5);
		    //antennaeRightA.render(f5);
		    //antennaeLeftA.render(f5);
		    //antennaeRightB.render(f5);
		    //antennaeLeftB.render(f5);

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
	        this.HEAD.rotateAngleY = f3 / (180F / (float)Math.PI);
	        this.HEAD.rotateAngleX = f4 / (180F / (float)Math.PI);
	        float f6 = ((float)Math.PI / 4F);
	        this.leg1B.rotateAngleZ = -f6;
	        this.leg2B.rotateAngleZ = f6;
	        this.leg3B.rotateAngleZ = -f6 * 0.74F;
	        this.leg4B.rotateAngleZ = f6 * 0.74F;
	        this.leg5B.rotateAngleZ = -f6 * 0.74F;
	        this.leg6B.rotateAngleZ = f6 * 0.74F;
	        //this.spiderLeg7.rotateAngleZ = -f6;
	        //this.spiderLeg8.rotateAngleZ = f6;
	        float f7 = -0.0F;
	        float f8 = 0.3926991F;
	        this.leg1B.rotateAngleY = f8 * 2.0F + f7;
	        this.leg2B.rotateAngleY = -f8 * 2.0F - f7;
	        this.leg3B.rotateAngleY = f8 * 1.0F + f7;
	        this.leg4B.rotateAngleY = -f8 * 1.0F - f7;
	        this.leg5B.rotateAngleY = -f8 * 1.0F + f7;
	        this.leg6B.rotateAngleY = f8 * 1.0F - f7;
	        //this.spiderLeg7.rotateAngleY = -f8 * 2.0F + f7;
	        //this.spiderLeg8.rotateAngleY = f8 * 2.0F - f7;
	        float f9 = -(MathHelper.cos(f * 0.6662F * 2.0F + 0.0F) * 0.4F) * f1;
	        float f10 = -(MathHelper.cos(f * 0.6662F * 2.0F + (float)Math.PI) * 0.4F) * f1;
	        float f11 = -(MathHelper.cos(f * 0.6662F * 2.0F + ((float)Math.PI / 2F)) * 0.4F) * f1;
	        float f12 = -(MathHelper.cos(f * 0.6662F * 2.0F + ((float)Math.PI * 3F / 2F)) * 0.4F) * f1;
	        float f13 = Math.abs(MathHelper.sin(f * 0.6662F + 0.0F) * 0.4F) * f1;
	        float f14 = Math.abs(MathHelper.sin(f * 0.6662F + (float)Math.PI) * 0.4F) * f1;
	        float f15 = Math.abs(MathHelper.sin(f * 0.6662F + ((float)Math.PI / 2F)) * 0.4F) * f1;
	        float f16 = Math.abs(MathHelper.sin(f * 0.6662F + ((float)Math.PI * 3F / 2F)) * 0.4F) * f1;
	        this.leg1B.rotateAngleY += f9;
	        this.leg2B.rotateAngleY += -f9;
	        this.leg3B.rotateAngleY += f10;
	        this.leg4B.rotateAngleY += -f10;
	        this.leg5B.rotateAngleY += f11;
	        this.leg6B.rotateAngleY += -f11;
	        //this.spiderLeg7.rotateAngleY += f12;
	        //this.spiderLeg8.rotateAngleY += -f12;
	        this.leg1B.rotateAngleZ += f13;
	        this.leg2B.rotateAngleZ += -f13;
	        this.leg3B.rotateAngleZ += f14;
	        this.leg4B.rotateAngleZ += -f14;
	        this.leg5B.rotateAngleZ += f15;
	        this.leg6B.rotateAngleZ += -f15;
	        //this.spiderLeg7.rotateAngleZ += f16;
	        //this.spiderLeg8.rotateAngleZ += -f16;
	  }
}
