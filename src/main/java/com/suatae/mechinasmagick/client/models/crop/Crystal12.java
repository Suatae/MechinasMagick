package com.suatae.mechinasmagick.client.models.crop;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;





/**
 * Crystal - Suatae Created using Tabula 4.1.1
 */
public class Crystal12 extends ModelBase {
	public double[]			modelScale	= new double[] { 2.0D, 2.0D, 2.0D };
	public ModelRenderer	shape8;
	public ModelRenderer	shape8_1;
	public ModelRenderer	shape8_2;
	public ModelRenderer	shape8_3;
	public ModelRenderer	shape8_4;
	public ModelRenderer	shape8_5;
	public ModelRenderer	shape8_6;
	public ModelRenderer	shape8_7;
	public ModelRenderer	shape8_8;
	public ModelRenderer	shape8_9;
	public ModelRenderer	shape8_10;
	public ModelRenderer	shape8_11;
	public ModelRenderer	shape8_12;
	public ModelRenderer	shape8_13;
	public ModelRenderer	shape8_14;
	public ModelRenderer	shape8_15;
	public ModelRenderer	shape8_16;
	public ModelRenderer	shape8_17;
	public ModelRenderer	shape8_18;
	public ModelRenderer	shape8_19;
	public ModelRenderer	shape8_20;

