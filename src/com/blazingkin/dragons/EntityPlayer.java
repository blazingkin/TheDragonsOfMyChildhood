package com.blazingkin.dragons;

import javax.swing.ImageIcon;

public class EntityPlayer extends Entity {
	
	EntityPlayer(DragonsMain dm){
		main = dm;
		icon = new ImageIcon("Images/Player.png").getImage();
	}

	void walkVertical(boolean down) {
		if (main.playerTurn){
		if (down){
			if (main.theTiles.getBlockByNumber(main.World.getBlock(posX, posY+1, main.currentlevel)).canStandOn){
				posY++;
			}
		}else{
			if (main.theTiles.getBlockByNumber(main.World.getBlock(posX, posY-1, main.currentlevel)).canStandOn){
				posY--;
			}
		}
		main.playerTurn = false;
		}
	}

	void walkHorizontal(boolean left) {
		if (main.playerTurn){
		if (left){
			if (main.theTiles.getBlockByNumber(main.World.getBlock(posX-1, posY, main.currentlevel)).canStandOn){
				posX--;
			}
		}else{
			if (main.theTiles.getBlockByNumber(main.World.getBlock(posX+1, posY, main.currentlevel)).canStandOn){
				posX++;
			}
		}
		main.playerTurn = false;
		}
	}

	void onDeath() {
		
	}

	void onHurt() {
		
	}

	void onHeal() {
		
	}

}
