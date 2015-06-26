package com.suatae.mechinasmagick.client.models.crop;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

/**
 * CropNew - Suatae
 * Created using Tabula 4.1.1
 */
public class Crop06 extends ModelBase {
    public double[] modelScale = new double[] { 2.0D, 2.0D, 2.0D };
    public ModelRenderer Stem;
    public ModelRenderer Base01;
    public ModelRenderer Base02;
    public ModelRenderer Base03;
    public ModelRenderer Base04;

    public Crop06() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Base01 = new ModelRenderer(this, 0, 32);
        this.Base01.setRotationPoint(-6.0F, 50.5F, 0.0F);
        this.Base01.addBox(-3.0F, 0.0F, -3.0F, 6, 20, 6, 0.0F);
        this.setRotateAngle(Base01, 3.141592653589793F, 0.0F, 0.5235987755982988F);
        this.Base04 = new ModelRenderer(this, 0, 32);
        this.Base04.setRotationPoint(0.0F, 50.5F, 6.0F);
        this.Base04.addBox(-3.0F, 0.0F, -3.0F, 6, 20, 6, 0.0F);
        this.setRotateAngle(Base04, -2.6179938779914944F, 0.0F, 0.0F);
        this.Base03 = new ModelRenderer(this, 0, 32);
        this.Base03.setRotationPoint(6.0F, 50.5F, 0.0F);
        this.Base03.addBox(-3.0F, 0.0F, -3.0F, 6, 20, 6, 0.0F);
        this.setRotateAngle(Base03, 3.141592653589793F, 0.0F, -0.5235987755982988F);
        this.Stem = new ModelRenderer(this, 24, 32);
        this.Stem.setRotationPoint(0.0F, 44.0F, 0.0F);
        this.Stem.addBox(-5.0F, 0.0F, -5.0F, 10, 20, 10, 0.0F);
        this.setRotateAngle(Stem, 3.141592653589793F, 0.0F, 0.0F);
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
        GL11.glTranslatef(this.Base01.offsetX, this.Base01.offsetY, this.Base01.offsetZ);
        GL11.glTranslatef(this.Base01.rotationPointX * f5, this.Base01.rotationPointY * f5, this.Base01.rotationPointZ * f5);
        GL11.glScaled(0.5D, 0.5D, 0.5D);
        GL11.glTranslatef(-this.Base01.offsetX, -this.Base01.offsetY, -this.Base01.offsetZ);
        GL11.glTranslatef(-this.Base01.rotationPointX * f5, -this.Base01.rotationPointY * f5, -this.Base01.rotationPointZ * f5);
        this.Base01.render(f5);
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
        GL11.glTranslatef(this.Base03.offsetX, this.Base03.offsetY, this.Base03.offsetZ);
        GL11.glTranslatef(this.Base03.rotationPointX * f5, this.Base03.rotationPointY * f5, this.Base03.rotationPointZ * f5);
        GL11.glScaled(0.5D, 0.5D, 0.5D);
        GL11.glTranslatef(-this.Base03.offsetX, -this.Base03.offsetY, -this.Base03.offsetZ);
        GL11.glTranslatef(-this.Base03.rotationPointX * f5, -this.Base03.rotationPointY * f5, -this.Base03.rotationPointZ * f5);
        this.Base03.render(f5);
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
