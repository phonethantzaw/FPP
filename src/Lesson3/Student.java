package Lesson3;

public class Student {
    public String name;
    public int age;
    public static String schoolName;

    {
        //instance block
        name = "John";
        System.out.println("Hello");
    }

    static {
        //static block
        schoolName = "MIU";
    }

    public Student(String name) {
        this("Mike", 25);
        System.out.println(name);
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
