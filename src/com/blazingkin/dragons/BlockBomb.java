package com.blazingkin.dragons;

import java.awt.Image;

public class BlockBomb extends Block {
	BlockBomb(int id, boolean canStandOn, Image blockImage) {
		super(id, canStandOn, blockImage);
	}

	public void onWalk(int x, int y, Entity entity, CurrentDungeon w, int dungeonLevel){
		if (entity.getClass() == new EntityPlayer(null).getClass()){
		entity.Health -= 2;
		w.eliminateenemies();
		w.setBlock(x, y, 1);
		}
	}


}
