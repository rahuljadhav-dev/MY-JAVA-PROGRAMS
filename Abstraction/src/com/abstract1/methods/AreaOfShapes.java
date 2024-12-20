package com.abstract1.methods;

public  class AreaOfShapes implements Shape {
	
	double area;
	
	@Override
	public void AreaOfTraiangle(int base, int height) {
		area=half*base*height;
		System.out.println("Area of triangle :"+area);
		
	}

	@Override
	public void AreaOfRectangle(int lenght, int breadth) {
		area=lenght*breadth;
		System.out.println("Area of rectangle :"+area);
		
	}

	@Override
	public void AreaOfSquare(int a, int a1) {
		area=a*a1;
		System.out.println("Area of Square :"+area);
		
	}

	@Override
	public void AreaOfCircle(int radius) {
		area=PI*radius*radius;
		System.out.println("Area of circle :"+area);
		
	}


}
