package Lesson8.Queue;

public class LinkQueueDemo {
    public static void main(String[] args) {
        LinkQueue q = new LinkQueue();
        q.display();
        q.enqueue('A');
        q.enqueue('B');
        q.enqueue('C');
        q.enqueue('D');
        q.display();
        System.out.println("Remove(): " + q.dequeue());
        q.display();
        System.out.println("peek(): " + q.peek());

    }
}
