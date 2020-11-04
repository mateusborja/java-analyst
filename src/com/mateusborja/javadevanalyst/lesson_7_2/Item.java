//java abstract class example
package com.mateusborja.javadevanalyst.lesson_7_2;

public abstract class Item {

	private int posX;
	private int posY;

	public abstract void pegar(); // method not be implemented just signed
	
	
	//methods get and set can be implemented on abstract class
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}
