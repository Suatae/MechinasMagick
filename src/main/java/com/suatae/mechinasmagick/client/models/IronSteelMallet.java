package com.suatae.mechinasmagick.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;





/**
 * Copper Mallet - Suatae Created using Tabula 4.1.1
 */
public class IronSteelMallet extends ModelBase {
	public ModelRenderer	HandleHolder;
	public ModelRenderer	HeadBase;
	public ModelRenderer	Handle;
	public ModelRenderer	Handle_1;
	public ModelRenderer	Handle_2;
	public ModelRenderer	HeadBaseFC;
	public ModelRenderer	HeadBaseBC;
	public ModelRenderer	HeadBaseB;
	public ModelRenderer	HeadBaseF;
	public ModelRenderer	BoltLTF;
	public ModelRenderer	BoltLMF;
	public ModelRenderer	BoltLBF;
	public ModelRenderer	BoltLTB;
	public ModelRenderer	BoltLMB;
	public ModelRenderer	BoltLBB;
	public ModelRenderer	BoltRTF;
	public ModelRenderer	BoltRMF;
	public ModelRenderer	BoltRBF;
	public ModelRenderer	BoltRTB;
	public ModelRenderer	BoltRMB;
	public ModelRenderer	BoltRBB;
	public ModelRenderer	BoltTMF;
	public ModelRenderer	BoltTLF;
	public ModelRenderer	BoltTRF;
	public ModelRenderer	BoltTMB;
	public ModelRenderer	BoltTLB;
	public ModelRenderer	BoltTRB;
	public ModelRenderer	BoltBMF;
	public ModelRenderer	BoltBLF;
	public ModelRenderer	BoltBRF;
	public ModelRenderer	BoltBMB;
	public ModelRenderer	BoltBLB;
	public ModelRenderer	BoltBRB;

