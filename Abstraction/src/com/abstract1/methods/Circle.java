package com.abstract1.methods;

public class Circle implements Shape2{
	private double radius;

	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public void setDimension(double length, double width) {
		
		
	}

	@Override
	public void setRadius(double radius) {
		this.radius=radius;
		
	}

}
