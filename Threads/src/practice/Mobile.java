package practice;

public class Mobile{
	synchronized void play(String songs) {
		try {
			for(int i=1;i<2;i++) {
				System.out.println("Playing songs "+songs);
				Thread.sleep(5000);
			}
		} catch (Exception e) {
	
		}
		

	}
	
	

}
