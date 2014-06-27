package com.gabezter4.Flower_Power;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

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

		if (plugin.inGame.contains(playerName)) {
			if (a == 0) {
				player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
						+ "Flower Power" + ChatColor.RED + "] "
						+ ChatColor.RED
						+ "The flower you are looking for is the"
						+ ChatColor.RED + " Poppy" + ChatColor.RED + "!");
			}
			if (a == 1) {
				player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
						+ "Flower Power" + ChatColor.RED + "] "
						+ ChatColor.RED
						+ "The flower you are looking for is the"
						+ ChatColor.RED + " Dandelion" + ChatColor.RED + "!");
			}
			if (a == 2) {
				player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
						+ "Flower Power" + ChatColor.RED + "] "
						+ ChatColor.RED
						+ "The flower you are looking for is the"
						+ ChatColor.RED + " Allium" + ChatColor.RED + "!");
			}
			if (a == 3) {
				player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
						+ "Flower Power" + ChatColor.RED + "] "
						+ ChatColor.RED
						+ "The flower you are looking for is the"
						+ ChatColor.RED + " Azure Bluet" + ChatColor.RED + "!");
			}
			if (a == 4) {
				player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
						+ "Flower Power" + ChatColor.RED + "] "
						+ ChatColor.RED
						+ "The flower you are looking for is the"
						+ ChatColor.RED + " Blue Orchid" + ChatColor.RED + "!");
			}
			if (a == 5) {
				player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
						+ "Flower Power" + ChatColor.RED + "] "
						+ ChatColor.RED
						+ "The flower you are looking for is the"
						+ ChatColor.RED + " Lilac" + ChatColor.RED + "!");
			}
			if (a == 6) {
				player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
						+ "Flower Power" + ChatColor.RED + "] "
						+ ChatColor.RED
						+ "The flower you are looking for is the"
						+ ChatColor.RED + " Orange Tulip" + ChatColor.RED
						+ "!");
			}
			if (a == 7) {
				player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
						+ "Flower Power" + ChatColor.RED + "] "
						+ ChatColor.RED
						+ "The flower you are looking for is the"
						+ ChatColor.RED + " Oxeye Daisy" + ChatColor.RED + "!");
			}
			if (a == 8) {
				player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
						+ "Flower Power" + ChatColor.RED + "] "
						+ ChatColor.RED
						+ "The flower you are looking for is the"
						+ ChatColor.RED + " Peony" + ChatColor.RED + "!");
			}
			if (a == 9) {
				player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
						+ "Flower Power" + ChatColor.RED + "] "
						+ ChatColor.RED
						+ "The flower you are looking for is the"
						+ ChatColor.RED + " Pink Tulip" + ChatColor.RED + "!");
			}
			if (a == 10) {
				player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
						+ "Flower Power" + ChatColor.RED + "] "
						+ ChatColor.RED
						+ "The flower you are looking for is the"
						+ ChatColor.RED + " Red Tulip" + ChatColor.RED + "!");
			}
			if (a == 11) {
				player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
						+ "Flower Power" + ChatColor.RED + "] "
						+ ChatColor.RED
						+ "The flower you are looking for is the"
						+ ChatColor.RED + " Rose Bush" + ChatColor.RED + "!");
			}
			if (a == 12) {
				player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
						+ "Flower Power" + ChatColor.RED + "] "
						+ ChatColor.RED
						+ "The flower you are looking for is the"
						+ ChatColor.RED + " SunFlower" + ChatColor.RED + "!");
			}
			if (a == 13) {
				player.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN
						+ "Flower Power" + ChatColor.RED + "] "
						+ ChatColor.RED
						+ "The flower you are looking for is the"
						+ ChatColor.RED + " White Tulip" + ChatColor.RED + "!");
			}

		}

	}

}
