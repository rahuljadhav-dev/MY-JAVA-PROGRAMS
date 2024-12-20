package com.abstract1.methods;

public class Rectangle implements Shape2{
	private double length;
	private double width;
	

	@Override
	public double calculateArea() {
		return length*width;
	}

	@Override
	public double calculatePerimeter() {
		return 2*(length+width);
	}

	@Override
	public void setDimension(double length, double width) {
		this.length=length;
		this.width=width;
		
	}

	@Override
	public void setRadius(double radius) {
		
		
	}
	

}
