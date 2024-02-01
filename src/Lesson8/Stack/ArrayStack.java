package Lesson8.Stack;

public class ArrayStack {
    private Object[] a;
    private int top;

    public ArrayStack(int n) {
        a = new Object[n];
        top = -1;
    }

    public void push(Object item) {
        if (top == a.length - 1) {
            System.out.println("Stack is full");
            return;
        }

        top++;
        a[top] = item;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }

        Object item = a[top];
        top--;
        return item;
    }

    public Object peek() { // get top item of stack
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
