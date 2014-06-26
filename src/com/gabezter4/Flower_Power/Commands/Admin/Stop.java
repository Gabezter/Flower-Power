package com.gabezter4.Flower_Power.Commands.Admin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Stop implements CommandExecutor  {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player player = (Player)sender;
		String playerName = player.getName();
		if(cmd.getName().equalsIgnoreCase("fp stop")){
			
			return true;
		}

		return false;
	}

}
