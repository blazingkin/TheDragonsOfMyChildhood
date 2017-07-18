package com.blazingkin.dragons;
import java.awt.*;
public abstract class Entity {

abstract void walkVertical(boolean up);
abstract void walkHorizontal(boolean side);
abstract void onDeath();
abstract void onHurt();
abstract void onHeal();

int posY = 200;
int posX = 200;
int Health = 10;
DragonsMain main;
Image icon;
}
