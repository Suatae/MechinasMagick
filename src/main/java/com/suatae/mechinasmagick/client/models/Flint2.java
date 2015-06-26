package com.suatae.mechinasmagick.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;





/**
 * Flint2 - Omegami Created using Tabula 4.1.1
 */
public class Flint2 extends ModelBase {
	public ModelRenderer	shape1;
	public ModelRenderer	shape1_1;
	public ModelRenderer	shape1_2;
	public ModelRenderer	shape4;
	public ModelRenderer	shape4_1;
	public ModelRenderer	shape4_2;
	public ModelRenderer	shape4_3;
	public ModelRenderer	shape4_4;
	public ModelRenderer	shape4_5;
	public ModelRenderer	shape4_6;
	public ModelRenderer	shape4_7;
	public ModelRenderer	shape4_8;

	public Flint2() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.shape1_2 = new ModelRenderer(this, 0, 33);
		this.shape1_2.setRotationPoint(-18.4F, 0.0F, 22.9F);
		this.shape1_2.addBox(-6.0F, -1.0F, -6.0F, 12, 2, 12, 0.0F);
		this.setRotateAngle(shape1_2, 0.0F, 0.31869712141416456F, 0.0F);
		this.shape4_5 = new ModelRenderer(this, 0, 47);
		this.shape4_5.setRotationPoint(-1.0F, 0.3F, 8.6F);
		this.shape4_5.addBox(-2.0F, -1.0F, -2.0F, 4, 2, 4, 0.0F);
		this.setRotateAngle(shape4_5, 0.0F, 0.4553564018453205F, 0.0F);
		this.shape4_2 = new ModelRenderer(this, 0, 47);
		this.shape4_2.setRotationPoint(2.1F, -1.9F, 0.0F);
		this.shape4_2.addBox(-2.0F, -1.0F, -2.0F, 4, 2, 4, 0.0F);
		this.setRotateAngle(shape4_2, 0.0F, 0.40980330836826856F, 0.0F);
		this.shape4_8 = new ModelRenderer(this, 0, 53);
		this.shape4_8.setRotationPoint(-18.8F, 0.0F, 10.0F);
		this.shape4_8.addBox(-2.0F, -1.0F, -3.5F, 4, 2, 7, 0.0F);
		this.setRotateAngle(shape4_8, 0.0F, -0.7740535232594852F, 0.0F);
		this.shape4_6 = new ModelRenderer(this, 0, 47);
		this.shape4_6.setRotationPoint(7.4F, 0.0F, 25.0F);
		this.shape4_6.addBox(-2.0F, -1.0F, -2.0F, 4, 2, 4, 0.0F);
		this.shape1_1 = new ModelRenderer(this, 0, 16);
		this.shape1_1.setRotationPoint(-6.2F, -0.5F, 1.2F);
		this.shape1_1.addBox(-7.0F, -1.5F, -7.0F, 14, 3, 14, 0.0F);
		this.setRotateAngle(shape1_1, 0.0F, -0.5462880558742251F, 0.0F);
		this.shape4_4 = new ModelRenderer(this, 0, 47);
		this.shape4_4.setRotationPoint(17.0F, 0.0F, 20.0F);
		this.shape4_4.addBox(-2.0F, -1.0F, -2.0F, 4, 2, 4, 0.0F);
		this.setRotateAngle(shape4_4, 0.0F, 0.8196066167365371F, 0.0F);
		this.shape4_3 = new ModelRenderer(this, 0, 47);
		this.shape4_3.setRotationPoint(-20.0F, -1.0F, 20.0F);
		this.shape4_3.addBox(-2.0F, -1.0F, -2.0F, 4, 2, 4, 0.0F);
		this.setRotateAngle(shape4_3, 0.0F, -0.9105382707654417F, 0.0F);
		this.shape4_7 = new ModelRenderer(this, 0, 53);
		this.shape4_7.setRotationPoint(9.7F, 0.0F, 13.9F);
		this.shape4_7.addBox(-2.0F, -1.0F, -3.5F, 4, 2, 7, 0.0F);
		this.shape1 = new ModelRenderer(this, 0, 0);
		this.shape1.setRotationPoint(13.0F, 23.0F, -10.0F);
		this.shape1.addBox(-7.0F, -1.0F, -7.0F, 14, 2, 14, 0.0F);
		this.setRotateAngle(shape1, 0.0F, -0.4553564018453205F, 0.0F);
		this.shape4_1 = new ModelRenderer(this, 0, 47);
		this.shape4_1.setRotationPoint(-15.0F, 0.0F, 36.0F);
		this.shape4_1.addBox(-2.0F, -1.0F, -2.0F, 4, 2, 4, 0.0F);
		this.setRotateAngle(shape4_1, 0.0F, 0.9105382707654417F, 0.0F);
		this.shape4 = new ModelRenderer(this, 0, 47);
		this.shape4.setRotationPoint(-25.0F, 0.0F, 5.0F);
		this.shape4.addBox(-2.0F, -1.0F, -2.0F, 4, 2, 4, 0.0F);
		this.shape1.addChild(this.shape1_2);
		this.shape1.addChild(this.shape4_5);
		this.shape1.addChild(this.shape4_2);
		this.shape1.addChild(this.shape4_8);
		this.shape1.addChild(this.shape4_6);
		this.shape1.addChild(this.shape1_1);
		this.shape1.addChild(this.shape4_4);
		this.shape1.addChild(this.shape4_3);
		this.shape1.addChild(this.shape4_7);
		this.shape1.addChild(this.shape4_1);
		this.shape1.addChild(this.shape4);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.shape1.render(f5);
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
