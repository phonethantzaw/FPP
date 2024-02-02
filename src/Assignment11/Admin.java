package Assignment11;

import java.util.*;

public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        //implement
        HashMap<Key, Student> stuList = new HashMap<>();

        for (Student stu : students) {
            stuList.put(new Key(stu.getFirstName(), stu.getLastName()), stu);
        }

        return stuList;
    }

    public static double computeAverageGPA(HashMap<Key, Student> maps) {
        //implements
        double totalAverageGPA = 0.0;

        for (Student stu : maps.values()) {
            totalAverageGPA += stu.getGpa();
        }

        return totalAverageGPA / maps.size();
    }
}
