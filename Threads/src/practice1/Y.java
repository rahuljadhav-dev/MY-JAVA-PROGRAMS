package practice1;

public class Y implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is running...");
		
	}
	public static void main(String[] args) {
		Y call=new Y();
		Thread obj=new Thread(call);
		obj.start();
		
	}

}
