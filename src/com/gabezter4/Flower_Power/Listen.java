package com.gabezter4.Flower_Power;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Listen implements Listener {

	Main plugin;

	@EventHandler
	public void onPlayerMove(PlayerMoveEvent e) {
		if (e.getPlayer().getLocation().getBlockX() == plugin.getConfig()
				.getDouble("Arnea.1.X")) {
			e.setCancelled(true);
		}
		if (e.getPlayer().getLocation().getBlockX() == plugin.getConfig()
				.getDouble("Arnea.2.X")) {
			e.setCancelled(true);
		}
		if (e.getPlayer().getLocation().getBlockZ() == plugin.getConfig()
				.getDouble("Arnea.1.Z")) {
			e.setCancelled(true);
		}
		if (e.getPlayer().getLocation().getBlockZ() == plugin.getConfig()
				.getDouble("Arnea.2.Z")) {
			e.setCancelled(true);
		}
	}
}
