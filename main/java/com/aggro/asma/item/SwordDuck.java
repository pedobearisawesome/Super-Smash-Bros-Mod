package com.aggro.asma.item;

import com.aggro.asma.Main;
import com.aggro.asma.entity.EntityDisc;
import com.aggro.asma.entity.render.RenderPlayerN;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.stats.AchievementList;
import net.minecraft.world.World;

public class SwordDuck  extends ItemSword{
	
	public SwordDuck(Item.ToolMaterial mat){
		super(mat);
		this.setUnlocalizedName("swordDuck");
		this.setCreativeTab(CreativeTabs.tabCombat);
		
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
			this.itemIcon = reg.registerIcon(Main.MODID + ":" + "itemDuckSword");
	}
	
	
	
}
