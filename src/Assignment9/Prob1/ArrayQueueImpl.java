package Assignment9.Prob1;

public class ArrayQueueImpl {

    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public void enqueue(int obj) {
        if (front == -1) {
            front = 0;
        } else if (rear == arr.length) {
            resize();
        }
        arr[rear++] = obj;

    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Array Queue is Empty");
            return -1;
        }

        int item = arr[front];
        arr[front++] = 0;
        if (front == rear) {
            front = -1;
            rear = 0;
        }
        return item;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return rear - front;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    private void resize() {
        int len = arr.length;
        int newlen = 2 * len;
        int[] newArray = new int[newlen];
        System.arraycopy(arr, front, newArray, 0, len);
        arr = newArray;
        rear = size();
        front = 0;
    }


}
