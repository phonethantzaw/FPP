package Assignment9.Prob2;

public class LinkedStack {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    public LinkedStack() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }


}
