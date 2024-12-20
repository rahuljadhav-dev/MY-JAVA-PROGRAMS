package practice1;

public class X extends Thread{
	//using thread class
	@Override
	public void run() {
		System.out.println("Thread is running...");
	
	}
	public static void main(String[] args) {
		X call=new X();
		call.start();
	}
	

}
