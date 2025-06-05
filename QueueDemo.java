import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
       // queue.poll();
        queue.peek();
        System.out.println("queue = " + queue);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(3);
        priorityQueue.add(1);
        System.out.println("priorityQueue = " + priorityQueue.poll());
    }
}
