package Lesson3;

public class RecursionString {

    public static void main(String[] args) {
        stringSize("ORANGE");
        System.out.println("StringSize function finished.");

    }

    public static int stringSize(String str) {
        if (str == null || str.equals("")) {
            System.out.println("Base Case");
            return 0;
        } else {
            int size = 1 + stringSize(str.substring(1));
            System.out.println("Size :" + size);
            return size;
        }
    }
}
