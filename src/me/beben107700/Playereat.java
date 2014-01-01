package me.beben107700;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class Playereat implements Listener{
	
	private Main plugin;
	public Playereat(Main m){
		plugin = m;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	@EventHandler
	public void onPlayerClick(PlayerInteractEvent event){
		
		Player p = event.getPlayer();
		
		if(p.getItemInHand().getType() == Material.COOKED_BEEF && p.getHealth() != 20){
						
			

			
			if(p.getItemInHand().getAmount() == 1 ){
				p.getItemInHand().setType(Material.STRING);
			}else{
				p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
			}
			
			
			if(p.getHealth() <= 12){
				p.setHealth(p.getHealth() + 8);
			}
			else{
				p.setHealth(20);
			}
		}
	}

}
