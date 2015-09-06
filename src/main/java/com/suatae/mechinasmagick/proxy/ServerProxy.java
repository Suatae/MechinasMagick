package com.suatae.mechinasmagick.proxy;

import net.minecraft.entity.player.EntityPlayer;





public class ServerProxy extends CommonProxy {

	public void registerItemRender() {}

	public void registerTESRender() {}

	public void registerTESRGoldCasing() {}

	public void registerTESRIronCasing() {}

	public EntityPlayer getClientPlayer() {
		return null;
	};

}
