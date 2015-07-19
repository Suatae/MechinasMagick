package com.suatae.mechinasmagick.client.renders.flint;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.suatae.mechinasmagick.client.models.Flint1;
import com.suatae.mechinasmagick.client.models.Flint2;
import com.suatae.mechinasmagick.client.models.Flint3;
import com.suatae.mechinasmagick.client.models.Flint4;
import com.suatae.mechinasmagick.common.core.lib.REF;





public class TESRBlockFlint extends TileEntitySpecialRenderer {
	private static final ResourceLocation	texture00	= new ResourceLocation(
																REF.MOD_ID.toLowerCase(),
																"textures/models/Flint1.png");
	private static final ResourceLocation	texture01	= new ResourceLocation(
																REF.MOD_ID.toLowerCase(),
																"textures/models/Flint2.png");
	private static final ResourceLocation	texture02	= new ResourceLocation(
																REF.MOD_ID.toLowerCase(),
																"textures/models/Flint3.png");
	private static final ResourceLocation	texture03	= new ResourceLocation(
																REF.MOD_ID.toLowerCase(),
																"textures/models/Flint4.png");

	private Flint1							model00;
	private Flint2							model01;
	private Flint3							model02;
	private Flint4							model03;

	public TESRBlockFlint() {
		this.model00 = new Flint1();
		this.model01 = new Flint2();
		this.model02 = new Flint3();
		this.model03 = new Flint4();
	}

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
		renderWorldBlock(tileEntity, x, y, z, f);
	}

	public void renderWorldBlock(TileEntity tileEntity, double x, double y, double z, float f) {
		if (tileEntity.getBlockMetadata() == 0) {
			GL11.glPushMatrix();
			this.bindTexture(texture00);

			GL11.glTranslatef((float) x + 0.5F, (float) y + 1.47F, (float) z + 0.5F);
			GL11.glRotatef(-180F, 0F, 0F, 1F);

			GL11.glPushMatrix();
			this.model00.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 1) {
			GL11.glPushMatrix();
			this.bindTexture(texture01);

			GL11.glTranslatef((float) x + 0.5F, (float) y + 1.47F, (float) z + 0.5F);
			GL11.glRotatef(-180F, 0F, 0F, 1F);

			this.model01.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 2) {
			GL11.glPushMatrix();
			this.bindTexture(texture02);

			GL11.glTranslatef((float) x + 0.5F, (float) y + 1.47F, (float) z + 0.5F);
			GL11.glRotatef(-180F, 0F, 0F, 1F);

			this.model02.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 3) {
			GL11.glPushMatrix();
			this.bindTexture(texture03);

			GL11.glTranslatef((float) x + 0.5F, (float) y + 1.47F, (float) z + 0.5F);
			GL11.glRotatef(-180F, 0F, 0F, 1F);

			this.model03.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
	}
}
