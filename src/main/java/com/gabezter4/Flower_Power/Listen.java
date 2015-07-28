package com.gabezter4.Flower_Power;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Listen implements Listener {

	Main plugin;

	/*
	 * @EventHandler public void onPlayerMove(PlayerMoveEvent e) { if
	 * (!(plugin.sb.playTeam.hasPlayer(e.getPlayer()))) { if
	 * ((plugin.b.getConfig().get("Arena.Pos1.X", null) != null) &&
	 * (plugin.b.getConfig().get("Arena.Pos1.Z", null) != null) &&
	 * (plugin.b.getConfig().get("Arena.Pos2.X", null) != null) &&
	 * (plugin.b.getConfig().get("Arena.Pos2.Z", null) != null)) { if
	 * (e.getPlayer().getLocation().getBlockX() == plugin.b
	 * .getConfig().getInt("Arena.Pos1.X")) { e.setCancelled(true); } else {
	 * e.setCancelled(false); } if (e.getPlayer().getLocation().getBlockX() ==
	 * plugin.b .getConfig().getInt("Arena.Pos2.X")) { e.setCancelled(true); }
	 * else { e.setCancelled(false); } if
	 * (e.getPlayer().getLocation().getBlockZ() == plugin.b
	 * .getConfig().getInt("Arena.Pos1.Z")) { e.setCancelled(true); } else {
	 * e.setCancelled(false); } if (e.getPlayer().getLocation().getBlockZ() ==
	 * plugin.b .getConfig().getInt("Arena.Pos2.Z")) { e.setCancelled(true); }
	 * else { e.setCancelled(false); } } else { e.setCancelled(false); } } else
	 * { e.setCancelled(false); } }
	 */

	@EventHandler
	public void onBlockDrop(PlayerDropItemEvent e) {
		if (plugin.sb.playTeam.hasPlayer(e.getPlayer()) == true) {
			e.setCancelled(true);
		} else {
			e.setCancelled(false);
		}
		e.setCancelled(false);
	}

	@EventHandler
	public void onBlockBreak(BlockBreakEvent e) {
		// if (plugin.sb.playTeam.hasPlayer(e.getPlayer())) {
		// if (!(plugin.sb.doneTeam.hasPlayer(e.getPlayer()))) {
		if (plugin.flower == 1) {
			/*
			 * plugin.sb.playTeam.removePlayer(e.getPlayer());
			 * plugin.sb.doneTeam.addPlayer(e.getPlayer()); if
			 * (plugin.sb.doneTeam.getSize() == 1) {
			 * plugin.sb.score.setScore(plugin.sb.score.getScore() + 3); } else
			 * { plugin.sb.score.setScore(plugin.sb.score.getScore() + 1); }
			 */
			e.setCancelled(true);
			e.getBlock().setType(Material.AIR);
		}
		if (plugin.flower == 2) {
			plugin.sb.playTeam.removePlayer(e.getPlayer());
			plugin.sb.doneTeam.addPlayer(e.getPlayer());
			if (plugin.sb.doneTeam.getSize() == 1) {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 3);
			} else {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 1);
			}
			e.setCancelled(true);
			e.getBlock().setType(Material.AIR);
		}
		if (plugin.flower == 3) {
			plugin.sb.playTeam.removePlayer(e.getPlayer());
			plugin.sb.doneTeam.addPlayer(e.getPlayer());
			if (plugin.sb.doneTeam.getSize() == 1) {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 3);
			} else {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 1);
			}
			e.setCancelled(true);
			e.getBlock().setType(Material.AIR);
		}
		if (plugin.flower == 4) {
			plugin.sb.playTeam.removePlayer(e.getPlayer());
			plugin.sb.doneTeam.addPlayer(e.getPlayer());
			if (plugin.sb.doneTeam.getSize() == 1) {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 3);
			} else {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 1);
			}
			e.setCancelled(true);
			e.getBlock().setType(Material.AIR);
		}
		if (plugin.flower == 5) {
			plugin.sb.playTeam.removePlayer(e.getPlayer());
			plugin.sb.doneTeam.addPlayer(e.getPlayer());
			if (plugin.sb.doneTeam.getSize() == 1) {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 3);
			} else {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 1);
			}
			e.setCancelled(true);
			e.getBlock().setType(Material.AIR);
		}
		if (plugin.flower == 6) {
			plugin.sb.playTeam.removePlayer(e.getPlayer());
			plugin.sb.doneTeam.addPlayer(e.getPlayer());
			if (plugin.sb.doneTeam.getSize() == 1) {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 3);
			} else {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 1);
			}
			e.setCancelled(true);
			e.getBlock().setType(Material.AIR);
		}
		if (plugin.flower == 7) {
			plugin.sb.playTeam.removePlayer(e.getPlayer());
			plugin.sb.doneTeam.addPlayer(e.getPlayer());
			if (plugin.sb.doneTeam.getSize() == 1) {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 3);
			} else {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 1);
			}
			e.setCancelled(true);
			e.getBlock().setType(Material.AIR);
		}
		if (plugin.flower == 8) {
			plugin.sb.playTeam.removePlayer(e.getPlayer());
			plugin.sb.doneTeam.addPlayer(e.getPlayer());
			if (plugin.sb.doneTeam.getSize() == 1) {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 3);
			} else {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 1);
			}
			e.setCancelled(true);
			e.getBlock().setType(Material.AIR);
		}
		if (plugin.flower == 9) {
			plugin.sb.playTeam.removePlayer(e.getPlayer());
			plugin.sb.doneTeam.addPlayer(e.getPlayer());
			if (plugin.sb.doneTeam.getSize() == 1) {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 3);
			} else {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 1);
			}
			e.setCancelled(true);
			e.getBlock().setType(Material.AIR);
		}
		if (plugin.flower == 10) {
			plugin.sb.playTeam.removePlayer(e.getPlayer());
			plugin.sb.doneTeam.addPlayer(e.getPlayer());
			if (plugin.sb.doneTeam.getSize() == 1) {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 3);
			} else {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 1);
			}
			e.setCancelled(true);
			e.getBlock().setType(Material.AIR);
		}
		if (plugin.flower == 11) {
			plugin.sb.playTeam.removePlayer(e.getPlayer());
			plugin.sb.doneTeam.addPlayer(e.getPlayer());
			if (plugin.sb.doneTeam.getSize() == 1) {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 3);
			} else {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 1);
			}
			e.setCancelled(true);
			e.getBlock().setType(Material.AIR);
		}
		if (plugin.flower == 12) {
			plugin.sb.playTeam.removePlayer(e.getPlayer());
			plugin.sb.doneTeam.addPlayer(e.getPlayer());
			if (plugin.sb.doneTeam.getSize() == 1) {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 3);
			} else {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 1);
			}
			e.setCancelled(true);
			e.getBlock().setType(Material.AIR);
		}
		if (plugin.flower == 13) {
			plugin.sb.playTeam.removePlayer(e.getPlayer());
			plugin.sb.doneTeam.addPlayer(e.getPlayer());
			if (plugin.sb.doneTeam.getSize() == 1) {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 3);
			} else {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 1);
			}
			e.setCancelled(true);
			e.getBlock().setType(Material.AIR);
		}
		if (plugin.flower == 14) {
			plugin.sb.playTeam.removePlayer(e.getPlayer());
			plugin.sb.doneTeam.addPlayer(e.getPlayer());

			if (plugin.sb.doneTeam.getSize() == 1) {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 3);
			} else {
				plugin.sb.score.setScore(plugin.sb.score.getScore() + 1);
			}
			e.setCancelled(true);
			e.getBlock().setType(Material.AIR);
		}
		/*
		 * } else if (plugin.sb.doneTeam.hasPlayer(e.getPlayer())) {
		 * e.setCancelled(true); } else { e.setCancelled(false); } } else {
		 * e.setCancelled(false); }
		 */
		e.setCancelled(false);
	}
}