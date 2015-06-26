package com.suatae.mechinasmagick.client.renders.ir.blocks.cache;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;





public class IRCacheE implements IItemRenderer {
	TileEntitySpecialRenderer	render;
	private TileEntity			entity;

	public IRCacheE(TileEntitySpecialRenderer render, TileEntity tileEntity) {
		this.entity = tileEntity;
		this.render = render;
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		if (type == IItemRenderer.ItemRenderType.ENTITY) {
			GL11.glTranslatef(-0.55F, -0.45F, -0.55F);
			this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);
		}
		if (type == IItemRenderer.ItemRenderType.EQUIPPED) {
			GL11.glTranslatef(-0.1F, 0F, -0.1F);
			GL11.glScalef(1.2F, 1.2F, 1.2F);
			this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);
		}
		if (type == IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON) {
			this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);
		}
		if (type == IItemRenderer.ItemRenderType.INVENTORY) {
			this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);
		}
	}
}
