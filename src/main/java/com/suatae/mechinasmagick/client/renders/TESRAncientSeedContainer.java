package com.suatae.mechinasmagick.client.renders;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import com.suatae.mechinasmagick.client.models.AncientSeedContainer;
import com.suatae.mechinasmagick.common.core.lib.REF;





public class TESRAncientSeedContainer extends TileEntitySpecialRenderer {
	private static final ResourceLocation	texture	= new ResourceLocation(
															REF.MOD_ID.toLowerCase(),
															"textures/models/blockAncientSeedContainer.png");
	private AncientSeedContainer			model;

	public TESRAncientSeedContainer() {
		this.model = new AncientSeedContainer();
	}

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {

		GL11.glPushMatrix();

		GL11.glTranslatef((float) x + 0.5F, (float) y + 0.37F, (float) z + 0.5F);

		this.bindTexture(texture);
		GL11.glRotatef(-180F, 0F, 0F, 1F);
		GL11.glScalef(0.25F, 0.25F, 0.25F);

		this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);

		GL11.glPopMatrix();

	}

	protected int shouldrenderPass() {
		return 1;
	}

	private void adjustLightFixture(World world, int i, int j, int k, Block block) {
		Tessellator tess = Tessellator.instance;
		float brightness = block.getLightValue(world, i, j, k);
		int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
		int modulousModifier = skyLight % 65536;
		int divModifier = skyLight / 65536;
		tess.setColorOpaque_F(brightness, brightness, brightness);
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, modulousModifier,
				divModifier);
	}
}
