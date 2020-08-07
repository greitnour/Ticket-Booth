import ch04.queues.ArrayBoundedQueue;

public class QueueProcessing {
    public static void main(String[] args) {

        TixQueue newTixQue = new TixQueue<TixOrder>(10,10000);
        //Thread queThread = new Thread((Runnable) newTixQue);

        TixOrder orderOne = new TixOrder("Elise", 5);

        newTixQue.enqueue(orderOne);
        System.out.println(newTixQue.getTotTix());
        System.out.println(newTixQue.dequeue().toString());


        //System.out.println(newTixQue.dequeue());
        //System.out.println(newTixQue.size());
    }
}