package Assignment4;

public class Prog2 {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(countDigits(n));
    }

    public static int countDigits(int n) {
        if (n == 0) {
            System.out.println("Base Case");
            return 0;
        } else {
            return 1 + countDigits(n / 10);
        }
    }
}
