package com.suatae.mechinasmagick.client.renders;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;

import com.suatae.mechinasmagick.client.models.Casing;
import com.suatae.mechinasmagick.common.core.lib.REF;





public class TESRIronCasing extends TileEntitySpecialRenderer {
	private static final ResourceLocation	texture	= new ResourceLocation(
															REF.MOD_ID.toLowerCase(),
															"textures/models/casing_iron.png");

	private Casing							model;

	public TESRIronCasing() {
		this.model = new Casing();

	}

	private void Meta(IBlockAccess world, int X, int Y, int Z) {

	}

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
		GL11.glPushMatrix();

		GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);

		this.bindTexture(texture);
		GL11.glRotatef(-180F, 0F, 0F, 1F);
		GL11.glScalef(1F, 1F, 1F);
		this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}

	protected int shouldrenderPass() {
		return 1;
	}
}
