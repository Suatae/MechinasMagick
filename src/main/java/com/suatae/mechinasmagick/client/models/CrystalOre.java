package com.suatae.mechinasmagick.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;





/**
 * Ore - Suatae Created using Tabula 4.1.1
 */
public class CrystalOre extends ModelBase {
	public ModelRenderer	BaseBlock;
	public ModelRenderer	shape19;
	public ModelRenderer	shape19_1;
	public ModelRenderer	shape19_2;
	public ModelRenderer	shape19_3;
	public ModelRenderer	shape19_4;
	public ModelRenderer	shape19_5;
	public ModelRenderer	shape19_6;
	public ModelRenderer	shape19_7;
	public ModelRenderer	shape19_8;
	public ModelRenderer	shape19_9;
	public ModelRenderer	shape19_10;
	public ModelRenderer	shape19_11;
	public ModelRenderer	shape19_12;
	public ModelRenderer	shape19_13;
	public ModelRenderer	shape19_14;
	public ModelRenderer	shape19_15;
	public ModelRenderer	shape19_16;
	public ModelRenderer	shape19_17;

	public CrystalOre() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.shape19_3 = new ModelRenderer(this, 0, 22);
		this.shape19_3.setRotationPoint(2.2F, 12.6F, 8.0F);
		this.shape19_3.addBox(-10.0F, -3.0F, -2.0F, 20, 6, 2, 0.0F);
		this.setRotateAngle(shape19_3, 0.0F, 3.141592653589793F, 0.0F);
		this.shape19_13 = new ModelRenderer(this, 0, 22);
		this.shape19_13.setRotationPoint(3.6F, 25.0F, 0.0F);
		this.shape19_13.addBox(-10.0F, -3.0F, -2.0F, 20, 6, 2, 0.0F);
		this.shape19_10 = new ModelRenderer(this, 0, 22);
		this.shape19_10.setRotationPoint(12.8F, 14.8F, 0.0F);
		this.shape19_10.addBox(-10.0F, -3.0F, -2.0F, 20, 6, 2, 0.0F);
		this.shape19_12 = new ModelRenderer(this, 0, 22);
		this.shape19_12.setRotationPoint(12.8F, 14.8F, 0.0F);
		this.shape19_12.addBox(-10.0F, -3.0F, -2.0F, 20, 6, 2, 0.0F);
		this.shape19_15 = new ModelRenderer(this, 0, 22);
		this.shape19_15.setRotationPoint(3.6F, 25.0F, 0.0F);
		this.shape19_15.addBox(-10.0F, -3.0F, -2.0F, 20, 6, 2, 0.0F);
		this.shape19_17 = new ModelRenderer(this, 0, 22);
		this.shape19_17.setRotationPoint(3.6F, 25.0F, 0.0F);
		this.shape19_17.addBox(-10.0F, -3.0F, -2.0F, 20, 6, 2, 0.0F);
		this.shape19_7 = new ModelRenderer(this, 0, 22);
		this.shape19_7.setRotationPoint(3.6F, 25.0F, 0.0F);
		this.shape19_7.addBox(-10.0F, -3.0F, -2.0F, 20, 6, 2, 0.0F);
		this.shape19_14 = new ModelRenderer(this, 0, 22);
		this.shape19_14.setRotationPoint(12.8F, 14.8F, 0.0F);
		this.shape19_14.addBox(-10.0F, -3.0F, -2.0F, 20, 6, 2, 0.0F);
		this.shape19_9 = new ModelRenderer(this, 0, 22);
		this.shape19_9.setRotationPoint(3.6F, 25.0F, 0.0F);
		this.shape19_9.addBox(-10.0F, -3.0F, -2.0F, 20, 6, 2, 0.0F);
		this.shape19_4 = new ModelRenderer(this, 0, 22);
		this.shape19_4.setRotationPoint(-2.2F, 8.0F, 4.0F);
		this.shape19_4.addBox(-10.0F, -3.0F, -2.0F, 20, 6, 2, 0.0F);
		this.setRotateAngle(shape19_4, -1.5707963267948966F, 0.0F, 0.0F);
		this.shape19_5 = new ModelRenderer(this, 0, 22);
		this.shape19_5.setRotationPoint(-2.2F, 24.0F, -4.0F);
		this.shape19_5.addBox(-10.0F, -3.0F, -2.0F, 20, 6, 2, 0.0F);
		this.setRotateAngle(shape19_5, 1.5707963267948966F, 0.0F, 0.0F);
		this.shape19_6 = new ModelRenderer(this, 0, 22);
		this.shape19_6.setRotationPoint(12.8F, 14.8F, 0.0F);
		this.shape19_6.addBox(-10.0F, -3.0F, -2.0F, 20, 6, 2, 0.0F);
		this.shape19_2 = new ModelRenderer(this, 0, 22);
		this.shape19_2.setRotationPoint(8.0F, 12.6F, -2.2F);
		this.shape19_2.addBox(-10.0F, -3.0F, -2.0F, 20, 6, 2, 0.0F);
		this.setRotateAngle(shape19_2, 0.0F, -1.5707963267948966F, 0.0F);
		this.shape19_11 = new ModelRenderer(this, 0, 22);
		this.shape19_11.setRotationPoint(3.6F, 25.0F, 0.0F);
		this.shape19_11.addBox(-10.0F, -3.0F, -2.0F, 20, 6, 2, 0.0F);
		this.shape19 = new ModelRenderer(this, 0, 22);
		this.shape19.setRotationPoint(-2.2F, 12.6F, -8.0F);
		this.shape19.addBox(-10.0F, -3.0F, -2.0F, 20, 6, 2, 0.0F);
		this.shape19_1 = new ModelRenderer(this, 0, 22);
		this.shape19_1.setRotationPoint(-8.0F, 12.6F, 2.2F);
		this.shape19_1.addBox(-10.0F, -3.0F, -2.0F, 20, 6, 2, 0.0F);
		this.setRotateAngle(shape19_1, 0.0F, 1.5707963267948966F, 0.0F);
		this.shape19_8 = new ModelRenderer(this, 0, 22);
		this.shape19_8.setRotationPoint(12.8F, 14.8F, 0.0F);
		this.shape19_8.addBox(-10.0F, -3.0F, -2.0F, 20, 6, 2, 0.0F);
		this.shape19_16 = new ModelRenderer(this, 0, 22);
		this.shape19_16.setRotationPoint(12.8F, 14.8F, 0.0F);
		this.shape19_16.addBox(-10.0F, -3.0F, -2.0F, 20, 6, 2, 0.0F);
		this.BaseBlock = new ModelRenderer(this, 0, 32);
		this.BaseBlock.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.BaseBlock.addBox(-8.0F, -8.0F, -8.0F, 16, 16, 16, 0.0F);
		this.shape19_3.addChild(this.shape19_13);
		this.shape19_2.addChild(this.shape19_10);
		this.shape19_3.addChild(this.shape19_12);
		this.shape19_4.addChild(this.shape19_15);
		this.shape19_5.addChild(this.shape19_17);
		this.shape19.addChild(this.shape19_7);
		this.shape19_4.addChild(this.shape19_14);
		this.shape19_1.addChild(this.shape19_9);
		this.shape19.addChild(this.shape19_6);
		this.shape19_2.addChild(this.shape19_11);
		this.shape19_1.addChild(this.shape19_8);
		this.shape19_5.addChild(this.shape19_16);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape19_3.offsetX, this.shape19_3.offsetY, this.shape19_3.offsetZ);
		GL11.glTranslatef(this.shape19_3.rotationPointX * f5, this.shape19_3.rotationPointY * f5,
				this.shape19_3.rotationPointZ * f5);
		GL11.glScaled(0.3D, 0.3D, 0.3D);
		GL11.glTranslatef(-this.shape19_3.offsetX, -this.shape19_3.offsetY, -this.shape19_3.offsetZ);
		GL11.glTranslatef(-this.shape19_3.rotationPointX * f5, -this.shape19_3.rotationPointY * f5,
				-this.shape19_3.rotationPointZ * f5);
		this.shape19_3.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape19_4.offsetX, this.shape19_4.offsetY, this.shape19_4.offsetZ);
		GL11.glTranslatef(this.shape19_4.rotationPointX * f5, this.shape19_4.rotationPointY * f5,
				this.shape19_4.rotationPointZ * f5);
		GL11.glScaled(0.3D, 0.3D, 0.3D);
		GL11.glTranslatef(-this.shape19_4.offsetX, -this.shape19_4.offsetY, -this.shape19_4.offsetZ);
		GL11.glTranslatef(-this.shape19_4.rotationPointX * f5, -this.shape19_4.rotationPointY * f5,
				-this.shape19_4.rotationPointZ * f5);
		this.shape19_4.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape19_5.offsetX, this.shape19_5.offsetY, this.shape19_5.offsetZ);
		GL11.glTranslatef(this.shape19_5.rotationPointX * f5, this.shape19_5.rotationPointY * f5,
				this.shape19_5.rotationPointZ * f5);
		GL11.glScaled(0.3D, 0.3D, 0.3D);
		GL11.glTranslatef(-this.shape19_5.offsetX, -this.shape19_5.offsetY, -this.shape19_5.offsetZ);
		GL11.glTranslatef(-this.shape19_5.rotationPointX * f5, -this.shape19_5.rotationPointY * f5,
				-this.shape19_5.rotationPointZ * f5);
		this.shape19_5.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape19_2.offsetX, this.shape19_2.offsetY, this.shape19_2.offsetZ);
		GL11.glTranslatef(this.shape19_2.rotationPointX * f5, this.shape19_2.rotationPointY * f5,
				this.shape19_2.rotationPointZ * f5);
		GL11.glScaled(0.3D, 0.3D, 0.3D);
		GL11.glTranslatef(-this.shape19_2.offsetX, -this.shape19_2.offsetY, -this.shape19_2.offsetZ);
		GL11.glTranslatef(-this.shape19_2.rotationPointX * f5, -this.shape19_2.rotationPointY * f5,
				-this.shape19_2.rotationPointZ * f5);
		this.shape19_2.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape19.offsetX, this.shape19.offsetY, this.shape19.offsetZ);
		GL11.glTranslatef(this.shape19.rotationPointX * f5, this.shape19.rotationPointY * f5,
				this.shape19.rotationPointZ * f5);
		GL11.glScaled(0.3D, 0.3D, 0.3D);
		GL11.glTranslatef(-this.shape19.offsetX, -this.shape19.offsetY, -this.shape19.offsetZ);
		GL11.glTranslatef(-this.shape19.rotationPointX * f5, -this.shape19.rotationPointY * f5,
				-this.shape19.rotationPointZ * f5);
		this.shape19.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape19_1.offsetX, this.shape19_1.offsetY, this.shape19_1.offsetZ);
		GL11.glTranslatef(this.shape19_1.rotationPointX * f5, this.shape19_1.rotationPointY * f5,
				this.shape19_1.rotationPointZ * f5);
		GL11.glScaled(0.3D, 0.3D, 0.3D);
		GL11.glTranslatef(-this.shape19_1.offsetX, -this.shape19_1.offsetY, -this.shape19_1.offsetZ);
		GL11.glTranslatef(-this.shape19_1.rotationPointX * f5, -this.shape19_1.rotationPointY * f5,
				-this.shape19_1.rotationPointZ * f5);
		this.shape19_1.render(f5);
		GL11.glPopMatrix();
		this.BaseBlock.render(f5);
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
