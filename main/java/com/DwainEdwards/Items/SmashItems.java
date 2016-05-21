package com.DwainEdwards.Items;

import com.DwainEdwards.CreativeTabs.SmashTabs;
import com.aggro.asma.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SmashItems {

	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}

	public static Item record_SariasSong;
	public static Item record_brawl;
	public static Item record_brinstar;
	public static Item record_darkpittheme;
	public static Item record_groundtheme;
	public static Item record_kappn;
	public static Item record_masterhand;
	public static Item record_megmanmedley;
	public static Item record_ocarinamedley;
	public static Item record_pacmantheme;
	public static Item record_pkmnbattle;
	public static Item record_sonicheroes;
	public static Item record_gerudovalley;
	public static Item record_creditsssb4;
	public static Item record_darklord;
	public static Item record_drmario;
	public static Item record_ywikon;
	public static Item record_wuhuisland;
	public static Item record_meleemenu;
	public static Item record_femaintheme;
	public static Item record_lumiosecity;
	public static Item record_livelearn;
	public static Item record_greengreens;
	
	public static Item miibullet;
	public static Item ssbshard;
	public static Item dollar;
	public static Item coin;
	
	public static Item MarioHat;
	public static Item LuigiHat;
	public static Item YoshiEgg;
	public static Item LinkHat;
	public static Item WishStar;
	public static Item bananapeel;
	public static Item ReflectPiece;
	public static Item PikachuTail;
	public static Item JigglyEars;
	public static Item SamusHelmet;
	public static Item NessHat;
	public static Item FalconEmblem;
	

	public static void initializeItem() {
		// basicitems
		ssbshard = new Item().setUnlocalizedName("ssbshard")
				.setCreativeTab(SmashTabs.tabBlock)
				.setTextureName(Main.MODID + ":ssbshard");
		dollar = new Item().setUnlocalizedName("dollar")
				.setCreativeTab(SmashTabs.tabBlock)
				.setTextureName(Main.MODID + ":dollar");

		coin = new Item().setUnlocalizedName("coin")
				.setCreativeTab(SmashTabs.tabBlock)
				.setTextureName(Main.MODID + ":coin");
		miibullet = new Item().setUnlocalizedName("miibullet")
				.setTextureName(Main.MODID + ":miibullet");

		//drops
		MarioHat = new Item().setUnlocalizedName("MarioHat")
				.setCreativeTab(SmashTabs.tabBlock).setTextureName(Main.MODID + ":MarioHat");
		
		LuigiHat = new Item().setUnlocalizedName("LuigiHat")
				.setCreativeTab(SmashTabs.tabBlock).setTextureName(Main.MODID + ":LuigiHat");
		
		YoshiEgg = new Item().setUnlocalizedName("YoshiEgg")
				.setCreativeTab(SmashTabs.tabBlock).setTextureName(Main.MODID + ":YoshiEgg");
		
		LinkHat = new Item().setUnlocalizedName("LinkHat")
				.setCreativeTab(SmashTabs.tabBlock).setTextureName(Main.MODID + ":LinkHat");
		
		WishStar = new Item().setUnlocalizedName("WishStar")
				.setCreativeTab(SmashTabs.tabBlock).setTextureName(Main.MODID + ":WishStar");
		
		bananapeel = new Item().setUnlocalizedName("bananapeel")
				.setCreativeTab(SmashTabs.tabBlock).setTextureName(Main.MODID + ":bananapeel");

		ReflectPiece = new Item().setUnlocalizedName("ReflectPiece")
				.setCreativeTab(SmashTabs.tabBlock).setTextureName(Main.MODID + ":ReflectPiece");
		
		PikachuTail = new Item().setUnlocalizedName("PikachuTail")
				.setCreativeTab(SmashTabs.tabBlock).setTextureName(Main.MODID + ":PikachuTail");
		
		JigglyEars = new Item().setUnlocalizedName("JigglyEars")
				.setCreativeTab(SmashTabs.tabBlock).setTextureName(Main.MODID + "JigglyEars");
		
		SamusHelmet = new Item().setUnlocalizedName("SamusHelmet")
				.setCreativeTab(SmashTabs.tabBlock).setTextureName(Main.MODID + ":SamusHelmet");
		
		NessHat = new Item().setUnlocalizedName("NessHat")
				.setCreativeTab(SmashTabs.tabBlock).setTextureName(Main.MODID + ":NessHat");
		
		FalconEmblem = new Item().setUnlocalizedName("FalconEmblem")
				.setCreativeTab(SmashTabs.tabBlock).setTextureName(Main.MODID + "FalconEmblem");
		
		// records
		record_SariasSong = new MusicDisc("SariasSong").setUnlocalizedName(
				"SariasSong").setCreativeTab(SmashTabs.tabrecords);
		record_brawl = new MusicDisc("brawl").setUnlocalizedName("brawl")
				.setCreativeTab(SmashTabs.tabrecords);
		record_brinstar = new MusicDisc("brinstar").setUnlocalizedName(
				"brinstar").setCreativeTab(SmashTabs.tabrecords);
		record_darkpittheme = new MusicDisc("darkpittheme").setUnlocalizedName(
				"darkpittheme").setCreativeTab(SmashTabs.tabrecords);
		record_groundtheme = new MusicDisc("groundtheme").setUnlocalizedName(
				"groundtheme").setCreativeTab(SmashTabs.tabrecords);
		record_kappn = new MusicDisc("kappn").setUnlocalizedName("kappn")
				.setCreativeTab(SmashTabs.tabrecords);
		record_masterhand = new MusicDisc("masterhand").setUnlocalizedName(
				"masterhand").setCreativeTab(SmashTabs.tabrecords);
		record_megmanmedley = new MusicDisc("megmanmedley").setUnlocalizedName(
				"megmanmedley").setCreativeTab(SmashTabs.tabrecords);
		record_megmanmedley = new MusicDisc("megmanmedley").setUnlocalizedName(
				"megmanmedley").setCreativeTab(SmashTabs.tabrecords);
		record_ocarinamedley = new MusicDisc("ocarinamedley")
				.setUnlocalizedName("ocarinamedley").setCreativeTab(
						SmashTabs.tabrecords);
		record_pacmantheme = new MusicDisc("pacmantheme").setUnlocalizedName(
				"pacmantheme").setCreativeTab(SmashTabs.tabrecords);
		record_pkmnbattle = new MusicDisc("pkmnbattle").setUnlocalizedName(
				"pkmnbattle").setCreativeTab(SmashTabs.tabrecords);
		record_sonicheroes = new MusicDisc("sonicheroes").setUnlocalizedName(
				"sonicheroes").setCreativeTab(SmashTabs.tabrecords);
		record_gerudovalley = new MusicDisc("gerudovalley").setUnlocalizedName(
				"gerudovalley").setCreativeTab(SmashTabs.tabrecords);
		record_creditsssb4 = new MusicDisc("creditsssb4").setUnlocalizedName(
				"creditsssb4").setCreativeTab(SmashTabs.tabrecords);
		record_darklord = new MusicDisc("darklord").setUnlocalizedName(
				"darklord").setCreativeTab(SmashTabs.tabrecords);
		record_drmario = new MusicDisc("drmario").setUnlocalizedName("drmario")
				.setCreativeTab(SmashTabs.tabrecords);
		record_ywikon = new MusicDisc("ywikon").setUnlocalizedName("ywikon")
				.setCreativeTab(SmashTabs.tabrecords);
		record_wuhuisland = new MusicDisc("wuhuisland").setUnlocalizedName(
				"wuhuisland").setCreativeTab(SmashTabs.tabrecords);
		record_meleemenu = new MusicDisc("meleemenu").setUnlocalizedName(
				"meleemenu").setCreativeTab(SmashTabs.tabrecords);
		record_femaintheme = new MusicDisc("femaintheme").setUnlocalizedName(
				"femaintheme").setCreativeTab(SmashTabs.tabrecords);
		record_lumiosecity = new MusicDisc("lumiosecity").setUnlocalizedName(
				"lumiosecity").setCreativeTab(SmashTabs.tabrecords);
		record_livelearn = new MusicDisc("livelearn").setUnlocalizedName(
				"livelearn").setCreativeTab(SmashTabs.tabrecords);
		record_greengreens = new MusicDisc("greengreens").setUnlocalizedName(
				"greengreens").setCreativeTab(SmashTabs.tabrecords);

		// seeds

	}

	public static void registerItem() {
		// items
				GameRegistry.registerItem(ssbshard, ssbshard.getUnlocalizedName());
				GameRegistry.registerItem(dollar, dollar.getUnlocalizedName());
				GameRegistry.registerItem(coin, coin.getUnlocalizedName());
				GameRegistry.registerItem(MarioHat, MarioHat.getUnlocalizedName());
				GameRegistry.registerItem(LuigiHat, LuigiHat.getUnlocalizedName());
				GameRegistry.registerItem(YoshiEgg, YoshiEgg.getUnlocalizedName());
				GameRegistry.registerItem(LinkHat, LinkHat.getUnlocalizedName());
				GameRegistry.registerItem(WishStar, WishStar.getUnlocalizedName());
				GameRegistry.registerItem(bananapeel, bananapeel.getUnlocalizedName());
				GameRegistry.registerItem(ReflectPiece, ReflectPiece.getUnlocalizedName());
				GameRegistry.registerItem(PikachuTail, PikachuTail.getUnlocalizedName());
				GameRegistry.registerItem(JigglyEars, JigglyEars.getUnlocalizedName());
				GameRegistry.registerItem(SamusHelmet, SamusHelmet.getUnlocalizedName());
				GameRegistry.registerItem(NessHat, NessHat.getUnlocalizedName());
				GameRegistry.registerItem(FalconEmblem, FalconEmblem.getUnlocalizedName());
		
		// records
		// menu
		GameRegistry.registerItem(record_brawl, "brawl");
		GameRegistry.registerItem(record_meleemenu, "meleemenu");
		GameRegistry.registerItem(record_masterhand, "masterhand");
		GameRegistry.registerItem(record_creditsssb4, "creditsssb4");

		// mario
		GameRegistry.registerItem(record_groundtheme, "groundtheme");
		GameRegistry.registerItem(record_drmario, "drmario");

		// legend of zelda
		GameRegistry.registerItem(record_SariasSong, "SariasSong");
		GameRegistry.registerItem(record_gerudovalley, "gerudovalley");
		GameRegistry.registerItem(record_ocarinamedley, "ocarinamedley");

		// metroid
		GameRegistry.registerItem(record_brinstar, "brinstar");

		// kidicarus
		GameRegistry.registerItem(record_darkpittheme, "darkpittheme");

		// pokemon
		GameRegistry.registerItem(record_pkmnbattle, "pkmnbattle");
		GameRegistry.registerItem(record_lumiosecity, "lumiosecity");

		// kirby
		GameRegistry.registerItem(record_greengreens, "greengreens");

		// xenoblade
		GameRegistry.registerItem(record_ywikon, "ywikon");

		// fireemblem
		GameRegistry.registerItem(record_femaintheme, "femaintheme");

		// animal crossing
		GameRegistry.registerItem(record_kappn, "kappn");

		// sonic
		GameRegistry.registerItem(record_sonicheroes, "sonicheroes");
		GameRegistry.registerItem(record_livelearn, "livelearn");
		// pacman
		GameRegistry.registerItem(record_pacmantheme, "pacmantheme");

		// megaman
		GameRegistry.registerItem(record_megmanmedley, "megmanmedley");

		// miis
		GameRegistry.registerItem(record_darklord, "darklord");
		GameRegistry.registerItem(record_wuhuisland, "wuhuisland");
	}
}
