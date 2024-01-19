package Lesson3;

public final class School {
    private final String name;
    private final String address;


    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void func(int a) {
        System.out.println(a);
    }

    public int func(int a, double b) {
        return a + (int) b;
    }


}
