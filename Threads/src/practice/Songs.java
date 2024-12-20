package practice;

public class Songs {
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		Ash a=new Ash(obj);
		Rj r=new Rj(obj);
		Kailas k=new Kailas(obj);
		a.setPriority(6);
		r.setPriority(6);
		k.setPriority(1);
		System.out.println(a.getPriority());
		System.out.println(r.getPriority());
		System.out.println(k.getPriority());
	
		
		
		a.start();
		r.start();
		k.start();
	}

}
