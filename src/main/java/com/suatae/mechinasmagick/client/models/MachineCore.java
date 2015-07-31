package com.suatae.mechinasmagick.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Machine Core - Omegami
 * Created using Tabula 4.1.1
 */
public class MachineCore extends ModelBase {
    public ModelRenderer center;
    public ModelRenderer side;
    public ModelRenderer side_1;
    public ModelRenderer corner;
    public ModelRenderer corner_1;
    public ModelRenderer corner_2;
    public ModelRenderer corner_3;
    public ModelRenderer corner_4;
    public ModelRenderer corner_5;
    public ModelRenderer corner_6;
    public ModelRenderer corner_7;
    public ModelRenderer sidetop;
    public ModelRenderer sidetop_1;
    public ModelRenderer sidebottom;
    public ModelRenderer sidebottom_1;

    public MachineCore() {
        this.textureWidth = 190;
        this.textureHeight = 180;
        this.side = new ModelRenderer(this, 0, 90);
        this.side.setRotationPoint(22.0F, -8.0F, 0.0F);
        this.side.addBox(-32.0F, -12.0F, -10.0F, 64, 24, 20, 0.0F);
        this.setRotateAngle(side, 0.0F, 1.5707963267948966F, 0.0F);
        this.sidetop_1 = new ModelRenderer(this, 80, 135);
        this.sidetop_1.setRotationPoint(22.0F, -30.0F, 0.0F);
        this.sidetop_1.addBox(-12.0F, -10.0F, -10.0F, 24, 20, 20, 0.0F);
        this.setRotateAngle(sidetop_1, 0.0F, 1.5707963267948966F, 0.0F);
        this.corner = new ModelRenderer(this, 0, 135);
        this.corner.setRotationPoint(21.0F, -29.0F, 21.0F);
        this.corner.addBox(-9.0F, -9.0F, -9.0F, 18, 18, 18, 0.0F);
        this.setRotateAngle(corner, 0.0F, 1.5707963267948966F, 0.0F);
        this.corner_7 = new ModelRenderer(this, 0, 135);
        this.corner_7.setRotationPoint(21.0F, 13.0F, -21.0F);
        this.corner_7.addBox(-9.0F, -9.0F, -9.0F, 18, 18, 18, 0.0F);
        this.setRotateAngle(corner_7, 0.0F, 1.5707963267948966F, 0.0F);
        this.sidetop = new ModelRenderer(this, 80, 135);
        this.sidetop.setRotationPoint(-22.0F, -30.0F, 0.0F);
        this.sidetop.addBox(-12.0F, -10.0F, -10.0F, 24, 20, 20, 0.0F);
        this.setRotateAngle(sidetop, 0.0F, 1.5707963267948966F, 0.0F);
        this.sidebottom = new ModelRenderer(this, 80, 135);
        this.sidebottom.setRotationPoint(22.0F, 14.0F, 0.0F);
        this.sidebottom.addBox(-12.0F, -10.0F, -10.0F, 24, 20, 20, 0.0F);
        this.setRotateAngle(sidebottom, 0.0F, 1.5707963267948966F, 0.0F);
        this.corner_2 = new ModelRenderer(this, 0, 135);
        this.corner_2.setRotationPoint(-21.0F, -29.0F, 21.0F);
        this.corner_2.addBox(-9.0F, -9.0F, -9.0F, 18, 18, 18, 0.0F);
        this.setRotateAngle(corner_2, 0.0F, 1.5707963267948966F, 0.0F);
        this.corner_5 = new ModelRenderer(this, 0, 135);
        this.corner_5.setRotationPoint(21.0F, 13.0F, 21.0F);
        this.corner_5.addBox(-9.0F, -9.0F, -9.0F, 18, 18, 18, 0.0F);
        this.setRotateAngle(corner_5, 0.0F, 1.5707963267948966F, 0.0F);
        this.corner_3 = new ModelRenderer(this, 0, 135);
        this.corner_3.setRotationPoint(-21.0F, -29.0F, -21.0F);
        this.corner_3.addBox(-9.0F, -9.0F, -9.0F, 18, 18, 18, 0.0F);
        this.setRotateAngle(corner_3, 0.0F, 1.5707963267948966F, 0.0F);
        this.corner_4 = new ModelRenderer(this, 0, 135);
        this.corner_4.setRotationPoint(-21.0F, 13.0F, -21.0F);
        this.corner_4.addBox(-9.0F, -9.0F, -9.0F, 18, 18, 18, 0.0F);
        this.setRotateAngle(corner_4, 0.0F, 1.5707963267948966F, 0.0F);
        this.sidebottom_1 = new ModelRenderer(this, 80, 135);
        this.sidebottom_1.setRotationPoint(-22.0F, 14.0F, 0.0F);
        this.sidebottom_1.addBox(-12.0F, -10.0F, -10.0F, 24, 20, 20, 0.0F);
        this.setRotateAngle(sidebottom_1, 0.0F, 1.5707963267948966F, 0.0F);
        this.center = new ModelRenderer(this, 0, 0);
        this.center.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.center.addBox(-32.0F, -32.0F, -12.0F, 64, 64, 24, 0.0F);
        this.setRotateAngle(center, 0.0F, 1.5707963267948966F, 0.0F);
        this.corner_6 = new ModelRenderer(this, 0, 135);
        this.corner_6.setRotationPoint(-21.0F, 13.0F, 21.0F);
        this.corner_6.addBox(-9.0F, -9.0F, -9.0F, 18, 18, 18, 0.0F);
        this.setRotateAngle(corner_6, 0.0F, 1.5707963267948966F, 0.0F);
        this.corner_1 = new ModelRenderer(this, 0, 135);
        this.corner_1.setRotationPoint(21.0F, -29.0F, -21.0F);
        this.corner_1.addBox(-9.0F, -9.0F, -9.0F, 18, 18, 18, 0.0F);
        this.setRotateAngle(corner_1, 0.0F, 1.5707963267948966F, 0.0F);
        this.side_1 = new ModelRenderer(this, 0, 90);
        this.side_1.setRotationPoint(-22.0F, -8.0F, 0.0F);
        this.side_1.addBox(-32.0F, -12.0F, -10.0F, 64, 24, 20, 0.0F);
        this.setRotateAngle(side_1, 0.0F, 1.5707963267948966F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.side.render(f5);
        this.sidetop_1.render(f5);
        this.corner.render(f5);
        this.corner_7.render(f5);
        this.sidetop.render(f5);
        this.sidebottom.render(f5);
        this.corner_2.render(f5);
        this.corner_5.render(f5);
        this.corner_3.render(f5);
        this.corner_4.render(f5);
        this.sidebottom_1.render(f5);
        this.center.render(f5);
        this.corner_6.render(f5);
        this.corner_1.render(f5);
        this.side_1.render(f5);
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
