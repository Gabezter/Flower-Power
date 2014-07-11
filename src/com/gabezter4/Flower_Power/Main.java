package com.gabezter4.Flower_Power;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.gabezter4.Flower_Power.Commands.Spectate;
import com.gabezter4.Flower_Power.Commands.Admin.Create;
import com.gabezter4.Flower_Power.Commands.Admin.Postion;
import com.gabezter4.Flower_Power.Commands.Admin.Start;
import com.gabezter4.Flower_Power.Commands.Admin.Stop;
import com.gabezter4.Flower_Power.Commands.Player.Join;
import com.gabezter4.Flower_Power.Commands.Player.Leave;

public class Main extends JavaPlugin {

	public Listen listen = new Listen();
	public Run run = new Run();
	public Leave leave = new Leave();
	public Spectate spec = new Spectate();
	public Create create = new Create();
	public Start start = new Start();
	public Stop stop = new Stop();
	public Join join = new Join();
	public Postion pos = new Postion();
	public Flower_Gen gen = new Flower_Gen();
	public ScoreBoards sb = new ScoreBoards();

	public File config = null;
	public FileConfiguration nc = null;

	@Override
	public void onEnable() {
		getCommand("fp leave").setExecutor(leave);
		getCommand("fp spec").setExecutor(spec);
		getCommand("fp create").setExecutor(create);
		getCommand("fp start").setExecutor(start);
		getCommand("fp stop").setExecutor(stop);
		getCommand("fp join").setExecutor(join);
		getCommand("fp pos 1").setExecutor(pos);
		getCommand("fp pos 2").setExecutor(pos);
		getCommand("fp spec set").setExecutor(spec);
		getServer().getPluginManager().registerEvents(listen, this);

		this.config = new File(this.getDataFolder(), "config.yml");
		this.nc = YamlConfiguration.loadConfiguration(config);

		if (!config.exists()) {
			this.getLogger().info("Gernerating the config.yml file...");
			nc.addDefault("Arena", "");
			nc.options().copyDefaults(true);
			try {
				nc.save(config);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void onDisable() {

	}

	public ArrayList<String> inGame = new ArrayList<String>();
	public ArrayList<String> playing = new ArrayList<String>();
	public ArrayList<String> scored = new ArrayList<String>();

	public boolean gameGoing = false;
	public boolean roundGoing = false;
	public boolean gameEnd = false;

	public int beforeTimer = 0;
	public int gameTimer = 0;
	public int flower = 0;

	public int rounds = 1;

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (cmd.getName().equalsIgnoreCase("fp")) {
			sender.sendMessage(ChatColor.RED + "/fp help  - Help Page");
			sender.sendMessage(ChatColor.RED + "/fp ahelp - Admin Help Page");
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("fp ahelp")) {
			sender.sendMessage(ChatColor.RED + "Flower Power Admin Help Page");
			sender.sendMessage(ChatColor.RED
					+ "/fp create [name] - Creates the arena name.");
			sender.sendMessage(ChatColor.RED
					+ "/fp setPos [1/2]  - Sets a corner of the areana");
			sender.sendMessage(ChatColor.RED
					+ "/fp stop          - Stops the game");
			sender.sendMessage(ChatColor.RED
					+ "/fp start         - Force starts the game");
			sender.sendMessage(ChatColor.RED
					+ "/fp spec set      - Sets spectate spawn");
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("fp help")) {
			sender.sendMessage(ChatColor.RED + "Flower Power Help Page");
			sender.sendMessage(ChatColor.RED + "/fp join   - Join the game");
			sender.sendMessage(ChatColor.RED + "/fp leave  - Leaves the game");
			sender.sendMessage(ChatColor.RED + "/fp spec   - Spectate the game");
			return true;
		}
		return false;
	}

	public int RandomNumber(int flower) {
		Random number = new Random();
		flower = number.nextInt(flower);
		return flower;
	}

	public void beforeTimer(int max) {
		while (!(beforeTimer == max) && (roundGoing = false)) {
			beforeTimer++;
			if (beforeTimer == max) {
				beforeTimer = 0;
				roundGoing = true;

			}
		}
	}

	public void gameTimer(int max) {
		while (!(gameTimer == max) && (roundGoing = true)) {
			gameTimer++;
			if (gameTimer == max) {
				gameTimer = 0;
				roundGoing = false;
				rounds++;
				if(rounds==6){
					gameGoing = false;
					gameEnd = true;
					rounds = 1;
				}
			
			}
		}

	}

}
