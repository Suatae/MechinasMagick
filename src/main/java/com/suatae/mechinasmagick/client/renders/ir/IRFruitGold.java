package com.suatae.mechinasmagick.client.renders.ir;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.suatae.mechinasmagick.client.models.Fruit;
import com.suatae.mechinasmagick.common.core.lib.REF;





public class IRFruitGold implements IItemRenderer {
	protected Fruit	model;

	public IRFruitGold() {
		model = new Fruit();
		this.Texture = new ResourceLocation(REF.MOD_ID.toLowerCase(),
				"textures/models/FruitGold.png");
	}

	private ResourceLocation	Texture;

	@Override
	public boolean handleRenderType(ItemStack itemstack, ItemRenderType type) {
		switch (type) {
			case EQUIPPED:
				if (Minecraft.getMinecraft().isFancyGraphicsEnabled() == true) {
					return true;
				}
				else {
					return false;
				}
			case EQUIPPED_FIRST_PERSON:
				if (Minecraft.getMinecraft().isFancyGraphicsEnabled() == true) {
					return true;
				}
				else {
					return false;
				}
			case ENTITY:
				if (Minecraft.getMinecraft().isFancyGraphicsEnabled() == true) {
					return true;
				}
				else {
					return false;
				}
			default:
				return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack itemstack,
			ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack itemstack, Object... data) {
		switch (type) {
			case EQUIPPED:
				GL11.glPushMatrix();
				Minecraft.getMinecraft().renderEngine.bindTexture(Texture);

				GL11.glTranslatef(0.5F, -0.5F, 0.5F);

				model.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

				GL11.glPopMatrix();
				break;
			case EQUIPPED_FIRST_PERSON:
				GL11.glPushMatrix();
				Minecraft.getMinecraft().renderEngine.bindTexture(Texture);

				GL11.glTranslatef(-0.5F, 0.3F, 0.63F);
				GL11.glScalef(0.8F, 0.8F, 0.8F);

				model.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

				GL11.glPopMatrix();
				break;

			case ENTITY:
				if (RenderItem.renderInFrame == true) {
					GL11.glPushMatrix();

					Minecraft.getMinecraft().renderEngine.bindTexture(Texture);

					GL11.glTranslatef(-0.03F, -0.75F, 0F);
					GL11.glScalef(0.75f, 0.75f, 0.75f);
					model.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
					GL11.glPopMatrix();

				}
				else {
					GL11.glPushMatrix();
					Minecraft.getMinecraft().renderEngine.bindTexture(Texture);

					GL11.glTranslatef(0F, -0.5F, 0F);

					model.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

					GL11.glPopMatrix();
				}
				break;
			default:
				break;
		}
	}
}
