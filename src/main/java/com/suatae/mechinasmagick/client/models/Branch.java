package com.suatae.mechinasmagick.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

/**
 * Branch - Suatae
 * Created using Tabula 4.1.1
 */
public class Branch extends ModelBase {
    public ModelRenderer Main1;
    public ModelRenderer Main2;
    public ModelRenderer Main3;
    public ModelRenderer Side1;
    public ModelRenderer Side2;
    public ModelRenderer Side3;
    public ModelRenderer Side4;
    public ModelRenderer Leaf1;
    public ModelRenderer Leaf2;
    public ModelRenderer Leaf3;
    public ModelRenderer Leaf4;

    public Branch() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Leaf4 = new ModelRenderer(this, -20, 30);
        this.Leaf4.setRotationPoint(0.1F, 23.1F, -4.7F);
        this.Leaf4.addBox(-10.0F, 0.0F, -10.0F, 20, 0, 20, 0.0F);
        this.setRotateAngle(Leaf4, 0.36425021489121656F, 2.8228955321756284F, 0.18203784098300857F);
        this.Leaf3 = new ModelRenderer(this, -20, 30);
        this.Leaf3.setRotationPoint(-5.5F, 23.7F, 2.9F);
        this.Leaf3.addBox(-10.0F, 0.0F, -10.0F, 20, 0, 20, 0.0F);
        this.setRotateAngle(Leaf3, 0.0F, -2.1399481958702475F, 0.0F);
        this.Side4 = new ModelRenderer(this, 12, 0);
        this.Side4.setRotationPoint(0.9F, 23.1F, 3.5F);
        this.Side4.addBox(-1.0F, 0.0F, -1.0F, 2, 15, 2, 0.0F);
        this.setRotateAngle(Side4, -1.4114477660878142F, -2.9595548126067843F, -0.136659280431156F);
        this.Main1 = new ModelRenderer(this, 0, 0);
        this.Main1.setRotationPoint(6.5F, 23.6F, -8.5F);
        this.Main1.addBox(-1.5F, 0.0F, -1.5F, 3, 22, 3, 0.0F);
        this.setRotateAngle(Main1, -1.5707963267948966F, 2.5497515042385164F, 0.0F);
        this.Side2 = new ModelRenderer(this, 12, 0);
        this.Side2.setRotationPoint(-2.8F, 22.9F, -4.3F);
        this.Side2.addBox(-1.0F, 0.0F, -1.0F, 2, 27, 2, 0.0F);
        this.setRotateAngle(Side2, -2.0488420089161434F, 1.0016444577195458F, -0.136659280431156F);
        this.Main3 = new ModelRenderer(this, 12, 0);
        this.Main3.setRotationPoint(-2.9F, 23.7F, 1.2F);
        this.Main3.addBox(-1.0F, 0.0F, -1.0F, 2, 19, 2, 0.0F);
        this.setRotateAngle(Main3, -1.5707963267948966F, 2.5497515042385164F, 0.0F);
        this.Side3 = new ModelRenderer(this, 12, 0);
        this.Side3.setRotationPoint(-1.1F, 23.7F, -0.1F);
        this.Side3.addBox(-1.0F, 0.0F, -1.0F, 2, 15, 2, 0.0F);
        this.setRotateAngle(Side3, -1.6390387005478748F, -2.6406831582674206F, -0.136659280431156F);
        this.Leaf2 = new ModelRenderer(this, -20, 30);
        this.Leaf2.setRotationPoint(-5.9F, 21.0F, -5.0F);
        this.Leaf2.addBox(-10.0F, 0.0F, -10.0F, 20, 0, 20, 0.0F);
        this.setRotateAngle(Leaf2, 0.40980330836826856F, -0.5009094953223726F, 0.40980330836826856F);
        this.Leaf1 = new ModelRenderer(this, -20, 30);
        this.Leaf1.setRotationPoint(1.2F, 22.9F, 1.6F);
        this.Leaf1.addBox(-10.0F, 0.0F, -10.0F, 20, 0, 20, 0.0F);
        this.setRotateAngle(Leaf1, 0.27314402793711257F, 2.0488420089161434F, -0.27314402793711257F);
        this.Main2 = new ModelRenderer(this, 12, 0);
        this.Main2.setRotationPoint(2.9F, 23.7F, -3.2F);
        this.Main2.addBox(-1.0F, 0.0F, -1.0F, 2, 19, 2, 0.0F);
        this.setRotateAngle(Main2, -1.5707963267948966F, 2.231054382824351F, 0.0F);
        this.Side1 = new ModelRenderer(this, 12, 0);
        this.Side1.setRotationPoint(2.1F, 23.7F, -2.7F);
        this.Side1.addBox(-1.0F, 0.0F, -1.0F, 2, 19, 2, 0.0F);
        this.setRotateAngle(Side1, -1.8668041679331349F, 1.2292353921796064F, -0.136659280431156F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Leaf4.offsetX, this.Leaf4.offsetY, this.Leaf4.offsetZ);
        GL11.glTranslatef(this.Leaf4.rotationPointX * f5, this.Leaf4.rotationPointY * f5, this.Leaf4.rotationPointZ * f5);
        GL11.glScaled(0.1D, 0.1D, 0.1D);
        GL11.glTranslatef(-this.Leaf4.offsetX, -this.Leaf4.offsetY, -this.Leaf4.offsetZ);
        GL11.glTranslatef(-this.Leaf4.rotationPointX * f5, -this.Leaf4.rotationPointY * f5, -this.Leaf4.rotationPointZ * f5);
        this.Leaf4.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Leaf3.offsetX, this.Leaf3.offsetY, this.Leaf3.offsetZ);
        GL11.glTranslatef(this.Leaf3.rotationPointX * f5, this.Leaf3.rotationPointY * f5, this.Leaf3.rotationPointZ * f5);
        GL11.glScaled(0.1D, 0.1D, 0.1D);
        GL11.glTranslatef(-this.Leaf3.offsetX, -this.Leaf3.offsetY, -this.Leaf3.offsetZ);
        GL11.glTranslatef(-this.Leaf3.rotationPointX * f5, -this.Leaf3.rotationPointY * f5, -this.Leaf3.rotationPointZ * f5);
        this.Leaf3.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Side4.offsetX, this.Side4.offsetY, this.Side4.offsetZ);
        GL11.glTranslatef(this.Side4.rotationPointX * f5, this.Side4.rotationPointY * f5, this.Side4.rotationPointZ * f5);
        GL11.glScaled(0.2D, 0.2D, 0.2D);
        GL11.glTranslatef(-this.Side4.offsetX, -this.Side4.offsetY, -this.Side4.offsetZ);
        GL11.glTranslatef(-this.Side4.rotationPointX * f5, -this.Side4.rotationPointY * f5, -this.Side4.rotationPointZ * f5);
        this.Side4.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Main1.offsetX, this.Main1.offsetY, this.Main1.offsetZ);
        GL11.glTranslatef(this.Main1.rotationPointX * f5, this.Main1.rotationPointY * f5, this.Main1.rotationPointZ * f5);
        GL11.glScaled(0.3D, 0.3D, 0.3D);
        GL11.glTranslatef(-this.Main1.offsetX, -this.Main1.offsetY, -this.Main1.offsetZ);
        GL11.glTranslatef(-this.Main1.rotationPointX * f5, -this.Main1.rotationPointY * f5, -this.Main1.rotationPointZ * f5);
        this.Main1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Side2.offsetX, this.Side2.offsetY, this.Side2.offsetZ);
        GL11.glTranslatef(this.Side2.rotationPointX * f5, this.Side2.rotationPointY * f5, this.Side2.rotationPointZ * f5);
        GL11.glScaled(0.2D, 0.2D, 0.2D);
        GL11.glTranslatef(-this.Side2.offsetX, -this.Side2.offsetY, -this.Side2.offsetZ);
        GL11.glTranslatef(-this.Side2.rotationPointX * f5, -this.Side2.rotationPointY * f5, -this.Side2.rotationPointZ * f5);
        this.Side2.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Main3.offsetX, this.Main3.offsetY, this.Main3.offsetZ);
        GL11.glTranslatef(this.Main3.rotationPointX * f5, this.Main3.rotationPointY * f5, this.Main3.rotationPointZ * f5);
        GL11.glScaled(0.3D, 0.3D, 0.3D);
        GL11.glTranslatef(-this.Main3.offsetX, -this.Main3.offsetY, -this.Main3.offsetZ);
        GL11.glTranslatef(-this.Main3.rotationPointX * f5, -this.Main3.rotationPointY * f5, -this.Main3.rotationPointZ * f5);
        this.Main3.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Side3.offsetX, this.Side3.offsetY, this.Side3.offsetZ);
        GL11.glTranslatef(this.Side3.rotationPointX * f5, this.Side3.rotationPointY * f5, this.Side3.rotationPointZ * f5);
        GL11.glScaled(0.3D, 0.3D, 0.3D);
        GL11.glTranslatef(-this.Side3.offsetX, -this.Side3.offsetY, -this.Side3.offsetZ);
        GL11.glTranslatef(-this.Side3.rotationPointX * f5, -this.Side3.rotationPointY * f5, -this.Side3.rotationPointZ * f5);
        this.Side3.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Leaf2.offsetX, this.Leaf2.offsetY, this.Leaf2.offsetZ);
        GL11.glTranslatef(this.Leaf2.rotationPointX * f5, this.Leaf2.rotationPointY * f5, this.Leaf2.rotationPointZ * f5);
        GL11.glScaled(0.1D, 0.1D, 0.1D);
        GL11.glTranslatef(-this.Leaf2.offsetX, -this.Leaf2.offsetY, -this.Leaf2.offsetZ);
        GL11.glTranslatef(-this.Leaf2.rotationPointX * f5, -this.Leaf2.rotationPointY * f5, -this.Leaf2.rotationPointZ * f5);
        this.Leaf2.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Leaf1.offsetX, this.Leaf1.offsetY, this.Leaf1.offsetZ);
        GL11.glTranslatef(this.Leaf1.rotationPointX * f5, this.Leaf1.rotationPointY * f5, this.Leaf1.rotationPointZ * f5);
        GL11.glScaled(0.1D, 0.1D, 0.1D);
        GL11.glTranslatef(-this.Leaf1.offsetX, -this.Leaf1.offsetY, -this.Leaf1.offsetZ);
        GL11.glTranslatef(-this.Leaf1.rotationPointX * f5, -this.Leaf1.rotationPointY * f5, -this.Leaf1.rotationPointZ * f5);
        this.Leaf1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Main2.offsetX, this.Main2.offsetY, this.Main2.offsetZ);
        GL11.glTranslatef(this.Main2.rotationPointX * f5, this.Main2.rotationPointY * f5, this.Main2.rotationPointZ * f5);
        GL11.glScaled(0.4D, 0.4D, 0.4D);
        GL11.glTranslatef(-this.Main2.offsetX, -this.Main2.offsetY, -this.Main2.offsetZ);
        GL11.glTranslatef(-this.Main2.rotationPointX * f5, -this.Main2.rotationPointY * f5, -this.Main2.rotationPointZ * f5);
        this.Main2.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Side1.offsetX, this.Side1.offsetY, this.Side1.offsetZ);
        GL11.glTranslatef(this.Side1.rotationPointX * f5, this.Side1.rotationPointY * f5, this.Side1.rotationPointZ * f5);
        GL11.glScaled(0.3D, 0.3D, 0.3D);
        GL11.glTranslatef(-this.Side1.offsetX, -this.Side1.offsetY, -this.Side1.offsetZ);
        GL11.glTranslatef(-this.Side1.rotationPointX * f5, -this.Side1.rotationPointY * f5, -this.Side1.rotationPointZ * f5);
        this.Side1.render(f5);
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
