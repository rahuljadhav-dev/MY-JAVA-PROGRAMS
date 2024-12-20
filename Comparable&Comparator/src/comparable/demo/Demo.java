package comparable.demo;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Student>st=new ArrayList<Student>();
		Student s1=new Student("Rahul",24);
		Student s2=new Student("Santosh",25);
		Student s3=new Student("Soham",21);
		Student s4=new Student("Omkar",23);
		Student s5=new Student("Anand",18);
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);
		Collections.sort(st);

		System.out.println(st);


	}

}
