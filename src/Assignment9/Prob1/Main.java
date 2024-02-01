package Assignment9.Prob1;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl arrayQueue = new ArrayQueueImpl();
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(6);


        System.out.println(arrayQueue.peek());
        System.out.println(arrayQueue.dequeue());
        System.out.println("Size: " + arrayQueue.size());

    }
}
