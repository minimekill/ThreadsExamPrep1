
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer extends Thread {

    ArrayBlockingQueue<Integer> fibanacciQueue;
    Integer number;
    boolean isPrinting = true;
    int sum;

    public Consumer(ArrayBlockingQueue<Integer> fibanacciQueue) {
        this.fibanacciQueue = fibanacciQueue;
    }

    @Override
    public void run() {
        while (isPrinting) {
            try {
                number = fibanacciQueue.poll(3,TimeUnit.SECONDS);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (number == null) {
                isPrinting = false;
                System.out.println("The sum of all numbers is: " + sum);
                System.out.println("quit");
            } else {
                sum += number;
                System.out.println(number);
            }
        }
    }
}
