package com.suatae.mechinasmagick.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;





/**
 * Flint1 - Omegami Created using Tabula 4.1.1
 */
public class Flint1 extends ModelBase {
	public ModelRenderer	shape1;
	public ModelRenderer	shape1_1;
	public ModelRenderer	shape3;
	public ModelRenderer	shape3_1;
	public ModelRenderer	shape3_2;
	public ModelRenderer	shape3_3;
	public ModelRenderer	shape3_4;
	public ModelRenderer	shape3_5;

	public Flint1() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.shape1_1 = new ModelRenderer(this, 0, 0);
		this.shape1_1.setRotationPoint(4.0F, -0.5F, -5.0F);
		this.shape1_1.addBox(-8.0F, -2.5F, -8.0F, 16, 5, 16, 0.0F);
		this.shape3_2 = new ModelRenderer(this, 0, 24);
		this.shape3_2.setRotationPoint(10.0F, 0.0F, 15.0F);
		this.shape3_2.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
		this.setRotateAngle(shape3_2, 0.0F, 0.7740535232594852F, 0.0F);
		this.shape3_4 = new ModelRenderer(this, 0, 24);
		this.shape3_4.setRotationPoint(-14.0F, 0.0F, -6.0F);
		this.shape3_4.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
		this.setRotateAngle(shape3_4, 0.0F, 0.4553564018453205F, 0.0F);
		this.shape1 = new ModelRenderer(this, 0, 0);
		this.shape1.setRotationPoint(-5.7F, 22.0F, 0.0F);
		this.shape1.addBox(-8.0F, -2.0F, -8.0F, 16, 4, 16, 0.0F);
		this.shape3 = new ModelRenderer(this, 0, 24);
		this.shape3.setRotationPoint(3.0F, -2.0F, 2.7F);
		this.shape3.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
		this.setRotateAngle(shape3, 0.0F, 0.31869712141416456F, 0.0F);
		this.shape3_5 = new ModelRenderer(this, 0, 24);
		this.shape3_5.setRotationPoint(0.0F, 0.0F, -14.0F);
		this.shape3_5.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
		this.setRotateAngle(shape3_5, 0.0F, -0.22759093446006054F, 0.0F);
		this.shape3_1 = new ModelRenderer(this, 0, 24);
		this.shape3_1.setRotationPoint(25.8F, 0.0F, 0.0F);
		this.shape3_1.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
		this.setRotateAngle(shape3_1, 0.0F, -0.045553093477052F, 0.0F);
		this.shape3_3 = new ModelRenderer(this, 0, 24);
		this.shape3_3.setRotationPoint(-0.0F, 0.0F, 20.0F);
		this.shape3_3.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
		this.setRotateAngle(shape3_3, 0.0F, 0.136659280431156F, 0.0F);
		this.shape1.addChild(this.shape1_1);
		this.shape1.addChild(this.shape3_2);
		this.shape1.addChild(this.shape3_4);
		this.shape1.addChild(this.shape3);
		this.shape1.addChild(this.shape3_5);
		this.shape1.addChild(this.shape3_1);
		this.shape1.addChild(this.shape3_3);
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
