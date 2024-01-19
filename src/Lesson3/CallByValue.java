package Lesson3;

class OperationAR {
    int data = 50;

    void change(int data) {
        data = data + 100;
    }

}

public class CallByValue {

    public static void main(String[] args) {
        OperationAR op = new OperationAR();
        System.out.println("before cahnge " + op.data);
        op.change(500);
        System.out.println("after cahnge " + op.data);
    }
}
