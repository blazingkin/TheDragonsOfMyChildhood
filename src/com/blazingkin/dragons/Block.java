package com.blazingkin.dragons;

import java.awt.Image;
import javax.swing.*;

import java.util.LinkedList;
import java.util.List;

public class Block {
public List<Block> blocks;
public int id;
public boolean canStandOn;
public Image blockImage;

Block(boolean mainBlock){
	
}

Block(int id, boolean canStandOn, Image blockImage){
	this.id = id;
	this.canStandOn = canStandOn;
	this.blockImage = blockImage;
}
Block(int id, boolean canStandOn){
	this.id = id;
	this.canStandOn = canStandOn;
}

	
public void onWalk(int x, int y, Entity entity, CurrentDungeon w, int dungeonLevel){
	
}

public Image getImage(int x, int y){
	return blockImage;
}

public void onTick(int x, int y){
	
}

public int numTicks(){
	return -1;
}

public void setBlocks(){
	blocks = new LinkedList<Block>();
	blockedTile = new Block(0, false, new ImageIcon("Images/BackTile.png").getImage());
	blocks.add(blockedTile);
	normalTile = new Block(1, true, new ImageIcon("Images/NormalTile.png").getImage());
	blocks.add(normalTile);
	TrapBlock = new TrapBlock(2, true, new ImageIcon("Images/TrapBlock.png").getImage());
	blocks.add(TrapBlock);
	teleTile = new BlockTele(3, true, new ImageIcon("Images/TeleBrick.png").getImage());
	blocks.add(teleTile);
	bombTile = new BlockBomb(4, true, new ImageIcon("Images/Bomb.png").getImage());
	blocks.add(bombTile);
}

public Block getBlockByNumber(int number){
	return blocks.get(number);
}

public Block blockedTile;
public Block normalTile;
public Block TrapBlock;
public Block teleTile;
public Block bombTile;
}
