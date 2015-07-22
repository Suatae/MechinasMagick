package com.suatae.mechinasmagick.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

/**
 * Fruit - Suatae
 * Created using Tabula 4.1.1
 */
public class Fruit extends ModelBase {
    public ModelRenderer Fruit;

    public Fruit() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Fruit = new ModelRenderer(this, 0, 0);
        this.Fruit.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.Fruit.addBox(-8.0F, -8.0F, -8.0F, 16, 16, 16, 0.0F);
        this.setRotateAngle(Fruit, 0.7853981633974483F, 0.0F, 0.5585053606381855F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Fruit.offsetX, this.Fruit.offsetY, this.Fruit.offsetZ);
        GL11.glTranslatef(this.Fruit.rotationPointX * f5, this.Fruit.rotationPointY * f5, this.Fruit.rotationPointZ * f5);
        GL11.glScaled(0.4D, 0.6D, 0.4D);
        GL11.glTranslatef(-this.Fruit.offsetX, -this.Fruit.offsetY, -this.Fruit.offsetZ);
        GL11.glTranslatef(-this.Fruit.rotationPointX * f5, -this.Fruit.rotationPointY * f5, -this.Fruit.rotationPointZ * f5);
        this.Fruit.render(f5);
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
