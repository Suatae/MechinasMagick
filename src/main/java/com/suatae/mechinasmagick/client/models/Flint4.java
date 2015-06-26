package com.suatae.mechinasmagick.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;





/**
 * Flint4 - Omegami Created using Tabula 4.1.1
 */
public class Flint4 extends ModelBase {
	public ModelRenderer	shape1;
	public ModelRenderer	shape1_1;
	public ModelRenderer	shape1_2;
	public ModelRenderer	shape1_3;
	public ModelRenderer	shape1_4;
	public ModelRenderer	shape6;
	public ModelRenderer	shape6_1;
	public ModelRenderer	shape6_2;
	public ModelRenderer	shape6_3;
	public ModelRenderer	shape6_4;
	public ModelRenderer	shape11;
	public ModelRenderer	shape11_1;
	public ModelRenderer	shape11_2;

	public Flint4() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.shape6 = new ModelRenderer(this, 52, 0);
		this.shape6.setRotationPoint(-8.0F, 0.0F, 9.6F);
		this.shape6.addBox(-1.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F);
		this.setRotateAngle(shape6, 0.0F, 0.31869712141416456F, 0.0F);
		this.shape1_4 = new ModelRenderer(this, 0, 0);
		this.shape1_4.setRotationPoint(13.3F, 0.0F, -15.6F);
		this.shape1_4.addBox(-6.0F, -1.0F, -6.0F, 12, 2, 12, 0.0F);
		this.setRotateAngle(shape1_4, 0.0F, -0.5918411493512771F, 0.0F);
		this.shape1_3 = new ModelRenderer(this, 0, 0);
		this.shape1_3.setRotationPoint(-10.0F, 0.0F, -25.0F);
		this.shape1_3.addBox(-6.0F, -1.0F, -6.0F, 12, 2, 12, 0.0F);
		this.setRotateAngle(shape1_3, 0.0F, -0.7740535232594852F, 0.0F);
		this.shape11 = new ModelRenderer(this, 0, 29);
		this.shape11.setRotationPoint(1.0F, 0.0F, -20.0F);
		this.shape11.addBox(-1.5F, -1.0F, -4.0F, 3, 2, 8, 0.0F);
		this.shape6_2 = new ModelRenderer(this, 52, 0);
		this.shape6_2.setRotationPoint(10.0F, -1.0F, -13.4F);
		this.shape6_2.addBox(-1.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F);
		this.setRotateAngle(shape6_2, 0.0F, 1.7756979809790308F, 0.0F);
		this.shape6_4 = new ModelRenderer(this, 52, 0);
		this.shape6_4.setRotationPoint(-20.0F, 0.0F, -19.0F);
		this.shape6_4.addBox(-1.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F);
		this.setRotateAngle(shape6_4, 0.0F, 0.22759093446006054F, 0.0F);
		this.shape1_1 = new ModelRenderer(this, 0, 0);
		this.shape1_1.setRotationPoint(-20.0F, 0.0F, 0.0F);
		this.shape1_1.addBox(-6.0F, -1.0F, -6.0F, 12, 2, 12, 0.0F);
		this.setRotateAngle(shape1_1, 0.0F, 0.8196066167365371F, 0.0F);
		this.shape6_1 = new ModelRenderer(this, 52, 0);
		this.shape6_1.setRotationPoint(-15.5F, -2.0F, -3.2F);
		this.shape6_1.addBox(-1.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F);
		this.shape11_2 = new ModelRenderer(this, 0, 29);
		this.shape11_2.setRotationPoint(2.0F, -1.0F, 1.2F);
		this.shape11_2.addBox(-1.5F, -1.0F, -4.0F, 3, 2, 8, 0.0F);
		this.setRotateAngle(shape11_2, 0.0F, -0.7740535232594852F, 0.0F);
		this.shape6_3 = new ModelRenderer(this, 52, 0);
		this.shape6_3.setRotationPoint(-5.0F, 0.5F, -20.7F);
		this.shape6_3.addBox(-1.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F);
		this.setRotateAngle(shape6_3, 0.0F, 0.36425021489121656F, 0.0F);
		this.shape1 = new ModelRenderer(this, 0, 0);
		this.shape1.setRotationPoint(10.0F, 23.0F, 5.0F);
		this.shape1.addBox(-6.0F, -1.0F, -6.0F, 12, 2, 12, 0.0F);
		this.setRotateAngle(shape1, 0.0F, 0.5462880558742251F, 0.0F);
		this.shape11_1 = new ModelRenderer(this, 0, 29);
		this.shape11_1.setRotationPoint(0.0F, 0.0F, 15.0F);
		this.shape11_1.addBox(-1.5F, -1.0F, -4.0F, 3, 2, 8, 0.0F);
		this.setRotateAngle(shape11_1, 0.0F, -1.0471975511965976F, 0.0F);
		this.shape1_2 = new ModelRenderer(this, 0, 14);
		this.shape1_2.setRotationPoint(-10.4F, 0.0F, -6.3F);
		this.shape1_2.addBox(-6.0F, -2.0F, -6.0F, 12, 3, 12, 0.0F);
		this.setRotateAngle(shape1_2, 0.0F, 0.40980330836826856F, 0.0F);
		this.shape1.addChild(this.shape6);
		this.shape1.addChild(this.shape1_4);
		this.shape1.addChild(this.shape1_3);
		this.shape1.addChild(this.shape11);
		this.shape1.addChild(this.shape6_2);
		this.shape1.addChild(this.shape6_4);
		this.shape1.addChild(this.shape1_1);
		this.shape1.addChild(this.shape6_1);
		this.shape1.addChild(this.shape11_2);
		this.shape1.addChild(this.shape6_3);
		this.shape1.addChild(this.shape11_1);
		this.shape1.addChild(this.shape1_2);
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
