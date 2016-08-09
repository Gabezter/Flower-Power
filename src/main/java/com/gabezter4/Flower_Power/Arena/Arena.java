package com.gabezter4.Flower_Power.Arena;

import org.bukkit.block.Block;
import org.bukkit.event.Listener;

import com.gabezter4.Flower_Power.Main.Main;

public class Arena implements Listener {
	
	Main plugin;
	
	public Arena(Main pl){
		plugin = pl;
	}
	public int y = 64;
	
	public int cornerOneX = plugin.b.getConfig().getInt("Arena.Pos1.X");
	public int cornerOneZ = plugin.b.getConfig().getInt("Arena.Pos1.Z");
	public int cornerTwoX = plugin.b.getConfig().getInt("Arena.Pos2.X");
	public int cornerTwoZ = plugin.b.getConfig().getInt("Arena.Pos2.Z");
	
	public Block cornerOne;
	public Block cornerTwo;

	public void setCorners(){
		cornerOne.getLocation().setX(cornerOneX);
		cornerOne.getLocation().setZ(cornerOneZ);
		cornerOne.getLocation().setY(y);
		cornerTwo.getLocation().setY(y);
		cornerTwo.getLocation().setX(cornerTwoX);
		cornerTwo.getLocation().setZ(cornerTwoZ);
	}
}
