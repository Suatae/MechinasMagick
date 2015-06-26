package com.suatae.mechinasmagick.client.models.crop;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

/**
 * CropNew - Suatae
 * Created using Tabula 4.1.1
 */
public class Crop10 extends ModelBase {
    public double[] modelScale = new double[] { 2.0D, 2.0D, 2.0D };
    public ModelRenderer Stem;
    public ModelRenderer Base01;
    public ModelRenderer Base02;
    public ModelRenderer Base03;
    public ModelRenderer Base04;
    public ModelRenderer Top01;
    public ModelRenderer Top02;
    public ModelRenderer Top03;
    public ModelRenderer Top04;
    public ModelRenderer Fruit;

    public Crop10() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Top03 = new ModelRenderer(this, 0, 32);
        this.Top03.setRotationPoint(1.8F, 35.5F, 0.0F);
        this.Top03.addBox(-3.0F, 0.0F, -3.0F, 6, 20, 6, 0.0F);
        this.setRotateAngle(Top03, 3.141592653589793F, 0.0F, 1.1344640137963142F);
        this.Top01 = new ModelRenderer(this, 0, 32);
        this.Top01.setRotationPoint(-1.8F, 35.5F, 0.0F);
        this.Top01.addBox(-3.0F, 0.0F, -3.0F, 6, 20, 6, 0.0F);
        this.setRotateAngle(Top01, 3.141592653589793F, 0.0F, -1.1344640137963142F);
        this.Top02 = new ModelRenderer(this, 0, 32);
        this.Top02.setRotationPoint(0.0F, 35.5F, -1.8F);
        this.Top02.addBox(-3.0F, 0.0F, -3.0F, 6, 20, 6, 0.0F);
        this.setRotateAngle(Top02, -2.007128639793479F, 0.0F, 0.0F);
        this.Base03 = new ModelRenderer(this, 0, 32);
        this.Base03.setRotationPoint(6.0F, 50.5F, 0.0F);
        this.Base03.addBox(-3.0F, 0.0F, -3.0F, 6, 20, 6, 0.0F);
        this.setRotateAngle(Base03, 3.141592653589793F, 0.0F, -0.5235987755982988F);
        this.Base01 = new ModelRenderer(this, 0, 32);
        this.Base01.setRotationPoint(-6.0F, 50.5F, 0.0F);
        this.Base01.addBox(-3.0F, 0.0F, -3.0F, 6, 20, 6, 0.0F);
        this.setRotateAngle(Base01, 3.141592653589793F, 0.0F, 0.5235987755982988F);
        this.Fruit = new ModelRenderer(this, 0, 0);
        this.Fruit.setRotationPoint(0.0F, 24.5F, 0.0F);
        this.Fruit.addBox(-8.0F, -8.0F, -8.0F, 16, 16, 16, 0.0F);
        this.setRotateAngle(Fruit, 0.7853981633974483F, 0.0F, 0.5585053606381855F);
        this.Base04 = new ModelRenderer(this, 0, 32);
        this.Base04.setRotationPoint(0.0F, 50.5F, 6.0F);
        this.Base04.addBox(-3.0F, 0.0F, -3.0F, 6, 20, 6, 0.0F);
        this.setRotateAngle(Base04, -2.6179938779914944F, 0.0F, 0.0F);
        this.Stem = new ModelRenderer(this, 24, 32);
        this.Stem.setRotationPoint(0.0F, 44.0F, 0.0F);
        this.Stem.addBox(-5.0F, 0.0F, -5.0F, 10, 20, 10, 0.0F);
        this.setRotateAngle(Stem, 3.141592653589793F, 0.0F, 0.0F);
        this.Top04 = new ModelRenderer(this, 0, 32);
        this.Top04.setRotationPoint(0.0F, 35.5F, 1.8F);
        this.Top04.addBox(-3.0F, 0.0F, -3.0F, 6, 20, 6, 0.0F);
        this.setRotateAngle(Top04, 2.007128639793479F, 0.0F, 0.0F);
        this.Base02 = new ModelRenderer(this, 0, 32);
        this.Base02.setRotationPoint(0.0F, 50.5F, -6.0F);
        this.Base02.addBox(-3.0F, 0.0F, -3.0F, 6, 20, 6, 0.0F);
        this.setRotateAngle(Base02, 2.6179938779914944F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GL11.glPushMatrix();
        GL11.glScaled(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Top03.offsetX, this.Top03.offsetY, this.Top03.offsetZ);
        GL11.glTranslatef(this.Top03.rotationPointX * f5, this.Top03.rotationPointY * f5, this.Top03.rotationPointZ * f5);
        GL11.glScaled(0.2D, 0.5D, 0.3D);
        GL11.glTranslatef(-this.Top03.offsetX, -this.Top03.offsetY, -this.Top03.offsetZ);
        GL11.glTranslatef(-this.Top03.rotationPointX * f5, -this.Top03.rotationPointY * f5, -this.Top03.rotationPointZ * f5);
        this.Top03.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Top01.offsetX, this.Top01.offsetY, this.Top01.offsetZ);
        GL11.glTranslatef(this.Top01.rotationPointX * f5, this.Top01.rotationPointY * f5, this.Top01.rotationPointZ * f5);
        GL11.glScaled(0.2D, 0.5D, 0.3D);
        GL11.glTranslatef(-this.Top01.offsetX, -this.Top01.offsetY, -this.Top01.offsetZ);
        GL11.glTranslatef(-this.Top01.rotationPointX * f5, -this.Top01.rotationPointY * f5, -this.Top01.rotationPointZ * f5);
        this.Top01.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Top02.offsetX, this.Top02.offsetY, this.Top02.offsetZ);
        GL11.glTranslatef(this.Top02.rotationPointX * f5, this.Top02.rotationPointY * f5, this.Top02.rotationPointZ * f5);
        GL11.glScaled(0.3D, 0.5D, 0.2D);
        GL11.glTranslatef(-this.Top02.offsetX, -this.Top02.offsetY, -this.Top02.offsetZ);
        GL11.glTranslatef(-this.Top02.rotationPointX * f5, -this.Top02.rotationPointY * f5, -this.Top02.rotationPointZ * f5);
        this.Top02.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Base03.offsetX, this.Base03.offsetY, this.Base03.offsetZ);
        GL11.glTranslatef(this.Base03.rotationPointX * f5, this.Base03.rotationPointY * f5, this.Base03.rotationPointZ * f5);
        GL11.glScaled(0.5D, 0.5D, 0.5D);
        GL11.glTranslatef(-this.Base03.offsetX, -this.Base03.offsetY, -this.Base03.offsetZ);
        GL11.glTranslatef(-this.Base03.rotationPointX * f5, -this.Base03.rotationPointY * f5, -this.Base03.rotationPointZ * f5);
        this.Base03.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Base01.offsetX, this.Base01.offsetY, this.Base01.offsetZ);
        GL11.glTranslatef(this.Base01.rotationPointX * f5, this.Base01.rotationPointY * f5, this.Base01.rotationPointZ * f5);
        GL11.glScaled(0.5D, 0.5D, 0.5D);
        GL11.glTranslatef(-this.Base01.offsetX, -this.Base01.offsetY, -this.Base01.offsetZ);
        GL11.glTranslatef(-this.Base01.rotationPointX * f5, -this.Base01.rotationPointY * f5, -this.Base01.rotationPointZ * f5);
        this.Base01.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Fruit.offsetX, this.Fruit.offsetY, this.Fruit.offsetZ);
        GL11.glTranslatef(this.Fruit.rotationPointX * f5, this.Fruit.rotationPointY * f5, this.Fruit.rotationPointZ * f5);
        GL11.glScaled(0.4D, 0.6D, 0.4D);
        GL11.glTranslatef(-this.Fruit.offsetX, -this.Fruit.offsetY, -this.Fruit.offsetZ);
        GL11.glTranslatef(-this.Fruit.rotationPointX * f5, -this.Fruit.rotationPointY * f5, -this.Fruit.rotationPointZ * f5);
        this.Fruit.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Base04.offsetX, this.Base04.offsetY, this.Base04.offsetZ);
        GL11.glTranslatef(this.Base04.rotationPointX * f5, this.Base04.rotationPointY * f5, this.Base04.rotationPointZ * f5);
        GL11.glScaled(0.5D, 0.5D, 0.5D);
        GL11.glTranslatef(-this.Base04.offsetX, -this.Base04.offsetY, -this.Base04.offsetZ);
        GL11.glTranslatef(-this.Base04.rotationPointX * f5, -this.Base04.rotationPointY * f5, -this.Base04.rotationPointZ * f5);
        this.Base04.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Stem.offsetX, this.Stem.offsetY, this.Stem.offsetZ);
        GL11.glTranslatef(this.Stem.rotationPointX * f5, this.Stem.rotationPointY * f5, this.Stem.rotationPointZ * f5);
        GL11.glScaled(0.5D, 0.5D, 0.5D);
        GL11.glTranslatef(-this.Stem.offsetX, -this.Stem.offsetY, -this.Stem.offsetZ);
        GL11.glTranslatef(-this.Stem.rotationPointX * f5, -this.Stem.rotationPointY * f5, -this.Stem.rotationPointZ * f5);
        this.Stem.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Top04.offsetX, this.Top04.offsetY, this.Top04.offsetZ);
        GL11.glTranslatef(this.Top04.rotationPointX * f5, this.Top04.rotationPointY * f5, this.Top04.rotationPointZ * f5);
        GL11.glScaled(0.3D, 0.5D, 0.2D);
        GL11.glTranslatef(-this.Top04.offsetX, -this.Top04.offsetY, -this.Top04.offsetZ);
        GL11.glTranslatef(-this.Top04.rotationPointX * f5, -this.Top04.rotationPointY * f5, -this.Top04.rotationPointZ * f5);
        this.Top04.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Base02.offsetX, this.Base02.offsetY, this.Base02.offsetZ);
        GL11.glTranslatef(this.Base02.rotationPointX * f5, this.Base02.rotationPointY * f5, this.Base02.rotationPointZ * f5);
        GL11.glScaled(0.5D, 0.5D, 0.5D);
        GL11.glTranslatef(-this.Base02.offsetX, -this.Base02.offsetY, -this.Base02.offsetZ);
        GL11.glTranslatef(-this.Base02.rotationPointX * f5, -this.Base02.rotationPointY * f5, -this.Base02.rotationPointZ * f5);
        this.Base02.render(f5);
        GL11.glPopMatrix();
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
