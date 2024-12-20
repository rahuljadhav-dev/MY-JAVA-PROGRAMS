package cf.list;

import java.util.ArrayList;
import java.util.Iterator;

public class CallCar {
	public static void main(String[] args) {
		Car c1=new Car("ab","maruti","REd",220);
		Car c2=new Car("bc","wagonr","red",200);
		Car c3=new Car("cd","punch","Red",210);
		Car c4=new Car("de","innova","black",240);
		Car c5=new Car("ef","bmw","green",280);

		ArrayList<Car> cars=new ArrayList<Car>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);

		for(int i = 0; i < cars.size(); i++) {
			if(cars.get(i).color.equalsIgnoreCase("red"))
				System.out.println(cars.get(i).name+" is :"+cars.get(i).color+" coloured");
		}


	}

}
