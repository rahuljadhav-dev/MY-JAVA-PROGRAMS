package com.abstract1.methods;

public class Findings {
	public static void main(String[] args) {
		AreaOfShapes2 a1=new AreaOfShapes2();
		a1.m1("Rahul");
		a1.AreaOfCircle(5);
		a1.AreaOfRectangle(20, 20);
		a1.AreaOfSquare(25, 25);
		a1.AreaOfTraiangle(5, 10);
		
		Rectangle r=new Rectangle();
		r.setDimension(20, 10);
		System.out.println("Area of Rectangle :"+r.calculateArea());
		System.out.println("Perimeter of Rectangle :"+r.calculatePerimeter());
		
		Circle c=new Circle();
		c.setRadius(3);
		System.out.println("Area of circle :"+c.calculateArea());
		System.out.println("Perimeter of circle :"+c.calculatePerimeter());
		
	
		

	
		
	}
	
	

}
