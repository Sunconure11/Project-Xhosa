package com.stek101.projectzulu.common.mobs.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

public class ModelDeer extends ModelBase
	{
    float heightToRaise = 5f;
    float renderScale = 1.3f;
	 
		  //fields
		    ModelRenderer top4hornRight;
		    ModelRenderer top4hornLeft;
		    ModelRenderer top3hornRight;
		    ModelRenderer top3hornLeft;
		    ModelRenderer top1hornRight;
		    ModelRenderer top1hornLeft;
		    ModelRenderer HEADROT;
		    ModelRenderer hornLeft;
		    ModelRenderer earLeft;
		    ModelRenderer earRight;
		    ModelRenderer neck;
		    ModelRenderer BODYROT;
		    ModelRenderer leg1;
		    ModelRenderer leg2;
		    ModelRenderer leg3;
		    ModelRenderer leg4;
		    ModelRenderer tail;
		    ModelRenderer top2hornLeft;
		    ModelRenderer hornRight;
		    ModelRenderer top2hornRight;
		  
		  public ModelDeer()
		  {
		    textureWidth = 64;
		    textureHeight = 64;
		    
		      HEADROT = new ModelRenderer(this, 1, 19);
		      HEADROT.addBox(-1.5F, -6F, -7F, 5, 4, 7);
		      HEADROT.setRotationPoint(-2F, 4F - heightToRaise , -6F);
		      HEADROT.setTextureSize(64, 64);
		      HEADROT.mirror = true;
		      setRotation(HEADROT, 0.5230717F, 0F, 0F);
		      
		      earLeft = new ModelRenderer(this, 43, 33);
		      earLeft.addBox(0F, 1F, 0F, 1, 3, 1);
		      //earLeft.setRotationPoint(0F, 0.5F, -9F);
		      earLeft.setRotationPoint(2F, -3.5F, -2.0F);
		      earLeft.setTextureSize(64, 64);
		      earLeft.mirror = true;
		      setRotation(earLeft, 0F, 0F, -2.199115F);
		      HEADROT.addChild(earLeft);
		      
		      earRight = new ModelRenderer(this, 50, 33);
		      earRight.addBox(-1F, 1F, 0F, 1, 3, 1);
		      //earRight.setRotationPoint(-2F, 0.5F, -9F);
		      earRight.setRotationPoint(-0.5F, -3.5F, -2.0F);
		      earRight.setTextureSize(64, 64);
		      earRight.mirror = true;
		      setRotation(earRight, 0F, 0F, 2.199115F);
		      HEADROT.addChild(earRight);      
		      
		      hornLeft = new ModelRenderer(this, 8, 5);
		      hornLeft.addBox(0F, -3F, 0F, 1, 5, 1);
		      //hornLeft.setRotationPoint(0F, -3F, -9F);
		      hornLeft.setRotationPoint(2F, -8F, -2F);
		      hornLeft.setTextureSize(64, 64);
		      hornLeft.mirror = true;
		      setRotation(hornLeft, -0.5410521F, 0.1396263F, 0F);
		      HEADROT.addChild(hornLeft);
		      
		      hornRight = new ModelRenderer(this, 2, 5);
		      hornRight.addBox(-1F, -3F, 0F, 1, 5, 1);
		      //hornRight.setRotationPoint(-2F, -3F, -9F);
		      hornRight.setRotationPoint(0F, -8F, -2F);
		      hornRight.setTextureSize(64, 64);
		      hornRight.mirror = true;
		      setRotation(hornRight, -0.5410521F, -0.1396263F, 0F);
		      HEADROT.addChild(hornRight);
		      
		      top2hornLeft = new ModelRenderer(this, 21, 5);
		      top2hornLeft.addBox(0F, -3F, 0F, 1, 4, 1);
		      //top2hornLeft.setRotationPoint(0.3F, -5.5F, -8F);
		      top2hornLeft.setRotationPoint(0.3F, -3.5F, 0F);
		      top2hornLeft.setTextureSize(64, 64);
		      top2hornLeft.mirror = true;
		      setRotation(top2hornLeft, 0.6372665F, 0.0349066F, 0.0523599F);
		      hornLeft.addChild(top2hornLeft);
		      
		      top2hornRight = new ModelRenderer(this, 15, 5);
		      top2hornRight.addBox(-1F, -3F, 0F, 1, 4, 1);
		      //top2hornRight.setRotationPoint(-2.3F, -5.5F, -8F);
		      top2hornRight.setRotationPoint(0F, -3.5F, 0F);
		      top2hornRight.setTextureSize(64, 64);
		      top2hornRight.mirror = true;
		      setRotation(top2hornRight, 0.6372665F, -0.0349066F, -0.0523599F);
		      hornRight.addChild(top2hornRight);
		      
		      top1hornRight = new ModelRenderer(this, 41, 5);
		      top1hornRight.addBox(-1F, -3F, 0F, 1, 3, 1);
		      //top1hornRight.setRotationPoint(-2.4F, -7.5F, -8F);
		      top1hornRight.setRotationPoint(-0.4F, -2.0F, -0F);
		      top1hornRight.setTextureSize(64, 64);
		      top1hornRight.mirror = true;
		      setRotation(top1hornRight, 1.047198F, 0.1047198F, 0F);
		      top2hornRight.addChild(top1hornRight);
		      
		      top1hornLeft = new ModelRenderer(this, 41, 10);
		      top1hornLeft.addBox(0F, -3F, 0F, 1, 3, 1);
		      //top1hornLeft.setRotationPoint(0.5F, -7.5F, -8F);
		      top1hornLeft.setRotationPoint(0.5F, -2.0F, -0F);
		      top1hornLeft.setTextureSize(64, 64);
		      top1hornLeft.mirror = true;
		      setRotation(top1hornLeft, 1.047198F, -0.1047198F, 0F);
		      top2hornLeft.addChild(top1hornLeft);
		      
		      top3hornRight = new ModelRenderer(this, 34, 5);
		      top3hornRight.addBox(-1F, -3F, 0F, 1, 3, 1);
		      //top3hornRight.setRotationPoint(-2.2F, -5F, -8F);
		      top3hornRight.setRotationPoint(-0.2F, -2.0F, 0F);
		      top3hornRight.setTextureSize(64, 64);
		      top3hornRight.mirror = true;
		      setRotation(top3hornRight, 1.747198F, 0.1047198F, 0F);
		      hornRight.addChild(top3hornRight);
		      
		      top3hornLeft = new ModelRenderer(this, 34, 10);
		      top3hornLeft.addBox(0F, -3F, 0F, 1, 3, 1); 
		      //top3hornLeft.setRotationPoint(0.2F, -5F, -8F);
		      top3hornLeft.setRotationPoint(0.2F, -2.0F, 0F);
		      top3hornLeft.setTextureSize(64, 64);
		      top3hornLeft.mirror = true; 
		      setRotation(top3hornLeft, 1.72173F, -0.1047198F, 0F);
		      hornLeft.addChild(top3hornLeft);
		      
		      top4hornRight = new ModelRenderer(this, 28, 5);
		      top4hornRight.addBox(-1F, -3F, 0F, 1, 2, 1);
		      //top4hornRight.setRotationPoint(-2F, -2F, -8F);
		      top4hornRight.setRotationPoint(-0F, 1.5F, 1.5F);
		      top4hornRight.setTextureSize(64, 64);
		      top4hornRight.mirror = true;
		      setRotation(top4hornRight, 1.747198F, 0.1047198F, 0F);
		      hornRight.addChild(top4hornRight);
		      
		      top4hornLeft = new ModelRenderer(this, 28, 9);
		      top4hornLeft.addBox(0F, -3F, 0F, 1, 2, 1);
		      //top4hornLeft.setRotationPoint(0F, -2F, -8F);
		      top4hornLeft.setRotationPoint(0F, 1.5F, 1.5F);
		      top4hornLeft.setTextureSize(64, 64);
		      top4hornLeft.mirror = true;
		      setRotation(top4hornLeft, 1.72173F, -0.1047198F, 0F);
		      hornLeft.addChild(top4hornLeft);

		      neck = new ModelRenderer(this, 28, 21);
		      neck.addBox(0F, -2F, -2F, 4, 3, 8);
		      neck.setRotationPoint(-3F, 2F - heightToRaise, -8F);
		      neck.setTextureSize(64, 64);
		      neck.mirror = true;
		      setRotation(neck, -0.9294653F, 0F, 0F);
		      BODYROT = new ModelRenderer(this, 28, 41);
		      BODYROT.addBox(-4F, -8F, -5F, 8, 15, 6);
		      BODYROT.setRotationPoint(-1F, 6F - heightToRaise, 1F);
		      BODYROT.setTextureSize(64, 64);
		      BODYROT.mirror = true;
		      setRotation(BODYROT, 1.570796F, 0F, 0F);
		      leg1 = new ModelRenderer(this, 0, 32);
		      leg1.addBox(-1F, 0F, -1F, 3, 10, 3);
		      leg1.setRotationPoint(-4F, 11F - heightToRaise, 6F);
		      leg1.setTextureSize(64, 64);
		      leg1.mirror = true;
		      setRotation(leg1, 0F, 0F, 0F);
		      leg2 = new ModelRenderer(this, 13, 32);
		      leg2.addBox(-1F, 0F, -1F, 3, 10, 3);
		      leg2.setRotationPoint(1F, 11F - heightToRaise, 6F);
		      leg2.setTextureSize(64, 64);
		      leg2.mirror = true;
		      setRotation(leg2, 0F, 0F, 0F);
		      leg3 = new ModelRenderer(this, 13, 49);
		      leg3.addBox(-2F, 0F, -1F, 3, 10, 3);
		      leg3.setRotationPoint(-3F, 11F - heightToRaise, -6F);
		      leg3.setTextureSize(64, 64);
		      leg3.mirror = true;
		      setRotation(leg3, 0F, 0F, 0F);
		      leg4 = new ModelRenderer(this, 0, 49);
		      leg4.addBox(-1F, 0F, -1F, 3, 10, 3);
		      leg4.setRotationPoint(1F, 11F - heightToRaise, -6F);
		      leg4.setTextureSize(64, 64);
		      leg4.mirror = true;
		      setRotation(leg4, 0F, 0F, 0F);
		      tail = new ModelRenderer(this, 28, 34);
		      tail.addBox(-1F, 0F, 0F, 2, 1, 3);
		      tail.setRotationPoint(-1F, 5.5F - heightToRaise, 7F);
		      tail.setTextureSize(64, 64);
		      tail.mirror = true;
		      setRotation(tail, -0.4506874F, 0F, 0F);
		      
		  }
		  
		  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
		  {
		    super.render(entity, f, f1, f2, f3, f4, f5);
		    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		    
		    float field_78145_x = 0.0f;
		    float field_78145_g = 2.2F;
		    float field_78151_h = 3.4F;
		    
		    if (this.isChild) {
		    	 float var8 = 2.0F;
		            GL11.glPushMatrix();
		            GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
		            GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
		            //GL11.glTranslatef(field_78145_x, field_78145_g * f5, field_78151_h * f5);
		            HEADROT.render(renderScale * f5);
		            neck.render(renderScale * f5);
		            BODYROT.render(renderScale * f5);
		            leg1.render(renderScale * f5);
				    leg2.render(renderScale * f5);
				    leg3.render(renderScale * f5);
				    leg4.render(renderScale * f5);
				    tail.render(renderScale * f5);			    
		            GL11.glPopMatrix();		   
		    } else {
		    	//top4hornRight.render(f5);
			    //top4hornLeft.render(f5);
			    //top3hornRight.render(f5);
			    //top3hornLeft.render(f5);
			    //top2hornLeft.render(f5);
			    //top2hornRight.render(f5);
			    //top1hornRight.render(f5);
			    //top1hornLeft.render(f5);
			    //hornLeft.render(f5);
			    //hornRight.render(f5);
			    //earLeft.render(f5);
			    //earRight.render(f5);
			    HEADROT.render(renderScale * f5);		   
			    neck.render(renderScale * f5);
			    BODYROT.render(renderScale * f5);
			    leg1.render(renderScale * f5);
			    leg2.render(renderScale * f5);
			    leg3.render(renderScale * f5);
			    leg4.render(renderScale * f5);
			    tail.render(renderScale * f5);
		    }  
		  }
		  
		  @Override
		  public void setLivingAnimations(EntityLivingBase par1EntityLiving, float par2, float par3, float par4) {
			/* Constant Animation Rotations */
			leg1.rotateAngleX = MathHelper.cos(par2 * 0.6662F * 2f) * 1.2F * par3;
			leg3.rotateAngleX = MathHelper.cos(par2 * 0.6662F * 2f + (float) Math.PI) * 1.2F * par3;
			leg2.rotateAngleX = MathHelper.cos(par2 * 0.6662F * 2f + (float) Math.PI) * 1.2F * par3;
			leg4.rotateAngleX = MathHelper.cos(par2 * 0.6662F * 2f) * 1.2F * par3; 
			
			/*tail.rotateAngleZ = (float) (MathHelper.cos(par2 * 0.6662F + (float) Math.PI) * 1.8F * ModelHelper.abs(Math
					.log(par3 + 1)));

			earLeft.rotateAngleY = (float) (70 * Math.PI / 180 + MathHelper.cos(par2 * 0.6662F + (float) Math.PI) * 1.2F
					* ModelHelper.abs(Math.log(par3 + 1)));
			earRight.rotateAngleY = (float) (-70 * Math.PI / 180 - MathHelper.cos(par2 * 0.6662F + (float) Math.PI) * 1.2F
					* ModelHelper.abs(Math.log(par3 + 1)));*/
				
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
		    //HEADROT.rotateAngleX = Math.min(Math.max(f4, -14), +45) * (float) (Math.PI / 180f);
			//HEADROT.rotateAngleY = Math.min(Math.max(f3, -15), +45) * (float) (Math.PI / 180f);
		    HEADROT.rotateAngleX = f4 / (180F / (float)Math.PI); //Math.min(Math.max(f4, -14), +35) * (float) (Math.PI / 180f);
			HEADROT.rotateAngleY = f3 / (180F / (float)Math.PI);
		  }


}
