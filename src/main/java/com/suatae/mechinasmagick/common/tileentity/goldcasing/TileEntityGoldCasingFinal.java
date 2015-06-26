package com.suatae.mechinasmagick.common.tileentity.goldcasing;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;





public class TileEntityGoldCasingFinal extends TileEntity {

	private int	i1	= 16;

	@Override
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
	}

	@Override
	public void writeToNBT(NBTTagCompound tag) {
		super.writeToNBT(tag);
	}

	public boolean anyPlayerInRange() {
		return this.worldObj.getClosestPlayer(this.xCoord + 0.5D, this.yCoord + 0.5D,
				this.zCoord + 0.5D, this.i1) != null;
	}

	@Override
	public void updateEntity() {
		if (this.anyPlayerInRange()) {
			if (this.worldObj.isRemote) {
				double var1 = this.xCoord + this.worldObj.rand.nextFloat();
				double var3 = this.yCoord + this.worldObj.rand.nextFloat();
				double var5 = this.zCoord + this.worldObj.rand.nextFloat();
				this.worldObj.spawnParticle("smoke", var1, var3, var5, 0.0D, 0.0D, 0.0D);
				this.worldObj.spawnParticle("flame", var1, var3, var5, 0.0D, 0.0D, 0.0D);
			}
		}
	}
}
