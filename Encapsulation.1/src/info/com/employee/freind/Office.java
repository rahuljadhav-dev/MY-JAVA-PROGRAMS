package info.com.employee.freind;

public class Office {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(123);
		e.setName("Rahul");
		e.setSalary(35000);
		System.out.println("The id of employee is :"+e.getId());
		System.out.println("The name of employee is :"+e.getName());
		System.out.println("The salary of employee is :"+e.getSalary());
		
	}

}
