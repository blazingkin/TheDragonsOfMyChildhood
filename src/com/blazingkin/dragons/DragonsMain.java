package com.blazingkin.dragons;

import java.awt.Graphics2D;
import java.awt.Window;
import java.util.*;

import javax.swing.ImageIcon;

public class DragonsMain extends Core {
public static void main(String[] args) {new DragonsMain().run(); }

public void update(long timePassed){
Random r = new Random();
r.setSeed(System.currentTimeMillis());
currentlevel = World.getLevel();
if (thePlayer.Health <= 0){
	dead = true;
	playerTurn = false;
}

if (!playerTurn && !dead){
if (MODE.equals("Zombie Hoard")){
if (enemies.size() > 150){
enemies.clear();
}
	Enemy z = new Zombie(this);
	if (r.nextInt(2)==0){
	z.posY = thePlayer.posY + (r.nextInt(2)==0?18:-18);
	}else{
	z.posX = thePlayer.posX + (r.nextInt(2)==0?18:-18);
	}
}
	
theTiles.getBlockByNumber(World.getBlock(thePlayer.posX, thePlayer.posY, currentlevel)).onWalk(thePlayer.posX, thePlayer.posY, thePlayer, World, currentlevel);
for (int i = 0; i < enemies.size(); i++){
	enemies.get(i).onUpdate();
	if (enemies.get(i).Health <= 0 ){
		enemies.get(i).onDeath();
	}
}
playerTurn = true;	
}

}

public void init(){
	super.init();
	Window w = s.getFullScreenWindow();
	w.setFocusTraversalKeysEnabled(false);
	w.addKeyListener(kl);
	theTiles.setBlocks();
	thePlayer = new EntityPlayer(this);
	World = new CurrentDungeon(enemies);
	DungeonLevel dl = new DungeonLevel();
	World.AddDungeonLevel(dl);
	scOutput = new ScreenOutput(this);
	width = w.getWidth();
	height = w.getHeight();
}

public void draw(Graphics2D g) {
scOutput.render(g);
if (dead){
	g.drawImage(new ImageIcon("Images/GameOver.png").getImage(), 0, 0, width, height, null);
}
	

}





GameKeyListener kl = new GameKeyListener(this);
Block theTiles = new Block(true);
CurrentDungeon World;
EntityPlayer thePlayer;
ScreenOutput scOutput;
int currentlevel = 0;
boolean playerTurn = true;
static List<Enemy> enemies = new LinkedList<Enemy>();
String MODE = "Zombie Hoard";
boolean dead = false;
int width;
int height;
}
