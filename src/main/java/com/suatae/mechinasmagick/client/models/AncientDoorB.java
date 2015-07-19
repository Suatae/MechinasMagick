package com.suatae.mechinasmagick.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;





/**
 * Door - Omegami Created using Tabula 4.1.1
 */
public class AncientDoorB extends ModelBase {
	public ModelRenderer	shape1;
	public ModelRenderer	shape1_1;
	public ModelRenderer	shape1_2;
	public ModelRenderer	shape3;
	public ModelRenderer	shape3_1;
	public ModelRenderer	shape3_2;
	public ModelRenderer	shape3_3;
	public ModelRenderer	shape3_4;
	public ModelRenderer	shape3_5;
	public ModelRenderer	shape3_6;
	public ModelRenderer	shape3_7;
	public ModelRenderer	shape3_8;
	public ModelRenderer	shape3_9;
	public ModelRenderer	shape3_10;
	public ModelRenderer	shape1_3;
	public ModelRenderer	shape3_11;
	public ModelRenderer	shape3_12;
	public ModelRenderer	shape3_13;
	public ModelRenderer	shape3_14;
	public ModelRenderer	shape3_15;
	public ModelRenderer	shape3_16;
	public ModelRenderer	shape3_17;
	public ModelRenderer	shape3_18;
	public ModelRenderer	shape3_19;
	public ModelRenderer	shape3_20;
	public ModelRenderer	shape3_21;

