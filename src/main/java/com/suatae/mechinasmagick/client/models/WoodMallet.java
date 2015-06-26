package com.suatae.mechinasmagick.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;





/**
 * Wood Mallet - Suatae Created using Tabula 4.1.1
 */
public class WoodMallet extends ModelBase {
	public ModelRenderer	HandleHolder;
	public ModelRenderer	HeadBase;
	public ModelRenderer	Handle;
	public ModelRenderer	shape9;

	public WoodMallet() {
		this.textureWidth = 32;
		this.textureHeight = 32;
		this.shape9 = new ModelRenderer(this, 10, 14);
		this.shape9.setRotationPoint(0.0F, 0.4F, 0.0F);
		this.shape9.addBox(-2.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
		this.HeadBase = new ModelRenderer(this, 0, 16);
		this.HeadBase.setRotationPoint(0.0F, 3.7F, 0.0F);
		this.HeadBase.addBox(-2.5F, -3.0F, -5.0F, 5, 6, 10, 0.0F);
		this.HandleHolder = new ModelRenderer(this, 0, 5);
		this.HandleHolder.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.HandleHolder.addBox(-0.5F, 0.0F, -0.5F, 1, 20, 1, 0.0F);
		this.Handle = new ModelRenderer(this, 20, 10);
		this.Handle.setRotationPoint(0.0F, 13.3F, 0.0F);
		this.Handle.addBox(-1.0F, -7.0F, -1.0F, 2, 14, 2, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9.offsetX, this.shape9.offsetY, this.shape9.offsetZ);
		GL11.glTranslatef(this.shape9.rotationPointX * f5, this.shape9.rotationPointY * f5,
				this.shape9.rotationPointZ * f5);
		GL11.glScaled(0.5D, 0.5D, 0.5D);
		GL11.glTranslatef(-this.shape9.offsetX, -this.shape9.offsetY, -this.shape9.offsetZ);
		GL11.glTranslatef(-this.shape9.rotationPointX * f5, -this.shape9.rotationPointY * f5,
				-this.shape9.rotationPointZ * f5);
		this.shape9.render(f5);
		GL11.glPopMatrix();
		this.HeadBase.render(f5);
		this.HandleHolder.render(f5);
		GL11.glPushMatrix();
		GL11.glTranslatef(this.Handle.offsetX, this.Handle.offsetY, this.Handle.offsetZ);
		GL11.glTranslatef(this.Handle.rotationPointX * f5, this.Handle.rotationPointY * f5,
				this.Handle.rotationPointZ * f5);
		GL11.glScaled(0.7D, 0.7D, 0.7D);
		GL11.glTranslatef(-this.Handle.offsetX, -this.Handle.offsetY, -this.Handle.offsetZ);
		GL11.glTranslatef(-this.Handle.rotationPointX * f5, -this.Handle.rotationPointY * f5,
				-this.Handle.rotationPointZ * f5);
		this.Handle.render(f5);
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
