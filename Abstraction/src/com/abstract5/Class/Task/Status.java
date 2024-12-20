package com.abstract5.Class.Task;

public abstract class Status implements Movable,Rolable{

	@Override
	public void isRolable() {
		System.out.println("The avg speed is :"+avgspeed);
	
		
	}

	@Override
	public void ismovable() {
		System.out.println("yes");
		
	}
	public abstract boolean isRolable(boolean a);
	public abstract boolean isMovable(boolean b);

}
