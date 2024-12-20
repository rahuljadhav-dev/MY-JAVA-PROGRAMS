package practice;

public class Kailas extends Thread{
	Mobile m;
	public Kailas(Mobile m) {
		this.m=m;
		
		
	}
	@Override
	public void run() {
		m.play("Paisa hai to badi badi baatein");
	}

}
