package com.suatae.mechinasmagick.common.tileentity;

import io.netty.buffer.ByteBuf;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import cpw.mods.fml.common.network.ByteBufUtils;





public class TileEntityRoad extends TileEntityBase {

	private ItemStack	camo;

	public void setCamo(ItemStack stack) {
		camo = stack;
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}

	public ItemStack getCamo() {
		return camo;
	}

	public void writeToPacket(ByteBuf buf) {
		ByteBufUtils.writeItemStack(buf, camo);
	}

	public void readFromPacket(ByteBuf buf) {
		camo = ByteBufUtils.readItemStack(buf);
		worldObj.markBlockRangeForRenderUpdate(xCoord, yCoord, zCoord, xCoord, yCoord, zCoord);
	}

	@Override
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);

		if (tag.hasKey("camo")) {
			camo = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("camo"));
		}
		else {
			camo = null;
		}
	}

	@Override
	public void writeToNBT(NBTTagCompound tag) {
		super.writeToNBT(tag);

		if (camo != null) {
			NBTTagCompound c = new NBTTagCompound();
			camo.writeToNBT(c);
			tag.setTag("camo", c);
		}
	}

}
