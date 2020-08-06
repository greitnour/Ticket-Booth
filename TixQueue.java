import ch04.queues.ArrayBoundedQueue;
import java.util.*;


public class TixQueue<T> extends ArrayBoundedQueue<T> {
    //Parameters
    int totTix;
    int pause;
    //Constructor
    public TixQueue() {
        totTix = 10;
        pause = 10000;
    }
//    Method to check queue and print
//    Dequeue every 10 seconds
    while true {
        dequeue();
        //Print "no orders to process" or print processed order
        if (isempty()) {
            System.out.println("No orders to process");
        }
        else {
            System.out.println("Order processed");
        }
        //Print tickets remaining
        System.out.println(totTix + " tickets remaining");
        try {
            Thread.sleep(pause);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
