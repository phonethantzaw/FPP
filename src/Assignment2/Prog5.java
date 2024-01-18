package Assignment2;

import java.util.Arrays;

public class Prog5 {

    public static void main(String[] args) {
        int[] a = {5, 6, -4, 3, 1};
        int[] b = {3, 8, 9, 11};
        int[] c = combine(a, b);
        System.out.println(Arrays.toString(c));

    }

    public static int[] combine(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];

        int idx = 0;
        for (int val : a) {
            c[idx++] = val;
        }

        for (int num : b) {
            c[idx++] = num;
        }

        return c;
    }
}
