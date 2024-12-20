package cf.list;

public class Employee {
	String name;
	int experience;
	String designation;
	public Employee(String name,int experience,String designation) {
		this.name=name;
		this.experience=experience;	
		this.designation=designation;
		
	}
	@Override
	public String toString() {
		return name+":"+experience+""+designation;
	}

}
