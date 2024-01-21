package Assignment4;

public class Prog1 {
    public static void main(String[] args) {
        int num = 123456;
        reverseInteger(num);
    }

    public static void reverseInteger(int n) {
        if (n == 0) {
            System.out.println("Base Case");
            return;
        } else {
            int reversedigit = n % 10;
            System.out.println(reversedigit);
            reverseInteger(n / 10);
        }

    }

}
