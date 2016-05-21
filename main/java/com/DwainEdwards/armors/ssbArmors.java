package com.DwainEdwards.armors;

import net.minecraft.item.Item;

import com.DwainEdwards.CreativeTabs.SmashTabs;
import com.aggro.asma.Main;

import cpw.mods.fml.common.registry.GameRegistry;

public class ssbArmors {

	
	public static void mainRegistry() {
		initializeItems();
		registerItems();
	}
	public static Item marioHelmet;
	public static Item marioChestplate;
    public static Item marioLeggings;
    public static Item marioBoots;
    
    public static Item linkHelmet;
    public static Item linkChestplate;
    public static Item linkLeggings;
    public static Item linkBoots;
    
    public static Item ylinkHelmet;
    public static Item ylinkChestplate;
    public static Item ylinkLeggings;
    public static Item ylinkBoots;
    
	
	public static void initializeItems() {
		 marioHelmet = new ItemmarioArmor(Main.marioArmorMaterial, 0, 0).setUnlocalizedName("ItemmarioHelmet").setTextureName("asma:mariohelmet").setCreativeTab(SmashTabs.tabnintendo);
         marioChestplate = new ItemmarioArmor(Main.marioArmorMaterial, 0, 1).setUnlocalizedName("ItemmarioChestplate").setTextureName("asma:mariochestplate").setCreativeTab(SmashTabs.tabnintendo);
         marioLeggings = new ItemmarioArmor(Main.marioArmorMaterial, 0, 2).setUnlocalizedName("ItemmarioLeggings").setTextureName("asma:marioleggings").setCreativeTab(SmashTabs.tabnintendo);
         marioBoots = new ItemmarioArmor(Main.marioArmorMaterial, 0, 3).setUnlocalizedName("ItemmarioBoots").setTextureName("asma:marioboots").setCreativeTab(SmashTabs.tabnintendo);
         
         linkHelmet = new ItemlinkArmor(Main.linkArmorMaterial, 0, 0).setUnlocalizedName("ItemlinkHelmet").setTextureName("asma:linkhelmet").setCreativeTab(SmashTabs.tabnintendo);
         linkChestplate = new ItemlinkArmor(Main.linkArmorMaterial, 0, 1).setUnlocalizedName("ItemlinkChestplate").setTextureName("asma:linkchesplate").setCreativeTab(SmashTabs.tabnintendo);
         linkLeggings = new ItemlinkArmor(Main.linkArmorMaterial, 0, 2).setUnlocalizedName("ItemlinkLeggings").setTextureName("asma:linkleggings").setCreativeTab(SmashTabs.tabnintendo);
         linkBoots = new ItemlinkArmor(Main.linkArmorMaterial, 0, 3).setUnlocalizedName("ItemlinkBoots").setTextureName("asma:linkboots").setCreativeTab(SmashTabs.tabnintendo);
         
         ylinkHelmet = new ItemylinkArmor(Main.linkArmorMaterial, 0, 0).setUnlocalizedName("ItemylinkHelmet").setTextureName("asma:ylinkhelmet").setCreativeTab(SmashTabs.tabnintendo);
         ylinkChestplate = new ItemylinkArmor(Main.linkArmorMaterial, 0, 1).setUnlocalizedName("ItemylinkChestplate").setTextureName("asma:ylinkchesplate").setCreativeTab(SmashTabs.tabnintendo);
         ylinkLeggings = new ItemylinkArmor(Main.linkArmorMaterial, 0, 2).setUnlocalizedName("ItemylinkLeggings").setTextureName("asma:ylinkleggings").setCreativeTab(SmashTabs.tabnintendo);
         ylinkBoots = new ItemylinkArmor(Main.linkArmorMaterial, 0, 3).setUnlocalizedName("ItemylinkBoots").setTextureName("asma:ylinkboots").setCreativeTab(SmashTabs.tabnintendo);
         
	}
	
	public static void registerItems() {
		GameRegistry.registerItem((Item)marioHelmet, (String)marioHelmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem((Item)marioChestplate, (String)marioChestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem((Item)marioLeggings, (String)marioLeggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem((Item)marioBoots, (String)marioBoots.getUnlocalizedName().substring(5));
        
        GameRegistry.registerItem((Item)linkHelmet, (String)linkHelmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem((Item)linkChestplate, (String)linkChestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem((Item)linkLeggings, (String)linkLeggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem((Item)linkBoots, (String)linkBoots.getUnlocalizedName().substring(5));
        
        GameRegistry.registerItem((Item)ylinkHelmet, (String)ylinkHelmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem((Item)ylinkChestplate, (String)ylinkChestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem((Item)ylinkLeggings, (String)ylinkLeggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem((Item)ylinkBoots, (String)ylinkBoots.getUnlocalizedName().substring(5));
        
        
	}
	
}
