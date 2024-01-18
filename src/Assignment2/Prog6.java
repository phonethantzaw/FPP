package Assignment2;

public class Prog6 {
    public static void main(String[] args) {
        int[] arrInt = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};

        int minVal = min(arrInt);
        System.out.println(minVal);

    }

    static int min(int[] arrayOfInts) {
        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] < minVal) {
                minVal = arrayOfInts[i];
            }
        }

        return minVal;
    }
}
