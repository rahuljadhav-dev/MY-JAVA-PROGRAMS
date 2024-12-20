package practice;
import java.io.Serializable;

public class Student implements Serializable{
	transient String name;
	transient static int age;
	public void show(String name,int age) {
		this.name=name;
		this.age=age;
		
	}

}
