package com.DwainEdwards.Items;

import java.util.List;

import com.aggro.asma.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class MusicDisc extends ItemRecord {
	String localName;

	protected MusicDisc(String name) {
		super("ssb:" + name);
		localName = name;
		this.setTextureName(Main.MODID + ":CD");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add(this.getRecordNameLocal());
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getRecordNameLocal() {
		return StatCollector.translateToLocal("record.record" + localName
				+ ".name");
	}

	@Override
	public ResourceLocation getRecordResource(String name) {
		return new ResourceLocation(Main.MODID + ":records." + name.substring(12));
	}
}