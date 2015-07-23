package com.gabezter4.Flower_Power;

import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

public class MessageBroadCast extends BukkitRunnable {

	Main plugin;

	@Override
	public void run() {
		plugin.getServer().broadcastMessage(
				ChatColor.RED + "[" + ChatColor.GREEN + "Flower Power"
						+ ChatColor.RED + "] "
						+ "A game is currently waiting for players. Do"
						+ ChatColor.WHITE + " /fp join" + ChatColor.RED
						+ " to join the game.");

	}

}
