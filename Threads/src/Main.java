
public class Main {
	   public static void main(String[] args) {
	        final ProducerConsumer pc = new ProducerConsumer();

	        Thread producerThread = new Thread(() -> {
	            try {
	                pc.produce();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        Thread consumerThread = new Thread(() -> {
	            try {
	                pc.consume();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        producerThread.start();
	        consumerThread.start();
	    }
	

}
