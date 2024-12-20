import java.util.*;
public class ProducerConsumer {
	 private LinkedList<Integer> buffer = new LinkedList<>();
	    private final int MAX_SIZE = 5;

	    public void produce() throws InterruptedException {
	        int value = 0;
	        while (true) {
	            synchronized (this) {
	                // If buffer is full, wait for consumer to consume
	                while (buffer.size() == MAX_SIZE) {
	                    wait();
	                }
	                System.out.println("Producer produced: " + value);
	                buffer.add(value++);
	                // Notify consumer that data is available
	                notify();
	                // Introduce some delay for demonstration
	                Thread.sleep(1000);
	            }
	        }
	    }

	    public void consume() throws InterruptedException {
	        while (true) {
	            synchronized (this) {
	                // If buffer is empty, wait for producer to produce
	                while (buffer.size() == 0) {
	                    wait();
	                }
	                int value = buffer.removeFirst();
	                System.out.println("Consumer consumed: " + value);
	                // Notify producer that buffer has space available
	                notify();
	                // Introduce some delay for demonstration
	                Thread.sleep(1000);
	            }
	        }
	    }
	}

	


