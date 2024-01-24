package Assignment5.Prog2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = new Professor("Jame", 5000.0, LocalDate.of(2009, 6, 1));
        department[1] = new Professor("Mike", 6000.0, LocalDate.of(2008, 10, 11));
        department[2] = new Professor("John", 4000.0, LocalDate.of(2011, 1, 1));
        department[3] = new Secretary("Susan", 4000.0, LocalDate.of(2011, 1, 1), 20);
        department[4] = new Secretary("Jenny", 4000.0, LocalDate.of(2011, 1, 1), 15);


        String userInput = "Y";
        if (userInput.equals("Y")) {
            double totalSalary = 0.0;
            for (DeptEmployee employee : department) {
                totalSalary += employee.computeSalary();
            }
            System.out.println("Total salary of all employees: " + totalSalary);
        }
    }


}
