package me.beben107700;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Hungerlock implements CommandExecutor{
	private Main plugin;
	public Hungerlock(Main plugn){
		plugin = plugn;
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		if(sender instanceof Player){
			Player p = (Player)sender;
			p.setFoodLevel(15);
			
			if(plugin.getConfig().getBoolean(p.getName())){
			plugin.getConfig().set(p.getName(), false);
			p.sendMessage("Food level unlocked");
			plugin.saveConfig();
			}
			else{
				plugin.getConfig().set(p.getName(), true);
				p.sendMessage("food level locked");
				plugin.saveConfig();
			}
			return true;
		}
		else{
			sender.sendMessage("Only a player could execute this command");
			return true;
		}
	}

}
