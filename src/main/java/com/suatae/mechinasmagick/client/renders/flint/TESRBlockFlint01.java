package com.suatae.mechinasmagick.client.renders.flint;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.suatae.mechinasmagick.client.models.Flint1;
import com.suatae.mechinasmagick.common.core.lib.REF;





public class TESRBlockFlint01 extends TileEntitySpecialRenderer {
	private static final ResourceLocation	texture	= new ResourceLocation(
															REF.MOD_ID.toLowerCase(),
															"textures/models/Flint1.png");
	private Flint1							model;

	public TESRBlockFlint01() {
		this.model = new Flint1();
	}

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		this.bindTexture(texture);

		GL11.glTranslatef((float) x + 0.5F, (float) y + 1.47F, (float) z + 0.5F);
		GL11.glRotatef(-180F, 0F, 0F, 1F);

		GL11.glPushMatrix();
		this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
}
