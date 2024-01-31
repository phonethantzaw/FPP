package Lesson6.Exec;

public class Main {

    public static void main(String[] args) {
        Car[] cars = {new Car("toyota", 12), new Car("BMW", 10)};

        for (Car c : cars) {
            System.out.println(c);
        }
    }
}
