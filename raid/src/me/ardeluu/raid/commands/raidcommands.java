package me.ardeluu.raid.commands;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.Main;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class raidcommands implements CommandExecutor{
	private Main plugin ;
	
	public raidcommands(Main plugi) {
		
	
	this.plugin = plugin;
	plugin.getCommand("creepspawn").setExecutor(this) ;

	}
	
    
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    Player p = (Player) sender;
    Location loc = p.getLocation();
    World w = p.getWorld();
    
    for(int i = 0; i < 10; i++) {
    	w.spawnEntity(loc, EntityType.CREEPER);
    }
		
		return false; 
	}
}
