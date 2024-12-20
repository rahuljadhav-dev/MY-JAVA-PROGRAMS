
public class Score extends Thread{
	@Override
	public void run() {
		for(int i=10;i<=500;i+=50) {
			System.out.println("Score= "+i);
			
		}
	}

}
