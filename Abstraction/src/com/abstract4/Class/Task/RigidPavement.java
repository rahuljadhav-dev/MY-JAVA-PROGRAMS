package com.abstract4.Class.Task;

public abstract class RigidPavement extends FlexiblePavement {

	@Override
	public void concrete() {
		System.out.println("Flexible pavement means concrete road it requires *cement* ");
		
	}

	@Override
	public abstract void wbm();
	
	

}
