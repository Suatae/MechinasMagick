package com.suatae.mechinasmagick.common.core.handler;

import net.minecraftforge.event.entity.player.PlayerEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;





public class MMClientEventHandler {

	public class NMClientEventHandler {

		@SubscribeEvent(priority = EventPriority.NORMAL)
		public void onEvent(PlayerEvent.NameFormat event) {

			event.displayname = "[--" + event.username + "--]";
		}

	}
}
