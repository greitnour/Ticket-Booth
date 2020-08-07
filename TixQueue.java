import ch04.queues.ArrayBoundedQueue;
import ch04.queues.QueueUnderflowException;

import java.util.*;

public class TixQueue<T> extends ArrayBoundedQueue<TixOrder> {

    // Fields
    private int totTix;
    private int pause;

    // Constructor
    public TixQueue(int totTix, int pause) {
        this.totTix = totTix;
        this.pause = pause;
    }

    // Method to get Total Ticket Count
    public int getTotTix() {
        return totTix;
    }

    public void removeTix(int count) {
        totTix = totTix - count;
    }

    public String dequeueOrder() {
        TixOrder currOrder = dequeue();
        removeTix(currOrder.getTixCount());
        return "*************************************************" +
                "\nORDER NUMBER: " + getOrderNumber() +
                "\nTIME STAMP: " + getTimeStamp() +
                "\nName: " + currOrder.getName() +
                "\nTickets in Order: " + currOrder.getTixCount() +
                "\nRemaining Tickets for Sale: " + totTix +
                "\n*************************************************";
    }

    public String getTimeStamp() {
        Date now = new Date();
        return now.toString();
    }

    public int getOrderNumber() {
        String s = getTimeStamp();
        return Math.abs(s.hashCode());
    }
}