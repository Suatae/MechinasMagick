package com.suatae.mechinasmagick.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

/**
 * Cache - Suatae
 * Created using Tabula 4.1.1
 */
public class Cache extends ModelBase {
    public ModelRenderer Top_T;
    public ModelRenderer Top_M;
    public ModelRenderer Top_B;
    public ModelRenderer Base;
    public ModelRenderer Back;
    public ModelRenderer Right;
    public ModelRenderer Front;
    public ModelRenderer Left;
    public ModelRenderer Front_R;
    public ModelRenderer Front_L;
    public ModelRenderer Back_L;
    public ModelRenderer Back_R;

    public Cache() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.Top_B = new ModelRenderer(this, 0, 0);
        this.Top_B.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.Top_B.addBox(-32.0F, -4.0F, -32.0F, 64, 4, 64, 0.0F);
        this.Left = new ModelRenderer(this, 0, 135);
        this.Left.setRotationPoint(6.3F, 16.8F, 0.0F);
        this.Left.addBox(-24.0F, -25.0F, -1.0F, 48, 50, 2, 0.0F);
        this.setRotateAngle(Left, -0.06981317007977318F, 1.5707963267948966F, 0.0F);
        this.Front_R = new ModelRenderer(this, 0, 0);
        this.Front_R.setRotationPoint(-6.2F, 17.0F, -6.2F);
        this.Front_R.addBox(-3.0F, -25.0F, -3.0F, 6, 50, 6, 0.0F);
        this.setRotateAngle(Front_R, 0.06981317007977318F, 0.0F, -0.06981317007977318F);
        this.Back = new ModelRenderer(this, 0, 135);
        this.Back.setRotationPoint(0.0F, 16.8F, 6.3F);
        this.Back.addBox(-24.0F, -25.0F, -1.0F, 48, 50, 2, 0.0F);
        this.setRotateAngle(Back, -0.06981317007977318F, 0.0F, 0.0F);
        this.Front_L = new ModelRenderer(this, 0, 0);
        this.Front_L.setRotationPoint(6.2F, 17.0F, -6.2F);
        this.Front_L.addBox(-3.0F, -25.0F, -3.0F, 6, 50, 6, 0.0F);
        this.setRotateAngle(Front_L, 0.06981317007977318F, 0.0F, 0.06981317007977318F);
        this.Top_M = new ModelRenderer(this, 0, 195);
        this.Top_M.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.Top_M.addBox(-28.0F, -4.0F, -28.0F, 56, 4, 56, 0.0F);
        this.Front = new ModelRenderer(this, 0, 135);
        this.Front.setRotationPoint(0.0F, 16.8F, -6.3F);
        this.Front.addBox(-24.0F, -25.0F, -1.0F, 48, 50, 2, 0.0F);
        this.setRotateAngle(Front, -0.06981317007977318F, -3.141592653589793F, 0.0F);
        this.Back_L = new ModelRenderer(this, 0, 0);
        this.Back_L.setRotationPoint(6.2F, 17.0F, 6.2F);
        this.Back_L.addBox(-3.0F, -25.0F, -3.0F, 6, 50, 6, 0.0F);
        this.setRotateAngle(Back_L, -0.06981317007977318F, 0.0F, 0.06981317007977318F);
        this.Top_T = new ModelRenderer(this, 0, 0);
        this.Top_T.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.Top_T.addBox(-32.0F, -4.0F, -32.0F, 64, 4, 64, 0.0F);
        this.Base = new ModelRenderer(this, 0, 70);
        this.Base.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Base.addBox(-27.0F, -4.0F, -27.0F, 54, 4, 54, 0.0F);
        this.Right = new ModelRenderer(this, 0, 135);
        this.Right.setRotationPoint(-6.3F, 16.8F, 0.0F);
        this.Right.addBox(-24.0F, -25.0F, -1.0F, 48, 50, 2, 0.0F);
        this.setRotateAngle(Right, -0.06981317007977318F, -1.5707963267948966F, 0.0F);
        this.Back_R = new ModelRenderer(this, 0, 0);
        this.Back_R.setRotationPoint(-6.2F, 17.0F, 6.2F);
        this.Back_R.addBox(-3.0F, -25.0F, -3.0F, 6, 50, 6, 0.0F);
        this.setRotateAngle(Back_R, -0.06981317007977318F, 0.0F, -0.06981317007977318F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Top_B.offsetX, this.Top_B.offsetY, this.Top_B.offsetZ);
        GL11.glTranslatef(this.Top_B.rotationPointX * f5, this.Top_B.rotationPointY * f5, this.Top_B.rotationPointZ * f5);
        GL11.glScaled(0.25D, 0.25D, 0.25D);
        GL11.glTranslatef(-this.Top_B.offsetX, -this.Top_B.offsetY, -this.Top_B.offsetZ);
        GL11.glTranslatef(-this.Top_B.rotationPointX * f5, -this.Top_B.rotationPointY * f5, -this.Top_B.rotationPointZ * f5);
        this.Top_B.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Left.offsetX, this.Left.offsetY, this.Left.offsetZ);
        GL11.glTranslatef(this.Left.rotationPointX * f5, this.Left.rotationPointY * f5, this.Left.rotationPointZ * f5);
        GL11.glScaled(0.25D, 0.25D, 0.25D);
        GL11.glTranslatef(-this.Left.offsetX, -this.Left.offsetY, -this.Left.offsetZ);
        GL11.glTranslatef(-this.Left.rotationPointX * f5, -this.Left.rotationPointY * f5, -this.Left.rotationPointZ * f5);
        this.Left.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Front_R.offsetX, this.Front_R.offsetY, this.Front_R.offsetZ);
        GL11.glTranslatef(this.Front_R.rotationPointX * f5, this.Front_R.rotationPointY * f5, this.Front_R.rotationPointZ * f5);
        GL11.glScaled(0.25D, 0.25D, 0.25D);
        GL11.glTranslatef(-this.Front_R.offsetX, -this.Front_R.offsetY, -this.Front_R.offsetZ);
        GL11.glTranslatef(-this.Front_R.rotationPointX * f5, -this.Front_R.rotationPointY * f5, -this.Front_R.rotationPointZ * f5);
        this.Front_R.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Back.offsetX, this.Back.offsetY, this.Back.offsetZ);
        GL11.glTranslatef(this.Back.rotationPointX * f5, this.Back.rotationPointY * f5, this.Back.rotationPointZ * f5);
        GL11.glScaled(0.25D, 0.25D, 0.25D);
        GL11.glTranslatef(-this.Back.offsetX, -this.Back.offsetY, -this.Back.offsetZ);
        GL11.glTranslatef(-this.Back.rotationPointX * f5, -this.Back.rotationPointY * f5, -this.Back.rotationPointZ * f5);
        this.Back.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Front_L.offsetX, this.Front_L.offsetY, this.Front_L.offsetZ);
        GL11.glTranslatef(this.Front_L.rotationPointX * f5, this.Front_L.rotationPointY * f5, this.Front_L.rotationPointZ * f5);
        GL11.glScaled(0.25D, 0.25D, 0.25D);
        GL11.glTranslatef(-this.Front_L.offsetX, -this.Front_L.offsetY, -this.Front_L.offsetZ);
        GL11.glTranslatef(-this.Front_L.rotationPointX * f5, -this.Front_L.rotationPointY * f5, -this.Front_L.rotationPointZ * f5);
        this.Front_L.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Top_M.offsetX, this.Top_M.offsetY, this.Top_M.offsetZ);
        GL11.glTranslatef(this.Top_M.rotationPointX * f5, this.Top_M.rotationPointY * f5, this.Top_M.rotationPointZ * f5);
        GL11.glScaled(0.25D, 0.25D, 0.25D);
        GL11.glTranslatef(-this.Top_M.offsetX, -this.Top_M.offsetY, -this.Top_M.offsetZ);
        GL11.glTranslatef(-this.Top_M.rotationPointX * f5, -this.Top_M.rotationPointY * f5, -this.Top_M.rotationPointZ * f5);
        this.Top_M.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Front.offsetX, this.Front.offsetY, this.Front.offsetZ);
        GL11.glTranslatef(this.Front.rotationPointX * f5, this.Front.rotationPointY * f5, this.Front.rotationPointZ * f5);
        GL11.glScaled(0.25D, 0.25D, 0.25D);
        GL11.glTranslatef(-this.Front.offsetX, -this.Front.offsetY, -this.Front.offsetZ);
        GL11.glTranslatef(-this.Front.rotationPointX * f5, -this.Front.rotationPointY * f5, -this.Front.rotationPointZ * f5);
        this.Front.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Back_L.offsetX, this.Back_L.offsetY, this.Back_L.offsetZ);
        GL11.glTranslatef(this.Back_L.rotationPointX * f5, this.Back_L.rotationPointY * f5, this.Back_L.rotationPointZ * f5);
        GL11.glScaled(0.25D, 0.25D, 0.25D);
        GL11.glTranslatef(-this.Back_L.offsetX, -this.Back_L.offsetY, -this.Back_L.offsetZ);
        GL11.glTranslatef(-this.Back_L.rotationPointX * f5, -this.Back_L.rotationPointY * f5, -this.Back_L.rotationPointZ * f5);
        this.Back_L.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Top_T.offsetX, this.Top_T.offsetY, this.Top_T.offsetZ);
        GL11.glTranslatef(this.Top_T.rotationPointX * f5, this.Top_T.rotationPointY * f5, this.Top_T.rotationPointZ * f5);
        GL11.glScaled(0.25D, 0.25D, 0.25D);
        GL11.glTranslatef(-this.Top_T.offsetX, -this.Top_T.offsetY, -this.Top_T.offsetZ);
        GL11.glTranslatef(-this.Top_T.rotationPointX * f5, -this.Top_T.rotationPointY * f5, -this.Top_T.rotationPointZ * f5);
        this.Top_T.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Base.offsetX, this.Base.offsetY, this.Base.offsetZ);
        GL11.glTranslatef(this.Base.rotationPointX * f5, this.Base.rotationPointY * f5, this.Base.rotationPointZ * f5);
        GL11.glScaled(0.25D, 0.25D, 0.25D);
        GL11.glTranslatef(-this.Base.offsetX, -this.Base.offsetY, -this.Base.offsetZ);
        GL11.glTranslatef(-this.Base.rotationPointX * f5, -this.Base.rotationPointY * f5, -this.Base.rotationPointZ * f5);
        this.Base.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Right.offsetX, this.Right.offsetY, this.Right.offsetZ);
        GL11.glTranslatef(this.Right.rotationPointX * f5, this.Right.rotationPointY * f5, this.Right.rotationPointZ * f5);
        GL11.glScaled(0.25D, 0.25D, 0.25D);
        GL11.glTranslatef(-this.Right.offsetX, -this.Right.offsetY, -this.Right.offsetZ);
        GL11.glTranslatef(-this.Right.rotationPointX * f5, -this.Right.rotationPointY * f5, -this.Right.rotationPointZ * f5);
        this.Right.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Back_R.offsetX, this.Back_R.offsetY, this.Back_R.offsetZ);
        GL11.glTranslatef(this.Back_R.rotationPointX * f5, this.Back_R.rotationPointY * f5, this.Back_R.rotationPointZ * f5);
        GL11.glScaled(0.25D, 0.25D, 0.25D);
        GL11.glTranslatef(-this.Back_R.offsetX, -this.Back_R.offsetY, -this.Back_R.offsetZ);
        GL11.glTranslatef(-this.Back_R.rotationPointX * f5, -this.Back_R.rotationPointY * f5, -this.Back_R.rotationPointZ * f5);
        this.Back_R.render(f5);
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
