package practice;

public class Rj extends Thread{
	Mobile m;
	public Rj(Mobile m) {
		this.m=m;
		
	}
	@Override
	public void run() {
		m.play("Chammak challo");
	}

}
