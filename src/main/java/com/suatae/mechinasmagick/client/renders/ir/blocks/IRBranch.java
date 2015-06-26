package com.suatae.mechinasmagick.client.renders.ir.blocks;

import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;





public class IRBranch implements IItemRenderer {
	TileEntitySpecialRenderer	render;
	private TileEntity			entity;

	public IRBranch(TileEntitySpecialRenderer render, TileEntity tileEntity) {
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
			GL11.glTranslatef(-0.75F, 0F, -0.75F);
			GL11.glScalef(1.4F, 1.4F, 1.4F);
			this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);
		}
		if (type == IItemRenderer.ItemRenderType.EQUIPPED) {
			GL11.glTranslatef(1.1F, 0.35F, 1F);
			GL11.glRotatef(180, 0F, 1F, 0F);
			GL11.glScalef(2F, 2F, 2F);
			GL11.glRotatef(5, 0F, 0F, 1F);
			GL11.glRotatef(-45, 1F, 0F, 0F);
			this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);
		}
		if (type == IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON) {
			GL11.glTranslatef(0F, 0.5F, 1.5F);
			GL11.glRotatef(90, 0F, 1F, 0F);
			GL11.glScalef(1.5F, 1.5F, 1.5F);
			GL11.glRotatef(5, 0F, 0F, 1F);
			GL11.glRotatef(-45, 1F, 0F, 0F);
			this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);
		}
		if (type == IItemRenderer.ItemRenderType.INVENTORY) {
			GL11.glTranslatef(0.25F, -0.95F, -0.5F);
			GL11.glRotatef(130, 0F, 1F, 0F);
			GL11.glRotatef(40, 0F, 0F, 1F);
			GL11.glRotatef(180, 1F, 0F, 0F);
			GL11.glScalef(1.5F, 1.5F, 1.5F);
			GL11.glEnable(GL11.GL_BLEND);
			OpenGlHelper.glBlendFunc(770, 771, 1, 0);
			this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);

		}
	}
}
