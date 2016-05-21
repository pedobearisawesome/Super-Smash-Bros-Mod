package com.DwainEdwards.Entity;

import java.util.Random;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.aggro.asma.Main;

import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityHandler {

	public static void registerSmash(Class entityClass, String name, int entityId) {
		long x = name.hashCode();
		Random random = new Random(x);
		int mainColor = random.nextInt() * 1677215;
		int subColor = random.nextInt() * 1677215;
		
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityId);
		EntityRegistry.addSpawn(entityClass, 1, 1, 1, EnumCreatureType.ambient, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.plains,
				BiomeGenBase.desertHills, BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.desertHills, BiomeGenBase.forestHills,
				BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.jungle, BiomeGenBase.jungleEdge, BiomeGenBase.jungleHills);
		EntityRegistry.registerModEntity(entityClass, name, entityId, Main.modInstance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId,  mainColor, subColor));
	}
}
