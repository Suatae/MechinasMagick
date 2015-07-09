package com.suatae.mechinasmagick.proxy;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.suatae.mechinasmagick.client.renders.TESRAncientDoorB;
import com.suatae.mechinasmagick.client.renders.TESRAncientDoorT;
import com.suatae.mechinasmagick.client.renders.TESRAncientSeedContainer;
import com.suatae.mechinasmagick.client.renders.TESRBlockCache;
import com.suatae.mechinasmagick.client.renders.TESRBranch;
import com.suatae.mechinasmagick.client.renders.TESRCasing;
import com.suatae.mechinasmagick.client.renders.TESRCatalyst;
import com.suatae.mechinasmagick.client.renders.TESRGoldCrop;
import com.suatae.mechinasmagick.client.renders.TESRIronCrop;
import com.suatae.mechinasmagick.client.renders.TESROreE;
import com.suatae.mechinasmagick.client.renders.flint.TESRBlockFlint01;
import com.suatae.mechinasmagick.client.renders.flint.TESRBlockFlint02;
import com.suatae.mechinasmagick.client.renders.flint.TESRBlockFlint03;
import com.suatae.mechinasmagick.client.renders.flint.TESRBlockFlint04;
import com.suatae.mechinasmagick.client.renders.ir.IRToolIronSteelMallet;
import com.suatae.mechinasmagick.client.renders.ir.IRToolStoneMallet;
import com.suatae.mechinasmagick.client.renders.ir.IRToolWoodMallet;
import com.suatae.mechinasmagick.client.renders.ir.blocks.IRAncientDoorB;
import com.suatae.mechinasmagick.client.renders.ir.blocks.IRAncientDoorT;
import com.suatae.mechinasmagick.client.renders.ir.blocks.IRAncientSeedContainer;
import com.suatae.mechinasmagick.client.renders.ir.blocks.IRBranch;
import com.suatae.mechinasmagick.client.renders.ir.blocks.IRCache;
import com.suatae.mechinasmagick.client.renders.ir.blocks.IRCasing;
import com.suatae.mechinasmagick.client.renders.ir.blocks.IRCatalyst;
import com.suatae.mechinasmagick.client.renders.ir.blocks.IROreE;
import com.suatae.mechinasmagick.client.renders.ir.blocks.flint.IRBlockFlint01;
import com.suatae.mechinasmagick.client.renders.ir.blocks.flint.IRBlockFlint02;
import com.suatae.mechinasmagick.client.renders.ir.blocks.flint.IRBlockFlint03;
import com.suatae.mechinasmagick.client.renders.ir.blocks.flint.IRBlockFlint04;
import com.suatae.mechinasmagick.common.init.BlockReg;
import com.suatae.mechinasmagick.common.init.ItemReg;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientContainer;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientDoorB;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientDoorT;
import com.suatae.mechinasmagick.common.tileentity.TileEntityBranch;
import com.suatae.mechinasmagick.common.tileentity.TileEntityCache;
import com.suatae.mechinasmagick.common.tileentity.TileEntityCatalyst;
import com.suatae.mechinasmagick.common.tileentity.TileEntityGoldCrop;
import com.suatae.mechinasmagick.common.tileentity.TileEntityIronCrop;
import com.suatae.mechinasmagick.common.tileentity.TileEntityOreE;
import com.suatae.mechinasmagick.common.tileentity.flint.TileEntityFlint01;
import com.suatae.mechinasmagick.common.tileentity.flint.TileEntityFlint02;
import com.suatae.mechinasmagick.common.tileentity.flint.TileEntityFlint03;
import com.suatae.mechinasmagick.common.tileentity.flint.TileEntityFlint04;
import com.suatae.mechinasmagick.common.tileentity.goldcasing.TileEntityCasing;

import cpw.mods.fml.client.registry.ClientRegistry;





public class ClientProxy extends CommonProxy {

	TileEntitySpecialRenderer	adb	= new TESRAncientDoorB();
	TileEntitySpecialRenderer	adt	= new TESRAncientDoorT();
	TileEntitySpecialRenderer	asc	= new TESRAncientSeedContainer();
	TileEntitySpecialRenderer	b	= new TESRBranch();
	TileEntitySpecialRenderer	c	= new TESRCatalyst();
	TileEntitySpecialRenderer	c1	= new TESRCasing();
	TileEntitySpecialRenderer	c2	= new TESRBlockCache();
	TileEntitySpecialRenderer	f1	= new TESRBlockFlint01();
	TileEntitySpecialRenderer	f2	= new TESRBlockFlint02();
	TileEntitySpecialRenderer	f3	= new TESRBlockFlint03();
	TileEntitySpecialRenderer	f4	= new TESRBlockFlint04();
	TileEntitySpecialRenderer	gc	= new TESRGoldCrop();
	TileEntitySpecialRenderer	ic	= new TESRIronCrop();
	TileEntitySpecialRenderer	o	= new TESROreE();

	@Override
	public void registerTESRender() {

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAncientContainer.class, asc);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAncientDoorB.class, adb);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAncientDoorT.class, adt);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBranch.class, b);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCatalyst.class, c);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCasing.class, c1);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCache.class, c2);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFlint01.class, f1);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFlint02.class, f2);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFlint03.class, f3);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFlint04.class, f4);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoldCrop.class, gc);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIronCrop.class, ic);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityOreE.class, o);

	}

	@Override
	public void registerItemRender() {

		// Items
		MinecraftForgeClient.registerItemRenderer(ItemReg.woodMallet, new IRToolWoodMallet());
		MinecraftForgeClient.registerItemRenderer(ItemReg.stoneMallet, new IRToolStoneMallet());
		MinecraftForgeClient.registerItemRenderer(ItemReg.ironsteelMallet,
				new IRToolIronSteelMallet());

		// Cache
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCache),
				new IRCache(c2, new TileEntityCache()));

		// Doors
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockADoorB),
				new IRAncientDoorB(adb, new TileEntityAncientDoorB()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockADoorT),
				new IRAncientDoorT(adt, new TileEntityAncientDoorT()));

		// Flints
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockFlint01),
				new IRBlockFlint01(f1, new TileEntityFlint01()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockFlint02),
				new IRBlockFlint02(f2, new TileEntityFlint02()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockFlint03),
				new IRBlockFlint03(f3, new TileEntityFlint03()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockFlint04),
				new IRBlockFlint04(f4, new TileEntityFlint04()));

		// Casing
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCasing),
				new IRCasing(c1, new TileEntityCasing()));

		// Crops
		// MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockAncientGold),
		// new IRGoldCrop(r2, new TileEntityGoldCrop()));
		// MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockAncientIron),
		// new IRIronCrop(r3, new TileEntityIronCrop()));

		// Other
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockASContainer),
				new IRAncientSeedContainer(asc, new TileEntityAncientContainer()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCatalyst),
				new IRCatalyst(c, new TileEntityCatalyst()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockBranch),
				new IRBranch(b, new TileEntityBranch()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.OREe), new IROreE(
				o, new TileEntityOreE()));

	}
}
