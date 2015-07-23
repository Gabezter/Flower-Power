package com.gabezter4.Flower_Power;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public Listen listen = new Listen();
	public Run run = new Run(this);
	public Flower_Gen gen = new Flower_Gen();
	public ScoreBoards sb = new ScoreBoards();

	public File config = null;
	public FileConfiguration nc = null;

	@Override
	public void onEnable() {

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
	int playerCount = 0;
	public int rounds = 1;
	public int a = RandomNumber(14);

	public String title = ChatColor.AQUA + "[Flower Power] ";

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player player = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("fp")) {
			if (args.length == 0) {
				if (sender.hasPermission("fp.main")
						|| sender.hasPermission("fp.admin")
						|| sender.hasPermission("fp.player")) {
					sender.sendMessage(ChatColor.RED + "/fp help  - Help Page");
					sender.sendMessage(ChatColor.RED
							+ "/fp ahelp - Admin Help Page");
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("ahelp")) {
				if (sender.hasPermission("fp.ahelp")
						|| sender.hasPermission("fp.admin")) {
					sender.sendMessage(ChatColor.RED + title
							+ " Admin Help Page");
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
			}
			if (args[0].equalsIgnoreCase("help")) {
				if (sender.hasPermission("fp.help")
						|| sender.hasPermission("fp.admin")
						|| sender.hasPermission("fp.player")) {
					sender.sendMessage(ChatColor.RED + title + " Help Page");
					sender.sendMessage(ChatColor.RED
							+ "/fp join   - Join the game");
					sender.sendMessage(ChatColor.RED
							+ "/fp leave  - Leaves the game");
					sender.sendMessage(ChatColor.RED
							+ "/fp spec   - Spectate the game");
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("stop")) {
				if (sender.hasPermission("fp.stop")
						|| sender.hasPermission("fp.admin")) {
					run.cancel();
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("start")) {
				if (sender.hasPermission("fp.start")
						|| sender.hasPermission("fp.admin")) {
					getServer().broadcastMessage(
							title + ChatColor.RED
									+ "Flower Power has started in the Anrea");
					run.run();
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("pos")) {
				if (args.length == 1) {
					sender.sendMessage(title + ChatColor.DARK_RED
							+ "Retype command.");
					sender.sendMessage(title + ChatColor.DARK_RED
							+ "Add a 1 for Position 1");
					sender.sendMessage(title + ChatColor.DARK_RED
							+ "Add a 2 for Position 2");
					return true;
				}
				if (args.length >= 3) {
					sender.sendMessage(title + ChatColor.DARK_RED
							+ "To many Arguments!");
					return true;
				}
				if (args[1].equalsIgnoreCase("1")) {
					if (sender.hasPermission("fp.pos1")
							|| sender.hasPermission("fp.admin")) {
						getConfig().set("Arena.World",
								player.getLocation().getWorld());
						getConfig().set("Arena.1.X",
								player.getLocation().getX());
						getConfig().set("Arena.1.Z",
								player.getLocation().getZ());
						sender.sendMessage(title + ChatColor.RED + "X:"
								+ player.getLocation().getBlockX() + " Z:"
								+ player.getLocation().getBlockZ());
						return true;
					}
				}
				if (args[1].equalsIgnoreCase("2")) {
					if (sender.hasPermission("fp.pos2")
							|| sender.hasPermission("fp.admin")) {
						getConfig().set("Arena.World",
								player.getLocation().getWorld());
						getConfig().set("Arena.2.X",
								player.getLocation().getBlockX());
						getConfig().set("Arena.2.Z",
								player.getLocation().getBlockZ());
						sender.sendMessage(title + ChatColor.RED + "X:"
								+ player.getLocation().getBlockX() + " Z:"
								+ player.getLocation().getBlockZ());
						return true;
					}

				}

				return true;
			}
			if (args[0].equalsIgnoreCase("create")) {
				if (args.length == 1) {
					sender.sendMessage(title + ChatColor.DARK_RED
							+ "Need an Arena Name!");
					return true;
				}
				if (args.length >= 3) {
					sender.sendMessage(title + ChatColor.DARK_RED
							+ "Please use only one word for the Arena Name.");
					return true;
				}
				if (sender.hasPermission("fp.create")
						|| sender.hasPermission("fp.admin")) {
					getConfig().set("Arena.Name", args[1]);
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("spec")) {
				if (args.length == 1) {
					if (sender.hasPermission("fp.spec")
							|| sender.hasPermission("fp.admin")
							|| sender.hasPermission("fp.player")) {
						World world = ((World) getConfig().get(
								"Arena.Spec.World"));
						Double x = getConfig().getDouble("Arena.Spec.X");
						Double y = getConfig().getDouble("Arena.Spec.Y");
						Double z = getConfig().getDouble("Arena.Spec.Z");
						Location loc = new Location(world, x, y, z);
						player.teleport(loc);
						return true;
					}
				}
				if (args[1].equalsIgnoreCase("set")) {
					if (sender.hasPermission("fp.spec.set")
							|| sender.hasPermission("fp.admin")) {
						getConfig().set("Arena.Spec.World",
								player.getLocation().getWorld());
						getConfig().set("Arena.Spec.X",
								player.getLocation().getX());
						getConfig().set("Arena.Spec.Y",
								player.getLocation().getY());
						getConfig().set("Arena.Spec.Z",
								player.getLocation().getZ());
					}
				}
			}
			String playerName = player.getName();
			if (args[0].equalsIgnoreCase("fp join")) {
				if (sender.hasPermission("fp.join")
						|| sender.hasPermission("fp.admin")
						|| sender.hasPermission("fp.player")) {
					if (!(inGame.contains(playerName))) {
						inGame.add(playerName);
						playerCount++;
						if (playerCount == 1) {
							getServer().broadcastMessage(
									title + ChatColor.WHITE + playerName
											+ ChatColor.RED
											+ " has joined the "
											+ ChatColor.GREEN + "Flower Power"
											+ ChatColor.RED
											+ " arena, the arena now has "
											+ ChatColor.GOLD + playerCount
											+ " player.");
						} else {
							getServer().broadcastMessage(
									title + ChatColor.WHITE + playerName
											+ ChatColor.RED
											+ " has joined the "
											+ ChatColor.GREEN + "Flower Power"
											+ ChatColor.RED
											+ " arena, the arena now has "
											+ ChatColor.GOLD + playerCount
											+ " players.");
						}
					} else {
						sender.sendMessage(ChatColor.RED
								+ "You are already in game.");
					}
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("fp leave")) {
				if (sender.hasPermission("fp.leave")
						|| sender.hasPermission("fp.admin")
						|| sender.hasPermission("fp.player")) {
					if (inGame.contains(playerName)) {
						sender.sendMessage(title + ChatColor.RED
								+ "You have left the game.");
						inGame.remove(playerName);
						playerCount--;
					} else {
						sender.sendMessage(ChatColor.RED
								+ "You aren't in a game.");
					}

					return true;
				}
			}
			if(args[0].equalsIgnoreCase("test")){
				sender.sendMessage(Integer.toString(a));
			}

		}

		return false;

	}

	public int RandomNumber(int upper) {
		Random number = new Random();
		flower = number.nextInt(upper);
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
				if (rounds == 6) {
					gameGoing = false;
					gameEnd = true;
					rounds = 1;
				}

			}
		}

	}

}