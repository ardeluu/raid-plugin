package me.ardeluu.raid;

import org.bukkit.plugin.java.JavaPlugin;

import me.ardeluu.raid.commands.raidcommands;

public class Main extends JavaPlugin {

	@Override  
	public void onEnable() {
		new raidcommands(this);
	}
}
