package com.DwainEdwards.CreativeTabs;

import com.DwainEdwards.Items.SmashItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabrecords extends CreativeTabs {

	public CreativeTabrecords(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return SmashItems.record_SariasSong;
	}

}
