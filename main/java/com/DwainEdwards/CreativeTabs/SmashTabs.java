package com.DwainEdwards.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;

public class SmashTabs {

	public static CreativeTabs tabBlock;
	public static CreativeTabs tabWeapons;
	public static CreativeTabs tabcharacters;
	public static CreativeTabs tabtrophies;
	public static CreativeTabs tabrecords;
	public static CreativeTabs tabnintendo;
	public static CreativeTabs tabthirdparty;

	public static void initialiseTabs() {
		tabBlock = new CreativeTabBlock("BlockTab");
		//tabWeapons = new CreativeTabweapons("WeaponTab");
		//tabcharacters = new CreativeTabcharacters("CharacterTab");
		//tabtrophies = new CreativeTabtrophies("TrophiesTab");
		tabrecords = new CreativeTabrecords("RecordsTab");
		tabnintendo = new CreativeTabNintendo("NintendoTab");
		//tabthirdparty = new CreativeTabThirdParty("ThirdPartyTab");
	}
}