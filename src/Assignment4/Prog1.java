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

/**
 reverseInteger(0)
 reverseInteger(1)			n = 0
 reverseInteger(12)			n = 1
 reverseInteger(123)		n = 12
 reverseInteger(1234)		n = 123
 reverseInteger(12345)		n = 1234
 reverseInteger(123456)	    n = 12345
 main()

 Runtime Stack

 Console
 6
 5
 4
 3
 2
 1
 Base Case
 **/
