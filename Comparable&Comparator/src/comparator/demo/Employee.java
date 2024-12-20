package comparator.demo;

public class Employee {
	private String name;
	private int id;
	private int salary;
	public Employee(String name,int id,int salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return name+" :"+" ID :"+id+" salary :"+salary;
	}
	
	
	
	
	

}
