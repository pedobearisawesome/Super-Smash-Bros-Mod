package com.DwainEdwards.CreativeTabs;

import com.DwainEdwards.armors.ssbArmors;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabThirdParty extends CreativeTabs {

	public CreativeTabThirdParty(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ssbArmors.marioHelmet;
	}

}
