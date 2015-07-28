package com.gabezter4.Flower_Power;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Listen implements Listener {

	Main plugin;
	
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent e) {
		if (!(plugin.inGame.contains(e.getPlayer().getName()))) {
			e.setCancelled(false);
		} else {
			if (plugin.b.getConfig().getConfigurationSection("Arnea") != null) {
				if (e.getPlayer().getLocation().getBlockX() == plugin.b
						.getConfig().getDouble("Arnea.1.X")) {
					e.setCancelled(true);
				}
				if (e.getPlayer().getLocation().getBlockX() == plugin.b
						.getConfig().getDouble("Arnea.2.X")) {
					e.setCancelled(true);
				}
				if (e.getPlayer().getLocation().getBlockZ() == plugin.b
						.getConfig().getDouble("Arnea.1.Z")) {
					e.setCancelled(true);
				}
				if (e.getPlayer().getLocation().getBlockZ() == plugin.b
						.getConfig().getDouble("Arnea.2.Z")) {
					e.setCancelled(true);
				}
			}
		}
	}

	@EventHandler
	public void onBlockDrop(PlayerDropItemEvent e) {
		if (plugin.inGame.contains(e.getPlayer().getName())) {
			e.setCancelled(true);
		} else {
			e.setCancelled(false);
		}
	}

	@EventHandler
	public void onBlockBreak(BlockBreakEvent e) {
		if (plugin.inGame.contains(e.getPlayer().getName())) {
			if (!(plugin.scored.contains(e.getPlayer().getName()))) {
				if (plugin.flower == 1) {
					plugin.playing.remove(e.getPlayer().getName());
					plugin.scored.add(e.getPlayer().getName());
					if (plugin.scored.size() == 1) {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 3);
					} else {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 1);
					}
					e.setCancelled(true);
					e.getBlock().setType(Material.AIR);
				}
				if (plugin.flower == 2) {
					plugin.playing.remove(e.getPlayer().getName());
					plugin.scored.add(e.getPlayer().getName());
					if (plugin.scored.size() == 1) {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 3);
					} else {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 1);
					}
					e.setCancelled(true);
					e.getBlock().setType(Material.AIR);
				}
				if (plugin.flower == 3) {
					plugin.playing.remove(e.getPlayer().getName());
					plugin.scored.add(e.getPlayer().getName());
					if (plugin.scored.size() == 1) {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 3);
					} else {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 1);
					}
					e.setCancelled(true);
					e.getBlock().setType(Material.AIR);
				}
				if (plugin.flower == 4) {
					plugin.playing.remove(e.getPlayer().getName());
					plugin.scored.add(e.getPlayer().getName());
					if (plugin.scored.size() == 1) {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 3);
					} else {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 1);
					}
					e.setCancelled(true);
					e.getBlock().setType(Material.AIR);
				}
				if (plugin.flower == 5) {
					plugin.playing.remove(e.getPlayer().getName());
					plugin.scored.add(e.getPlayer().getName());
					if (plugin.scored.size() == 1) {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 3);
					} else {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 1);
					}
					e.setCancelled(true);
					e.getBlock().setType(Material.AIR);
				}
				if (plugin.flower == 6) {
					plugin.playing.remove(e.getPlayer().getName());
					plugin.scored.add(e.getPlayer().getName());
					if (plugin.scored.size() == 1) {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 3);
					} else {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 1);
					}
					e.setCancelled(true);
					e.getBlock().setType(Material.AIR);
				}
				if (plugin.flower == 7) {
					plugin.playing.remove(e.getPlayer().getName());
					plugin.scored.add(e.getPlayer().getName());
					if (plugin.scored.size() == 1) {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 3);
					} else {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 1);
					}
					e.setCancelled(true);
					e.getBlock().setType(Material.AIR);
				}
				if (plugin.flower == 8) {
					plugin.playing.remove(e.getPlayer().getName());
					plugin.scored.add(e.getPlayer().getName());
					if (plugin.scored.size() == 1) {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 3);
					} else {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 1);
					}
					e.setCancelled(true);
					e.getBlock().setType(Material.AIR);
				}
				if (plugin.flower == 9) {
					plugin.playing.remove(e.getPlayer().getName());
					plugin.scored.add(e.getPlayer().getName());
					if (plugin.scored.size() == 1) {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 3);
					} else {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 1);
					}
					e.setCancelled(true);
					e.getBlock().setType(Material.AIR);
				}
				if (plugin.flower == 10) {
					plugin.playing.remove(e.getPlayer().getName());
					plugin.scored.add(e.getPlayer().getName());
					if (plugin.scored.size() == 1) {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 3);
					} else {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 1);
					}
					e.setCancelled(true);
					e.getBlock().setType(Material.AIR);
				}
				if (plugin.flower == 11) {
					plugin.playing.remove(e.getPlayer().getName());
					plugin.scored.add(e.getPlayer().getName());
					if (plugin.scored.size() == 1) {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 3);
					} else {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 1);
					}
					e.setCancelled(true);
					e.getBlock().setType(Material.AIR);
				}
				if (plugin.flower == 12) {
					plugin.playing.remove(e.getPlayer().getName());
					plugin.scored.add(e.getPlayer().getName());
					if (plugin.scored.size() == 1) {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 3);
					} else {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 1);
					}
					e.setCancelled(true);
					e.getBlock().setType(Material.AIR);
				}
				if (plugin.flower == 13) {
					plugin.playing.remove(e.getPlayer().getName());
					plugin.scored.add(e.getPlayer().getName());
					if (plugin.scored.size() == 1) {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 3);
					} else {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 1);
					}
					e.setCancelled(true);
					e.getBlock().setType(Material.AIR);
				}
				if (plugin.flower == 14) {
					plugin.playing.remove(e.getPlayer().getName());
					plugin.scored.add(e.getPlayer().getName());
					if (plugin.scored.size() == 1) {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 3);
					} else {
						plugin.sb.score
								.setScore(plugin.sb.score.getScore() + 1);
					}
					e.setCancelled(true);
					e.getBlock().setType(Material.AIR);
				}
			} else if (plugin.scored.contains(e.getPlayer().getName())) {
				e.setCancelled(true);
			} else {
				e.setCancelled(false);
			}
		}
	}
}