package com.DwainEdwards.EventHandlers;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;

import org.lwjgl.input.Keyboard;

import com.DwainEdwards.armors.ItemylinkArmor;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class YLinkHandler {
	private boolean hasJumped;
	private int jumps;
	
	public YLinkHandler() {
		this.hasJumped = false;
		this.jumps = 0;
	}
	
	@SubscribeEvent
	public void onLivingUpdateEvent(final LivingEvent.LivingUpdateEvent event) {
		if (event.entity instanceof EntityPlayer) {
			final EntityPlayer player = (EntityPlayer)event.entity;
			if (player.worldObj.isRemote) {
				if (player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(1) != null 
						&& player.getCurrentArmor(0) != null) {
				if (player.getCurrentArmor(3).getItem() instanceof  ItemylinkArmor 
				&& player.getCurrentArmor(2).getItem() instanceof  ItemylinkArmor 
				&& player.getCurrentArmor(1).getItem() instanceof ItemylinkArmor
				&& player.getCurrentArmor(0).getItem() instanceof ItemylinkArmor) {
			}
				if (Keyboard.isKeyDown(57) && !Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen() && Minecraft.getMinecraft().currentScreen == null && player.isCollided) {
                    player.motionY = 0.6;
                    this.jumps++;
                }
                if (Minecraft.getMinecraft().gameSettings.keyBindJump.isPressed() && player.motionY < 0.07 && !this.hasJumped && this.jumps < 1 ) {
                    player.addVelocity(0.0, 0.9, 0.0);
                    this.jumps++;
                }
                if (this.jumps >= 1) {
                	this.hasJumped = true;
                }
                if (player.onGround) {
                    this.hasJumped = false;
                    this.jumps = 0;
                }
                final int var5 = MathHelper.floor_double(player.posX);
                final int var6 = MathHelper.floor_double(player.posY + 1.0);
                final int var7 = MathHelper.floor_double(player.posZ);
                if (Minecraft.getMinecraft().theWorld.getBlock(var5, var6, var7).getMaterial().isSolid()) {
                    if (Keyboard.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindJump.getKeyCode())) {
                        player.motionY = 0.1;
                    }
                    else {
                        final EntityPlayer entityPlayer = player;
                        entityPlayer.motionY *= 0.6;
                    }
                }
			}
		}
		}
	}
	
	@SubscribeEvent
	public void livingFall(LivingFallEvent event)
	{
	    if (!(event.entityLiving instanceof EntityPlayer)) return;
	    EntityPlayer eventPlayer = (EntityPlayer)event.entityLiving;
	    //Check if the damage should be removed
	    event.distance = 0F;
	}
	
	@SubscribeEvent
    public void tickPlayer(final TickEvent.PlayerTickEvent event) {
    }
}
