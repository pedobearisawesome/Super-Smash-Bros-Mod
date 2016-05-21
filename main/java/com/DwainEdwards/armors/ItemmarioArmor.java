package com.DwainEdwards.armors;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemmarioArmor
extends ItemArmor {
    public ItemmarioArmor(ArmorMaterial armourMaterial, int renderIndex, int armourType) {
        super(armourMaterial, renderIndex, armourType);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (this.armorType == 2) {
            return "asma:textures/models/armor/mario_layer_2.png";
        }
        return "asma:textures/models/armor/mario_layer_1.png";
    }

    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals((Object)ssbArmors.marioLeggings)
        		&& player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals((Object)ssbArmors.marioHelmet)
        		&& player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals((Object)ssbArmors.marioChestplate)
        		&& player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals((Object)ssbArmors.marioBoots)) {
        	 //player.addPotionEffect(new PotionEffect(Potion.jump.id, 200, 4));
        }
        player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 200, 2));
    }
}

