package Lesson8.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(42);
        q.add(-3);
        q.add(17); // front [42,-3,17] back
        System.out.println(q.remove()); //42

        //Important: when constructiong a queue you must use a new LinkedList instead of a new Queue because It is an Interface
    }
}
