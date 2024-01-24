package Assignment5.Prog4;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new HourlyEmployee("Mike", "Joe", "123-45-6789", 15.0, 40.0);
        employees[1] = new SalariedEmployee("James", "Smith", "987-65-4321", 800.0);
        employees[2] = new CommissionEmployee("Bob", "Johnson", "456-78-9012", 50000.0, 0.05);
        employees[3] = new BasePlusCommissionEmployee("Alice", "Brown", "234-56-7890", 100000.0, 0.03, 2000.0);
        employees[4] = new HourlyEmployee("Tom", "Davis", "789-01-2345", 20.0, 35.0);


        double totalSalaries = 0.0;
        for (Employee employee : employees) {
            totalSalaries += employee.getPayment();
            System.out.println(employee);
        }

        System.out.println("Total Salaries: " + totalSalaries);
    }
}
