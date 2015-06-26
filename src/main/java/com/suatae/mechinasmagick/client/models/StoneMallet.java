package com.suatae.mechinasmagick.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

/**
 * Stone Mallet - Suatae
 * Created using Tabula 4.1.1
 */
public class StoneMallet extends ModelBase {
    public ModelRenderer HandleHolder;
    public ModelRenderer HeadBase;
    public ModelRenderer Handle;
    public ModelRenderer strap_t_f;
    public ModelRenderer strap_b_f;
    public ModelRenderer strap_s1_b;
    public ModelRenderer strap_b_b;
    public ModelRenderer strap_t_b;
    public ModelRenderer strap_s1_f;
    public ModelRenderer strap_s2_f;
    public ModelRenderer strap_s2_b;
    public ModelRenderer Handle_1;
    public ModelRenderer Handle_2;

    public StoneMallet() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.strap_s2_f = new ModelRenderer(this, 2, 0);
        this.strap_s2_f.setRotationPoint(2.6F, 3.2F, 2.5F);
        this.strap_s2_f.addBox(-13.5F, -0.5F, -2.0F, 27, 1, 4, 0.0F);
        this.setRotateAngle(strap_s2_f, 3.141592653589793F, 0.0F, -1.5707963267948966F);
        this.HandleHolder = new ModelRenderer(this, 0, 6);
        this.HandleHolder.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.HandleHolder.addBox(-0.5F, 0.0F, -0.5F, 1, 18, 1, 0.0F);
        this.strap_b_b = new ModelRenderer(this, 6, 5);
        this.strap_b_b.setRotationPoint(0.0F, 5.8F, -2.5F);
        this.strap_b_b.addBox(-12.5F, -0.5F, -2.0F, 25, 1, 4, 0.0F);
        this.strap_s1_f = new ModelRenderer(this, 2, 0);
        this.strap_s1_f.setRotationPoint(-2.6F, 3.2F, 2.5F);
        this.strap_s1_f.addBox(-13.5F, -0.5F, -2.0F, 27, 1, 4, 0.0F);
        this.setRotateAngle(strap_s1_f, 0.0F, 0.0F, -1.5707963267948966F);
        this.Handle = new ModelRenderer(this, 34, 22);
        this.Handle.setRotationPoint(0.0F, 19.8F, 0.0F);
        this.Handle.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.strap_s1_b = new ModelRenderer(this, 2, 0);
        this.strap_s1_b.setRotationPoint(-2.6F, 3.2F, -2.5F);
        this.strap_s1_b.addBox(-13.5F, -0.5F, -2.0F, 27, 1, 4, 0.0F);
        this.setRotateAngle(strap_s1_b, 0.0F, 0.0F, -1.5707963267948966F);
        this.strap_b_f = new ModelRenderer(this, 6, 5);
        this.strap_b_f.setRotationPoint(0.0F, 5.8F, 2.5F);
        this.strap_b_f.addBox(-12.5F, -0.5F, -2.0F, 25, 1, 4, 0.0F);
        this.strap_t_b = new ModelRenderer(this, 6, 5);
        this.strap_t_b.setRotationPoint(0.0F, 0.6F, -2.5F);
        this.strap_t_b.addBox(-12.5F, -0.5F, -2.0F, 25, 1, 4, 0.0F);
        this.Handle_2 = new ModelRenderer(this, 20, 10);
        this.Handle_2.setRotationPoint(0.0F, 13.3F, 0.0F);
        this.Handle_2.addBox(-1.0F, -7.0F, -1.0F, 2, 14, 2, 0.0F);
        this.HeadBase = new ModelRenderer(this, 0, 16);
        this.HeadBase.setRotationPoint(0.0F, 3.7F, 0.0F);
        this.HeadBase.addBox(-2.5F, -3.0F, -5.0F, 5, 5, 10, 0.0F);
        this.Handle_1 = new ModelRenderer(this, 30, 26);
        this.Handle_1.setRotationPoint(0.0F, 5.8F, 0.0F);
        this.Handle_1.addBox(-2.0F, -0.5F, -2.0F, 4, 1, 4, 0.0F);
        this.strap_t_f = new ModelRenderer(this, 6, 5);
        this.strap_t_f.setRotationPoint(0.0F, 0.6F, 2.5F);
        this.strap_t_f.addBox(-12.5F, -0.5F, -2.0F, 25, 1, 4, 0.0F);
        this.strap_s2_b = new ModelRenderer(this, 2, 0);
        this.strap_s2_b.setRotationPoint(2.6F, 3.2F, -2.5F);
        this.strap_s2_b.addBox(-13.5F, -0.5F, -2.0F, 27, 1, 4, 0.0F);
        this.setRotateAngle(strap_s2_b, 3.141592653589793F, 0.0F, -1.5707963267948966F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GL11.glPushMatrix();
        GL11.glTranslatef(this.strap_s2_f.offsetX, this.strap_s2_f.offsetY, this.strap_s2_f.offsetZ);
        GL11.glTranslatef(this.strap_s2_f.rotationPointX * f5, this.strap_s2_f.rotationPointY * f5, this.strap_s2_f.rotationPointZ * f5);
        GL11.glScaled(0.2D, 0.2D, 0.2D);
        GL11.glTranslatef(-this.strap_s2_f.offsetX, -this.strap_s2_f.offsetY, -this.strap_s2_f.offsetZ);
        GL11.glTranslatef(-this.strap_s2_f.rotationPointX * f5, -this.strap_s2_f.rotationPointY * f5, -this.strap_s2_f.rotationPointZ * f5);
        this.strap_s2_f.render(f5);
        GL11.glPopMatrix();
        this.HandleHolder.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.strap_b_b.offsetX, this.strap_b_b.offsetY, this.strap_b_b.offsetZ);
        GL11.glTranslatef(this.strap_b_b.rotationPointX * f5, this.strap_b_b.rotationPointY * f5, this.strap_b_b.rotationPointZ * f5);
        GL11.glScaled(0.2D, 0.2D, 0.2D);
        GL11.glTranslatef(-this.strap_b_b.offsetX, -this.strap_b_b.offsetY, -this.strap_b_b.offsetZ);
        GL11.glTranslatef(-this.strap_b_b.rotationPointX * f5, -this.strap_b_b.rotationPointY * f5, -this.strap_b_b.rotationPointZ * f5);
        this.strap_b_b.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.strap_s1_f.offsetX, this.strap_s1_f.offsetY, this.strap_s1_f.offsetZ);
        GL11.glTranslatef(this.strap_s1_f.rotationPointX * f5, this.strap_s1_f.rotationPointY * f5, this.strap_s1_f.rotationPointZ * f5);
        GL11.glScaled(0.2D, 0.2D, 0.2D);
        GL11.glTranslatef(-this.strap_s1_f.offsetX, -this.strap_s1_f.offsetY, -this.strap_s1_f.offsetZ);
        GL11.glTranslatef(-this.strap_s1_f.rotationPointX * f5, -this.strap_s1_f.rotationPointY * f5, -this.strap_s1_f.rotationPointZ * f5);
        this.strap_s1_f.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Handle.offsetX, this.Handle.offsetY, this.Handle.offsetZ);
        GL11.glTranslatef(this.Handle.rotationPointX * f5, this.Handle.rotationPointY * f5, this.Handle.rotationPointZ * f5);
        GL11.glScaled(0.9D, 0.9D, 0.9D);
        GL11.glTranslatef(-this.Handle.offsetX, -this.Handle.offsetY, -this.Handle.offsetZ);
        GL11.glTranslatef(-this.Handle.rotationPointX * f5, -this.Handle.rotationPointY * f5, -this.Handle.rotationPointZ * f5);
        this.Handle.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.strap_s1_b.offsetX, this.strap_s1_b.offsetY, this.strap_s1_b.offsetZ);
        GL11.glTranslatef(this.strap_s1_b.rotationPointX * f5, this.strap_s1_b.rotationPointY * f5, this.strap_s1_b.rotationPointZ * f5);
        GL11.glScaled(0.2D, 0.2D, 0.2D);
        GL11.glTranslatef(-this.strap_s1_b.offsetX, -this.strap_s1_b.offsetY, -this.strap_s1_b.offsetZ);
        GL11.glTranslatef(-this.strap_s1_b.rotationPointX * f5, -this.strap_s1_b.rotationPointY * f5, -this.strap_s1_b.rotationPointZ * f5);
        this.strap_s1_b.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.strap_b_f.offsetX, this.strap_b_f.offsetY, this.strap_b_f.offsetZ);
        GL11.glTranslatef(this.strap_b_f.rotationPointX * f5, this.strap_b_f.rotationPointY * f5, this.strap_b_f.rotationPointZ * f5);
        GL11.glScaled(0.2D, 0.2D, 0.2D);
        GL11.glTranslatef(-this.strap_b_f.offsetX, -this.strap_b_f.offsetY, -this.strap_b_f.offsetZ);
        GL11.glTranslatef(-this.strap_b_f.rotationPointX * f5, -this.strap_b_f.rotationPointY * f5, -this.strap_b_f.rotationPointZ * f5);
        this.strap_b_f.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.strap_t_b.offsetX, this.strap_t_b.offsetY, this.strap_t_b.offsetZ);
        GL11.glTranslatef(this.strap_t_b.rotationPointX * f5, this.strap_t_b.rotationPointY * f5, this.strap_t_b.rotationPointZ * f5);
        GL11.glScaled(0.2D, 0.2D, 0.2D);
        GL11.glTranslatef(-this.strap_t_b.offsetX, -this.strap_t_b.offsetY, -this.strap_t_b.offsetZ);
        GL11.glTranslatef(-this.strap_t_b.rotationPointX * f5, -this.strap_t_b.rotationPointY * f5, -this.strap_t_b.rotationPointZ * f5);
        this.strap_t_b.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Handle_2.offsetX, this.Handle_2.offsetY, this.Handle_2.offsetZ);
        GL11.glTranslatef(this.Handle_2.rotationPointX * f5, this.Handle_2.rotationPointY * f5, this.Handle_2.rotationPointZ * f5);
        GL11.glScaled(0.7D, 0.7D, 0.7D);
        GL11.glTranslatef(-this.Handle_2.offsetX, -this.Handle_2.offsetY, -this.Handle_2.offsetZ);
        GL11.glTranslatef(-this.Handle_2.rotationPointX * f5, -this.Handle_2.rotationPointY * f5, -this.Handle_2.rotationPointZ * f5);
        this.Handle_2.render(f5);
        GL11.glPopMatrix();
        this.HeadBase.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Handle_1.offsetX, this.Handle_1.offsetY, this.Handle_1.offsetZ);
        GL11.glTranslatef(this.Handle_1.rotationPointX * f5, this.Handle_1.rotationPointY * f5, this.Handle_1.rotationPointZ * f5);
        GL11.glScaled(0.5D, 0.5D, 0.5D);
        GL11.glTranslatef(-this.Handle_1.offsetX, -this.Handle_1.offsetY, -this.Handle_1.offsetZ);
        GL11.glTranslatef(-this.Handle_1.rotationPointX * f5, -this.Handle_1.rotationPointY * f5, -this.Handle_1.rotationPointZ * f5);
        this.Handle_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.strap_t_f.offsetX, this.strap_t_f.offsetY, this.strap_t_f.offsetZ);
        GL11.glTranslatef(this.strap_t_f.rotationPointX * f5, this.strap_t_f.rotationPointY * f5, this.strap_t_f.rotationPointZ * f5);
        GL11.glScaled(0.2D, 0.2D, 0.2D);
        GL11.glTranslatef(-this.strap_t_f.offsetX, -this.strap_t_f.offsetY, -this.strap_t_f.offsetZ);
        GL11.glTranslatef(-this.strap_t_f.rotationPointX * f5, -this.strap_t_f.rotationPointY * f5, -this.strap_t_f.rotationPointZ * f5);
        this.strap_t_f.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.strap_s2_b.offsetX, this.strap_s2_b.offsetY, this.strap_s2_b.offsetZ);
        GL11.glTranslatef(this.strap_s2_b.rotationPointX * f5, this.strap_s2_b.rotationPointY * f5, this.strap_s2_b.rotationPointZ * f5);
        GL11.glScaled(0.2D, 0.2D, 0.2D);
        GL11.glTranslatef(-this.strap_s2_b.offsetX, -this.strap_s2_b.offsetY, -this.strap_s2_b.offsetZ);
        GL11.glTranslatef(-this.strap_s2_b.rotationPointX * f5, -this.strap_s2_b.rotationPointY * f5, -this.strap_s2_b.rotationPointZ * f5);
        this.strap_s2_b.render(f5);
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
