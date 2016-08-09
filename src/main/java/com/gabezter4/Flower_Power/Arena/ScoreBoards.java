package com.gabezter4.Flower_Power.Arena;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

import com.gabezter4.Flower_Power.Main.Main;

public class ScoreBoards {

	Main plugin;

	public ScoreboardManager manager;
	public Scoreboard board;
	public Team playTeam;
	public Team doneTeam;
	public Objective objective;
	public Score score;
	public Score time;

	public void ScoreBoard(Player player) {

		playTeam.addPlayer(player);
		playTeam.setPrefix(ChatColor.BLUE + "");
		time = objective.getScore(ChatColor.GREEN + "Time:");
		score = objective.getScore(player.getName());
		player.setScoreboard(board);
		score.setScore(1);
		time.setScore(15);

	}

	public void setupScoreboard() {

		manager = Bukkit.getScoreboardManager();
		board = manager.getNewScoreboard();
		playTeam = board.registerNewTeam("Playing");
		doneTeam = board.registerNewTeam("Done");
		objective = board.registerNewObjective("points", "dummy");
		objective.setDisplayName("Flower Power Points");
		objective.setDisplaySlot(DisplaySlot.SIDEBAR);

	}
}