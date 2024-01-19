package Assignment3a.Prog2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        LocalDate birthday;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String firstName = sc.nextLine();
        System.out.println("Please enter your last name:");
        String lastName = sc.nextLine();
        System.out.println("Please enter your birthday "
                + "in yyyy-MM-dd format (e.g. 1989-4-14): ");
        String dobInput = sc.nextLine();
        birthday = LocalDate.parse(dobInput, formatter);

        HeartRates hr = new HeartRates(firstName, lastName, birthday);
        hr.calcTargetHeartRate();
        System.out.println(hr);

        sc.close();

    }

}
