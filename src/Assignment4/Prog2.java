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

/**
        countDigits(0)
        countDigits(1)			1+countDigits(0)
        countDigits(12)			1+countDigits(1)
        countDigits(123)		1+countDigits(12)
        countDigits(1234)		1+countDigits(123)
        countDigits(12345)		1+countDigits(1234)
        main()

        Runtime Stack

        Console
        Base Case
        5
 **/
