package Assignment1;

public class Main {
    public static void main(String[] args) {
//        1.
        String inputName = "Hi \uD83D\uDC4B my name is \"\u1018\u102F\u1014\u103A\u1038\".";
        System.out.println(inputName);
//        2.
        System.out.println("Name of size is " + inputName.length()); //Waving hand is supplementary characters so it take two code units, and Myanmar Unicode has only one unit

//        3.
        var randomNum = RandomNumbers.getRandomInt(0, 2000000000);
        System.out.println("Random Number " + randomNum);

        if (randomNum >= Byte.MIN_VALUE && randomNum <= Byte.MAX_VALUE) {
            System.out.println("Preferred data type: Byte");
        } else if (randomNum >= Short.MIN_VALUE && randomNum <= Short.MAX_VALUE) {
            System.out.println("Preferred data type: Short");
        } else if (randomNum >= Integer.MIN_VALUE && randomNum <= Integer.MAX_VALUE) {
            System.out.println("Preferred data type: Integer");
        } else if (randomNum >= Long.MIN_VALUE && randomNum <= Long.MAX_VALUE) {
            System.out.println("Preferred data type: Long");
        }
    }
}