package Lesson5;

public class Manager extends Employee {
    private double bonus;

    Manager(String aName, double aSalary, int aYear, int aMonth, int aDay) {
        super(aName, aSalary, aYear, aMonth, aDay);
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
