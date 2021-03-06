package com.stek101.projectzulu.common.mobs.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

import com.stek101.projectzulu.common.core.ModelHelper;

public class ModelMonkeyTailed extends ModelBase {
	
    float heightToRaise = 1f;
    float renderScale = 0.80f;

	//fields
    ModelRenderer HEAD;
    ModelRenderer neck;
    ModelRenderer snoutHEAD;
    ModelRenderer earLeft;
    ModelRenderer earRight;
    ModelRenderer BODYbase;
    ModelRenderer BODYtop;
    ModelRenderer leftTopArm;
    ModelRenderer leftBotArm;
    ModelRenderer rightTopArm;
    ModelRenderer rightBotArm;
    ModelRenderer leftTopLeg;
    ModelRenderer leftBotLeg;
    ModelRenderer rightTopLeg;
    ModelRenderer rightBotLeg;
    ModelRenderer tailBase;
    ModelRenderer tailExt1;
    ModelRenderer tailExt2;
  
  public ModelMonkeyTailed()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      HEAD = new ModelRenderer(this, 1, 1);
      HEAD.addBox(-2F, -4F, -3F, 5, 5, 5);
      HEAD.setRotationPoint(0.5F, 11F - heightToRaise, -5F);
      HEAD.setTextureSize(64, 64);
      HEAD.mirror = true;
      setRotation(HEAD, 0.1745329F, 0F, 0F);
      neck = new ModelRenderer(this, 19, 44);
      neck.addBox(-2F, -2F, -1F, 3, 4, 3);
      neck.setRotationPoint(1.5F, 11F - heightToRaise, -4F);
      neck.setTextureSize(64, 64);
      neck.mirror = true;
      setRotation(neck, 0.0174533F, 0F, 0F);
      snoutHEAD = new ModelRenderer(this, 21, 1);
      snoutHEAD.addBox(-1F, -1F, -3F, 3, 3, 5);
      //snoutHEAD.setRotationPoint(0.5F, 10.2F, -7F);
      snoutHEAD.setRotationPoint(0F, -0.9F, -1.0F);
      snoutHEAD.setTextureSize(64, 64);
      snoutHEAD.mirror = true;
      setRotation(snoutHEAD, 0.1745329F, 0F, 0F);
      HEAD.addChild(snoutHEAD);      
      earLeft = new ModelRenderer(this, 1, 44);
      earLeft.addBox(0F, -1F, 0F, 3, 3, 1);
      //earLeft.setRotationPoint(2F, 8.4F, -5F);
      earLeft.setRotationPoint(2.0F, -2.6F, 0F);
      earLeft.setTextureSize(64, 64);
      earLeft.mirror = true;
      setRotation(earLeft, 0.1396263F, 0F, 0F);
      HEAD.addChild(earLeft);
      earRight = new ModelRenderer(this, 1, 50);
      earRight.addBox(-2F, -1F, 0F, 3, 3, 1);
      //earRight.setRotationPoint(-1F, 8.4F, -5F);
      earRight.setRotationPoint(-2.0F, -2.6F, 0F);
      earRight.setTextureSize(64, 64);
      earRight.mirror = true;
      setRotation(earRight, 0.1396263F, 0F, 0F);
      HEAD.addChild(earRight);
      BODYbase = new ModelRenderer(this, 1, 12);
      BODYbase.addBox(-2F, -2F, -2F, 6, 5, 12);
      BODYbase.setRotationPoint(0F, 11F - heightToRaise, -1F);
      BODYbase.setTextureSize(64, 64);
      BODYbase.mirror = true;
      setRotation(BODYbase, -0.2974289F, 0F, 0F);
      BODYtop = new ModelRenderer(this, 1, 30);
      BODYtop.addBox(-2F, -1F, -2F, 5, 4, 8);
      BODYtop.setRotationPoint(0.5F, 9.5F - heightToRaise, 0F);
      BODYtop.setTextureSize(64, 64);
      BODYtop.mirror = true;
      setRotation(BODYtop, -0.2974289F, 0F, 0F);
      leftTopArm = new ModelRenderer(this, 37, 1);
      leftTopArm.addBox(0F, -1F, -1F, 3, 7, 3);
      leftTopArm.setRotationPoint(3F, 11F - heightToRaise, -2F);
      leftTopArm.setTextureSize(64, 64);
      leftTopArm.mirror = true;
      setRotation(leftTopArm, -0.1858931F, 0F, 0F);
      leftBotArm = new ModelRenderer(this, 37, 12);
      leftBotArm.addBox(-1F, 0F, -1F, 3, 8, 3);
      //leftBotArm.setRotationPoint(4F, 16F, -3F);
      leftBotArm.setRotationPoint(1.0F, 5.0F, 0.0F);
      leftBotArm.setTextureSize(64, 64);
      leftBotArm.mirror = true;
      setRotation(leftBotArm, -0.5576792F, 0F, 0F);
      leftTopArm.addChild(leftBotArm);
      rightTopArm = new ModelRenderer(this, 51, 1);
      rightTopArm.addBox(-2F, -1F, -1F, 3, 7, 3);
      rightTopArm.setRotationPoint(-2F, 11F - heightToRaise, -2F);
      rightTopArm.setTextureSize(64, 64);
      rightTopArm.mirror = true;
      setRotation(rightTopArm, -0.1858931F, 0F, 0F);
      rightBotArm = new ModelRenderer(this, 51, 12);
      rightBotArm.addBox(-1F, 0F, -1F, 3, 8, 3);
      //rightBotArm.setRotationPoint(-3F, 16F, -3F);
      rightBotArm.setRotationPoint(-1.0F, 5.0F, 0.0F);
      rightBotArm.setTextureSize(64, 64);
      rightBotArm.mirror = true;
      setRotation(rightBotArm, -0.5576792F, 0F, 0F);
      rightTopArm.addChild(rightBotArm);
      leftTopLeg = new ModelRenderer(this, 37, 25);
      leftTopLeg.addBox(0F, -1F, -1F, 3, 7, 3);
      leftTopLeg.setRotationPoint(2F, 13F - heightToRaise, 6F);
      leftTopLeg.setTextureSize(64, 64);
      leftTopLeg.mirror = true;
      setRotation(leftTopLeg, -0.6108652F, 0F, 0F);
      leftBotLeg = new ModelRenderer(this, 37, 36);
      leftBotLeg.addBox(-1F, 0F, -1F, 3, 7, 3);
      //leftBotLeg.setRotationPoint(3F, 17F, 3F);
      leftBotLeg.setRotationPoint(1F, 4F, 0F);
      leftBotLeg.setTextureSize(64, 64);
      leftBotLeg.mirror = true;
      setRotation(leftBotLeg, 0.3717861F, 0F, 0F);
      leftTopLeg.addChild(leftBotLeg);
      rightTopLeg = new ModelRenderer(this, 51, 25);
      rightTopLeg.addBox(-2F, -1F, -1F, 3, 7, 3);
      rightTopLeg.setRotationPoint(-1F, 13F - heightToRaise, 6F);
      rightTopLeg.setTextureSize(64, 64);
      rightTopLeg.mirror = true;
      setRotation(rightTopLeg, -0.6108652F, 0F, 0F);
      rightBotLeg = new ModelRenderer(this, 51, 36);
      rightBotLeg.addBox(-1F, 0F, -1F, 3, 7, 3);
      //rightBotLeg.setRotationPoint(-2F, 17F, 3F);
      rightBotLeg.setRotationPoint(-1F, 4F, 0F);
      rightBotLeg.setTextureSize(64, 64);
      rightBotLeg.mirror = true;
      setRotation(rightBotLeg, 0.3717861F, 0F, 0F);
      rightTopLeg.addChild(rightBotLeg);
      tailBase = new ModelRenderer(this, 1, 56);
      tailBase.addBox(0F, 0F, 0F, 1, 1, 6);
      tailBase.setRotationPoint(0.5F, 13F - heightToRaise, 7F);
      tailBase.setTextureSize(64, 64);
      tailBase.mirror = true;
      setRotation(tailBase, 0F, 0F, 0F);
      tailExt1 = new ModelRenderer(this, 16, 56);
      tailExt1.addBox(0F, 0F, 0F, 1, 1, 6);
      tailExt1.setRotationPoint(0.5F, 13F - heightToRaise, 13F);
      tailExt1.setTextureSize(64, 64);
      tailExt1.mirror = true;
      setRotation(tailExt1, -0.5576792F, 0F, 0F);
      tailExt2 = new ModelRenderer(this, 29, 55);
      tailExt2.addBox(0F, 0F, 0F, 1, 1, 7);
      tailExt2.setRotationPoint(0.5F, 15.9F - heightToRaise, 18F);
      tailExt2.setTextureSize(64, 64);
      tailExt2.mirror = true;
      setRotation(tailExt2, -0.9856463F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    if (this.isChild) {
   	 float var8 = 2.0F;
           GL11.glPushMatrix();
           GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
           GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
           //GL11.glTranslatef(field_78145_x, field_78145_g * f5, field_78151_h * f5);
           HEAD.render(renderScale * f5);
           neck.render(renderScale * f5);
           BODYbase.render(renderScale * f5);
           BODYtop.render(renderScale * f5);
           leftTopArm.render(renderScale * f5);
           rightTopArm.render(renderScale * f5);
           leftTopLeg.render(renderScale * f5);
           rightTopLeg.render(renderScale * f5);
           tailBase.render(renderScale * f5);
           tailExt1.render(renderScale * f5);
           tailExt2.render(renderScale * f5);
           GL11.glPopMatrix();		   
   } else {
   	//GL11.glPushMatrix();
    //   GL11.glScalef(0.85F, 0.85F, 0.85F);
    //   GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
       HEAD.render(f5);
       neck.render(f5);
       //snoutHEAD.render(f5);
       //earLeft.render(f5);
       //earRight.render(f5);
       BODYbase.render(f5);
       BODYtop.render(f5);
       leftTopArm.render(f5);
       //leftBotArm.render(f5);
       rightTopArm.render(f5);
       //rightBotArm.render(f5);
       leftTopLeg.render(f5);
       //leftBotLeg.render(f5);
       rightTopLeg.render(f5);
       //rightBotLeg.render(f5);
       tailBase.render(f5);
       tailExt1.render(f5);
       tailExt2.render(f5);
     //  GL11.glPopMatrix();
   }  
    
  }
  
