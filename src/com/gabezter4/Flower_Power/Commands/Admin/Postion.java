package com.gabezter4.Flower_Power.Commands.Admin;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.gabezter4.Flower_Power.Main;

public class Postion implements CommandExecutor {

	
	Main plugin;
	Location loc;
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("fp pos 1")) {
			if (sender.hasPermission("fp.pos1")) {
				if (sender.hasPermission("fp.admin")) {
					plugin.getConfig().set("Arena.1.X", loc.getBlockX());
					plugin.getConfig().set("Arena.1.Z", loc.getBlockZ());
					return true;
				}
			}
		}
		if (cmd.getName().equalsIgnoreCase("fb pos 2")) {
			if (sender.hasPermission("fp.pos2")) {
				if (sender.hasPermission("fp.admin")) {
					plugin.getConfig().set("Arena.2.X", loc.getBlockX());
					plugin.getConfig().set("Arena.2.Z", loc.getBlockZ());
					return true;
				}
			}
		}

		return false;
	}
}
