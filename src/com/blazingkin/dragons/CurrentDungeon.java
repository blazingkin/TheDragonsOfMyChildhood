package com.blazingkin.dragons;
import java.util.*;

public class CurrentDungeon {

CurrentDungeon(List<Enemy> enemies){
	this.enemies = enemies;
}
	

public void AddDungeonLevel(DungeonLevel level){
	dl.add(level);
}
public void setLevel(int level){
	onLevel = level;
}
public int getLevel(){
	return onLevel;
}
public void setBlock(int x, int y, int level, int newvalue){
	dl.get(onLevel).setBlock(x, y, newvalue);
}

public void setBlock(int x, int y, int newvalue){
	dl.get(onLevel).setBlock(x, y, newvalue);
}

public int getBlock(int x, int y, int level){
	return dl.get(level).getBlock(x, y);
}
public void clearDungeon(){
	dl.clear();
}
public void eliminateenemies(){
	enemies.clear();
}



List<DungeonLevel> dl = new LinkedList<DungeonLevel>();
private int onLevel = 0;
static List<Enemy> enemies;
}
