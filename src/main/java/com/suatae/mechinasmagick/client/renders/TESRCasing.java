package com.suatae.mechinasmagick.client.renders;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.suatae.mechinasmagick.client.models.Casing;
import com.suatae.mechinasmagick.client.models.CasingSeeded;
import com.suatae.mechinasmagick.common.core.lib.REF;





public class TESRCasing extends TileEntitySpecialRenderer {
	private static final ResourceLocation	textureGold	= new ResourceLocation(
																REF.MOD_ID.toLowerCase(),
																"textures/models/casing_gold.png");
	private static final ResourceLocation	textureIron	= new ResourceLocation(
																REF.MOD_ID.toLowerCase(),
																"textures/models/casing_iron.png");

	private Casing							model;
	private CasingSeeded					seeded;

	public TESRCasing() {
		this.model = new Casing();
		this.seeded = new CasingSeeded();

	}

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
		renderWorldBlock(tileEntity, x, y, z, f);
	}

	public void renderWorldBlock(TileEntity tileEntity, double x, double y, double z, float f) {
		if (tileEntity.getBlockMetadata() == 0) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 0.445F, z + 0.5F);

			this.bindTexture(textureIron);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(0.295F, 0.295F, 0.295F);
			this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 1) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 0.445F, z + 0.5F);

			this.bindTexture(textureIron);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(0.295F, 0.295F, 0.295F);
			this.seeded.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 2) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 0.445F, z + 0.5F);

			this.bindTexture(textureIron);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(0.295F, 0.295F, 0.295F);
			this.seeded.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 3) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 0.445F, z + 0.5F);

			this.bindTexture(textureGold);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(0.295F, 0.295F, 0.295F);
			this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 4) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 0.445F, z + 0.5F);

			this.bindTexture(textureGold);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(0.295F, 0.295F, 0.295F);
			this.seeded.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 5) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 0.445F, z + 0.5F);

			this.bindTexture(textureGold);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(0.295F, 0.295F, 0.295F);
			this.seeded.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
	}

	protected int shouldrenderPass() {
		return 1;
	}
}
