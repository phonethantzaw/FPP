package Assignment8.Prob1;

import java.util.Arrays;

public class MyPersonList {
    private final int INITIAL_LENGTH = 4;
    private Person[] currentArray;
    private int numOfElements;

    public MyPersonList() {
        currentArray = new Person[INITIAL_LENGTH];
        numOfElements = 0;
    }

    //Add element in last
    public void add(Person s) {
        if (s == null) return;
        if (numOfElements == currentArray.length) resize();
        currentArray[numOfElements++] = s;
//        currentArray[numOfElements] = s;
//        numOfElements = numOfElements + 1;
    }

    public Person get(int i) {
        if (i < 0 || i >= numOfElements) {
            return null;
        }
        return currentArray[i];
    }

    private void resize() {
        System.out.println("resizing");
        int len = currentArray.length;
        int newlen = 2 * len;
        Person[] newArray = new Person[newlen];
        System.arraycopy(currentArray, 0, newArray, 0, len);
        currentArray = newArray;
    }

    public boolean isEmpty() {
        return numOfElements == 0;
    }

    public boolean find(Person s) {
        if (s == null) return false;

        for (int i = 0; i < numOfElements; i++) {
            if (currentArray[i].equals(s)) return true;
        }
//        for (String test : currentArray) {
//            if (test.equals(s)) return true;
//        }
        return false;
    }

    public void insert(Person s, int pos) { //E,2
        if (pos > numOfElements || pos < 0) return;
        if (numOfElements == currentArray.length) resize();

        Person[] temp = new Person[currentArray.length];//5
        System.arraycopy(currentArray, 0, temp, 0, pos); //A,B,C
        temp[pos] = s;

        System.arraycopy(currentArray, pos, temp, pos + 1, currentArray.length - (numOfElements + 1));
        currentArray = temp;
        ++numOfElements;
    }

    public boolean remove(Person s) {
        if (numOfElements == 0) return false;//list is empty
        if (s == null) return false;
        int index = -1;
        for (int i = 0; i < numOfElements; i++) {
            if (currentArray[i].equals(s)) {
                index = i;
                break;
            }

        }

        if (index == -1) return false; //s is not found in ArrayList
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index + 1, temp, index, currentArray.length - (numOfElements + 1));

        currentArray = temp;
        --numOfElements;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < numOfElements - 1; i++) {
            sb.append(currentArray[i] + ", ");
        }
        sb.append(currentArray[numOfElements - 1] + "]");
        return sb.toString();
    }

    public int size() {
        return numOfElements;
    }

    public Object clone() {
        Person[] temp = Arrays.copyOf(currentArray, numOfElements);
        return temp;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Mike", "Jackson", 23);
        Person p2 = new Person("Phone", "Bryan", 29);
        Person p3 = new Person("Philip", "Davie", 29);
        Person p4 = new Person("Lucas", "Joseph", 29);
        Person p5 = new Person("Thomas", "Alexander", 25);


        MyPersonList personList = new MyPersonList();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);

        personList.insert(p5, 2);
        System.out.println("At index 3 " + personList.get(3));
        personList.remove(p2);

        System.out.println("Person List: " + personList);


    }


}
