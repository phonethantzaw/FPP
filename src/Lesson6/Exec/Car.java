package Lesson6.Exec;

import java.util.Objects;

public class Car extends Vehicle {

    private int age;


    public Car(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Age " + age;
    }


}
