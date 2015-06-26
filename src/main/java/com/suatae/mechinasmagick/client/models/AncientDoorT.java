package com.suatae.mechinasmagick.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ADoor - Omegami
 * Created using Tabula 4.1.1
 */
public class AncientDoorT extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape1_1;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer shape4_1;
    public ModelRenderer shape4_2;
    public ModelRenderer shape4_3;
    public ModelRenderer shape4_4;
    public ModelRenderer shape4_5;
    public ModelRenderer shape4_6;
    public ModelRenderer shape4_7;
    public ModelRenderer shape4_8;
    public ModelRenderer shape4_9;
    public ModelRenderer shape4_10;
    public ModelRenderer shape4_11;
    public ModelRenderer shape4_12;
    public ModelRenderer shape4_13;
    public ModelRenderer shape4_14;
    public ModelRenderer shape4_15;
    public ModelRenderer shape4_16;
    public ModelRenderer shape4_17;
    public ModelRenderer shape4_18;
    public ModelRenderer shape4_19;

    public AncientDoorT() {
        this.textureWidth = 256;
        this.textureHeight = 290;
        this.shape4_9 = new ModelRenderer(this, 0, 227);
        this.shape4_9.setRotationPoint(6.0F, -21.0F, 63.0F);
        this.shape4_9.addBox(-42.0F, -10.5F, -10.5F, 84, 21, 21, 0.0F);
        this.shape4_10 = new ModelRenderer(this, 0, 227);
        this.shape4_10.setRotationPoint(5.0F, -42.0F, 21.0F);
        this.shape4_10.addBox(-42.0F, -10.5F, -10.5F, 84, 21, 21, 0.0F);
        this.shape1_1 = new ModelRenderer(this, 0, 0);
        this.shape1_1.setRotationPoint(0.0F, 0.0F, 98.0F);
        this.shape1_1.addBox(-49.0F, -56.0F, -3.5F, 98, 112, 14, 0.0F);
        this.shape4_6 = new ModelRenderer(this, 0, 227);
        this.shape4_6.setRotationPoint(1.9F, -63.0F, 0.0F);
        this.shape4_6.addBox(-42.0F, -10.5F, -10.5F, 84, 21, 21, 0.0F);
        this.shape4_7 = new ModelRenderer(this, 0, 227);
        this.shape4_7.setRotationPoint(2.6F, -21.0F, 21.0F);
        this.shape4_7.addBox(-42.0F, -10.5F, -10.5F, 84, 21, 21, 0.0F);
        this.shape4_4 = new ModelRenderer(this, 0, 227);
        this.shape4_4.setRotationPoint(4.0F, -21.0F, 0.0F);
        this.shape4_4.addBox(-42.0F, -10.5F, -10.5F, 84, 21, 21, 0.0F);
        this.shape4_5 = new ModelRenderer(this, 0, 227);
        this.shape4_5.setRotationPoint(10.0F, -42.0F, 0.0F);
        this.shape4_5.addBox(-42.0F, -10.5F, -10.5F, 84, 21, 21, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(-52.5F, -32.0F, 0.0F);
        this.shape1.addBox(-49.0F, -56.0F, -3.5F, 98, 112, 14, 0.0F);
        this.setRotateAngle(shape1, 0.0F, 1.5707963267948966F, 0.0F);
        this.shape4_12 = new ModelRenderer(this, 0, 227);
        this.shape4_12.setRotationPoint(2.2F, -42.0F, 63.0F);
        this.shape4_12.addBox(-42.0F, -10.5F, -10.5F, 84, 21, 21, 0.0F);
        this.shape4_2 = new ModelRenderer(this, 0, 227);
        this.shape4_2.setRotationPoint(5.0F, 0.0F, 42.0F);
        this.shape4_2.addBox(-42.0F, -10.5F, -10.5F, 84, 21, 21, 0.0F);
        this.shape4_13 = new ModelRenderer(this, 0, 227);
        this.shape4_13.setRotationPoint(3.1F, -63.0F, 21.0F);
        this.shape4_13.addBox(-42.0F, -10.5F, -10.5F, 84, 21, 21, 0.0F);
        this.shape4_3 = new ModelRenderer(this, 0, 227);
        this.shape4_3.setRotationPoint(2.0F, 0.0F, 63.0F);
        this.shape4_3.addBox(-42.0F, -10.5F, -10.5F, 84, 21, 21, 0.0F);
        this.shape4_15 = new ModelRenderer(this, 0, 227);
        this.shape4_15.setRotationPoint(0.0F, -63.0F, 63.0F);
        this.shape4_15.addBox(-42.0F, -10.5F, -10.5F, 84, 21, 21, 0.0F);
        this.shape4_11 = new ModelRenderer(this, 0, 227);
        this.shape4_11.setRotationPoint(1.5F, -42.0F, 42.0F);
        this.shape4_11.addBox(-42.0F, -10.5F, -10.5F, 84, 21, 21, 0.0F);
        this.shape4_16 = new ModelRenderer(this, 0, 227);
        this.shape4_16.setRotationPoint(4.0F, -17.5F, 0.0F);
        this.shape4_16.addBox(-42.0F, -7.0F, -10.5F, 84, 14, 21, 0.0F);
        this.shape4_1 = new ModelRenderer(this, 0, 227);
        this.shape4_1.setRotationPoint(4.0F, 0.0F, 21.0F);
        this.shape4_1.addBox(-42.0F, -10.5F, -10.5F, 84, 21, 21, 0.0F);
        this.shape3 = new ModelRenderer(this, 0, 126);
        this.shape3.setRotationPoint(0.0F, 52.5F, 59.5F);
        this.shape3.addBox(-49.0F, -49.0F, -3.5F, 98, 84, 14, 0.0F);
        this.setRotateAngle(shape3, 1.5707963267948966F, 0.0F, 0.0F);
        this.shape4_17 = new ModelRenderer(this, 0, 227);
        this.shape4_17.setRotationPoint(0.0F, 0.0F, -21.0F);
        this.shape4_17.addBox(-42.0F, -7.0F, -10.5F, 84, 14, 21, 0.0F);
        this.shape4 = new ModelRenderer(this, 0, 227);
        this.shape4.setRotationPoint(-4.0F, 31.5F, 21.0F);
        this.shape4.addBox(-42.0F, -10.5F, -10.5F, 84, 21, 21, 0.0F);
        this.shape4_8 = new ModelRenderer(this, 0, 227);
        this.shape4_8.setRotationPoint(0.0F, -21.0F, 42.0F);
        this.shape4_8.addBox(-42.0F, -10.5F, -10.5F, 84, 21, 21, 0.0F);
        this.shape4_18 = new ModelRenderer(this, 0, 227);
        this.shape4_18.setRotationPoint(0.0F, 0.0F, -42.0F);
        this.shape4_18.addBox(-42.0F, -7.0F, -10.5F, 84, 14, 21, 0.0F);
        this.shape4_14 = new ModelRenderer(this, 0, 227);
        this.shape4_14.setRotationPoint(-1.2F, -63.0F, 42.0F);
        this.shape4_14.addBox(-42.0F, -10.5F, -10.5F, 84, 21, 21, 0.0F);
        this.shape4_19 = new ModelRenderer(this, 0, 227);
        this.shape4_19.setRotationPoint(0.0F, 0.0F, -63.0F);
        this.shape4_19.addBox(-42.0F, -7.0F, -10.5F, 84, 14, 21, 0.0F);
        this.shape4.addChild(this.shape4_9);
        this.shape4.addChild(this.shape4_10);
        this.shape1.addChild(this.shape1_1);
        this.shape4.addChild(this.shape4_6);
        this.shape4.addChild(this.shape4_7);
        this.shape4.addChild(this.shape4_4);
        this.shape4.addChild(this.shape4_5);
        this.shape4.addChild(this.shape4_12);
        this.shape4.addChild(this.shape4_2);
        this.shape4.addChild(this.shape4_13);
        this.shape4.addChild(this.shape4_3);
        this.shape4.addChild(this.shape4_15);
        this.shape4.addChild(this.shape4_11);
        this.shape4_15.addChild(this.shape4_16);
        this.shape4.addChild(this.shape4_1);
        this.shape1.addChild(this.shape3);
        this.shape4_16.addChild(this.shape4_17);
        this.shape1.addChild(this.shape4);
        this.shape4.addChild(this.shape4_8);
        this.shape4_16.addChild(this.shape4_18);
        this.shape4.addChild(this.shape4_14);
        this.shape4_16.addChild(this.shape4_19);
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
