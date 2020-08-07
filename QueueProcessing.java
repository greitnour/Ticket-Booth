import ch04.queues.ArrayBoundedQueue;

public class QueueProcessing {
    public static void main(String[] args) {

        TixQueue newTixQue = new TixQueue(10,10000);
        //Thread queThread = new Thread((Runnable) newTixQue);

        // Create and enque order 1
        TixOrder orderOne = new TixOrder("Elise", 5);
        newTixQue.enqueue(orderOne);

        System.out.println("Current available tickets: " + newTixQue.getTotTix());

        // Create and enque order 2
        TixOrder orderTwo = new TixOrder("Andrew", 15);
        newTixQue.enqueue(orderTwo);

        // Process orders
        System.out.println(newTixQue.dequeueOrder());
        System.out.println(newTixQue.dequeueOrder());
    }
}