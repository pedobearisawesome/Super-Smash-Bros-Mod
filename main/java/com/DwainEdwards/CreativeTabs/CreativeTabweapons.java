package com.DwainEdwards.CreativeTabs;

import com.DwainEdwards.Items.SmashItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabweapons extends CreativeTabs {

	public CreativeTabweapons(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return SmashItems.ssbshard;
	}

}
