package practice1;

public class A1 extends Thread{
	Remote r;
	public A1(Remote r) {
		this.r=r;
		
	}
	@Override
	public void run() {
		r.play("Rahul");
	
	}

}
