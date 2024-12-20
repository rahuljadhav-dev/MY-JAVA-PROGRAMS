package comparable.demo;

public class Student implements Comparable<Student>{
	String name;
	int age;

	public Student(String name,int age) {
		this.name=name;
		this.age=age;

	}

	@Override
	public String toString() {

		return name+" :"+age;
	}

	@Override
	public int compareTo(Student obj) {
		if(this.age==obj.age)
		return 0;
		
		else if(this.age>obj.age)
			return 1;
		else
			return -1;
	
	}



}
