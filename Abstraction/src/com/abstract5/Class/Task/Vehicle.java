package com.abstract5.Class.Task;

public class Vehicle extends Status {

	@Override
	public boolean isRolable(boolean a) {
		System.out.println(a);
		return true;
	}

	@Override
	public boolean isMovable(boolean b) {
		System.out.println(b);
		return true;
	}

}
