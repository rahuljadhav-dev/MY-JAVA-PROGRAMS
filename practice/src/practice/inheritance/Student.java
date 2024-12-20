package practice.inheritance;

public class Student extends Person{
	int batchcode;
	int coursefees;
	
	void showStudentInfo(){
		System.out.println("Student name :"+name);
		System.out.println("Student age :"+age);
		System.out.println("Gender :"+gender);
		System.out.println("Batchcode :"+batchcode);
		System.out.println("Course Fees :"+coursefees);
		
		 
	}

}
