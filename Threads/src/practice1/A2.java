package practice1;

public class A2 extends Thread{
	Remote r;
	public A2(Remote r) {
		this.r=r;
		
	}
	@Override
	public void run() {
		r.play("Ashu");
	}

}
