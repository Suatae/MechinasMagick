package com.suatae.mechinasmagick.client.renders;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import com.suatae.mechinasmagick.common.core.lib.REF;





public class TESRCache extends TileEntitySpecialRenderer {
	private IModelCustom		model;
	private ResourceLocation	texture;

	// private float yRotationAngle;
	// private float speed;
	// private float yTranslate;

	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return true;
	}

	public TESRCache() {

		ResourceLocation modelLocation = new ResourceLocation(REF.MOD_ID.toLowerCase(),
				"models/Cache.obj");

		this.model = AdvancedModelLoader.loadModel(modelLocation);
		this.texture = new ResourceLocation(REF.MOD_ID.toLowerCase(),
				"textures/models/CacheHiRes.png");

		// yTranslate = 10f;
		// yRotationAngle = 0.01F;
		// speed = 2.0F;
	}

	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		// char c0 = 61680;
		// int j = c0 % 65536;
		// int k = c0 / 65536;
		// OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, j
		// / 1.0F, k / 1.0F);
		// GL11.glEnable(GL11.GL_LIGHTING);

		GL11.glPushMatrix();
		// GL11.glTranslated(x - 0.12f, y - 0.72f, z + 1.12f);
		GL11.glTranslated(x + 0.5f, y + 0.5f, z + 0.5f);
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		// GL11.glTranslated(x + 0.5f, yTranslate, z + 0.5f);

		// float a0 = (180.0f - Minecraft.getMinecraft().thePlayer.rotationYaw)
		// % 360.0f;
		//
		// yRotationAngle += f * speed;
		// if (yRotationAngle <= 360) {
		// yRotationAngle -= 360;
		// }
		//
		// GL11.glRotatef(yRotationAngle, 0.0f, 1.0f, 0.0f);
		GL11.glScalef(1.25f, 1.25f, 1.25f);
		// GL11.glScalef(1.0f, 1.0f, 1.0f);
		// GL11.glRotatef(0.0F, 0.0F, 0.0F, 0.0F);
		model.renderAll();
		GL11.glPopMatrix();
	}

}
