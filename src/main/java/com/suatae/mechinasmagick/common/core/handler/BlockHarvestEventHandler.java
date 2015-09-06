package com.suatae.mechinasmagick.common.core.handler;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

import com.suatae.mechinasmagick.utility.ConfigUtil;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;





public class BlockHarvestEventHandler {

	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onBlockHarvest(HarvestDropsEvent event) {

		World world = event.world;
		Block block = event.block;

		if (ConfigUtil.FlintModule) {
			if (block == Blocks.gravel) {
				event.drops.clear();
				event.drops.add(new ItemStack(Blocks.gravel, 1));
			}
		}
		else {

		}

	}

}
