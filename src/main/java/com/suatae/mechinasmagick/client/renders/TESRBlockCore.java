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
import com.suatae.mechinasmagick.utility.ResourceLocationHelper;





public class TESRBlockCore extends TileEntitySpecialRenderer {
	private IModelCustom					model;
	private ResourceLocation				texture;
	public static final ResourceLocation	cache	= ResourceLocationHelper
															.getResourceLocation("models/Cache.obj");

	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return true;
	}

	public TESRBlockCore() {

		model = AdvancedModelLoader.loadModel(cache);
		// this.model = AdvancedModelLoader.loadModel(new
		// ResourceLocation(REF.MOD_ID.toLowerCase(),
		// "models/Cache.obj"));
		this.texture = new ResourceLocation(REF.MOD_ID.toLowerCase(), "textures/models/ice.png");

	}

	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);

		GL11.glPushMatrix();
		// GL11.glTranslated(x - 0.12f, y - 0.72f, z + 1.12f);
		GL11.glTranslated(x + 0.5f, y + 0.5f, z + 0.5f);
		// GL11.glTranslated(x + 0.5f, yTranslate, z + 0.5f);

		// GL11.glRotatef(0, 0.0f, 1.0f, 0.0f);
		GL11.glScalef(1.25f, 1.25f, 1.25f);
		// GL11.glScalef(1.0f, 1.0f, 1.0f);
		// GL11.glRotatef(0.0F, 0.0F, 0.0F, 0.0F);
		model.renderAll();
		GL11.glPopMatrix();
	}
}
