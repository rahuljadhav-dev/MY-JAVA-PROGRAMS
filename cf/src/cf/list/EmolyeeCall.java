package cf.list;

import java.util.ArrayList;

public class EmolyeeCall {
	public static void main(String[] args) {
		Employee e1=new Employee("kunal",2,"Developer");
		Employee e2=new Employee("sangita",5,"Tester");
		Employee e3=new Employee("mrunal",5,"HR");
		Employee e4=new Employee("bhagyashree",4,"Tester");
		Employee e5=new Employee("rohit",3,"Tester");
		Employee e6=new Employee("Ajay",0,"Intern");
		Employee e7=new Employee("nikhil",0,"Intern");
		Employee e8=new Employee("onkar",0,"Tester");
		Employee e9=new Employee("sujit",11,"Manager");
		Employee e10=new Employee("anand",15,"Manager");


		ArrayList<Employee>emp=new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		emp.add(e7);
		emp.add(e8);
		emp.add(e9);
		emp.add(e10);

		for(int i=0;i<emp.size();i++) {
			System.out.println("Names of employee :"+emp.get(i).name);
		}

		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).experience==0) {
				System.out.println(emp.get(i).name+" is fresher");
			}
		}

		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).experience>=10) {
				System.out.println(emp.get(i).name+" has more than 10+ years experience");
			}
		}

		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).designation.equals("Manager")) {
				System.out.println("Manager :"+emp.get(i).name);
			}
		}

		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).name.startsWith("a")||emp.get(i).name.startsWith("A")) {
				System.out.println(emp.get(i).name);

			}
		}


	}

}
