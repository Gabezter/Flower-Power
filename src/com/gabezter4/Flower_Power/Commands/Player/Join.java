package com.gabezter4.Flower_Power.Commands.Player;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gabezter4.Flower_Power.Main;

public class Join implements CommandExecutor {

	Main plugin;
	int playerCount =0;
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player player = (Player) sender;
		String playerName = player.getName();
		if (cmd.getName().equalsIgnoreCase("fp join")) {
			if (!(plugin.inGame.contains(playerName))) {
				plugin.inGame.add(playerName);
				playerCount++;
				if(playerCount == 1){
				plugin.getServer().broadcastMessage(ChatColor.GOLD + "["+ ChatColor.GREEN + "Flower Power" + ChatColor.GOLD + "] " + ChatColor.WHITE + playerName + ChatColor.RED + " has joined the "+ ChatColor.GREEN + "Flower Power" + ChatColor.RED + " arena, the arena now has " + ChatColor.GOLD + playerCount + " player.");
			}else{
				plugin.getServer().broadcastMessage(ChatColor.GOLD + "["+ ChatColor.GREEN + "Flower Power" + ChatColor.GOLD + "] " + ChatColor.WHITE + playerName + ChatColor.RED + " has joined the "+ ChatColor.GREEN + "Flower Power" + ChatColor.RED + " arena, the arena now has " + ChatColor.GOLD + playerCount + " players.");
			}} else {
				sender.sendMessage(ChatColor.RED + "You are already in game.");
			}
			return true;
		}

		return false;
	}

}
