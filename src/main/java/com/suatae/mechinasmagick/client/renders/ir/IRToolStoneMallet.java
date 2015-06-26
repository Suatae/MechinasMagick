package com.suatae.mechinasmagick.client.renders.ir;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.suatae.mechinasmagick.client.models.StoneMallet;
import com.suatae.mechinasmagick.common.core.lib.REF;





public class IRToolStoneMallet implements IItemRenderer {
	protected StoneMallet	model;

	public IRToolStoneMallet() {
		model = new StoneMallet();
		this.MalletTexture = new ResourceLocation(REF.MOD_ID.toLowerCase(),
				"textures/models/stoneMallet.png");
	}

	private ResourceLocation	MalletTexture;

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
				Minecraft.getMinecraft().renderEngine.bindTexture(MalletTexture);

				GL11.glRotatef(140F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(60F, 0.0F, -0.35F, -1.0F);
				GL11.glRotatef(30F, 0.0F, -0.5F, 0.9F);
				GL11.glTranslatef(0.0F, -1.9F, -1.3F);
				GL11.glScalef(3.0F, 3.0F, 3.0F);

				model.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

				GL11.glPopMatrix();
				break;
			case EQUIPPED_FIRST_PERSON:
				GL11.glPushMatrix();
				Minecraft.getMinecraft().renderEngine.bindTexture(MalletTexture);

				GL11.glRotatef(90F, 0.5F, 0.5F, 0.0F);
				GL11.glRotatef(120.0F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(150.0F, 0.0F, 1.0F, 0.0F);
				GL11.glRotatef(40F, -1.0F, -1.0F, 0.0F);
				GL11.glRotatef(30F, 0.0F, -1.0F, -0.2F);
				GL11.glTranslatef(0.4F, -2.0F, -0.60F);
				GL11.glScalef(1.8F, 1.8F, 1.8F);

				model.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

				GL11.glPopMatrix();
				break;

			case ENTITY:
				if (RenderItem.renderInFrame == true) {
					GL11.glPushMatrix();

					Minecraft.getMinecraft().renderEngine.bindTexture(MalletTexture);

					GL11.glRotatef(180F, 1.0f, 0.0f, 0.0f);
					GL11.glTranslatef(0F, -0.5F, 0F);
					GL11.glScalef(0.7f, 0.7f, 0.7f);
					model.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
					GL11.glPopMatrix();

				}
				else {
					GL11.glPushMatrix();
					Minecraft.getMinecraft().renderEngine.bindTexture(MalletTexture);

					GL11.glRotatef(180F, 1.0f, 0.0f, 0.0f);
					GL11.glTranslatef(0F, -1.2F, 0F);

					model.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

					GL11.glPopMatrix();
				}
				break;
			default:
				break;
		}
	}
}
