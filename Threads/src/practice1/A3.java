package practice1;

public class A3 extends Thread{
	Remote r;
	public A3(Remote r) {
		this.r=r;
		
	}
	@Override
	public void run() {
		r.play("shubh");
	}

}
