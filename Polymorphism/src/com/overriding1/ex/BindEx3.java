package com.overriding1.ex;

public class BindEx3 extends BindEx2 {
	String friend;
	public void show() {
		super.show();
		System.out.println("this is my name"+name+" this is my surname "+surname+" and tis is my friend name "+friend);
	}

}
