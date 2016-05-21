package com.DwainEdwards.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.DwainEdwards.CreativeTabs.SmashTabs;
import com.aggro.asma.Main;

import cpw.mods.fml.common.registry.GameRegistry;

public class SmashBlocks {

	public static void mainRegistry() {
		initializeBlock();
		registerBlock();
	}

	public static Block ssbBlock;
	public static Block ssbATM;

	private static void initializeBlock() {
		ssbBlock = new ssbBlock(Material.ground).setBlockName("ssbBlock")
				.setCreativeTab(SmashTabs.tabBlock)
				.setBlockTextureName(Main.MODID + ":ssbblock");
		//ssbATM = new ssbATM(Material.ground).setBlockName("ssbATM")
			//	.setCreativeTab(SmashTabs.tabBlock)
				//.setBlockTextureName(Main.MODID + ":ssbATMM");
	}

	private static void registerBlock() {
		GameRegistry.registerBlock(ssbBlock, ssbBlock.getUnlocalizedName());

		//GameRegistry.registerBlock(ssbATM, ssbATM.getUnlocalizedName());

		//GameRegistry.registerTileEntity(TileEntityssbATM.class, "tileEntityATM");
	}
}
