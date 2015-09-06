package com.suatae.mechinasmagick.common.tileentity;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;

import com.suatae.mechinasmagick.network.DescriptionHandler;

import cpw.mods.fml.common.network.internal.FMLProxyPacket;





public class TileEntityBase extends TileEntity {

	public Packet getDescriptionPacket() {
		ByteBuf buf = Unpooled.buffer();
		buf.writeInt(xCoord);
		buf.writeInt(yCoord);
		buf.writeInt(zCoord);
		writeToPacket(buf);
		return new FMLProxyPacket(buf, DescriptionHandler.CHANNEL);
	}

	public void writeToPacket(ByteBuf buf) {

	}

	public void readFromPacket(ByteBuf buf) {

	}
}
