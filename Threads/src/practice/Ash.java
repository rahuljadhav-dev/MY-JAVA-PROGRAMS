package practice;

public class Ash extends Thread{
	Mobile m;
	public Ash(Mobile m) {
		this.m=m;
	}
	@Override
	public void run() {
		m.play("Tum hi ho bandhu ");
	}
	

}
