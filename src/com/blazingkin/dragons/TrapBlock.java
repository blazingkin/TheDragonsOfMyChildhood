package com.blazingkin.dragons;

import java.awt.Image;

public class TrapBlock extends Block {
	TrapBlock(int id, boolean canStandOn, Image blockImage) {
		super(id, canStandOn, blockImage);
	}

	public void onWalk(int x, int y, Entity entity, CurrentDungeon w, int dungeonLevel){
		entity.Health -= 1;
		w.setBlock(x, y, dungeonLevel, 1);
	}


}
