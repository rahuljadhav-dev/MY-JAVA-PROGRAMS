package practice1;

public class Remote {
	public synchronized void play(String control) {
		try {
			for(int i=0;i<1;i++) {
				System.out.println("Remote control :"+control+"'s hands");
				Thread.sleep(5000);
			
			}
			
		} catch (Exception e) {
			
		}
		

	}

}
