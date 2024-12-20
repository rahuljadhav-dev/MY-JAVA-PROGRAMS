package com.abstract4.Class.Task;

public abstract class FlexiblePavement implements MaterialsForRoad{

	@Override
	public void bitumen() {
		System.out.println("Flexible pavements means bitumen road it requires *Bitumen* ");
		
	}

	@Override
	public abstract void concrete();
	
	@Override
	public abstract void wbm();
	

}
