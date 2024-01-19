package Lesson3;

class Operation {
    int data = 50;

    void change(Operation op) {
        op.data = op.data + 100;
    }
}

public class CallByReference {
    public static void main(String[] args) {
        Operation op = new Operation();

        System.out.println("before change "+ op.data);
        op.change(op);
        System.out.println("after change "+ op.data);
    }
}
