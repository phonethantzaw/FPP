package Assignment2;

import java.util.Arrays;

public class Prog3 {
    public static void main(String[] args) {

        String[] arrString = {"horse", "dog", "cat", "horse", "dog" };
        String[] result = removeDups(arrString);
        System.out.println(Arrays.toString(result));

    }

    private static String[] removeDups(String[] arrays) {

        int idx = 0;

        for (int i = 0; i < arrays.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arrays[i].equals(arrays[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                idx++;
            }
        }

        String[] returnVals = new String[idx];
        int index = 0;
        for (int i = 0; i < arrays.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arrays[i].equals(arrays[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                returnVals[index++] = arrays[i];
            }

        }

        return returnVals;

    }
}
