package Lesson8.Stack;

public class ArrayStackInt {
    private Integer[] a;
    private int top;

    public ArrayStackInt(int n) {
        a = new Integer[n];
        top = -1;
    }

    public void push(Integer item) {
        if (top == a.length - 1) {
            System.out.println("Stack is full");
            return;
        }

        top++;
        a[top] = item;
    }

    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }

        Integer item = a[top];
        top--;
        return item;
    }

    public Integer peek() { // get top item of stack
        if (isEmpty()) {
            return null;
        }

        return a[top];
    }

    public boolean isEmpty() { // true if stack is empty
        return (top == -1);
    }

    public int size() { // returns number of items in stack
        return top + 1;
    }
}
