package com.suatae.mechinasmagick.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * GoldCrop - Suatae
 * Created using Tabula 4.1.1
 */
public class GoldCrop extends ModelBase {
    public ModelRenderer Base;
    public ModelRenderer BottomFront;
    public ModelRenderer BottomBack;
    public ModelRenderer BottomLeft;
    public ModelRenderer BottomRight;
    public ModelRenderer FrontLeft;
    public ModelRenderer BackRight;
    public ModelRenderer FrontRight;
    public ModelRenderer BackLeft;
    public ModelRenderer Top;

    public GoldCrop() {
        this.textureWidth = 35;
        this.textureHeight = 32;
        this.BottomRight = new ModelRenderer(this, 0, 13);
        this.BottomRight.setRotationPoint(-3.5F, -1.0F, 0.0F);
        this.BottomRight.addBox(-3.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F);
        this.setRotateAngle(BottomRight, 0.0F, -1.5707963267948966F, 0.0F);
        this.BackRight = new ModelRenderer(this, 0, 15);
        this.BackRight.setRotationPoint(-2.5F, -4.5F, 2.5F);
        this.BackRight.addBox(-4.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
        this.setRotateAngle(BackRight, 0.0F, -3.141592653589793F, -1.5707963267948966F);
        this.Top = new ModelRenderer(this, 0, 17);
        this.Top.setRotationPoint(0.0F, -9.0F, 0.0F);
        this.Top.addBox(-3.5F, -0.5F, -3.5F, 7, 1, 7, 0.0F);
        this.BottomBack = new ModelRenderer(this, 0, 11);
        this.BottomBack.setRotationPoint(0.0F, -1.0F, 3.5F);
        this.BottomBack.addBox(-4.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
        this.FrontRight = new ModelRenderer(this, 0, 15);
        this.FrontRight.setRotationPoint(-2.5F, -4.5F, -2.5F);
        this.FrontRight.addBox(-4.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
        this.setRotateAngle(FrontRight, 0.0F, -3.141592653589793F, -1.5707963267948966F);
        this.FrontLeft = new ModelRenderer(this, 0, 15);
        this.FrontLeft.setRotationPoint(2.5F, -4.5F, -2.5F);
        this.FrontLeft.addBox(-4.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
        this.setRotateAngle(FrontLeft, 0.0F, -3.141592653589793F, -1.5707963267948966F);
        this.Base = new ModelRenderer(this, 0, 0);
        this.Base.setRotationPoint(0.0F, 23.5F, 0.0F);
        this.Base.addBox(-5.0F, -0.5F, -5.0F, 10, 1, 10, 0.0F);
        this.BottomLeft = new ModelRenderer(this, 0, 13);
        this.BottomLeft.setRotationPoint(3.5F, -1.0F, 0.0F);
        this.BottomLeft.addBox(-3.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F);
        this.setRotateAngle(BottomLeft, 0.0F, 1.5707963267948966F, 0.0F);
        this.BackLeft = new ModelRenderer(this, 0, 15);
        this.BackLeft.setRotationPoint(2.5F, -4.5F, 2.5F);
        this.BackLeft.addBox(-4.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
        this.setRotateAngle(BackLeft, 0.0F, -3.141592653589793F, -1.5707963267948966F);
        this.BottomFront = new ModelRenderer(this, 0, 11);
        this.BottomFront.setRotationPoint(0.0F, -1.0F, -3.5F);
        this.BottomFront.addBox(-4.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
        this.setRotateAngle(BottomFront, 0.0F, -3.141592653589793F, 0.0F);
        this.Base.addChild(this.BottomRight);
        this.Base.addChild(this.BackRight);
        this.Base.addChild(this.Top);
        this.Base.addChild(this.BottomBack);
        this.Base.addChild(this.FrontRight);
        this.Base.addChild(this.FrontLeft);
        this.Base.addChild(this.BottomLeft);
        this.Base.addChild(this.BackLeft);
        this.Base.addChild(this.BottomFront);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Base.render(f5);
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
