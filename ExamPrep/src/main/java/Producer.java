
import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer extends Thread {

    ArrayBlockingQueue<Integer> initialQueue;
    ArrayBlockingQueue<Integer> fibanacciQueue;
    Integer number;
    boolean isRunning = true;

    public Producer(ArrayBlockingQueue<Integer> initialQueue, ArrayBlockingQueue<Integer> fibanacciQueue) {
        this.initialQueue = initialQueue;
        this.fibanacciQueue = fibanacciQueue;
    }

    @Override
    public void run() {
        while (isRunning) {
            number = initialQueue.poll();
            if (number == null) {
                isRunning = false;
                } else {

                try {

                    number =(Integer) fib(number);
                    fibanacciQueue.put(number);

                } catch (InterruptedException ex) {
                    Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public int fib(int a) {
        if (a == 0 || a == 1) {
            return a;
        } else {
            return fib(a - 1) + fib(a - 2);
        }
    }
}
