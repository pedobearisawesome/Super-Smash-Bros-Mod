package com.DwainEdwards.CreativeTabs;

import com.DwainEdwards.Blocks.SmashBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBlock extends CreativeTabs {

	public CreativeTabBlock(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(SmashBlocks.ssbBlock);
	}

}
