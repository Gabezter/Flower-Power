package com.gabezter4.Flower_Power;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class Run extends BukkitRunnable {

	Main plugin;

	public Run() {
		run();
	}

	Player player;
	String playerName = player.getName();
	public int a = plugin.RandomNumber(14);

	@Override
	public void run() {
		if (plugin.gameGoing = false) {
			while (plugin.inGame.size() < plugin.getConfig().getInt("Player amount before autoStart")) {
				BukkitTask task = new MessageBroadCast().runTaskLater(this.plugin, 1200);
			}
		}
		if (plugin.gameGoing = true) {
			if (plugin.inGame.contains(playerName)) {
				plugin.playing.add(plugin.inGame.toString());
				if (a == 0) {
					plugin.gen.arena();
					player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
							+ "Flower Power" + ChatColor.RED + "] "
							+ ChatColor.RED
							+ "The flower you are looking for is the"
							+ ChatColor.RED + " Poppy" + ChatColor.RED + "!");
					plugin.flower = 1;
					plugin.gen.arena();

				}
				if (a == 1) {
					player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
							+ "Flower Power" + ChatColor.RED + "] "
							+ ChatColor.RED
							+ "The flower you are looking for is the"
							+ ChatColor.RED + " Dandelion" + ChatColor.RED
							+ "!");
					plugin.flower = 2;
					plugin.gen.arena();
				}
				if (a == 2) {
					player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
							+ "Flower Power" + ChatColor.RED + "] "
							+ ChatColor.RED
							+ "The flower you are looking for is the"
							+ ChatColor.RED + " Allium" + ChatColor.RED + "!");
					plugin.flower = 3;
					plugin.gen.arena();
				}
				if (a == 3) {
					player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
							+ "Flower Power" + ChatColor.RED + "] "
							+ ChatColor.RED
							+ "The flower you are looking for is the"
							+ ChatColor.RED + " Azure Bluet" + ChatColor.RED
							+ "!");
					plugin.flower = 4;
					plugin.gen.arena();
				}
				if (a == 4) {
					player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
							+ "Flower Power" + ChatColor.RED + "] "
							+ ChatColor.RED
							+ "The flower you are looking for is the"
							+ ChatColor.RED + " Blue Orchid" + ChatColor.RED
							+ "!");
					plugin.flower = 5;
					plugin.gen.arena();
				}
				if (a == 5) {
					player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
							+ "Flower Power" + ChatColor.RED + "] "
							+ ChatColor.RED
							+ "The flower you are looking for is the"
							+ ChatColor.RED + " Lilac" + ChatColor.RED + "!");
					plugin.flower = 6;
					plugin.gen.arena();
				}
				if (a == 6) {
					player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
							+ "Flower Power" + ChatColor.RED + "] "
							+ ChatColor.RED
							+ "The flower you are looking for is the"
							+ ChatColor.RED + " Orange Tulip" + ChatColor.RED
							+ "!");
					plugin.flower = 7;
					plugin.gen.arena();
				}
				if (a == 7) {
					player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
							+ "Flower Power" + ChatColor.RED + "] "
							+ ChatColor.RED
							+ "The flower you are looking for is the"
							+ ChatColor.RED + " Oxeye Daisy" + ChatColor.RED
							+ "!");
					plugin.flower = 8;
					plugin.gen.arena();
				}
				if (a == 8) {
					player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
							+ "Flower Power" + ChatColor.RED + "] "
							+ ChatColor.RED
							+ "The flower you are looking for is the"
							+ ChatColor.RED + " Peony" + ChatColor.RED + "!");
					plugin.flower = 9;
					plugin.gen.arena();
				}
				if (a == 9) {
					player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
							+ "Flower Power" + ChatColor.RED + "] "
							+ ChatColor.RED
							+ "The flower you are looking for is the"
							+ ChatColor.RED + " Pink Tulip" + ChatColor.RED
							+ "!");
					plugin.flower = 10;
					plugin.gen.arena();
				}
				if (a == 10) {
					player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
							+ "Flower Power" + ChatColor.RED + "] "
							+ ChatColor.RED
							+ "The flower you are looking for is the"
							+ ChatColor.RED + " Red Tulip" + ChatColor.RED
							+ "!");
					plugin.flower = 11;
					plugin.gen.arena();
				}
				if (a == 11) {
					player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
							+ "Flower Power" + ChatColor.RED + "] "
							+ ChatColor.RED
							+ "The flower you are looking for is the"
							+ ChatColor.RED + " Rose Bush" + ChatColor.RED
							+ "!");
					plugin.flower = 12;
					plugin.gen.arena();
				}
				if (a == 12) {
					player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
							+ "Flower Power" + ChatColor.RED + "] "
							+ ChatColor.RED
							+ "The flower you are looking for is the"
							+ ChatColor.RED + " SunFlower" + ChatColor.RED
							+ "!");
					plugin.flower = 13;
					plugin.gen.arena();
				}
				if (a == 13) {
					player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
							+ "Flower Power" + ChatColor.RED + "] "
							+ ChatColor.RED
							+ "The flower you are looking for is the"
							+ ChatColor.RED + " White Tulip" + ChatColor.RED
							+ "!");
					plugin.flower = 14;
					plugin.gen.arena();
				}

			}
		}
	}

}
