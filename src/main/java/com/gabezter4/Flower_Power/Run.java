package com.gabezter4.Flower_Power;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class Run extends BukkitRunnable {

	Main plugin;

	public Run(Main plugin) {
		this.plugin = plugin;
	}

	Player player;

	@Override
	public void run() {
		if (plugin.gameGoing == false && plugin.gameEnd == false) {
			while (plugin.inGame.size() < plugin.getConfig().getInt(
					"Player amount before autoStart")) {
				BukkitTask task = new MessageBroadCast().runTaskLater(
						this.plugin, 1200);
				plugin.sb.ScoreBoard(player);
			}
		}
		if (plugin.gameGoing = true && (plugin.gameEnd = false)) {

			for (int i = 0; i > plugin.inGame.size(); i++) {
				player = plugin.inGame.get(i);
				plugin.sb.ScoreBoard(player);
				player.setScoreboard(plugin.sb.board);
			}

			if (plugin.roundGoing = false) {
				plugin.beforeTimer(plugin.getConfig().getInt(
						"Between Round Timer") * 20);
			}

			if (plugin.roundGoing = true) {
				plugin.gameTimer(plugin.getConfig().getInt(
						"Time for each round(in seconds)") * 20);

				
				if (plugin.inGame.contains(player)) {
					while (plugin.roundGoing = true) {
						if (plugin.a == 0) {
							player.sendMessage(ChatColor.RED + "["
									+ ChatColor.GREEN + "Flower Power"
									+ ChatColor.RED + "] " + ChatColor.RED
									+ "The flower you are looking for is the"
									+ ChatColor.RED + " Poppy" + ChatColor.RED
									+ "!");
							plugin.flower = 1;
							plugin.gen.arena();

						}
						if (plugin.a == 1) {
							player.sendMessage(ChatColor.RED + "["
									+ ChatColor.GREEN + "Flower Power"
									+ ChatColor.RED + "] " + ChatColor.RED
									+ "The flower you are looking for is the"
									+ ChatColor.RED + " Dandelion"
									+ ChatColor.RED + "!");
							plugin.flower = 2;
							plugin.gen.arena();
						}
						if (plugin.a == 2) {
							player.sendMessage(ChatColor.RED + "["
									+ ChatColor.GREEN + "Flower Power"
									+ ChatColor.RED + "] " + ChatColor.RED
									+ "The flower you are looking for is the"
									+ ChatColor.RED + " Allium" + ChatColor.RED
									+ "!");
							plugin.flower = 3;
							plugin.gen.arena();
						}
						if (plugin.a == 3) {
							player.sendMessage(ChatColor.RED + "["
									+ ChatColor.GREEN + "Flower Power"
									+ ChatColor.RED + "] " + ChatColor.RED
									+ "The flower you are looking for is the"
									+ ChatColor.RED + " Azure Bluet"
									+ ChatColor.RED + "!");
							plugin.flower = 4;
							plugin.gen.arena();
						}
						if (plugin.a == 4) {
							player.sendMessage(ChatColor.RED + "["
									+ ChatColor.GREEN + "Flower Power"
									+ ChatColor.RED + "] " + ChatColor.RED
									+ "The flower you are looking for is the"
									+ ChatColor.RED + " Blue Orchid"
									+ ChatColor.RED + "!");
							plugin.flower = 5;
							plugin.gen.arena();
						}
						if (plugin.a == 5) {
							player.sendMessage(ChatColor.RED + "["
									+ ChatColor.GREEN + "Flower Power"
									+ ChatColor.RED + "] " + ChatColor.RED
									+ "The flower you are looking for is the"
									+ ChatColor.RED + " Lilac" + ChatColor.RED
									+ "!");
							plugin.flower = 6;
							plugin.gen.arena();
						}
						if (plugin.a == 6) {
							player.sendMessage(ChatColor.RED + "["
									+ ChatColor.GREEN + "Flower Power"
									+ ChatColor.RED + "] " + ChatColor.RED
									+ "The flower you are looking for is the"
									+ ChatColor.RED + " Orange Tulip"
									+ ChatColor.RED + "!");
							plugin.flower = 7;
							plugin.gen.arena();
						}
						if (plugin.a == 7) {
							player.sendMessage(ChatColor.RED + "["
									+ ChatColor.GREEN + "Flower Power"
									+ ChatColor.RED + "] " + ChatColor.RED
									+ "The flower you are looking for is the"
									+ ChatColor.RED + " Oxeye Daisy"
									+ ChatColor.RED + "!");
							plugin.flower = 8;
							plugin.gen.arena();
						}
						if (plugin.a == 8) {
							player.sendMessage(ChatColor.RED + "["
									+ ChatColor.GREEN + "Flower Power"
									+ ChatColor.RED + "] " + ChatColor.RED
									+ "The flower you are looking for is the"
									+ ChatColor.RED + " Peony" + ChatColor.RED
									+ "!");
							plugin.flower = 9;
							plugin.gen.arena();
						}
						if (plugin.a == 9) {
							player.sendMessage(ChatColor.RED + "["
									+ ChatColor.GREEN + "Flower Power"
									+ ChatColor.RED + "] " + ChatColor.RED
									+ "The flower you are looking for is the"
									+ ChatColor.RED + " Pink Tulip"
									+ ChatColor.RED + "!");
							plugin.flower = 10;
							plugin.gen.arena();
						}
						if (plugin.a == 10) {
							player.sendMessage(ChatColor.RED + "["
									+ ChatColor.GREEN + "Flower Power"
									+ ChatColor.RED + "] " + ChatColor.RED
									+ "The flower you are looking for is the"
									+ ChatColor.RED + " Red Tulip"
									+ ChatColor.RED + "!");
							plugin.flower = 11;
							plugin.gen.arena();
						}
						if (plugin.a == 11) {
							player.sendMessage(ChatColor.RED + "["
									+ ChatColor.GREEN + "Flower Power"
									+ ChatColor.RED + "] " + ChatColor.RED
									+ "The flower you are looking for is the"
									+ ChatColor.RED + " Rose Bush"
									+ ChatColor.RED + "!");
							plugin.flower = 12;
							plugin.gen.arena();
						}
						if (plugin.a == 12) {
							player.sendMessage(ChatColor.RED + "["
									+ ChatColor.GREEN + "Flower Power"
									+ ChatColor.RED + "] " + ChatColor.RED
									+ "The flower you are looking for is the"
									+ ChatColor.RED + " SunFlower"
									+ ChatColor.RED + "!");
							plugin.flower = 13;
							plugin.gen.arena();
						}
						if (plugin.a == 13) {
							player.sendMessage(ChatColor.RED + "["
									+ ChatColor.GREEN + "Flower Power"
									+ ChatColor.RED + "] " + ChatColor.RED
									+ "The flower you are looking for is the"
									+ ChatColor.RED + " White Tulip"
									+ ChatColor.RED + "!");
							plugin.flower = 14;
							plugin.gen.arena();
						}

					}
				}
			}
		}
		if (plugin.gameEnd = true) {
			if (plugin.inGame.contains(player.getName())) {
				Location world = Bukkit
						.getServer()
						.getWorld(plugin.b.getConfig().getString("Arena.World"))
						.getSpawnLocation();
				player.teleport(world);
			}
		}

	}
}