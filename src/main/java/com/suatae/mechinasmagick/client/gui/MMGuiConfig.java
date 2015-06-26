package com.suatae.mechinasmagick.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.utility.ConfigUtil;

import cpw.mods.fml.client.config.GuiConfig;





public class MMGuiConfig extends GuiConfig {

	public MMGuiConfig(GuiScreen parent) {
		super(parent, new ConfigElement(ConfigUtil.configuration.getCategory("dev mode")).getChildElements(),
				REF.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(ConfigUtil.configuration.toString()));
	}
}
