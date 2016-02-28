package com.gabezter4.Flower_Power.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

public class MessageBroadCast extends BukkitRunnable {

	Main plugin;

	@Override
	public void run() {
		Bukkit.getServer().broadcastMessage(
				plugin.title + "A game is currently waiting for players. Do"
						+ ChatColor.WHITE + " /fp join" + ChatColor.RED
						+ " to join the game.");

	}

}
