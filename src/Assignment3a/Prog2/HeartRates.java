package Assignment3a.Prog2;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dob;

    private final int RHR = 70;
    private final int MHR = 220;
    private final double LB = 0.5;
    private final double UB = 0.85;

    public HeartRates(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int calculateAge() {
        AgeCalculator ageCalculator = new AgeCalculator();
        Period age = ageCalculator.calculateAge(dob);
        return age.getYears();

    }

    public int calcMaxHeartRate() {
        return MHR - calculateAge();
    }

    public void calcTargetHeartRate() {

        int AHR = MHR - RHR;
        double LBTHR = (AHR * LB) + RHR;
        double UBTHR = (AHR * UB) + RHR;

        System.out.println("The Target Heart Rate Range is between " + LBTHR + " and " + UBTHR);

    }

    @Override
    public String toString() {
        return "FirstName : " + firstName + '\n' +
                "LastName : " + lastName + '\n' +
                "Age : " + calculateAge() + '\n' +
                "Date of Birth : " + dob + '\n' +
                "Maxium Heart Rate : " + calcMaxHeartRate();
    }

}
