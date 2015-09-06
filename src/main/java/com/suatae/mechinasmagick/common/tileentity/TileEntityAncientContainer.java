package com.suatae.mechinasmagick.common.tileentity;

import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;





public class TileEntityAncientContainer extends TileEntity {

	private int			i1		= 8;
	private static int	timer	= 20 * 20;

	Random				ran		= new Random();

	public boolean anyPlayerInRange() {
		return this.worldObj.getClosestPlayer(this.xCoord + 0.5D, this.yCoord + 0.5D,
				this.zCoord + 0.5D, this.i1) != null;
	}

	@Override
	public void updateEntity() {
		if (this.anyPlayerInRange()) {
			if (!this.worldObj.isRemote) {
				EntityPlayer player = Minecraft.getMinecraft().thePlayer;
				if (timer > 0)
					timer--;
				if ((timer == ran.nextInt(300)) || (timer == 1)) {
					if (player.capabilities.isCreativeMode == false) {
						player.dropOneItem(true);
						timer = 20 * 20;
						timer--;
					}
				}
				if (this.worldObj.getTotalWorldTime() % 1L == 0L) {
					if (player.capabilities.isCreativeMode == false) {
						player.setSprinting(false);

						double motionX = Math.abs(player.motionX);
						double motionZ = Math.abs(player.motionZ);

						float speed = 0.5f;
						float max = 0.4f;

						if (player.motionX < max) {
							player.motionX *= speed;
						}
						if (player.motionZ < max) {
							player.motionZ *= speed;
						}
					}

				}

			}
		}
	}

	@Override
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		timer = tag.getInteger("timer");
	}

	@Override
	public void writeToNBT(NBTTagCompound tag) {
		super.writeToNBT(tag);
		tag.setInteger("timer", timer);
	}

}
