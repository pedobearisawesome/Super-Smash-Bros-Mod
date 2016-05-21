package com.DwainEdwards.CreativeTabs;

import com.DwainEdwards.Items.SmashItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabcharacters extends CreativeTabs {

	public CreativeTabcharacters(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return SmashItems.ssbshard;
	}

}
