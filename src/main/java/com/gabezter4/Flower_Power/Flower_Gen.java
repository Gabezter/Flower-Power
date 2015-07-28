package com.gabezter4.Flower_Power;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;

public class Flower_Gen {

	Main plugin;

	public void arena() {
		int mix, max, miz, maz;
		int may = 255;
		int miy = 0;

		if (plugin.b.getConfig().getInt("Arena.Pos1.X") < plugin.b.getConfig()
				.getInt("Arena.Pos2.X")) {
			mix = plugin.b.getConfig().getInt("Arena.Pos1.X");
			max = plugin.b.getConfig().getInt("Arena.Pos2.X");
		} else {
			max = plugin.b.getConfig().getInt("Arena.Pos1.X");
			mix = plugin.b.getConfig().getInt("Arena.Pos2.X");
		}
		if (plugin.b.getConfig().getInt("Arena.Pos1.Z") < plugin.b.getConfig()
				.getInt("Arena.Pos2.Z")) {
			miz = plugin.b.getConfig().getInt("Arena.Pos1.Z");
			maz = plugin.b.getConfig().getInt("Arena.Pos2.Z");
		} else {
			maz = plugin.b.getConfig().getInt("Arena.Pos1.Z");
			miz = plugin.b.getConfig().getInt("Arena.Pos2.Z");
		}
		World w = (World) plugin.b.getConfig().get("Arena.World");
		for (int x1 = mix; x1 < max; x1++) {
			for (int y1 = miy; y1 < may; y1++) {
				for (int z1 = miz; z1 < maz; z1++) {
					Location loc = new Location(w, (double)x1, (double)y1, (double)z1);

					Random number = new Random();
					int a = number.nextInt(14);

					if (loc.getBlock().equals(Material.GRASS)) {
						double y = loc.getY() + 1;
						if (a == 0) {
							loc.add(0, y, 0);
							loc.getBlock().setTypeIdAndData(175, (byte) 1,
									false);
						}
						if (a == 1) {
							loc.add(0, y, 0);
							loc.getBlock().setTypeIdAndData(175, (byte) 1,
									false);
						}
						if (a == 2) {
							loc.add(0, y, 0);
							loc.getBlock().setTypeIdAndData(175, (byte) 1,
									false);
						}
						if (a == 3) {
							loc.add(0, y, 0);
							loc.getBlock().setTypeIdAndData(175, (byte) 1,
									false);
						}
						if (a == 4) {
							loc.add(0, y, 0);
							loc.getBlock().setTypeIdAndData(175, (byte) 1,
									false);
						}
						if (a == 5) {
							loc.add(0, y, 0);
							loc.getBlock().setTypeIdAndData(175, (byte) 1,
									false);
						}
						if (a == 6) {
							loc.add(0, y, 0);
							loc.getBlock().setTypeIdAndData(175, (byte) 1,
									false);
						}
						if (a == 7) {
							loc.add(0, y, 0);
							loc.getBlock().setTypeIdAndData(175, (byte) 1,
									false);
						}
						if (a == 8) {
							loc.add(0, y, 0);
							loc.getBlock().setTypeIdAndData(175, (byte) 1,
									false);
						}
						if (a == 9) {
							loc.add(0, y, 0);
							loc.getBlock().setTypeIdAndData(175, (byte) 1,
									false);
						}
						if (a == 10) {
							loc.add(0, y, 0);
							loc.getBlock().setTypeIdAndData(175, (byte) 1,
									false);
						}
						if (a == 11) {
							loc.add(0, y, 0);
							loc.getBlock().setTypeIdAndData(175, (byte) 1,
									false);
						}
						if (a == 12) {
							loc.add(0, y, 0);
							loc.getBlock().setTypeIdAndData(175, (byte) 1,
									false);
						}
						if (a == 13) {
							loc.add(0, y, 0);
							loc.getBlock().setTypeIdAndData(175, (byte) 1,
									false);
						}
					}
				}
			}
		}
	}

	public void clear() {
		int mix, max, miz, maz;
		int may = 255;
		int miy = 0;

		if (plugin.b.getConfig().getInt("Arena.'1'.X") < plugin.b.getConfig()
				.getInt("Arena.'2'.X")) {
			mix = plugin.b.getConfig().getInt("Arena.'1'.X");
			max = plugin.b.getConfig().getInt("Arena.'2'.X");
		} else {
			max = plugin.b.getConfig().getInt("Arena.'1'.X");
			mix = plugin.b.getConfig().getInt("Arena.'2'.X");
		}
		if (plugin.b.getConfig().getInt("Arena.'1'.Z") < plugin.b.getConfig()
				.getInt("Arena.'2'.Z")) {
			miz = plugin.b.getConfig().getInt("Arena.'1'.Z");
			maz = plugin.b.getConfig().getInt("Arena.'2'.Z");
		} else {
			maz = plugin.b.getConfig().getInt("Arena.'1'.Z");
			miz = plugin.b.getConfig().getInt("Arena.'2'.Z");
		}
		World w = (World) plugin.b.getConfig().get("Arena.World");
		for (int x1 = mix; x1 < max; x1++) {
			for (int y1 = miy; y1 < may; y1++) {
				for (int z1 = miz; z1 < maz; z1++) {
					Location loc = new Location(w, (double)x1, (double)y1, (double)z1);
					if (loc.getBlock().getTypeId() == 175) {
						loc.getBlock().setType(Material.AIR);
					}
					if (loc.getBlock().getTypeId() == 37) {
						loc.getBlock().setType(Material.AIR);
					}
				}
			}
		}
	}

}