package com.blazingkin.dragons;
import java.util.*;

public class DungeonLevel {
DungeonLevel(){
	boolean set = false;
	Random r = new Random();
	r.setSeed(System.currentTimeMillis());
	for (int i = 0; i < 400; i++){
		List<Integer> Y = new LinkedList<Integer>();
		for (int d = 0; d < 400; d++){
			if (!set && ((r.nextInt(120000) == 0))){
				Y.add(3);
				System.out.println(i+", "+d);
				set = true;
			}else{
			Y.add(r.nextInt(5)==0?0:1);
			}
		}
		X.add(Y);
	}
	if (!set){
		this.setBlock(r.nextInt(400), r.nextInt(400), 3);
	}
	
	int bombs = r.nextInt(40) + 500;
	for (int i = 0; i < bombs; i++){
		int x = r.nextInt(400);
		int y = r.nextInt(400);
		if (getBlock(x, y) != 3){
			setBlock(x, y, 4);
		}
	}
	
	
}
DungeonLevel(int limit){
	for (int i = 0; i < limit; i++){
		List<Integer> Y = new LinkedList<Integer>();
		for (int d = 0; d < limit; d++){
			Y.add(0);
		}
		X.add(Y);
	}
}

public void setBlock(int x, int y, int newvalue){
	if (x < 1 || x > 399 || y < 1 || y > 399){
		return;
	}
	X.get(x).set(y, newvalue);
}
public int getBlock(int x, int y){
	if (x < 1 || x > 399 || y < 1 || y > 399){
		return 0;
	}
	return X.get(x).get(y);
}

List<List<Integer>> X = new LinkedList<List<Integer>>();
}
