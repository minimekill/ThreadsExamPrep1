
import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;




public class FibanacciCalc {
public void fibMethod(int threads){
            boolean isPrinting = true;
            ArrayBlockingQueue<Integer> initialQueue = new ArrayBlockingQueue(30);
            ArrayBlockingQueue<Integer> fibanacciQueue = new ArrayBlockingQueue(30);
            Producer p1 = new Producer(initialQueue, fibanacciQueue);
            Producer p2 = new Producer(initialQueue, fibanacciQueue);
            Producer p3 = new Producer(initialQueue, fibanacciQueue);
            Producer p4 = new Producer(initialQueue, fibanacciQueue);
            Consumer c1 = new Consumer(fibanacciQueue);
            
        try {
            
            initialQueue.put(4);
            initialQueue.put(5);
            initialQueue.put(8);
            initialQueue.put(12);
            initialQueue.put(21);
            initialQueue.put(22);
            initialQueue.put(34);
            initialQueue.put(35);
            initialQueue.put(36);
            initialQueue.put(37);
            initialQueue.put(42);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            if(threads == 1){
            p1.start();
                
            }else if(threads == 2){
            p1.start();
            p2.start();
                
            }else if(threads == 3){
            p1.start();
            p2.start();
            p3.start();
                
            } else if(threads == 4){
            p1.start();
            p2.start();
            p3.start();
            p4.start();
                
            } else{
                return;
            }
            
            c1.start();
    
        
        
    }
}
