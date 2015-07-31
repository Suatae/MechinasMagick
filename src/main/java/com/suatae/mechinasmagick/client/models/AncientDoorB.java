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
	public ModelRenderer	bottom1;
	public ModelRenderer	shape2;
	public ModelRenderer	shape2_1;
	public ModelRenderer	bottom2;
	public ModelRenderer	shape3;
	public ModelRenderer	shape3_1;
	public ModelRenderer	bottom3;
	public ModelRenderer	shape4;
	public ModelRenderer	shape4_1;
	public ModelRenderer	bottom4;
	public ModelRenderer	center;
	public ModelRenderer	shape1_2;
	public ModelRenderer	shape1_3;
	public ModelRenderer	bottom1_1;
	public ModelRenderer	shape2_2;
	public ModelRenderer	shape2_3;
	public ModelRenderer	bottom2_1;
	public ModelRenderer	shape3_2;
	public ModelRenderer	shape3_3;
	public ModelRenderer	bottom3_1;
	public ModelRenderer	shape4_2;
	public ModelRenderer	shape4_3;
	public ModelRenderer	bottom4_1;
	public ModelRenderer	center_1;

	public AncientDoorB() {
		this.textureWidth = 900;
		this.textureHeight = 870;
		this.bottom1 = new ModelRenderer(this, 0, 126);
		this.bottom1.setRotationPoint(0.0F, 20.5F, 0.0F);
		this.bottom1.addBox(-49.0F, -42.0F, -3.5F, 98, 84, 14, 0.0F);
		this.setRotateAngle(bottom1, 1.5707963267948966F, -1.5707963267948966F, 0.0F);
		this.bottom4_1 = new ModelRenderer(this, 192, 706);
		this.bottom4_1.setRotationPoint(0.0F, -154.0F, 0.0F);
		this.bottom4_1.addBox(-38.0F, -6.0F, -4.0F, 76, 12, 8, 0.0F);
		this.setRotateAngle(bottom4_1, 1.5707963267948966F, -1.5707963267948966F, 0.0F);
		this.bottom2 = new ModelRenderer(this, 230, 220);
		this.bottom2.setRotationPoint(0.0F, 3.0F, 0.0F);
		this.bottom2.addBox(-41.0F, -28.0F, -7.0F, 82, 56, 14, 0.0F);
		this.setRotateAngle(bottom2, 1.5707963267948966F, -1.5707963267948966F, 0.0F);
		this.bottom4 = new ModelRenderer(this, 192, 301);
		this.bottom4.setRotationPoint(0.0F, -22.0F, 0.0F);
		this.bottom4.addBox(-38.0F, -6.0F, -4.0F, 76, 12, 8, 0.0F);
		this.setRotateAngle(bottom4, 1.5707963267948966F, -1.5707963267948966F, 0.0F);
		this.shape1_3 = new ModelRenderer(this, 430, 405);
		this.shape1_3.setRotationPoint(-49.0F, -144.0F, 0.0F);
		this.shape1_3.addBox(-49.0F, -56.0F, -7.0F, 98, 112, 14, 0.0F);
		this.setRotateAngle(shape1_3, 0.0F, -1.5707963267948966F, 0.0F);
		this.shape2_3 = new ModelRenderer(this, 660, 405);
		this.shape2_3.setRotationPoint(-35.0F, -137.0F, 0.0F);
		this.shape2_3.addBox(-41.0F, -49.0F, -7.0F, 82, 98, 14, 0.0F);
		this.setRotateAngle(shape2_3, 0.0F, -1.5707963267948966F, 0.0F);
		this.bottom1_1 = new ModelRenderer(this, 0, 531);
		this.bottom1_1.setRotationPoint(0.0F, -193.0F, 0.0F);
		this.bottom1_1.addBox(-49.0F, -42.0F, -7.0F, 98, 84, 14, 0.0F);
		this.setRotateAngle(bottom1_1, 1.5707963267948966F, -1.5707963267948966F, 0.0F);
		this.shape4 = new ModelRenderer(this, 0, 276);
		this.shape4.setRotationPoint(-10.0F, -53.0F, 0.0F);
		this.shape4.addBox(-38.0F, -35.0F, -4.0F, 76, 70, 8, 0.0F);
		this.setRotateAngle(shape4, 0.0F, -1.5707963267948966F, 0.0F);
		this.shape2 = new ModelRenderer(this, 230, 0);
		this.shape2.setRotationPoint(-35.0F, -39.0F, 0.0F);
		this.shape2.addBox(-41.0F, -49.0F, -7.0F, 82, 98, 14, 0.0F);
		this.setRotateAngle(shape2, 0.0F, -1.5707963267948966F, 0.0F);
		this.shape3_2 = new ModelRenderer(this, 230, 522);
		this.shape3_2.setRotationPoint(-21.0F, -130.0F, 0.0F);
		this.shape3_2.addBox(-33.0F, -42.0F, -7.0F, 66, 84, 14, 0.0F);
		this.setRotateAngle(shape3_2, 0.0F, -1.5707963267948966F, 0.0F);
		this.bottom3_1 = new ModelRenderer(this, 0, 630);
		this.bottom3_1.setRotationPoint(0.0F, -165.0F, 0.0F);
		this.bottom3_1.addBox(-33.0F, -14.0F, -7.0F, 66, 28, 14, 0.0F);
		this.setRotateAngle(bottom3_1, 1.5707963267948966F, -1.5707963267948966F, 0.0F);
		this.shape3 = new ModelRenderer(this, 230, 117);
		this.shape3.setRotationPoint(-21.0F, -46.0F, 0.0F);
		this.shape3.addBox(-33.0F, -42.0F, -7.0F, 66, 84, 14, 0.0F);
		this.setRotateAngle(shape3, 0.0F, -1.5707963267948966F, 0.0F);
		this.bottom3 = new ModelRenderer(this, 0, 225);
		this.bottom3.setRotationPoint(0.0F, -11.0F, 0.0F);
		this.bottom3.addBox(-33.0F, -14.0F, -7.0F, 66, 28, 14, 0.0F);
		this.setRotateAngle(bottom3, 1.5707963267948966F, -1.5707963267948966F, 0.0F);
		this.shape1 = new ModelRenderer(this, 0, 0);
		this.shape1.setRotationPoint(49.0F, -32.0F, 0.0F);
		this.shape1.addBox(-49.0F, -56.0F, -7.0F, 98, 112, 14, 0.0F);
		this.setRotateAngle(shape1, 0.0F, -1.5707963267948966F, 0.0F);
		this.shape4_3 = new ModelRenderer(this, 430, 681);
		this.shape4_3.setRotationPoint(10.0F, -123.0F, 0.0F);
		this.shape4_3.addBox(-38.0F, -35.0F, -4.0F, 76, 70, 8, 0.0F);
		this.setRotateAngle(shape4_3, 0.0F, -1.5707963267948966F, 0.0F);
		this.shape1_1 = new ModelRenderer(this, 430, 0);
		this.shape1_1.setRotationPoint(-49.0F, -32.0F, 0.0F);
		this.shape1_1.addBox(-49.0F, -56.0F, -7.0F, 98, 112, 14, 0.0F);
		this.setRotateAngle(shape1_1, 0.0F, -1.5707963267948966F, 0.0F);
		this.shape3_1 = new ModelRenderer(this, 660, 117);
		this.shape3_1.setRotationPoint(21.0F, -46.0F, 0.0F);
		this.shape3_1.addBox(-33.0F, -42.0F, -7.0F, 66, 84, 14, 0.0F);
		this.setRotateAngle(shape3_1, 0.0F, -1.5707963267948966F, 0.0F);
		this.shape4_2 = new ModelRenderer(this, 0, 681);
		this.shape4_2.setRotationPoint(-10.0F, -123.0F, 0.0F);
		this.shape4_2.addBox(-38.0F, -35.0F, -4.0F, 76, 70, 8, 0.0F);
		this.setRotateAngle(shape4_2, 0.0F, -1.5707963267948966F, 0.0F);
		this.shape3_3 = new ModelRenderer(this, 660, 522);
		this.shape3_3.setRotationPoint(21.0F, -130.0F, 0.0F);
		this.shape3_3.addBox(-33.0F, -42.0F, -7.0F, 66, 84, 14, 0.0F);
		this.setRotateAngle(shape3_3, 0.0F, -1.5707963267948966F, 0.0F);
		this.shape2_2 = new ModelRenderer(this, 230, 405);
		this.shape2_2.setRotationPoint(35.0F, -137.0F, 0.0F);
		this.shape2_2.addBox(-41.0F, -49.0F, -7.0F, 82, 98, 14, 0.0F);
		this.setRotateAngle(shape2_2, 0.0F, -1.5707963267948966F, 0.0F);
		this.shape1_2 = new ModelRenderer(this, 0, 405);
		this.shape1_2.setRotationPoint(49.0F, -144.0F, 0.0F);
		this.shape1_2.addBox(-49.0F, -56.0F, -7.0F, 98, 112, 14, 0.0F);
		this.setRotateAngle(shape1_2, 0.0F, -1.5707963267948966F, 0.0F);
		this.center = new ModelRenderer(this, 188, 328);
		this.center.setRotationPoint(0.0F, -57.0F, 0.0F);
		this.center.addBox(-40.0F, -31.0F, -6.0F, 80, 62, 12, 0.0F);
		this.setRotateAngle(center, 0.0F, -1.5707963267948966F, 0.0F);
		this.center_1 = new ModelRenderer(this, 188, 733);
		this.center_1.setRotationPoint(0.0F, -119.0F, 0.0F);
		this.center_1.addBox(-40.0F, -31.0F, -6.0F, 80, 62, 12, 0.0F);
		this.setRotateAngle(center_1, 0.0F, -1.5707963267948966F, 0.0F);
		this.shape2_1 = new ModelRenderer(this, 660, 0);
		this.shape2_1.setRotationPoint(35.0F, -39.0F, 0.0F);
		this.shape2_1.addBox(-41.0F, -49.0F, -7.0F, 82, 98, 14, 0.0F);
		this.setRotateAngle(shape2_1, 0.0F, -1.5707963267948966F, 0.0F);
		this.shape4_1 = new ModelRenderer(this, 430, 276);
		this.shape4_1.setRotationPoint(10.0F, -53.0F, 0.0F);
		this.shape4_1.addBox(-38.0F, -35.0F, -4.0F, 76, 70, 8, 0.0F);
		this.setRotateAngle(shape4_1, 0.0F, -1.5707963267948966F, 0.0F);
		this.bottom2_1 = new ModelRenderer(this, 230, 625);
		this.bottom2_1.setRotationPoint(0.0F, -179.0F, 0.0F);
		this.bottom2_1.addBox(-41.0F, -28.0F, -7.0F, 82, 56, 14, 0.0F);
		this.setRotateAngle(bottom2_1, 1.5707963267948966F, -1.5707963267948966F, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.bottom1.render(f5);
		this.bottom4_1.render(f5);
		this.bottom2.render(f5);
		this.bottom4.render(f5);
		this.shape1_3.render(f5);
		this.shape2_3.render(f5);
		this.bottom1_1.render(f5);
		this.shape4.render(f5);
		this.shape2.render(f5);
		this.shape3_2.render(f5);
		this.bottom3_1.render(f5);
		this.shape3.render(f5);
		this.bottom3.render(f5);
		this.shape1.render(f5);
		this.shape4_3.render(f5);
		this.shape1_1.render(f5);
		this.shape3_1.render(f5);
		this.shape4_2.render(f5);
		this.shape3_3.render(f5);
		this.shape2_2.render(f5);
		this.shape1_2.render(f5);
		this.center.render(f5);
		this.center_1.render(f5);
		this.shape2_1.render(f5);
		this.shape4_1.render(f5);
		this.bottom2_1.render(f5);
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
