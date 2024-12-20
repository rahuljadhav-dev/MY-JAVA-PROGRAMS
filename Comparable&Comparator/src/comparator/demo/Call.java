package comparator.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Call {
	public static void main(String[] args) {
		ArrayList<Employee>ee=new ArrayList<Employee>();
		Employee emp1=new Employee("Rahul ",144,55000);
		Employee emp2=new Employee("Kunal",102,45000);
		Employee emp3=new Employee("Bhagya",132,57000);
		Employee emp4=new Employee("Mrunal ",104,58000);
		Employee emp5=new Employee("Rohit",164,35000);

		ee.add(emp1);
		ee.add(emp2);
		ee.add(emp3);
		ee.add(emp4);
		
		Comparator<Employee>name=Comparator.comparing(Employee::getName);
		ee.sort(name);
		System.out.println(ee);
		
		Comparator<Employee>id=Comparator.comparing(Employee::getId);
		ee.sort(id);
		System.out.println(ee);
	
	}

}
