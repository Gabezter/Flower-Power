package com.gabezter4.Flower_Power;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

public class ScoreBoards {
	
	Main plugin;

	ScoreboardManager manager = Bukkit.getScoreboardManager();
	Scoreboard board = manager.getNewScoreboard();
	Team team = board.registerNewTeam("Flower Points");
	Objective objective = board.registerNewObjective("points", "null");
	Score score;
	Score time = objective.getScore(Bukkit.getOfflinePlayer(ChatColor.RED + "Time Left - " + (plugin.gameTimer/20) + " seconds"));

	public void ScoreBoard(Player player) {
		objective.setDisplayName("Flower Points");
		objective.setDisplaySlot(DisplaySlot.SIDEBAR);
		team.setAllowFriendlyFire(false);
		team.addPlayer(player);
		score = objective.getScore(Bukkit.getOfflinePlayer(ChatColor.RED + player.getName()));
		score.setScore(0);
		time.setScore(-1);

	}
}
