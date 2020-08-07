import ch04.queues.ArrayBoundedQueue;
import ch04.queues.QueueUnderflowException;

import java.util.*;

public class TixQueue extends ArrayBoundedQueue<TixOrder> {

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

        String status = "";

        // Dequeue the first item in the queue save it variable currOrder
        TixOrder currOrder = dequeue();

        // If the order is requesting more tickets then available Status = FALSE
        if (totTix < currOrder.getTixCount()) {
            status = "Not enough tickets were available to complete this order.";
        } else {
            status = "Order was successful!!";
            removeTix(currOrder.getTixCount());
        }

        return "*************************************************" +
                "\nORDER NUMBER: " + getOrderNumber() +
                "\nTIME STAMP: " + getTimeStamp() +
                "\nName: " + currOrder.getName() +
                "\nOrder Status: " + status +
                "\nTickets Requested: " + currOrder.getTixCount() +
                "\nTickets Available: " + totTix +
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