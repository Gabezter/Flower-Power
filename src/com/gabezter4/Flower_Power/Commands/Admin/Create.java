package com.gabezter4.Flower_Power.Commands.Admin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.gabezter4.Flower_Power.Main;

public class Create implements CommandExecutor {
	Main plugin;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (cmd.getName().equalsIgnoreCase("fp create")) {
			plugin.getConfig().set(null, args[0]);
			return true;
		}

		return false;
	}

}