	public AncientDoorB() {
		this.textureWidth = 512;
		this.textureHeight = 512;
		this.shape3_15 = new ModelRenderer(this, 230, 117);
		this.shape3_15.setRotationPoint(0.0F, -14.0F, 31.5F);
		this.shape3_15.addBox(-33.0F, -42.0F, -7.0F, 66, 84, 14, 0.0F);
		this.shape3_14 = new ModelRenderer(this, 230, 220);
		this.shape3_14.setRotationPoint(0.0F, 35.0F, 52.5F);
		this.shape3_14.addBox(-41.0F, -28.0F, -7.0F, 82, 56, 14, 0.0F);
		this.setRotateAngle(shape3_14, 1.5707963267948966F, 0.0F, 0.0F);
		this.shape3_21 = new ModelRenderer(this, 188, 328);
		this.shape3_21.setRotationPoint(0.0F, -25.0F, 52.5F);
		this.shape3_21.addBox(-40.0F, -31.0F, -6.0F, 80, 62, 12, 0.0F);
		this.shape3_8 = new ModelRenderer(this, 0, 276);
		this.shape3_8.setRotationPoint(0.0F, -21.0F, 62.5F);
		this.shape3_8.addBox(-38.0F, -35.0F, -4.0F, 76, 70, 8, 0.0F);
		this.shape3_10 = new ModelRenderer(this, 188, 328);
		this.shape3_10.setRotationPoint(0.0F, -25.0F, 52.5F);
		this.shape3_10.addBox(-40.0F, -31.0F, -6.0F, 80, 62, 12, 0.0F);
		this.shape3_19 = new ModelRenderer(this, 0, 276);
		this.shape3_19.setRotationPoint(0.0F, -21.0F, 62.5F);
		this.shape3_19.addBox(-38.0F, -35.0F, -4.0F, 76, 70, 8, 0.0F);
		this.shape3_20 = new ModelRenderer(this, 192, 301);
		this.shape3_20.setRotationPoint(0.0F, 10.0F, 52.5F);
		this.shape3_20.addBox(-38.0F, -6.0F, -4.0F, 76, 12, 8, 0.0F);
		this.setRotateAngle(shape3_20, 1.5707963267948966F, 0.0F, 0.0F);
		this.shape1_3 = new ModelRenderer(this, 0, 0);
		this.shape1_3.setRotationPoint(0.0F, 0.0F, 98.0F);
		this.shape1_3.addBox(-49.0F, -56.0F, -3.5F, 98, 112, 14, 0.0F);
		this.shape3_7 = new ModelRenderer(this, 0, 276);
		this.shape3_7.setRotationPoint(0.0F, -21.0F, 42.5F);
		this.shape3_7.addBox(-38.0F, -35.0F, -4.0F, 76, 70, 8, 0.0F);
		this.shape3_4 = new ModelRenderer(this, 230, 117);
		this.shape3_4.setRotationPoint(0.0F, -14.0F, 31.5F);
		this.shape3_4.addBox(-33.0F, -42.0F, -7.0F, 66, 84, 14, 0.0F);
		this.shape3_1 = new ModelRenderer(this, 230, 0);
		this.shape3_1.setRotationPoint(0.0F, -7.0F, 17.5F);
		this.shape3_1.addBox(-41.0F, -49.0F, -7.0F, 82, 98, 14, 0.0F);
		this.shape1_2 = new ModelRenderer(this, 0, 0);
		this.shape1_2.setRotationPoint(0.0F, 0.0F, 98.0F);
		this.shape1_2.addBox(-49.0F, -56.0F, -3.5F, 98, 112, 14, 0.0F);
		this.shape3_5 = new ModelRenderer(this, 230, 117);
		this.shape3_5.setRotationPoint(0.0F, -14.0F, 73.5F);
		this.shape3_5.addBox(-33.0F, -42.0F, -7.0F, 66, 84, 14, 0.0F);
		this.shape3_13 = new ModelRenderer(this, 230, 0);
		this.shape3_13.setRotationPoint(0.0F, -7.0F, 87.5F);
		this.shape3_13.addBox(-41.0F, -49.0F, -7.0F, 82, 98, 14, 0.0F);
		this.shape3_3 = new ModelRenderer(this, 230, 220);
		this.shape3_3.setRotationPoint(0.0F, 35.0F, 52.5F);
		this.shape3_3.addBox(-41.0F, -28.0F, -7.0F, 82, 56, 14, 0.0F);
		this.setRotateAngle(shape3_3, 1.5707963267948966F, 0.0F, 0.0F);
		this.shape3_6 = new ModelRenderer(this, 0, 225);
		this.shape3_6.setRotationPoint(0.0F, 21.0F, 52.5F);
		this.shape3_6.addBox(-33.0F, -14.0F, -7.0F, 66, 28, 14, 0.0F);
		this.setRotateAngle(shape3_6, 1.5707963267948966F, 0.0F, 0.0F);
		this.shape3_17 = new ModelRenderer(this, 0, 225);
		this.shape3_17.setRotationPoint(0.0F, 21.0F, 52.5F);
		this.shape3_17.addBox(-33.0F, -14.0F, -7.0F, 66, 28, 14, 0.0F);
		this.setRotateAngle(shape3_17, 1.5707963267948966F, 0.0F, 0.0F);
		this.shape1 = new ModelRenderer(this, 0, 0);
		this.shape1.setRotationPoint(52.5F, -32.0F, 0.0F);
		this.shape1.addBox(-49.0F, -56.0F, -3.5F, 98, 112, 14, 0.0F);
		this.setRotateAngle(shape1, 0.0F, -1.5707963267948966F, 0.0F);
		this.shape1_1 = new ModelRenderer(this, 0, 0);
		this.shape1_1.setRotationPoint(-52.5F, -144.0F, 0.0F);
		this.shape1_1.addBox(-49.0F, -56.0F, -3.5F, 98, 112, 14, 0.0F);
		this.setRotateAngle(shape1_1, 0.0F, -1.5707963267948966F, 3.141592653589793F);
		this.shape3_11 = new ModelRenderer(this, 0, 126);
		this.shape3_11.setRotationPoint(0.0F, 52.5F, 59.5F);
		this.shape3_11.addBox(-49.0F, -49.0F, -3.5F, 98, 84, 14, 0.0F);
		this.setRotateAngle(shape3_11, 1.5707963267948966F, 0.0F, 0.0F);
		this.shape3_12 = new ModelRenderer(this, 230, 0);
		this.shape3_12.setRotationPoint(0.0F, -7.0F, 17.5F);
		this.shape3_12.addBox(-41.0F, -49.0F, -7.0F, 82, 98, 14, 0.0F);
		this.shape3 = new ModelRenderer(this, 0, 126);
		this.shape3.setRotationPoint(0.0F, 52.5F, 59.5F);
		this.shape3.addBox(-49.0F, -49.0F, -3.5F, 98, 84, 14, 0.0F);
		this.setRotateAngle(shape3, 1.5707963267948966F, 0.0F, 0.0F);
		this.shape3_9 = new ModelRenderer(this, 192, 301);
		this.shape3_9.setRotationPoint(0.0F, 10.0F, 52.5F);
		this.shape3_9.addBox(-38.0F, -6.0F, -4.0F, 76, 12, 8, 0.0F);
		this.setRotateAngle(shape3_9, 1.5707963267948966F, 0.0F, 0.0F);
		this.shape3_2 = new ModelRenderer(this, 230, 0);
		this.shape3_2.setRotationPoint(0.0F, -7.0F, 87.5F);
		this.shape3_2.addBox(-41.0F, -49.0F, -7.0F, 82, 98, 14, 0.0F);
		this.shape3_18 = new ModelRenderer(this, 0, 276);
		this.shape3_18.setRotationPoint(0.0F, -21.0F, 42.5F);
		this.shape3_18.addBox(-38.0F, -35.0F, -4.0F, 76, 70, 8, 0.0F);
		this.shape3_16 = new ModelRenderer(this, 230, 117);
		this.shape3_16.setRotationPoint(0.0F, -14.0F, 73.5F);
		this.shape3_16.addBox(-33.0F, -42.0F, -7.0F, 66, 84, 14, 0.0F);
		this.shape1_1.addChild(this.shape3_15);
		this.shape1_1.addChild(this.shape3_14);
		this.shape1_1.addChild(this.shape3_21);
		this.shape1.addChild(this.shape3_8);
		this.shape1.addChild(this.shape3_10);
		this.shape1_1.addChild(this.shape3_19);
		this.shape1_1.addChild(this.shape3_20);
		this.shape1_1.addChild(this.shape1_3);
		this.shape1.addChild(this.shape3_7);
		this.shape1.addChild(this.shape3_4);
		this.shape1.addChild(this.shape3_1);
		this.shape1.addChild(this.shape1_2);
		this.shape1.addChild(this.shape3_5);
		this.shape1_1.addChild(this.shape3_13);
		this.shape1.addChild(this.shape3_3);
		this.shape1.addChild(this.shape3_6);
		this.shape1_1.addChild(this.shape3_17);
		this.shape1_1.addChild(this.shape3_11);
		this.shape1_1.addChild(this.shape3_12);
		this.shape1.addChild(this.shape3);
		this.shape1.addChild(this.shape3_9);
		this.shape1.addChild(this.shape3_2);
		this.shape1_1.addChild(this.shape3_18);
		this.shape1_1.addChild(this.shape3_16);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.shape1.render(f5);
		this.shape1_1.render(f5);
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