	public IronSteelMallet() {
		this.textureWidth = 64;
		this.textureHeight = 34;
		this.HeadBase = new ModelRenderer(this, 26, 0);
		this.HeadBase.setRotationPoint(0.0F, 3.7F, 0.0F);
		this.HeadBase.addBox(-2.5F, -2.5F, -5.0F, 5, 5, 10, 0.0F);
		this.BoltLTB = new ModelRenderer(this, 48, 0);
		this.BoltLTB.setRotationPoint(3.6F, 1.7F, 4.7F);
		this.BoltLTB.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltLTB, 0.0F, -1.5707963267948966F, 0.0F);
		this.BoltLMF = new ModelRenderer(this, 48, 0);
		this.BoltLMF.setRotationPoint(3.6F, 3.7F, -4.7F);
		this.BoltLMF.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltLMF, 0.0F, -1.5707963267948966F, 0.0F);
		this.Handle = new ModelRenderer(this, 52, 25);
		this.Handle.setRotationPoint(0.0F, 19.8F, 0.0F);
		this.Handle.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		this.HeadBaseF = new ModelRenderer(this, 0, 15);
		this.HeadBaseF.setRotationPoint(0.0F, 3.7F, -4.7F);
		this.HeadBaseF.addBox(-7.0F, -7.0F, -2.5F, 14, 14, 5, 0.0F);
		this.BoltRMF = new ModelRenderer(this, 48, 0);
		this.BoltRMF.setRotationPoint(-3.6F, 3.7F, -4.7F);
		this.BoltRMF.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltRMF, 0.0F, 1.5707963267948966F, 0.0F);
		this.BoltRMB = new ModelRenderer(this, 48, 0);
		this.BoltRMB.setRotationPoint(-3.6F, 3.7F, 4.7F);
		this.BoltRMB.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltRMB, 0.0F, 1.5707963267948966F, 0.0F);
		this.BoltLTF = new ModelRenderer(this, 48, 0);
		this.BoltLTF.setRotationPoint(3.6F, 1.7F, -4.7F);
		this.BoltLTF.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltLTF, 0.0F, -1.5707963267948966F, 0.0F);
		this.BoltTMF = new ModelRenderer(this, 48, 0);
		this.BoltTMF.setRotationPoint(0.0F, 0.1F, -4.7F);
		this.BoltTMF.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltTMF, -1.5707963267948966F, 0.0F, 0.0F);
		this.BoltTMB = new ModelRenderer(this, 48, 0);
		this.BoltTMB.setRotationPoint(0.0F, 0.1F, 4.7F);
		this.BoltTMB.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltTMB, -1.5707963267948966F, 0.0F, 0.0F);
		this.BoltBLF = new ModelRenderer(this, 48, 0);
		this.BoltBLF.setRotationPoint(2.0F, 7.3F, -4.7F);
		this.BoltBLF.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltBLF, 1.5707963267948966F, 0.0F, 0.0F);
		this.HandleHolder = new ModelRenderer(this, 60, 14);
		this.HandleHolder.setRotationPoint(0.0F, 2.0F, 0.0F);
		this.HandleHolder.addBox(-0.5F, 0.0F, -0.5F, 1, 18, 1, 0.0F);
		this.BoltTLB = new ModelRenderer(this, 48, 0);
		this.BoltTLB.setRotationPoint(2.0F, 0.1F, 4.7F);
		this.BoltTLB.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltTLB, -1.5707963267948966F, 0.0F, 0.0F);
		this.HeadBaseBC = new ModelRenderer(this, 0, 0);
		this.HeadBaseBC.setRotationPoint(0.0F, 3.7F, 3.2F);
		this.HeadBaseBC.addBox(-6.0F, -6.0F, -0.5F, 12, 12, 1, 0.0F);
		this.setRotateAngle(HeadBaseBC, 0.0F, 3.141592653589793F, 0.0F);
		this.BoltBMF = new ModelRenderer(this, 48, 0);
		this.BoltBMF.setRotationPoint(0.0F, 7.3F, -4.7F);
		this.BoltBMF.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltBMF, 1.5707963267948966F, 0.0F, 0.0F);
		this.BoltRBB = new ModelRenderer(this, 48, 0);
		this.BoltRBB.setRotationPoint(-3.6F, 5.7F, 4.7F);
		this.BoltRBB.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltRBB, 0.0F, 1.5707963267948966F, 0.0F);
		this.BoltBRF = new ModelRenderer(this, 48, 0);
		this.BoltBRF.setRotationPoint(-2.0F, 7.3F, -4.7F);
		this.BoltBRF.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltBRF, 1.5707963267948966F, 0.0F, 0.0F);
		this.BoltTRB = new ModelRenderer(this, 48, 0);
		this.BoltTRB.setRotationPoint(-2.0F, 0.1F, 4.7F);
		this.BoltTRB.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltTRB, -1.5707963267948966F, 0.0F, 0.0F);
		this.BoltRBF = new ModelRenderer(this, 48, 0);
		this.BoltRBF.setRotationPoint(-3.6F, 5.7F, -4.7F);
		this.BoltRBF.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltRBF, 0.0F, 1.5707963267948966F, 0.0F);
		this.BoltBRB = new ModelRenderer(this, 48, 0);
		this.BoltBRB.setRotationPoint(-2.0F, 7.3F, 4.7F);
		this.BoltBRB.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltBRB, 1.5707963267948966F, 0.0F, 0.0F);
		this.BoltBLB = new ModelRenderer(this, 48, 0);
		this.BoltBLB.setRotationPoint(2.0F, 7.3F, 4.7F);
		this.BoltBLB.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltBLB, 1.5707963267948966F, 0.0F, 0.0F);
		this.Handle_1 = new ModelRenderer(this, 48, 29);
		this.Handle_1.setRotationPoint(0.0F, 6.4F, 0.0F);
		this.Handle_1.addBox(-2.0F, -0.5F, -2.0F, 4, 1, 4, 0.0F);
		this.BoltLMB = new ModelRenderer(this, 48, 0);
		this.BoltLMB.setRotationPoint(3.6F, 3.7F, 4.7F);
		this.BoltLMB.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltLMB, 0.0F, -1.5707963267948966F, 0.0F);
		this.BoltTLF = new ModelRenderer(this, 48, 0);
		this.BoltTLF.setRotationPoint(2.0F, 0.1F, -4.7F);
		this.BoltTLF.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltTLF, -1.5707963267948966F, 0.0F, 0.0F);
		this.Handle_2 = new ModelRenderer(this, 38, 18);
		this.Handle_2.setRotationPoint(0.0F, 13.3F, 0.0F);
		this.Handle_2.addBox(-1.0F, -7.0F, -1.0F, 2, 14, 2, 0.0F);
		this.BoltLBB = new ModelRenderer(this, 48, 0);
		this.BoltLBB.setRotationPoint(3.6F, 5.7F, 4.7F);
		this.BoltLBB.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltLBB, 0.0F, -1.5707963267948966F, 0.0F);
		this.BoltTRF = new ModelRenderer(this, 48, 0);
		this.BoltTRF.setRotationPoint(-2.0F, 0.1F, -4.7F);
		this.BoltTRF.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltTRF, -1.5707963267948966F, 0.0F, 0.0F);
		this.BoltBMB = new ModelRenderer(this, 48, 0);
		this.BoltBMB.setRotationPoint(0.0F, 7.3F, 4.7F);
		this.BoltBMB.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltBMB, 1.5707963267948966F, 0.0F, 0.0F);
		this.HeadBaseFC = new ModelRenderer(this, 0, 0);
		this.HeadBaseFC.setRotationPoint(0.0F, 3.7F, -3.2F);
		this.HeadBaseFC.addBox(-6.0F, -6.0F, -0.5F, 12, 12, 1, 0.0F);
		this.BoltRTB = new ModelRenderer(this, 48, 0);
		this.BoltRTB.setRotationPoint(-3.6F, 1.7F, 4.7F);
		this.BoltRTB.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltRTB, 0.0F, 1.5707963267948966F, 0.0F);
		this.BoltRTF = new ModelRenderer(this, 48, 0);
		this.BoltRTF.setRotationPoint(-3.6F, 1.7F, -4.7F);
		this.BoltRTF.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltRTF, 0.0F, 1.5707963267948966F, 0.0F);
		this.HeadBaseB = new ModelRenderer(this, 0, 15);
		this.HeadBaseB.setRotationPoint(0.0F, 3.7F, 4.7F);
		this.HeadBaseB.addBox(-7.0F, -7.0F, -2.5F, 14, 14, 5, 0.0F);
		this.setRotateAngle(HeadBaseB, 0.0F, 3.141592653589793F, 0.0F);
		this.BoltLBF = new ModelRenderer(this, 48, 0);
		this.BoltLBF.setRotationPoint(3.6F, 5.7F, -4.7F);
		this.BoltLBF.addBox(-3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(BoltLBF, 0.0F, -1.5707963267948966F, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.HeadBase.render(f5);
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltLTB.offsetX, this.BoltLTB.offsetY, this.BoltLTB.offsetZ);
		GL11.glTranslatef(this.BoltLTB.rotationPointX * f5, this.BoltLTB.rotationPointY * f5,
				this.BoltLTB.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltLTB.offsetX, -this.BoltLTB.offsetY, -this.BoltLTB.offsetZ);
		GL11.glTranslatef(-this.BoltLTB.rotationPointX * f5, -this.BoltLTB.rotationPointY * f5,
				-this.BoltLTB.rotationPointZ * f5);
		this.BoltLTB.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltLMF.offsetX, this.BoltLMF.offsetY, this.BoltLMF.offsetZ);
		GL11.glTranslatef(this.BoltLMF.rotationPointX * f5, this.BoltLMF.rotationPointY * f5,
				this.BoltLMF.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltLMF.offsetX, -this.BoltLMF.offsetY, -this.BoltLMF.offsetZ);
		GL11.glTranslatef(-this.BoltLMF.rotationPointX * f5, -this.BoltLMF.rotationPointY * f5,
				-this.BoltLMF.rotationPointZ * f5);
		this.BoltLMF.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.Handle.offsetX, this.Handle.offsetY, this.Handle.offsetZ);
		GL11.glTranslatef(this.Handle.rotationPointX * f5, this.Handle.rotationPointY * f5,
				this.Handle.rotationPointZ * f5);
		GL11.glScaled(0.9D, 0.9D, 0.9D);
		GL11.glTranslatef(-this.Handle.offsetX, -this.Handle.offsetY, -this.Handle.offsetZ);
		GL11.glTranslatef(-this.Handle.rotationPointX * f5, -this.Handle.rotationPointY * f5,
				-this.Handle.rotationPointZ * f5);
		this.Handle.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.HeadBaseF.offsetX, this.HeadBaseF.offsetY, this.HeadBaseF.offsetZ);
		GL11.glTranslatef(this.HeadBaseF.rotationPointX * f5, this.HeadBaseF.rotationPointY * f5,
				this.HeadBaseF.rotationPointZ * f5);
		GL11.glScaled(0.5D, 0.5D, 0.5D);
		GL11.glTranslatef(-this.HeadBaseF.offsetX, -this.HeadBaseF.offsetY, -this.HeadBaseF.offsetZ);
		GL11.glTranslatef(-this.HeadBaseF.rotationPointX * f5, -this.HeadBaseF.rotationPointY * f5,
				-this.HeadBaseF.rotationPointZ * f5);
		this.HeadBaseF.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltRMF.offsetX, this.BoltRMF.offsetY, this.BoltRMF.offsetZ);
		GL11.glTranslatef(this.BoltRMF.rotationPointX * f5, this.BoltRMF.rotationPointY * f5,
				this.BoltRMF.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltRMF.offsetX, -this.BoltRMF.offsetY, -this.BoltRMF.offsetZ);
		GL11.glTranslatef(-this.BoltRMF.rotationPointX * f5, -this.BoltRMF.rotationPointY * f5,
				-this.BoltRMF.rotationPointZ * f5);
		this.BoltRMF.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltRMB.offsetX, this.BoltRMB.offsetY, this.BoltRMB.offsetZ);
		GL11.glTranslatef(this.BoltRMB.rotationPointX * f5, this.BoltRMB.rotationPointY * f5,
				this.BoltRMB.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltRMB.offsetX, -this.BoltRMB.offsetY, -this.BoltRMB.offsetZ);
		GL11.glTranslatef(-this.BoltRMB.rotationPointX * f5, -this.BoltRMB.rotationPointY * f5,
				-this.BoltRMB.rotationPointZ * f5);
		this.BoltRMB.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltLTF.offsetX, this.BoltLTF.offsetY, this.BoltLTF.offsetZ);
		GL11.glTranslatef(this.BoltLTF.rotationPointX * f5, this.BoltLTF.rotationPointY * f5,
				this.BoltLTF.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltLTF.offsetX, -this.BoltLTF.offsetY, -this.BoltLTF.offsetZ);
		GL11.glTranslatef(-this.BoltLTF.rotationPointX * f5, -this.BoltLTF.rotationPointY * f5,
				-this.BoltLTF.rotationPointZ * f5);
		this.BoltLTF.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltTMF.offsetX, this.BoltTMF.offsetY, this.BoltTMF.offsetZ);
		GL11.glTranslatef(this.BoltTMF.rotationPointX * f5, this.BoltTMF.rotationPointY * f5,
				this.BoltTMF.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltTMF.offsetX, -this.BoltTMF.offsetY, -this.BoltTMF.offsetZ);
		GL11.glTranslatef(-this.BoltTMF.rotationPointX * f5, -this.BoltTMF.rotationPointY * f5,
				-this.BoltTMF.rotationPointZ * f5);
		this.BoltTMF.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltTMB.offsetX, this.BoltTMB.offsetY, this.BoltTMB.offsetZ);
		GL11.glTranslatef(this.BoltTMB.rotationPointX * f5, this.BoltTMB.rotationPointY * f5,
				this.BoltTMB.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltTMB.offsetX, -this.BoltTMB.offsetY, -this.BoltTMB.offsetZ);
		GL11.glTranslatef(-this.BoltTMB.rotationPointX * f5, -this.BoltTMB.rotationPointY * f5,
				-this.BoltTMB.rotationPointZ * f5);
		this.BoltTMB.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltBLF.offsetX, this.BoltBLF.offsetY, this.BoltBLF.offsetZ);
		GL11.glTranslatef(this.BoltBLF.rotationPointX * f5, this.BoltBLF.rotationPointY * f5,
				this.BoltBLF.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltBLF.offsetX, -this.BoltBLF.offsetY, -this.BoltBLF.offsetZ);
		GL11.glTranslatef(-this.BoltBLF.rotationPointX * f5, -this.BoltBLF.rotationPointY * f5,
				-this.BoltBLF.rotationPointZ * f5);
		this.BoltBLF.render(f5);
		GL11.glPopMatrix();
		this.HandleHolder.render(f5);
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltTLB.offsetX, this.BoltTLB.offsetY, this.BoltTLB.offsetZ);
		GL11.glTranslatef(this.BoltTLB.rotationPointX * f5, this.BoltTLB.rotationPointY * f5,
				this.BoltTLB.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltTLB.offsetX, -this.BoltTLB.offsetY, -this.BoltTLB.offsetZ);
		GL11.glTranslatef(-this.BoltTLB.rotationPointX * f5, -this.BoltTLB.rotationPointY * f5,
				-this.BoltTLB.rotationPointZ * f5);
		this.BoltTLB.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.HeadBaseBC.offsetX, this.HeadBaseBC.offsetY, this.HeadBaseBC.offsetZ);
		GL11.glTranslatef(this.HeadBaseBC.rotationPointX * f5, this.HeadBaseBC.rotationPointY * f5,
				this.HeadBaseBC.rotationPointZ * f5);
		GL11.glScaled(0.5D, 0.5D, 0.5D);
		GL11.glTranslatef(-this.HeadBaseBC.offsetX, -this.HeadBaseBC.offsetY,
				-this.HeadBaseBC.offsetZ);
		GL11.glTranslatef(-this.HeadBaseBC.rotationPointX * f5, -this.HeadBaseBC.rotationPointY
				* f5, -this.HeadBaseBC.rotationPointZ * f5);
		this.HeadBaseBC.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltBMF.offsetX, this.BoltBMF.offsetY, this.BoltBMF.offsetZ);
		GL11.glTranslatef(this.BoltBMF.rotationPointX * f5, this.BoltBMF.rotationPointY * f5,
				this.BoltBMF.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltBMF.offsetX, -this.BoltBMF.offsetY, -this.BoltBMF.offsetZ);
		GL11.glTranslatef(-this.BoltBMF.rotationPointX * f5, -this.BoltBMF.rotationPointY * f5,
				-this.BoltBMF.rotationPointZ * f5);
		this.BoltBMF.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltRBB.offsetX, this.BoltRBB.offsetY, this.BoltRBB.offsetZ);
		GL11.glTranslatef(this.BoltRBB.rotationPointX * f5, this.BoltRBB.rotationPointY * f5,
				this.BoltRBB.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltRBB.offsetX, -this.BoltRBB.offsetY, -this.BoltRBB.offsetZ);
		GL11.glTranslatef(-this.BoltRBB.rotationPointX * f5, -this.BoltRBB.rotationPointY * f5,
				-this.BoltRBB.rotationPointZ * f5);
		this.BoltRBB.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltBRF.offsetX, this.BoltBRF.offsetY, this.BoltBRF.offsetZ);
		GL11.glTranslatef(this.BoltBRF.rotationPointX * f5, this.BoltBRF.rotationPointY * f5,
				this.BoltBRF.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltBRF.offsetX, -this.BoltBRF.offsetY, -this.BoltBRF.offsetZ);
		GL11.glTranslatef(-this.BoltBRF.rotationPointX * f5, -this.BoltBRF.rotationPointY * f5,
				-this.BoltBRF.rotationPointZ * f5);
		this.BoltBRF.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltTRB.offsetX, this.BoltTRB.offsetY, this.BoltTRB.offsetZ);
		GL11.glTranslatef(this.BoltTRB.rotationPointX * f5, this.BoltTRB.rotationPointY * f5,
				this.BoltTRB.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltTRB.offsetX, -this.BoltTRB.offsetY, -this.BoltTRB.offsetZ);
		GL11.glTranslatef(-this.BoltTRB.rotationPointX * f5, -this.BoltTRB.rotationPointY * f5,
				-this.BoltTRB.rotationPointZ * f5);
		this.BoltTRB.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltRBF.offsetX, this.BoltRBF.offsetY, this.BoltRBF.offsetZ);
		GL11.glTranslatef(this.BoltRBF.rotationPointX * f5, this.BoltRBF.rotationPointY * f5,
				this.BoltRBF.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltRBF.offsetX, -this.BoltRBF.offsetY, -this.BoltRBF.offsetZ);
		GL11.glTranslatef(-this.BoltRBF.rotationPointX * f5, -this.BoltRBF.rotationPointY * f5,
				-this.BoltRBF.rotationPointZ * f5);
		this.BoltRBF.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltBRB.offsetX, this.BoltBRB.offsetY, this.BoltBRB.offsetZ);
		GL11.glTranslatef(this.BoltBRB.rotationPointX * f5, this.BoltBRB.rotationPointY * f5,
				this.BoltBRB.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltBRB.offsetX, -this.BoltBRB.offsetY, -this.BoltBRB.offsetZ);
		GL11.glTranslatef(-this.BoltBRB.rotationPointX * f5, -this.BoltBRB.rotationPointY * f5,
				-this.BoltBRB.rotationPointZ * f5);
		this.BoltBRB.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltBLB.offsetX, this.BoltBLB.offsetY, this.BoltBLB.offsetZ);
		GL11.glTranslatef(this.BoltBLB.rotationPointX * f5, this.BoltBLB.rotationPointY * f5,
				this.BoltBLB.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltBLB.offsetX, -this.BoltBLB.offsetY, -this.BoltBLB.offsetZ);
		GL11.glTranslatef(-this.BoltBLB.rotationPointX * f5, -this.BoltBLB.rotationPointY * f5,
				-this.BoltBLB.rotationPointZ * f5);
		this.BoltBLB.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.Handle_1.offsetX, this.Handle_1.offsetY, this.Handle_1.offsetZ);
		GL11.glTranslatef(this.Handle_1.rotationPointX * f5, this.Handle_1.rotationPointY * f5,
				this.Handle_1.rotationPointZ * f5);
		GL11.glScaled(0.5D, 0.5D, 0.5D);
		GL11.glTranslatef(-this.Handle_1.offsetX, -this.Handle_1.offsetY, -this.Handle_1.offsetZ);
		GL11.glTranslatef(-this.Handle_1.rotationPointX * f5, -this.Handle_1.rotationPointY * f5,
				-this.Handle_1.rotationPointZ * f5);
		this.Handle_1.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltLMB.offsetX, this.BoltLMB.offsetY, this.BoltLMB.offsetZ);
		GL11.glTranslatef(this.BoltLMB.rotationPointX * f5, this.BoltLMB.rotationPointY * f5,
				this.BoltLMB.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltLMB.offsetX, -this.BoltLMB.offsetY, -this.BoltLMB.offsetZ);
		GL11.glTranslatef(-this.BoltLMB.rotationPointX * f5, -this.BoltLMB.rotationPointY * f5,
				-this.BoltLMB.rotationPointZ * f5);
		this.BoltLMB.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltTLF.offsetX, this.BoltTLF.offsetY, this.BoltTLF.offsetZ);
		GL11.glTranslatef(this.BoltTLF.rotationPointX * f5, this.BoltTLF.rotationPointY * f5,
				this.BoltTLF.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltTLF.offsetX, -this.BoltTLF.offsetY, -this.BoltTLF.offsetZ);
		GL11.glTranslatef(-this.BoltTLF.rotationPointX * f5, -this.BoltTLF.rotationPointY * f5,
				-this.BoltTLF.rotationPointZ * f5);
		this.BoltTLF.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.Handle_2.offsetX, this.Handle_2.offsetY, this.Handle_2.offsetZ);
		GL11.glTranslatef(this.Handle_2.rotationPointX * f5, this.Handle_2.rotationPointY * f5,
				this.Handle_2.rotationPointZ * f5);
		GL11.glScaled(0.7D, 0.7D, 0.7D);
		GL11.glTranslatef(-this.Handle_2.offsetX, -this.Handle_2.offsetY, -this.Handle_2.offsetZ);
		GL11.glTranslatef(-this.Handle_2.rotationPointX * f5, -this.Handle_2.rotationPointY * f5,
				-this.Handle_2.rotationPointZ * f5);
		this.Handle_2.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltLBB.offsetX, this.BoltLBB.offsetY, this.BoltLBB.offsetZ);
		GL11.glTranslatef(this.BoltLBB.rotationPointX * f5, this.BoltLBB.rotationPointY * f5,
				this.BoltLBB.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltLBB.offsetX, -this.BoltLBB.offsetY, -this.BoltLBB.offsetZ);
		GL11.glTranslatef(-this.BoltLBB.rotationPointX * f5, -this.BoltLBB.rotationPointY * f5,
				-this.BoltLBB.rotationPointZ * f5);
		this.BoltLBB.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltTRF.offsetX, this.BoltTRF.offsetY, this.BoltTRF.offsetZ);
		GL11.glTranslatef(this.BoltTRF.rotationPointX * f5, this.BoltTRF.rotationPointY * f5,
				this.BoltTRF.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltTRF.offsetX, -this.BoltTRF.offsetY, -this.BoltTRF.offsetZ);
		GL11.glTranslatef(-this.BoltTRF.rotationPointX * f5, -this.BoltTRF.rotationPointY * f5,
				-this.BoltTRF.rotationPointZ * f5);
		this.BoltTRF.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltBMB.offsetX, this.BoltBMB.offsetY, this.BoltBMB.offsetZ);
		GL11.glTranslatef(this.BoltBMB.rotationPointX * f5, this.BoltBMB.rotationPointY * f5,
				this.BoltBMB.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltBMB.offsetX, -this.BoltBMB.offsetY, -this.BoltBMB.offsetZ);
		GL11.glTranslatef(-this.BoltBMB.rotationPointX * f5, -this.BoltBMB.rotationPointY * f5,
				-this.BoltBMB.rotationPointZ * f5);
		this.BoltBMB.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.HeadBaseFC.offsetX, this.HeadBaseFC.offsetY, this.HeadBaseFC.offsetZ);
		GL11.glTranslatef(this.HeadBaseFC.rotationPointX * f5, this.HeadBaseFC.rotationPointY * f5,
				this.HeadBaseFC.rotationPointZ * f5);
		GL11.glScaled(0.5D, 0.5D, 0.5D);
		GL11.glTranslatef(-this.HeadBaseFC.offsetX, -this.HeadBaseFC.offsetY,
				-this.HeadBaseFC.offsetZ);
		GL11.glTranslatef(-this.HeadBaseFC.rotationPointX * f5, -this.HeadBaseFC.rotationPointY
				* f5, -this.HeadBaseFC.rotationPointZ * f5);
		this.HeadBaseFC.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltRTB.offsetX, this.BoltRTB.offsetY, this.BoltRTB.offsetZ);
		GL11.glTranslatef(this.BoltRTB.rotationPointX * f5, this.BoltRTB.rotationPointY * f5,
				this.BoltRTB.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltRTB.offsetX, -this.BoltRTB.offsetY, -this.BoltRTB.offsetZ);
		GL11.glTranslatef(-this.BoltRTB.rotationPointX * f5, -this.BoltRTB.rotationPointY * f5,
				-this.BoltRTB.rotationPointZ * f5);
		this.BoltRTB.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltRTF.offsetX, this.BoltRTF.offsetY, this.BoltRTF.offsetZ);
		GL11.glTranslatef(this.BoltRTF.rotationPointX * f5, this.BoltRTF.rotationPointY * f5,
				this.BoltRTF.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltRTF.offsetX, -this.BoltRTF.offsetY, -this.BoltRTF.offsetZ);
		GL11.glTranslatef(-this.BoltRTF.rotationPointX * f5, -this.BoltRTF.rotationPointY * f5,
				-this.BoltRTF.rotationPointZ * f5);
		this.BoltRTF.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.HeadBaseB.offsetX, this.HeadBaseB.offsetY, this.HeadBaseB.offsetZ);
		GL11.glTranslatef(this.HeadBaseB.rotationPointX * f5, this.HeadBaseB.rotationPointY * f5,
				this.HeadBaseB.rotationPointZ * f5);
		GL11.glScaled(0.5D, 0.5D, 0.5D);
		GL11.glTranslatef(-this.HeadBaseB.offsetX, -this.HeadBaseB.offsetY, -this.HeadBaseB.offsetZ);
		GL11.glTranslatef(-this.HeadBaseB.rotationPointX * f5, -this.HeadBaseB.rotationPointY * f5,
				-this.HeadBaseB.rotationPointZ * f5);
		this.HeadBaseB.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.BoltLBF.offsetX, this.BoltLBF.offsetY, this.BoltLBF.offsetZ);
		GL11.glTranslatef(this.BoltLBF.rotationPointX * f5, this.BoltLBF.rotationPointY * f5,
				this.BoltLBF.rotationPointZ * f5);
		GL11.glScaled(0.1D, 0.1D, 0.1D);
		GL11.glTranslatef(-this.BoltLBF.offsetX, -this.BoltLBF.offsetY, -this.BoltLBF.offsetZ);
		GL11.glTranslatef(-this.BoltLBF.rotationPointX * f5, -this.BoltLBF.rotationPointY * f5,
				-this.BoltLBF.rotationPointZ * f5);
		this.BoltLBF.render(f5);
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
