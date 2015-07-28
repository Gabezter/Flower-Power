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

	ScoreboardManager manager;
	Scoreboard board;
	Team team;
	Objective objective;
	Score score;
	Score time;

	public void ScoreBoard(Player player) {

			time = objective.getScore(ChatColor.GREEN + "Time:");
			score = objective.getScore(player.getName());
			score.setScore(0);
			time.setScore(15);
		
	}

	public void setupScoreboard() {

		manager = Bukkit.getScoreboardManager();
		board = manager.getNewScoreboard();
		objective = board.registerNewObjective("points", "dummy");
		objective.setDisplayName(ChatColor.WHITE + "Flower Points");
		objective.setDisplaySlot(DisplaySlot.SIDEBAR);
		objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
	}
}