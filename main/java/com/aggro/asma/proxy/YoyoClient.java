package com.aggro.asma.proxy;

import com.aggro.asma.Main;
import com.aggro.asma.entity.EntityYoyo;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderSnowball;

public class YoyoClient extends YoyoCommon{
	@Override
	public void registerRenderThings()
	{
	RenderingRegistry.registerEntityRenderingHandler(EntityYoyo.class, new RenderSnowball(Main.yoyo));
	}

	@Override
	public void registerSounds() {}
}
