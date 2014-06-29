package com.gabezter4.Flower_Power.Commands.Admin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gabezter4.Flower_Power.Main;

public class Postion implements CommandExecutor {

	
	Main plugin;
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {

		Player player = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("fp pos 1")) {
			if (sender.hasPermission("fp.pos1")) {
				if (sender.hasPermission("fp.admin")) {
					plugin.getConfig().set("Arena.World",
							player.getLocation().getWorld());
					plugin.getConfig().set("Arena.1.X", player.getLocation().getX());
					plugin.getConfig().set("Arena.1.Z", player.getLocation().getZ());
					return true;
				}
			}
		}
		if (cmd.getName().equalsIgnoreCase("fb pos 2")) {
			if (sender.hasPermission("fp.pos2")) {
				if (sender.hasPermission("fp.admin")) {
					plugin.getConfig().set("Arena.World",
							player.getLocation().getWorld());
					plugin.getConfig().set("Arena.2.X", player.getLocation().getX());
					plugin.getConfig().set("Arena.2.Z", player.getLocation().getZ());
					return true;
				}
			}
		}

		return false;
	}
}
