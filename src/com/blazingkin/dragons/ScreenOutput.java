package com.blazingkin.dragons;

import java.awt.*;

public class ScreenOutput {
ScreenOutput(DragonsMain dm){
	main = dm;
	width = main.s.getWidth();
	height = main.s.getHeight();
}

public void render(Graphics2D g){
int PlayerX = 0;
int PlayerY = 0;
int screenX = 0;
for (int x = -10; x < 10; x++){
	int screenY = 0;
	for (int y = -8; y < 8; y++){
	g.drawImage(main.theTiles.getBlockByNumber(main.World.getBlock(main.thePlayer.posX + x, main.thePlayer.posY + y, main.currentlevel)).blockImage,screenX*width/20,screenY*height/16,width/20,height/15,null);
	for (int i = 0; i < main.enemies.size(); i++){
		Enemy e = main.enemies.get(i);
		if (e.posX == main.thePlayer.posX + x && e.posY == main.thePlayer.posY + y){
			g.drawImage(e.icon,screenX*width/20,screenY*height/16,width/20,height/15,null);
		}
	}
	if (x == 0 && y == 0){
		PlayerX = screenX*width/20;
		PlayerY = screenY*height/16;
	}
	screenY++;
	}
screenX++;
}
g.drawImage(main.thePlayer.icon,PlayerX,PlayerY,width/20,height/16,null);
g.setColor(Color.white);
g.drawString(main.thePlayer.Health+" Health left    Current level: "+main.currentlevel+"    Gold: 0"+"    Mode: "+main.MODE	, 30, 30);

}
	
	
	
	
DragonsMain main;
int width;
int height;
}
