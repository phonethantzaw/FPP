package Assignment8.Prob3;


import java.util.*;

public class Main {


    public static void main(String[] args) {

        Marketing p1 = new Marketing("Mike", "Dell", 900);
        Marketing p2 = new Marketing("Phone", "Apple", 1900);
        Marketing p3 = new Marketing("Lucas", "NOKIA", 2900);
        Marketing p4 = new Marketing("Thomas", "Tesla", 2500);
        Marketing p5 = new Marketing("Philip", "Google", 1600);
        Marketing p6 = new Marketing("Jame", "Amazon", 700);


        List<Marketing> mkList = new ArrayList<>();
        mkList.add(p1);
        mkList.add(p2);
        mkList.add(p3);
        mkList.add(p4);
        mkList.add(p5);
        mkList.add(p6);

        mkList.remove(p6);

        System.out.println("Size of Marketing List :" + mkList.size());

        System.out.println("Marketing List: " + mkList);


        Comparator<Marketing> salaryCompare = new Comparator<Marketing>() {
            @Override
            public int compare(Marketing m1, Marketing m2) {
                return Double.compare(m1.getSalesamount(), m2.getSalesamount());
            }
        };
        Collections.sort(mkList, salaryCompare);

        System.out.println("Sales Amount using comparator List: " + mkList);

        List<Marketing> rmlist = listMoreThan1000(mkList);
        Comparator<Marketing> nameCompare = Comparator.comparing(Marketing::getEmployeename);
        Collections.sort(rmlist, nameCompare);

        System.out.println("ListMoreThan1000 " + rmlist);

    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        // Implement a body
        List<Marketing> nwList = new ArrayList<>();
        for (Marketing m : list) {
            if (m.getSalesamount() > 1000) {
                nwList.add(m);
            }
        }
        return nwList;
    }

}
