package com.blazingkin.dragons;

import java.awt.Image;

public class BlockTele extends Block {
	BlockTele(int id, boolean canStandOn, Image blockImage) {
		super(id, canStandOn, blockImage);
	}

	public void onWalk(int x, int y, Entity entity, CurrentDungeon w, int dungeonLevel){
		if (entity.getClass() == new EntityPlayer(null).getClass()){
		w.AddDungeonLevel(new DungeonLevel());
		w.setLevel(dungeonLevel+1);
		entity.posX = 200;
		entity.posY = 200;
		entity.Health += 5;
		w.eliminateenemies();
		}
	}


}
