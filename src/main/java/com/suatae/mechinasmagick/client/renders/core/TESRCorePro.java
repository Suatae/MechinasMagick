package com.suatae.mechinasmagick.client.renders.core;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.suatae.mechinasmagick.client.models.MachineCore;
import com.suatae.mechinasmagick.common.core.lib.REF;





public class TESRCorePro extends TileEntitySpecialRenderer {
	private static final ResourceLocation	texture	= new ResourceLocation(
															REF.MOD_ID.toLowerCase(),
															"textures/models/core/Machine Core-Prometheum.png");
	private MachineCore						model;

	public TESRCorePro() {
		this.model = new MachineCore();
	}

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
		GL11.glPushMatrix();

		GL11.glTranslatef((float) x + 0.5F, (float) y + 0.626F, (float) z + 0.5F);

		this.bindTexture(texture);
		// GL11.glRotatef(-180F, 0F, 0F, 1F);
		GL11.glScalef(0.25F, 0.25F, 0.25F);

		this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);

		GL11.glPopMatrix();

	}

	protected int shouldrenderPass() {
		return 0;
	}
}
