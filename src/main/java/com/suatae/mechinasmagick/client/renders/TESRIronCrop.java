package com.suatae.mechinasmagick.client.renders;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.suatae.mechinasmagick.client.models.crop.Crop00;
import com.suatae.mechinasmagick.client.models.crop.Crop01;
import com.suatae.mechinasmagick.client.models.crop.Crop02;
import com.suatae.mechinasmagick.client.models.crop.Crop03;
import com.suatae.mechinasmagick.client.models.crop.Crop04;
import com.suatae.mechinasmagick.client.models.crop.Crop05;
import com.suatae.mechinasmagick.client.models.crop.Crop06;
import com.suatae.mechinasmagick.client.models.crop.Crop07;
import com.suatae.mechinasmagick.client.models.crop.Crop08;
import com.suatae.mechinasmagick.client.models.crop.Crop09;
import com.suatae.mechinasmagick.client.models.crop.Crop10;
import com.suatae.mechinasmagick.common.core.lib.REF;





public class TESRIronCrop extends TileEntitySpecialRenderer {
	private static final ResourceLocation	texture	= new ResourceLocation(
															REF.MOD_ID.toLowerCase(),
															"textures/models/CropIron.png");

	private Crop00							model00;
	private Crop01							model01;
	private Crop02							model02;
	private Crop03							model03;
	private Crop04							model04;
	private Crop05							model05;
	private Crop06							model06;
	private Crop07							model07;
	private Crop08							model08;
	private Crop09							model09;
	private Crop10							model10;

	public TESRIronCrop() {
		this.model00 = new Crop00();
		this.model01 = new Crop01();
		this.model02 = new Crop02();
		this.model03 = new Crop03();
		this.model04 = new Crop04();
		this.model05 = new Crop05();
		this.model06 = new Crop06();
		this.model07 = new Crop07();
		this.model08 = new Crop08();
		this.model09 = new Crop09();
		this.model10 = new Crop10();

	}

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslated(x + 0.5F, y - 0.5F, z + 0.5F);
		GL11.glRotatef(-180F, 0F, 0F, 1F);
		GL11.glRotatef(180F, 1F, 1F, 0F);
		GL11.glRotatef(-180F, 1F, -1F, 0F);
		GL11.glScalef(1F, 1F, 1F);
		if (tileEntity.getBlockMetadata() == 0) {
			this.bindTexture(texture);
			this.model00.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		if (tileEntity.getBlockMetadata() == 1) {
			this.bindTexture(texture);
			this.model01.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		if (tileEntity.getBlockMetadata() == 2) {
			this.bindTexture(texture);
			this.model02.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		if (tileEntity.getBlockMetadata() == 3) {
			this.bindTexture(texture);
			this.model03.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		if (tileEntity.getBlockMetadata() == 4) {
			this.bindTexture(texture);
			this.model04.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		if (tileEntity.getBlockMetadata() == 5) {
			this.bindTexture(texture);
			this.model05.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		if (tileEntity.getBlockMetadata() == 6) {
			this.bindTexture(texture);
			this.model06.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		if (tileEntity.getBlockMetadata() == 7) {
			this.bindTexture(texture);
			this.model07.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		if (tileEntity.getBlockMetadata() == 8) {
			this.bindTexture(texture);
			this.model08.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		if (tileEntity.getBlockMetadata() == 9) {
			this.bindTexture(texture);
			this.model09.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		if (tileEntity.getBlockMetadata() == 10) {
			this.bindTexture(texture);
			this.model10.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		GL11.glPopMatrix();
	}

	protected int shouldrenderPass() {
		return 1;
	}
}
