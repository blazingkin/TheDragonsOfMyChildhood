package com.blazingkin.dragons;
import java.awt.event.*;

public class GameKeyListener implements KeyListener {

GameKeyListener(DragonsMain dm){
	main = dm;
}

public void keyPressed(KeyEvent k) {
	int KeyCode = k.getKeyCode();
	if (KeyCode == KeyEvent.VK_ESCAPE){main.stop();}
	if (KeyCode == KeyEvent.VK_W){main.thePlayer.walkVertical(false);}
	if (KeyCode == KeyEvent.VK_S){main.thePlayer.walkVertical(true);}
	if (KeyCode == KeyEvent.VK_A){main.thePlayer.walkHorizontal(true);}
	if (KeyCode == KeyEvent.VK_D){main.thePlayer.walkHorizontal(false);}
	if (KeyCode == KeyEvent.VK_UP){main.thePlayer.walkVertical(false);}
	if (KeyCode == KeyEvent.VK_DOWN){main.thePlayer.walkVertical(true);}
	if (KeyCode == KeyEvent.VK_LEFT){main.thePlayer.walkHorizontal(true);}
	if (KeyCode == KeyEvent.VK_RIGHT){main.thePlayer.walkHorizontal(false);}
}

public void keyReleased(KeyEvent k) {
	
}


public void keyTyped(KeyEvent arg0) {}



DragonsMain main;
}
