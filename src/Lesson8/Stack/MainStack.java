package Lesson8.Stack;

import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
//        Stack<Integer> s = new Stack<Integer>();
//        s.push(42);
//        s.push(-3);
//        s.push(17); // bottom [42,-3,17] top
//        System.out.println(s.pop()); //17

        ArrayStackInt as = new ArrayStackInt(4);
        as.push(1);
        as.push(2);
        as.push(3);
        as.push(4);
        System.out.println(as.pop());
        System.out.println(as.peek());
    }

}
