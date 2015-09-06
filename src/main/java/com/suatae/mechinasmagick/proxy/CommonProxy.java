package com.suatae.mechinasmagick.proxy;

import net.minecraft.entity.player.EntityPlayer;





public abstract class CommonProxy {

	public void registerItemRender() {}

	public void registerTESRender() {}

	public void registerTESRGoldCasing() {}

	public void registerTESRIronCasing() {}

	public abstract EntityPlayer getClientPlayer();

}
