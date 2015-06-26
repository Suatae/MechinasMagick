package com.suatae.mechinasmagick.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Casing - Suatae
 * Created using Tabula 4.1.1
 */
public class Casing extends ModelBase {
    public ModelRenderer shape28;
    public ModelRenderer shape28_1;
    public ModelRenderer shape30;
    public ModelRenderer shape30_1;
    public ModelRenderer shape30_2;
    public ModelRenderer shape30_3;

    public Casing() {
        this.textureWidth = 35;
        this.textureHeight = 32;
        this.shape30 = new ModelRenderer(this, 0, 9);
        this.shape30.setRotationPoint(2.5F, -4.5F, 2.5F);
        this.shape30.addBox(-0.5F, -4.0F, -0.5F, 1, 8, 1, 0.0F);
        this.shape28_1 = new ModelRenderer(this, 0, 0);
        this.shape28_1.setRotationPoint(0.0F, -9.0F, 0.0F);
        this.shape28_1.addBox(-3.5F, -0.5F, -3.5F, 7, 1, 7, 0.0F);
        this.shape28 = new ModelRenderer(this, 0, 0);
        this.shape28.setRotationPoint(0.0F, 23.5F, 0.0F);
        this.shape28.addBox(-3.5F, -0.5F, -3.5F, 7, 1, 7, 0.0F);
        this.shape30_1 = new ModelRenderer(this, 0, 9);
        this.shape30_1.setRotationPoint(-2.5F, -4.5F, -2.5F);
        this.shape30_1.addBox(-0.5F, -4.0F, -0.5F, 1, 8, 1, 0.0F);
        this.shape30_3 = new ModelRenderer(this, 0, 9);
        this.shape30_3.setRotationPoint(-2.5F, -4.5F, 2.5F);
        this.shape30_3.addBox(-0.5F, -4.0F, -0.5F, 1, 8, 1, 0.0F);
        this.shape30_2 = new ModelRenderer(this, 0, 9);
        this.shape30_2.setRotationPoint(2.5F, -4.5F, -2.5F);
        this.shape30_2.addBox(-0.5F, -4.0F, -0.5F, 1, 8, 1, 0.0F);
        this.shape28.addChild(this.shape30);
        this.shape28.addChild(this.shape28_1);
        this.shape28.addChild(this.shape30_1);
        this.shape28.addChild(this.shape30_3);
        this.shape28.addChild(this.shape30_2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape28.render(f5);
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
