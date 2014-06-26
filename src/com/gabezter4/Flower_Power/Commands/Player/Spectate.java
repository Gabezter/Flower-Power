package com.gabezter4.Flower_Power.Commands.Player;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gabezter4.Flower_Power.Main;

public class Spectate implements CommandExecutor {
	Main plugin;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player player = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("fp spec")) {
			World world = ((World) plugin.getConfig().get(
					args[0] + ".Spec.World"));
			Double x = plugin.getConfig().getDouble(args[0] + ".Spec.X");
			Double y = plugin.getConfig().getDouble(args[0] + ".Spec.Y");
			Double z = plugin.getConfig().getDouble(args[0] + ".Spec.Z");
			Location loc = new Location(world, x, y, z);
			player.teleport(loc);
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("fp spec set")) {
			plugin.getConfig().set(args[0] + ".Spec.World",
					player.getLocation().getWorld());
			plugin.getConfig().set(args[0] + ".Spec.X",
					player.getLocation().getX());
			plugin.getConfig().set(args[0] + ".Spec.Y",
					player.getLocation().getY());
			plugin.getConfig().set(args[0] + ".Spec.Z",
					player.getLocation().getZ());
		}

		return false;
	}

}
