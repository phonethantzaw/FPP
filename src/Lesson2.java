import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Type your name");
//        String nextLine = sc.nextLine();
//        int count = 0;
//        for (int i = 0; i < nextLine.length(); i++) {
//            if (nextLine.charAt(i) == 'e') {
//                count++;
//            }
//        }
//        sc.close();
//        System.out.println(count);

//        whileCondition();
//        switchCondition();
//        stringSplit();
//        forEach();
        twoDArrays();
    }

    private static void whileCondition() {
//        int count = 0;
//        while (count < 5) {
//            System.out.println(count);
//            count++;
//        }
//
//        int count2 = 10;
//        do {
//            System.out.println(count2);
//            count2--;
//        } while (count2 >= 0);

        boolean condition = false;
        while (condition) {
            System.out.println("Hello");
        }

        do {
            System.out.println("Hello");
        } while (condition);

    }

//    private static void switchCondition() { //fallthrough behavior
//    if there is no break that will be output all
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Pick an integer in the range 1...9");
//        int val = sc.nextInt();
//        System.out.println();
//
//        switch (val) {
//            case 2:
//            case 4:
//            case 6:
//            case 8:
//                System.out.println("You choose an even number.");
//                break;
//            default:
//                System.out.println("You choose an odd number.");
//        }
//    }

    private static void stringSplit() {

        String str = "Hello,strings can be fun. They have many uses.";
        String[] arr = str.split(",| |\\. |\\.");
        System.out.println(Arrays.toString(arr));


    }

//    private static void forEach() {
////        int[] arr = {4, 5, 12, 25};
//        char[] arrName = {'P', 'H', 'O', 'N', 'E'};
//        for (char x : arrName) {
//            System.out.print(x);
//        }
//    }

//    private static void arrayCopyAndSorting() {
////        System.arraycopy(from,fromIndex,to,toIndex,count);
////        Arrays.sort(arr);
//
//
//        int[] smallParams = {2, 3, 5, 7, 11};
//        int[] copy = new int[5];
//        System.arraycopy(smallParams, 0, copy, 0, 5);
//
//        int[] smallPrimes = {2, 3, 5, 7, 11};
//        int[] luckNums = {350, 400, 150, 200, 250};
//        System.arraycopy(smallParams, 1, luckNums, 3, 2);
//
//
//        Arrays.sort(luckNums);
//
//    }

    private static void twoDArrays() { //[] row [] column
        String[][] teams = {{"Joe", "Bob", "Frank", "Steve" },
                {"Jon", "Tom", "David", "Ralph" },
                {"Tim", "Bev", "Susan", "Dennis" }};


        System.out.println(teams.length);
        System.out.println(teams[1].length);
        System.out.println(teams[1][2]);

    }
}
