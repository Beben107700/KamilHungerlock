package me.beben107700;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public void onEnable(){
		
		this.saveDefaultConfig();
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		
		new Foodlevelevent(this);
		new Playereat(this);
		getCommand("hungerlock").setExecutor(new Hungerlock(this));
	}
	public void onDisable(){
		
	}

}
