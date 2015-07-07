package com.suatae.mechinasmagick.utility;

import net.minecraft.util.ResourceLocation;

import com.suatae.mechinasmagick.common.core.lib.REF;





public class ResourceLocationHelper {
	public static ResourceLocation getResourceLocation(String modId, String path) {
		return new ResourceLocation(modId, path);
	}

	public static ResourceLocation getResourceLocation(String path) {
		return getResourceLocation(REF.MOD_ID.toLowerCase(), path);
	}

}
