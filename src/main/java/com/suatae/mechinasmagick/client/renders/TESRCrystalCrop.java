package com.suatae.mechinasmagick.client.renders;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.suatae.mechinasmagick.client.models.crop.Crystal00;
import com.suatae.mechinasmagick.client.models.crop.Crystal01;
import com.suatae.mechinasmagick.client.models.crop.Crystal02;
import com.suatae.mechinasmagick.client.models.crop.Crystal03;
import com.suatae.mechinasmagick.client.models.crop.Crystal04;
import com.suatae.mechinasmagick.client.models.crop.Crystal05;
import com.suatae.mechinasmagick.client.models.crop.Crystal06;
import com.suatae.mechinasmagick.client.models.crop.Crystal07;
import com.suatae.mechinasmagick.client.models.crop.Crystal08;
import com.suatae.mechinasmagick.client.models.crop.Crystal09;
import com.suatae.mechinasmagick.client.models.crop.Crystal10;
import com.suatae.mechinasmagick.client.models.crop.Crystal11;
import com.suatae.mechinasmagick.client.models.crop.Crystal12;
import com.suatae.mechinasmagick.client.models.crop.Crystal13;
import com.suatae.mechinasmagick.client.models.crop.Crystal14;
import com.suatae.mechinasmagick.common.core.lib.REF;





public class TESRCrystalCrop extends TileEntitySpecialRenderer {
	private static final ResourceLocation	texture	= new ResourceLocation(
															REF.MOD_ID.toLowerCase(),
															"textures/models/CrystalCrop.png");

	private Crystal00						model00;
	private Crystal01						model01;
	private Crystal02						model02;
	private Crystal03						model03;
	private Crystal04						model04;
	private Crystal05						model05;
	private Crystal06						model06;
	private Crystal07						model07;
	private Crystal08						model08;
	private Crystal09						model09;
	private Crystal10						model10;
	private Crystal11						model11;
	private Crystal12						model12;
	private Crystal13						model13;
	private Crystal14						model14;

	public TESRCrystalCrop() {
		this.model00 = new Crystal00();
		this.model01 = new Crystal01();
		this.model02 = new Crystal02();
		this.model03 = new Crystal03();
		this.model04 = new Crystal04();
		this.model05 = new Crystal05();
		this.model06 = new Crystal06();
		this.model07 = new Crystal07();
		this.model08 = new Crystal08();
		this.model09 = new Crystal09();
		this.model10 = new Crystal10();
		this.model11 = new Crystal11();
		this.model12 = new Crystal12();
		this.model13 = new Crystal13();
		this.model14 = new Crystal14();

	}

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
		renderWorldBlock(tileEntity, x, y, z, f);
	}

	public void renderWorldBlock(TileEntity tileEntity, double x, double y, double z, float f) {
		if (tileEntity.getBlockMetadata() == 0) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);

			this.bindTexture(texture);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			this.model00.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 1) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);

			this.bindTexture(texture);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			this.model01.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 2) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);

			this.bindTexture(texture);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			this.model02.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 3) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);

			this.bindTexture(texture);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			this.model03.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 4) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);

			this.bindTexture(texture);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			this.model04.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 5) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);

			this.bindTexture(texture);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			this.model05.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 6) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);

			this.bindTexture(texture);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			this.model06.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 7) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);

			this.bindTexture(texture);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			this.model07.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 8) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);

			this.bindTexture(texture);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			this.model08.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 9) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);

			this.bindTexture(texture);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			this.model09.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 10) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);

			this.bindTexture(texture);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			this.model10.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}

		if (tileEntity.getBlockMetadata() == 11) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);

			this.bindTexture(texture);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			this.model11.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 12) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);

			this.bindTexture(texture);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			this.model12.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 13) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);

			this.bindTexture(texture);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			this.model13.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 14) {
			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);

			this.bindTexture(texture);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			this.model14.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}

	}

	protected int shouldrenderPass() {
		return 1;
	}
}
