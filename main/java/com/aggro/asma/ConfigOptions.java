package com.aggro.asma;

import net.minecraftforge.common.config.Configuration;

public class ConfigOptions {

	
	public static Configuration config;
	
	public static boolean PlayerModels = false;
	public static boolean armors = true;
	public static boolean doublejump = true;
	
	public static void loadConfig() {
		config.load();
		PlayerModels = config.getBoolean("PlayerModels", "Player", PlayerModels, "If this is true player will act weird and not work properly due to unfinished work. DO NOT TURN ON");
		armors = config.getBoolean("armors", "Accessories", armors, "if this is true armors will be on for the player.");
		doublejump = config.getBoolean("doublejump", "Accessories", doublejump, "If this is true the player will be able to double jump in game");
		config.save();
	}
	
}
