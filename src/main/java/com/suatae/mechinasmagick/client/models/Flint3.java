package com.suatae.mechinasmagick.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;





/**
 * Flint3 - Omegami Created using Tabula 4.1.1
 */
public class Flint3 extends ModelBase {
	public ModelRenderer	shape1;
	public ModelRenderer	shape1_1;
	public ModelRenderer	shape1_2;
	public ModelRenderer	shape4;
	public ModelRenderer	shape5;
	public ModelRenderer	shape5_1;
	public ModelRenderer	shape5_2;
	public ModelRenderer	shape5_3;
	public ModelRenderer	shape5_4;
	public ModelRenderer	shape12;
	public ModelRenderer	shape12_1;

	public Flint3() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.shape4 = new ModelRenderer(this, 0, 45);
		this.shape4.setRotationPoint(20.0F, 0.0F, 9.0F);
		this.shape4.addBox(-8.0F, -1.5F, -8.0F, 16, 3, 16, 0.0F);
		this.setRotateAngle(shape4, 0.0F, 0.40980330836826856F, 0.0F);
		this.shape5_2 = new ModelRenderer(this, 44, 0);
		this.shape5_2.setRotationPoint(18.0F, -1.2F, 7.0F);
		this.shape5_2.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
		this.shape5_4 = new ModelRenderer(this, 44, 0);
		this.shape5_4.setRotationPoint(5.9F, 0.0F, -10.0F);
		this.shape5_4.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
		this.setRotateAngle(shape5_4, 0.0F, -0.5462880558742251F, 0.0F);
		this.shape5 = new ModelRenderer(this, 44, 0);
		this.shape5.setRotationPoint(25.0F, 0.0F, -15.0F);
		this.shape5.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
		this.setRotateAngle(shape5, 0.0F, -0.27314402793711257F, 0.0F);
		this.shape12 = new ModelRenderer(this, 34, 8);
		this.shape12.setRotationPoint(-7.5F, 0.0F, -10.0F);
		this.shape12.addBox(-2.5F, -1.0F, -5.0F, 5, 2, 10, 0.0F);
		this.setRotateAngle(shape12, 0.0F, -0.7285004297824331F, 0.0F);
		this.shape5_1 = new ModelRenderer(this, 44, 0);
		this.shape5_1.setRotationPoint(-5.0F, 0.0F, -23.0F);
		this.shape5_1.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
		this.setRotateAngle(shape5_1, 0.0F, 0.31869712141416456F, 0.0F);
		this.shape1_1 = new ModelRenderer(this, 0, 12);
		this.shape1_1.setRotationPoint(2.0F, 1.0F, 5.0F);
		this.shape1_1.addBox(-4.0F, -1.0F, -4.0F, 8, 2, 8, 0.0F);
		this.setRotateAngle(shape1_1, 0.0F, -0.36425021489121656F, 0.0F);
		this.shape12_1 = new ModelRenderer(this, 34, 8);
		this.shape12_1.setRotationPoint(18.0F, 0.0F, -19.5F);
		this.shape12_1.addBox(-2.5F, -1.0F, -5.0F, 5, 2, 10, 0.0F);
		this.setRotateAngle(shape12_1, 0.0F, 0.18203784098300857F, 0.0F);
		this.shape1_2 = new ModelRenderer(this, 0, 12);
		this.shape1_2.setRotationPoint(10.0F, 1.0F, -5.0F);
		this.shape1_2.addBox(-4.0F, -1.0F, -4.0F, 8, 2, 8, 0.0F);
		this.setRotateAngle(shape1_2, 0.0F, 0.5462880558742251F, 0.0F);
		this.shape1 = new ModelRenderer(this, 0, 0);
		this.shape1.setRotationPoint(-10.0F, 22.0F, 3.0F);
		this.shape1.addBox(-4.0F, -2.0F, -4.0F, 8, 4, 8, 0.0F);
		this.shape5_3 = new ModelRenderer(this, 44, 0);
		this.shape5_3.setRotationPoint(-10.0F, 0.0F, 12.5F);
		this.shape5_3.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
		this.setRotateAngle(shape5_3, 0.0F, 0.40980330836826856F, 0.0F);
		this.shape1.addChild(this.shape4);
		this.shape1.addChild(this.shape5_2);
		this.shape1.addChild(this.shape5_4);
		this.shape1.addChild(this.shape5);
		this.shape1.addChild(this.shape12);
		this.shape1.addChild(this.shape5_1);
		this.shape1.addChild(this.shape1_1);
		this.shape1.addChild(this.shape12_1);
		this.shape1.addChild(this.shape1_2);
		this.shape1.addChild(this.shape5_3);
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
