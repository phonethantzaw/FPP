package Lesson11;

import java.util.Hashtable;
import java.util.Set;

public class HashtableDemo {

    public static void main(String[] args) {
        Hashtable<Integer, Empl> tm = new Hashtable<>();
        tm.put(1, new Empl(134, "Ramu", 3000));
        tm.put(5, new Empl(135, "Jony", 6000));
        tm.put(3, new Empl(876, "Crish", 2000));
        tm.put(4, new Empl(512, "Tom", 2400));
        System.out.println("Hashtable entries:");
        Set<Integer> keys = tm.keySet();
        for (Integer key : keys) {
            System.out.println(key + " ==> " + tm.get(key));
        }
        tm.remove(4);
        tm.replace(5, new Empl(235, "Jony", 3200));
        System.out.println(tm);
    }


}

class Empl {
    private String name;
    private int salary;
    private int id;

    public Empl(int id, String n, int s) {
        this.id = id;
        this.name = n;
        this.salary = s;
    }

    public String toString() {
        return id + "\n" + name + "\n" + salary + "\n";
    }
}
