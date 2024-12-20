package serialization.task3;
import java.io.Serializable;

public class Car implements Serializable{
	String name;
	String model;
	int price;
	public Car(String name,String model,int price) {
		this.model=model;
		this.name=name;
		this.price=price;
	}

}
