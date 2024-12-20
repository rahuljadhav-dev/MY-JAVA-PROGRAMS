package lambda;

public class Classes {
	class Inner{
		String name;
		public void m(String name) {
			this.name=name;
			System.out.println("Hey my name is :"+name+" from inner classes inside classes");
		}
	}
	class Demo extends Inner{
		@Override
		public void m(String name) {
			this.name=name;
			System.out.println("Hey my name is :"+name+" from demo class etxends inner class");
		}
	}
	public static void main(String[] args) {
		Classes c=new Classes();
		Inner i=c.new Inner();
		i.m("Rahul");
		Demo d=c.new Demo();
		d.m("Ashu");
	}

}

//	public static void main(String[] args) {
//		Inner i=new Classes(). new Inner();
//		i.m("Rahul");
//	}