	public Crystal12() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.shape8_8 = new ModelRenderer(this, 0, 30);
		this.shape8_8.setRotationPoint(5.0F, 48.9F, 8.4F);
		this.shape8_8.addBox(-2.0F, 0.0F, -2.0F, 4, 15, 4, 0.0F);
		this.setRotateAngle(shape8_8, 3.0049333731586367F, -0.091106186954104F,
				0.31869712141416456F);
		this.shape8_12 = new ModelRenderer(this, 0, 30);
		this.shape8_12.setRotationPoint(6.7F, 49.0F, -9.9F);
		this.shape8_12.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
		this.setRotateAngle(shape8_12, -2.6406831582674206F, -0.7740535232594852F,
				0.091106186954104F);
		this.shape8_10 = new ModelRenderer(this, 0, 30);
		this.shape8_10.setRotationPoint(-10.0F, 48.8F, -9.0F);
		this.shape8_10.addBox(-2.0F, 0.0F, -2.0F, 4, 18, 4, 0.0F);
		this.setRotateAngle(shape8_10, -2.8228955321756284F, -1.593485607070823F,
				-0.28361600344907856F);
		this.shape8_14 = new ModelRenderer(this, 4, 40);
		this.shape8_14.setRotationPoint(10.4F, 48.7F, 7.3F);
		this.shape8_14.addBox(-6.0F, 0.0F, -6.0F, 12, 12, 12, 0.0F);
		this.setRotateAngle(shape8_14, 2.9595548126067843F, 0.6829473363053812F, 0.091106186954104F);
		this.shape8_18 = new ModelRenderer(this, 40, 30);
		this.shape8_18.setRotationPoint(-2.0F, 49.5F, 7.9F);
		this.shape8_18.addBox(-1.0F, 0.0F, -1.0F, 2, 18, 2, 0.0F);
		this.setRotateAngle(shape8_18, 2.9595548126067843F, -0.7740535232594852F,
				-0.045553093477052F);
		this.shape8_19 = new ModelRenderer(this, 0, 30);
		this.shape8_19.setRotationPoint(-3.9F, 48.8F, -11.6F);
		this.shape8_19.addBox(-2.0F, 0.0F, -2.0F, 4, 15, 4, 0.0F);
		this.setRotateAngle(shape8_19, -2.4586453172844123F, -0.27314402793711257F,
				-0.28361600344907856F);
		this.shape8_1 = new ModelRenderer(this, 0, 0);
		this.shape8_1.setRotationPoint(1.5F, 48.5F, -0.5F);
		this.shape8_1.addBox(-7.0F, 0.0F, -7.0F, 14, 15, 14, 0.0F);
		this.setRotateAngle(shape8_1, -3.141592653589793F, 0.0F, 0.0F);
		this.shape8_4 = new ModelRenderer(this, 0, 30);
		this.shape8_4.setRotationPoint(-7.8F, 49.5F, 1.2F);
		this.shape8_4.addBox(-2.0F, 0.0F, -2.0F, 4, 16, 4, 0.0F);
		this.setRotateAngle(shape8_4, -3.141592653589793F, -0.5462880558742251F,
				-0.18203784098300857F);
		this.shape8_3 = new ModelRenderer(this, 4, 40);
		this.shape8_3.setRotationPoint(-9.0F, 48.9F, 9.5F);
		this.shape8_3.addBox(-6.0F, 0.0F, -6.0F, 12, 10, 12, 0.0F);
		this.setRotateAngle(shape8_3, 2.9595548126067843F, -0.6373942428283291F, 0.0F);
		this.shape8_17 = new ModelRenderer(this, 40, 30);
		this.shape8_17.setRotationPoint(9.2F, 49.5F, -8.2F);
		this.shape8_17.addBox(-1.0F, 0.0F, -1.0F, 2, 14, 2, 0.0F);
		this.setRotateAngle(shape8_17, 2.7317893452215247F, 2.5953045977155678F,
				0.18203784098300857F);
		this.shape8_6 = new ModelRenderer(this, 40, 30);
		this.shape8_6.setRotationPoint(-5.8F, 49.5F, 3.9F);
		this.shape8_6.addBox(-1.0F, 0.0F, -1.0F, 2, 15, 2, 0.0F);
		this.setRotateAngle(shape8_6, 2.9595548126067843F, -1.1838568316277536F,
				-0.27314402793711257F);
		this.shape8_15 = new ModelRenderer(this, 0, 30);
		this.shape8_15.setRotationPoint(-6.5F, 48.8F, -8.5F);
		this.shape8_15.addBox(-2.0F, 0.0F, -2.0F, 4, 15, 4, 0.0F);
		this.setRotateAngle(shape8_15, -2.7317893452215247F, -0.5009094953223726F,
				-0.27314402793711257F);
		this.shape8_2 = new ModelRenderer(this, 0, 30);
		this.shape8_2.setRotationPoint(3.9F, 48.5F, 11.2F);
		this.shape8_2.addBox(-2.0F, 0.0F, -2.0F, 4, 14, 4, 0.0F);
		this.setRotateAngle(shape8_2, -2.6862362517444724F, -3.141592653589793F,
				0.18203784098300857F);
		this.shape8_20 = new ModelRenderer(this, 0, 30);
		this.shape8_20.setRotationPoint(0.7F, 48.3F, 10.1F);
		this.shape8_20.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
		this.setRotateAngle(shape8_20, -3.096039560112741F, -0.6373942428283291F,
				-0.136659280431156F);
		this.shape8_13 = new ModelRenderer(this, 0, 30);
		this.shape8_13.setRotationPoint(10.8F, 48.7F, -5.8F);
		this.shape8_13.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
		this.setRotateAngle(shape8_13, -2.9140017191297325F, -0.22759093446006054F,
				0.091106186954104F);
		this.shape8 = new ModelRenderer(this, 0, 30);
		this.shape8.setRotationPoint(-9.0F, 48.9F, -4.3F);
		this.shape8.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
		this.setRotateAngle(shape8, -3.141592653589793F, -0.18203784098300857F,
				-0.27314402793711257F);
		this.shape8_5 = new ModelRenderer(this, 0, 30);
		this.shape8_5.setRotationPoint(1.2F, 48.9F, -11.1F);
		this.shape8_5.addBox(-2.0F, 0.0F, -2.0F, 4, 11, 4, 0.0F);
		this.setRotateAngle(shape8_5, -2.86844862565268F, 0.0F, 0.0F);
		this.shape8_7 = new ModelRenderer(this, 40, 30);
		this.shape8_7.setRotationPoint(9.5F, 49.5F, -0.4F);
		this.shape8_7.addBox(-1.0F, 0.0F, -1.0F, 2, 18, 2, 0.0F);
		this.setRotateAngle(shape8_7, 2.9595548126067843F, -3.141592653589793F,
				0.18203784098300857F);
		this.shape8_11 = new ModelRenderer(this, 0, 30);
		this.shape8_11.setRotationPoint(10.9F, 48.3F, 2.1F);
		this.shape8_11.addBox(-2.0F, 0.0F, -2.0F, 4, 11, 4, 0.0F);
		this.setRotateAngle(shape8_11, -3.096039560112741F, -0.7740535232594852F,
				0.091106186954104F);
		this.shape8_9 = new ModelRenderer(this, 4, 40);
		this.shape8_9.setRotationPoint(11.1F, 48.7F, -2.2F);
		this.shape8_9.addBox(-6.0F, 0.0F, -6.0F, 12, 12, 12, 0.0F);
		this.setRotateAngle(shape8_9, -2.8228955321756284F, -0.6373942428283291F,
				0.091106186954104F);
		this.shape8_16 = new ModelRenderer(this, 0, 30);
		this.shape8_16.setRotationPoint(-3.5F, 48.8F, -9.0F);
		this.shape8_16.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
		this.setRotateAngle(shape8_16, -3.0049333731586367F, -0.22759093446006054F, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScaled(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_8.offsetX, this.shape8_8.offsetY, this.shape8_8.offsetZ);
		GL11.glTranslatef(this.shape8_8.rotationPointX * f5, this.shape8_8.rotationPointY * f5,
				this.shape8_8.rotationPointZ * f5);
		GL11.glScaled(0.6D, 0.6D, 0.6D);
		GL11.glTranslatef(-this.shape8_8.offsetX, -this.shape8_8.offsetY, -this.shape8_8.offsetZ);
		GL11.glTranslatef(-this.shape8_8.rotationPointX * f5, -this.shape8_8.rotationPointY * f5,
				-this.shape8_8.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_8.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_12.offsetX, this.shape8_12.offsetY, this.shape8_12.offsetZ);
		GL11.glTranslatef(this.shape8_12.rotationPointX * f5, this.shape8_12.rotationPointY * f5,
				this.shape8_12.rotationPointZ * f5);
		GL11.glScaled(0.85D, 0.85D, 0.85D);
		GL11.glTranslatef(-this.shape8_12.offsetX, -this.shape8_12.offsetY, -this.shape8_12.offsetZ);
		GL11.glTranslatef(-this.shape8_12.rotationPointX * f5, -this.shape8_12.rotationPointY * f5,
				-this.shape8_12.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_12.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_10.offsetX, this.shape8_10.offsetY, this.shape8_10.offsetZ);
		GL11.glTranslatef(this.shape8_10.rotationPointX * f5, this.shape8_10.rotationPointY * f5,
				this.shape8_10.rotationPointZ * f5);
		GL11.glScaled(0.5D, 0.5D, 0.5D);
		GL11.glTranslatef(-this.shape8_10.offsetX, -this.shape8_10.offsetY, -this.shape8_10.offsetZ);
		GL11.glTranslatef(-this.shape8_10.rotationPointX * f5, -this.shape8_10.rotationPointY * f5,
				-this.shape8_10.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_10.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_14.offsetX, this.shape8_14.offsetY, this.shape8_14.offsetZ);
		GL11.glTranslatef(this.shape8_14.rotationPointX * f5, this.shape8_14.rotationPointY * f5,
				this.shape8_14.rotationPointZ * f5);
		GL11.glScaled(0.3D, 0.3D, 0.3D);
		GL11.glTranslatef(-this.shape8_14.offsetX, -this.shape8_14.offsetY, -this.shape8_14.offsetZ);
		GL11.glTranslatef(-this.shape8_14.rotationPointX * f5, -this.shape8_14.rotationPointY * f5,
				-this.shape8_14.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_14.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_18.offsetX, this.shape8_18.offsetY, this.shape8_18.offsetZ);
		GL11.glTranslatef(this.shape8_18.rotationPointX * f5, this.shape8_18.rotationPointY * f5,
				this.shape8_18.rotationPointZ * f5);
		GL11.glScaled(0.6D, 0.6D, 0.6D);
		GL11.glTranslatef(-this.shape8_18.offsetX, -this.shape8_18.offsetY, -this.shape8_18.offsetZ);
		GL11.glTranslatef(-this.shape8_18.rotationPointX * f5, -this.shape8_18.rotationPointY * f5,
				-this.shape8_18.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_18.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_19.offsetX, this.shape8_19.offsetY, this.shape8_19.offsetZ);
		GL11.glTranslatef(this.shape8_19.rotationPointX * f5, this.shape8_19.rotationPointY * f5,
				this.shape8_19.rotationPointZ * f5);
		GL11.glScaled(0.5D, 0.5D, 0.5D);
		GL11.glTranslatef(-this.shape8_19.offsetX, -this.shape8_19.offsetY, -this.shape8_19.offsetZ);
		GL11.glTranslatef(-this.shape8_19.rotationPointX * f5, -this.shape8_19.rotationPointY * f5,
				-this.shape8_19.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_19.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_1.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_4.offsetX, this.shape8_4.offsetY, this.shape8_4.offsetZ);
		GL11.glTranslatef(this.shape8_4.rotationPointX * f5, this.shape8_4.rotationPointY * f5,
				this.shape8_4.rotationPointZ * f5);
		GL11.glScaled(0.7D, 0.7D, 0.7D);
		GL11.glTranslatef(-this.shape8_4.offsetX, -this.shape8_4.offsetY, -this.shape8_4.offsetZ);
		GL11.glTranslatef(-this.shape8_4.rotationPointX * f5, -this.shape8_4.rotationPointY * f5,
				-this.shape8_4.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_4.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_3.offsetX, this.shape8_3.offsetY, this.shape8_3.offsetZ);
		GL11.glTranslatef(this.shape8_3.rotationPointX * f5, this.shape8_3.rotationPointY * f5,
				this.shape8_3.rotationPointZ * f5);
		GL11.glScaled(0.7D, 0.7D, 0.7D);
		GL11.glTranslatef(-this.shape8_3.offsetX, -this.shape8_3.offsetY, -this.shape8_3.offsetZ);
		GL11.glTranslatef(-this.shape8_3.rotationPointX * f5, -this.shape8_3.rotationPointY * f5,
				-this.shape8_3.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_3.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_17.offsetX, this.shape8_17.offsetY, this.shape8_17.offsetZ);
		GL11.glTranslatef(this.shape8_17.rotationPointX * f5, this.shape8_17.rotationPointY * f5,
				this.shape8_17.rotationPointZ * f5);
		GL11.glScaled(0.6D, 0.6D, 0.6D);
		GL11.glTranslatef(-this.shape8_17.offsetX, -this.shape8_17.offsetY, -this.shape8_17.offsetZ);
		GL11.glTranslatef(-this.shape8_17.rotationPointX * f5, -this.shape8_17.rotationPointY * f5,
				-this.shape8_17.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_17.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_6.offsetX, this.shape8_6.offsetY, this.shape8_6.offsetZ);
		GL11.glTranslatef(this.shape8_6.rotationPointX * f5, this.shape8_6.rotationPointY * f5,
				this.shape8_6.rotationPointZ * f5);
		GL11.glScaled(0.6D, 0.6D, 0.6D);
		GL11.glTranslatef(-this.shape8_6.offsetX, -this.shape8_6.offsetY, -this.shape8_6.offsetZ);
		GL11.glTranslatef(-this.shape8_6.rotationPointX * f5, -this.shape8_6.rotationPointY * f5,
				-this.shape8_6.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_6.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_15.offsetX, this.shape8_15.offsetY, this.shape8_15.offsetZ);
		GL11.glTranslatef(this.shape8_15.rotationPointX * f5, this.shape8_15.rotationPointY * f5,
				this.shape8_15.rotationPointZ * f5);
		GL11.glScaled(0.7D, 0.7D, 0.7D);
		GL11.glTranslatef(-this.shape8_15.offsetX, -this.shape8_15.offsetY, -this.shape8_15.offsetZ);
		GL11.glTranslatef(-this.shape8_15.rotationPointX * f5, -this.shape8_15.rotationPointY * f5,
				-this.shape8_15.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_15.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_2.offsetX, this.shape8_2.offsetY, this.shape8_2.offsetZ);
		GL11.glTranslatef(this.shape8_2.rotationPointX * f5, this.shape8_2.rotationPointY * f5,
				this.shape8_2.rotationPointZ * f5);
		GL11.glScaled(0.55D, 0.55D, 0.55D);
		GL11.glTranslatef(-this.shape8_2.offsetX, -this.shape8_2.offsetY, -this.shape8_2.offsetZ);
		GL11.glTranslatef(-this.shape8_2.rotationPointX * f5, -this.shape8_2.rotationPointY * f5,
				-this.shape8_2.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_2.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_20.offsetX, this.shape8_20.offsetY, this.shape8_20.offsetZ);
		GL11.glTranslatef(this.shape8_20.rotationPointX * f5, this.shape8_20.rotationPointY * f5,
				this.shape8_20.rotationPointZ * f5);
		GL11.glScaled(0.75D, 0.75D, 0.75D);
		GL11.glTranslatef(-this.shape8_20.offsetX, -this.shape8_20.offsetY, -this.shape8_20.offsetZ);
		GL11.glTranslatef(-this.shape8_20.rotationPointX * f5, -this.shape8_20.rotationPointY * f5,
				-this.shape8_20.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_20.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_13.offsetX, this.shape8_13.offsetY, this.shape8_13.offsetZ);
		GL11.glTranslatef(this.shape8_13.rotationPointX * f5, this.shape8_13.rotationPointY * f5,
				this.shape8_13.rotationPointZ * f5);
		GL11.glScaled(0.75D, 0.75D, 0.75D);
		GL11.glTranslatef(-this.shape8_13.offsetX, -this.shape8_13.offsetY, -this.shape8_13.offsetZ);
		GL11.glTranslatef(-this.shape8_13.rotationPointX * f5, -this.shape8_13.rotationPointY * f5,
				-this.shape8_13.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_13.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8.offsetX, this.shape8.offsetY, this.shape8.offsetZ);
		GL11.glTranslatef(this.shape8.rotationPointX * f5, this.shape8.rotationPointY * f5,
				this.shape8.rotationPointZ * f5);
		GL11.glScaled(1.2D, 1.2D, 1.2D);
		GL11.glTranslatef(-this.shape8.offsetX, -this.shape8.offsetY, -this.shape8.offsetZ);
		GL11.glTranslatef(-this.shape8.rotationPointX * f5, -this.shape8.rotationPointY * f5,
				-this.shape8.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_5.offsetX, this.shape8_5.offsetY, this.shape8_5.offsetZ);
		GL11.glTranslatef(this.shape8_5.rotationPointX * f5, this.shape8_5.rotationPointY * f5,
				this.shape8_5.rotationPointZ * f5);
		GL11.glScaled(1.6D, 1.6D, 1.6D);
		GL11.glTranslatef(-this.shape8_5.offsetX, -this.shape8_5.offsetY, -this.shape8_5.offsetZ);
		GL11.glTranslatef(-this.shape8_5.rotationPointX * f5, -this.shape8_5.rotationPointY * f5,
				-this.shape8_5.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_5.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_7.offsetX, this.shape8_7.offsetY, this.shape8_7.offsetZ);
		GL11.glTranslatef(this.shape8_7.rotationPointX * f5, this.shape8_7.rotationPointY * f5,
				this.shape8_7.rotationPointZ * f5);
		GL11.glScaled(0.6D, 0.6D, 0.6D);
		GL11.glTranslatef(-this.shape8_7.offsetX, -this.shape8_7.offsetY, -this.shape8_7.offsetZ);
		GL11.glTranslatef(-this.shape8_7.rotationPointX * f5, -this.shape8_7.rotationPointY * f5,
				-this.shape8_7.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_7.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_11.offsetX, this.shape8_11.offsetY, this.shape8_11.offsetZ);
		GL11.glTranslatef(this.shape8_11.rotationPointX * f5, this.shape8_11.rotationPointY * f5,
				this.shape8_11.rotationPointZ * f5);
		GL11.glScaled(0.75D, 0.75D, 0.75D);
		GL11.glTranslatef(-this.shape8_11.offsetX, -this.shape8_11.offsetY, -this.shape8_11.offsetZ);
		GL11.glTranslatef(-this.shape8_11.rotationPointX * f5, -this.shape8_11.rotationPointY * f5,
				-this.shape8_11.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_11.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_9.offsetX, this.shape8_9.offsetY, this.shape8_9.offsetZ);
		GL11.glTranslatef(this.shape8_9.rotationPointX * f5, this.shape8_9.rotationPointY * f5,
				this.shape8_9.rotationPointZ * f5);
		GL11.glScaled(0.2D, 0.2D, 0.2D);
		GL11.glTranslatef(-this.shape8_9.offsetX, -this.shape8_9.offsetY, -this.shape8_9.offsetZ);
		GL11.glTranslatef(-this.shape8_9.rotationPointX * f5, -this.shape8_9.rotationPointY * f5,
				-this.shape8_9.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_9.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape8_16.offsetX, this.shape8_16.offsetY, this.shape8_16.offsetZ);
		GL11.glTranslatef(this.shape8_16.rotationPointX * f5, this.shape8_16.rotationPointY * f5,
				this.shape8_16.rotationPointZ * f5);
		GL11.glScaled(0.5D, 0.5D, 0.5D);
		GL11.glTranslatef(-this.shape8_16.offsetX, -this.shape8_16.offsetY, -this.shape8_16.offsetZ);
		GL11.glTranslatef(-this.shape8_16.rotationPointX * f5, -this.shape8_16.rotationPointY * f5,
				-this.shape8_16.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.95F);
		this.shape8_16.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
