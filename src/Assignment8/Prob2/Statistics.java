package Assignment8.Prob2;

import java.util.*;

public class Statistics {
    /**
     * Polymorphically computes and returns the sum
     * of all the salaries of all the staff/teachers in the list.
     */
    public static double computeSumOfSalaries(List<EmployeeData> aList) {
        double sum = 0.0;

        for (EmployeeData ea : aList) {
            sum += ea.getSalary();
        }
        //implement
        //compute sum of all salaries of people in aList and return
        return sum;

    }
}
