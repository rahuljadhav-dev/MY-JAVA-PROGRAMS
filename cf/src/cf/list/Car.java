package cf.list;

public class Car {
	String model;
	String name;
	String color;
	int speed;
	public Car(String model,String name,String color,int speed) {
		this.model=model;
		this.name=name;
		this.color=color;
		this.speed=speed;
	}
	@Override
	public String toString() {
		return color+" colored "+name;
	}

}
