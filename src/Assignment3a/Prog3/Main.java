package Assignment3a.Prog3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter C for Circle\n" +
                "Enter R for Rectangle\n" +
                "Enter T for Triangle");
        String input = sc.nextLine();
        switch (input) {
            case "R":
                System.out.println("Enter the width of the Rectangle");
                double width = sc.nextDouble();
                System.out.println("Enter the height of the Rectangle");
                double height = sc.nextDouble();
                Rectangle re = new Rectangle(width, height);
                System.out.println("The area of Rectangle is : " + re.computeArea());
                break;
            case "C":
                System.out.println("Enter the radius of the Circle");
                double radius = sc.nextDouble();
                Circle c = new Circle(radius);
                System.out.println("The area of Circle is : " + c.computeArea());
                break;
            case "T":
                System.out.println("Enter the base of the Triangle");
                double base = sc.nextDouble();
                System.out.println("Enter the height of the Triangle");
                double theight = sc.nextDouble();
                Triangle t = new Triangle(base, theight);
                System.out.println("The area of Rectangle is : " + t.computeArea());
                break;

        }
        sc.close();

    }
}
