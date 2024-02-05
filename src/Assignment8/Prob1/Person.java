package Assignment8.Prob1;

public class Person {

    private String lasName;
    private String firstName;
    private int age;

    public Person(String lasName, String firstName, int age) {
        this.lasName = lasName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getLasName() {
        return lasName;
    }

    @Override
    public String toString() {
        return "Person {" +
                "lasName='" + lasName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
