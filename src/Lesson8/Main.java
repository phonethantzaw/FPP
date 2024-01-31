package Lesson8;

public class Main {
    public static void main(String[] args) {
        MyStringList mList = new MyStringList();
        mList.add("A");
        mList.add("B");
        mList.add("C");

        System.out.println(mList.get(0));
        System.out.println(mList.find("C"));
        mList.insert("D", 3);
        System.out.println(mList);


    }
}