  @Override
  public void setLivingAnimations(EntityLivingBase par1EntityLiving, float par2, float par3, float par4) {

	leftTopArm.rotateAngleX = (float) (MathHelper.cos(par2 * 0.6662F + (float) Math.PI) * 1.8F * ModelHelper
			.abs(Math.log(par3 + 1)));

	rightTopArm.rotateAngleX = (float) (MathHelper.cos(par2 * 0.6662F) * 1.8F * ModelHelper.abs(Math.log(par3 + 1)));
	
	
	leftTopLeg.rotateAngleX = (float) (MathHelper.cos(par2 * 0.6662F + (float) Math.PI) * 1.8F * ModelHelper
			.abs(Math.log(par3 + 1)));
	
	rightTopLeg.rotateAngleX = (float) (MathHelper.cos(par2 * 0.6662F) * 1.8F * ModelHelper.abs(Math.log(par3 + 1)));
	leftBotLeg.rotateAngleX = (float) Math.abs(MathHelper.cos(par2 * 0.6662F / 2 + (float) Math.PI) * 1.8F
		* ModelHelper.abs(Math.log(par3 + 1)));
	rightBotLeg.rotateAngleX = (float) Math.abs(MathHelper.cos(par2 * 0.6662F / 2) * 1.8F
		* ModelHelper.abs(Math.log(par3 + 1)));

	super.setLivingAnimations(par1EntityLiving, par2, par3, par4);
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
    HEAD.rotateAngleY = f3 / (180F / (float)Math.PI);
    HEAD.rotateAngleX = f3 / (180F / (float)Math.PI);
  }
}
