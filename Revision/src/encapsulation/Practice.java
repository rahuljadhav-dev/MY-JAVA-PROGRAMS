package encapsulation;

public class Practice {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void show() {
		System.out.println(age);
		System.out.println(name);
				
	}
	
	public static void main(String[] args) {
		Practice p=new Practice();
		p.setAge(18);
		p.setName("Rahul");
		p.getAge();
		p.getName();
		
		
	}

}
