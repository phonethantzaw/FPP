package Assignment2;

public class Prog4 {
    public static void main(String[] args) {
        float a = 1.27F;
        float b = 3.881F;
        float c = 9.6F;

        float sum = a + b + c;
        int intSum = (int) sum;

        System.out.println(intSum);
        System.out.println(Math.round(sum));

    }
}
