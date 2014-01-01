package me.beben107700;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class Foodlevelevent implements Listener{
	
	private Main plugin;
	public Foodlevelevent(Main m){
		plugin = m;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	@EventHandler
	public void onEat(FoodLevelChangeEvent event){
		if(event.getEntity() instanceof Player){
			Player p = (Player)event.getEntity();
			if(plugin.getConfig().getBoolean(p.getName())){
				event.setCancelled(true);
			}
		}
	}

}
