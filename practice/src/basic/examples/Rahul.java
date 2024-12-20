package basic.examples;

public class Rahul {
	public static void main(String[] args) {
		//1//This is for Area of rectangle
		int B=15;
		int D=20;
		float Rectangle =B*D;
		System.out.println("The area of rectangle is"+"="+Rectangle);
		
		//2//This is for Area of Circle
		int r=9;
		float Circle=3.141F*r*r;
		System.out.println("The area of circle is"+"="+Circle);
		
		//3//This is for Area of square
		int A=15;
		float square=A*A;
		System.out.println("The area of square is"+"="+square);
		
		//4//Perimeter of circle
		int r1=7;
		float perimeter=2F*3.141F*r1;
		System.out.println("Perimeter of the circle is"+"="+perimeter);
		
		//5//Dia of the circle 
		int r2=6;
		float dia=2*r2;
		System.out.println("Diameter of the circle is"+"="+dia);
		
		//6//Wap to add five numbers
		int a=22;
		int b=23;
		int c=44;
		int d=53;
		int e=21;
		int sum=a+b+c+d+e;
		System.out.println(a+"+"+b+"+"+c+"+"+d+"+"+e+"="+sum);
		
		//7//average of five numbers
		float A1=55.54F;
		float A2=111.2F;
		float A3=133.4F;
		float A4=23.5F;
		float A5=66.774F;
		System.out.println("Average of five numbers is"+"="+A1+A2+A3+A4+A5/5);
		
		//8//Hypotenuse of right angle triangle
		int D1=12;
		int D2=5;
		int result=D1*D1+D2*D2;
		System.out.println("hypotenuse of right angle triangle of D1 & D2 is"+"="+Math.sqrt(result));
		
		//9// Unit conversion kg to gms
		float kg=100F;
		float gms=kg*1000F;
		System.out.println("100 kg into gms is"+"="+gms);
		
		//10//unit conversion
		float gms1=160000F;
		float kg1=gms1/1000F;
		System.out.println("160000 gms in kg is"+"="+kg1);
		
		//11// Temperature Conversion
		float Celsius=456F;
		float fah=(Celsius*9/5F)+32F;
		System.out.println("456 celsius into fahrenheit is"+"="+fah);
		
		//12//Speed,time & distance
		float distance=555F;
		float time=60F;
		float speed=distance/time;
		float time1=distance/speed;
		float distance1=speed*time;
		
		System.out.println("The speed of train is"+"="+speed+"Km/hr");
		System.out.println("Time required for arriving the train is"+"="+time1+"hr");
		System.out.println("Total distance covered by the train is"+"="+distance1+"Km");
		int m=24;
		int n=12;
		m%=n;
		n*=2;
		System.out.println(n);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		//13//a^2+b^2+2ab 
		int rahul=10;
		int jadhav=25;
		int answer=rahul*rahul+jadhav*jadhav+2*rahul*jadhav;
		System.out.println("a^2+b^2+2ab is"+"="+answer);
		
		//14//Som problem-find stress
		float P=10*10*10*10F;
		float Area=2000F;
		float stress = P/Area;
		System.out.println(stress+"KN");
		
		//15//Area of triangle
		float base=5F;
		float height=8F;
		float area=0.5F*base*height;
		System.out.println("Area of triangle is"+"="+area);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
