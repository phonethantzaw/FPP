package Lesson8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    int size;
    ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public void addAtIndex(int index, int val) {
        if (index > size)
            return;
        if (index < 0)
            index = 0;

        ListNode pred = head;
        for (int i = 0; i < index; i++)
            pred = pred.next;

        ListNode toAdd = new ListNode(val);
        toAdd.next = pred.next;
        pred.next = toAdd;
        ++size;

    }

    public int get(int index) {
        if (index < 0 || index >= size) return 1;
        ListNode curr = head;
        for (int i = 0; i < index + 1; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        ListNode pred = head;
        for (int i = 0; i < index; i++)
            pred = pred.next;

        pred.next = pred.next.next;
        size--;

    }

    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList();
        ml.addAtHead(800);
        ml.addAtHead(300);
        ml.addAtTail(900);
        ml.addAtIndex(1, 200);
        ml.get(1);
        ml.deleteAtIndex(2);


        List<String> myLinkedList = new LinkedList<>(Arrays.asList("apple", "orange", "mango"));

        Iterator<String> iterator = myLinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        myLinkedList.forEach(name -> System.out.println(name.toUpperCase()));
    }
}
