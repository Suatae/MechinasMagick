package com.suatae.mechinasmagick.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import net.minecraft.tileentity.TileEntity;

import com.suatae.mechinasmagick.MechinasMagick;
import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.tileentity.TileEntityRoad;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;





@Sharable
public class DescriptionHandler extends SimpleChannelInboundHandler<FMLProxyPacket> {
	public static final String	CHANNEL	= REF.MOD_ID + "Desc";

	static {
		NetworkRegistry.INSTANCE.newChannel(CHANNEL, new DescriptionHandler());
	}

	public static void init() {}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, FMLProxyPacket msg) throws Exception {
		ByteBuf buf = msg.payload();
		int X = buf.readInt();
		int Y = buf.readInt();
		int Z = buf.readInt();
		TileEntity te = MechinasMagick.proxy.getClientPlayer().worldObj.getTileEntity(X, Y, Z);
		if (te instanceof TileEntityRoad) {
			((TileEntityRoad) te).readFromPacket(buf);
		}
	}

}
