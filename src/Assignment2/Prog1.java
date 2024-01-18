package Assignment2;

public class Prog1 {
    public static void main(String[] args) {

        var x = RandomNumbers.getRandomInt(1, 9);
        var y = RandomNumbers.getRandomInt(3, 14);

        var firstResult = Math.pow(Math.PI, x);
        var secondResult = Math.pow(y, Math.PI);

        System.out.println("First Compute Result :: " + firstResult);
        System.out.println("Second Compute Result :: " + secondResult);


    }
}
