package com.aggro.asma.moves;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import com.aggro.asma.Main;

public class ItemGrab extends Item{
	public ItemGrab()
	{
	this.setUnlocalizedName("grab"); //Sets the name of this item, Has to be unique!
	this.setCreativeTab(CreativeTabs.tabCombat); //This Item will be in the Combat Creative Tab!
	this.setTextureName(Main.MODID + ":" + "Grab"); //The texture for this item is the Grenade!
	}

	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (!par2World.isRemote)
		{
			
			
			
		}
	return par1ItemStack;
	
	}
	public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
     
		return EnumAction.bow;
    }
	
	
	public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 72000;
    }
	
	public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
		
        return true;
    }

    
}
