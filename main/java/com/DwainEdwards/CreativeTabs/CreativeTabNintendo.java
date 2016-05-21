package com.DwainEdwards.CreativeTabs;

import com.DwainEdwards.armors.ssbArmors;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabNintendo extends CreativeTabs {

	public CreativeTabNintendo(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ssbArmors.marioHelmet;
	}

}
