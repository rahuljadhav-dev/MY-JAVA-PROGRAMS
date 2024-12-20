package revision.prog.abstracts.interfaces;

public class AnotherMethod extends Details {
	String name;

	@Override
	public void show(String name) {
		this.name=name;
		System.out.println("This is my name :"+name);
		
		
	}
	public static void main(String[] args) {
		AnotherMethod f=new AnotherMethod();
		f.show(50, 50);
		f.show("Rahul");
	}

}
