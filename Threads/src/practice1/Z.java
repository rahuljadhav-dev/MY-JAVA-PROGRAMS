package practice1;

public class Z implements Runnable{

	@Override
	public void run() {
		System.out.println("thread is created and running successfully...");
		
	}
	public static void main(String[] args) {
		Runnable r1=new Z();
		Thread t1=new Thread(r1,"my thread");
		t1.start();
		System.out.println(t1.getName());
	}

}
