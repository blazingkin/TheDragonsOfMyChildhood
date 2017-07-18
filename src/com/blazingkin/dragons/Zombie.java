package com.blazingkin.dragons;

import java.util.Random;

import javax.swing.ImageIcon;

public class Zombie extends Enemy {
Zombie(DragonsMain dm){
		main = dm;
		icon = new ImageIcon("Images/Zombie.png").getImage();
		index = main.enemies.size();
		main.enemies.add(this);
}
	
	public void onUpdate(){
		Random r = new Random();
		r.setSeed(System.nanoTime());
		if (main.thePlayer.posX == posX && main.thePlayer.posY == posY){main.thePlayer.Health --;}
		if (r.nextInt(2)==1){

		if (main.thePlayer.posX > posX){
			walkHorizontal(false);
		}else{
			walkHorizontal(true);
		}
		}else{

			if (main.thePlayer.posY > posY){
				walkVertical(true);
			}else{
				walkVertical(false);
			}	
		}
		
		if (!(main.thePlayer.posX + main.thePlayer.posY > posX + posY + 40) || !(main.thePlayer.posX + main.thePlayer.posY < posX + posY - 40)){
			
		}else{
			posX = main.thePlayer.posX + 20;
			posY = main.thePlayer.posY;
		}
		
	}
	
	void walkVertical(boolean down) {
		if (down){
			if (main.theTiles.getBlockByNumber(main.World.getBlock(posX, posY+1, main.currentlevel)).canStandOn){
				posY++;
			}
		}else{
			if (main.theTiles.getBlockByNumber(main.World.getBlock(posX, posY-1, main.currentlevel)).canStandOn){
				posY--;
			}
		}
		if (main.thePlayer.posX == posX && main.thePlayer.posY == posY){main.thePlayer.Health --;}
		}

	void walkHorizontal(boolean left) {
		if (left){
			if (main.theTiles.getBlockByNumber(main.World.getBlock(posX-1, posY, main.currentlevel)).canStandOn){
				posX--;
			}
		}else{
		if (main.theTiles.getBlockByNumber(main.World.getBlock(posX+1, posY, main.currentlevel)).canStandOn){
				posX++;
		}
		}
		if (main.thePlayer.posX == posX && main.thePlayer.posY == posY){main.thePlayer.Health --;}
	}

	void onDeath() 
	{
		System.out.println("Dead Zombie");
		main.enemies.remove(index);
	}

	void onHurt() {
		
	}

	void onHeal() {
		
	}
	
int index;

}
