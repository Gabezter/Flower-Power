package com.gabezter4.Flower_Power;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.gabezter4.Flower_Power.Commands.Admin.Create;
import com.gabezter4.Flower_Power.Commands.Admin.Postion;
import com.gabezter4.Flower_Power.Commands.Admin.Start;
import com.gabezter4.Flower_Power.Commands.Admin.Stop;
import com.gabezter4.Flower_Power.Commands.Player.Join;
import com.gabezter4.Flower_Power.Commands.Player.Leave;
import com.gabezter4.Flower_Power.Commands.Player.Spectate;


public class Main extends JavaPlugin {

	Listen flowerNum = new Listen();
	Run run = new Run();
	Leave leave = new Leave();
	Spectate spec = new Spectate();
	Create create = new Create();
	Start start = new Start();
	Stop stop = new Stop();
	Join join = new Join();
	Postion pos = new Postion();

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
	}

	@Override
	public void onDisable() {

	}

	public ArrayList<String> inGame = new ArrayList<String>();
	public ArrayList<String> playing = new ArrayList<String>();
	public ArrayList<String> scored = new ArrayList<String>();
	
	public boolean gameGoing = false;
	
	
	
	
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (cmd.getName().equalsIgnoreCase("fp")) {
			sender.sendMessage(ChatColor.RED + "/fp help  - Help Page");
			sender.sendMessage(ChatColor.RED + "/fp ahelp - Admin Help Page");			
			return true;
		}
		if(cmd.getName().equalsIgnoreCase("fp ahelp")){
			sender.sendMessage(ChatColor.RED + "Flower Power Admin Help Page");
			sender.sendMessage(ChatColor.RED + "/fp create [name] - Creates the arena name.");
			sender.sendMessage(ChatColor.RED + "/fp setPos [1/2]  - Sets a corner of the areana");
			sender.sendMessage(ChatColor.RED + "/fp stop          - Stops the game");
			sender.sendMessage(ChatColor.RED + "/fp start         - Force starts the game");
			return true;
		}
		if(cmd.getName().equalsIgnoreCase("fp help")){
			sender.sendMessage(ChatColor.RED + "Flower Power Help Page");
			sender.sendMessage(ChatColor.RED + "/fp join   - Join the game");
			sender.sendMessage(ChatColor.RED + "/fp leave  - Leaves the game");
			sender.sendMessage(ChatColor.RED + "/fp spec   - Spectate the game");			
			return true;
		}
		return false;
	}
	
}