import Assignment1.RandomNumbers;

public class Lecture {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Type your name: ");
//        System.out.println("you wrote: " + sc.nextLine());
//        System.out.print("Type your age: ");
//        System.out.println("your age: " + sc.nextInt());
//        sc.close();


//        int a = 3;
//        int c = ++a * 2;
//        int d = a++ *1;
//        System.out.println(c +" "+d);

//        int res = 4 & 5;  //100
//        int res1 = 4 | 5; //101
//        int res2 = 4 ^ 5;
//        System.out.println(res); //100
//        System.out.println(res1); //101
//        System.out.println(res2); //001

        //100 -> 4
        //101 -> 5

//        int value = 3; //32 bit
//        int complementedValue = ~value;
//        System.out.println("value: " + value + " complementedValue: " + complementedValue);
//        System.out.println("Binary of the value: " + Integer.toBinaryString(value)); //0000000000000000000000000000011
//        System.out.println("Binary of the complementedValue: " + Integer.toBinaryString(complementedValue)); //11111111111111111111111111111100


//        int num = 12;
//        int leftShift = num << 2;
//        System.out.println("Num: " + num + " leftShift: " + leftShift);
//        System.out.println("Binary of the num: " + Integer.toBinaryString(num)); //0000000000000000000000000001100
//        System.out.println("Binary of the leftShift: " + Integer.toBinaryString(leftShift)); //0000000000000000000000000110000
//
//        double x = 9.97;
//        int nx = (int) Math.round(x);
//        System.out.println(nx);
//
//        int xx = 130;
//        byte b = (byte) xx;
//        System.out.println(b);

        String name = "Robert";
//        System.out.println(name.substring(0, 3));//last index n-1 Rob
//        System.out.println(name.substring(0, name.length()));//Robert
//        System.out.println(name.substring(0, 1));//R
//        System.out.println(name.substring(0, 0));
//
//        System.out.println(name.indexOf('t'));
//        System.out.println(name.indexOf("bert"));
//
//        System.out.println(name.startsWith("Rob"));
//        System.out.println(name.startsWith("R"));
//        System.out.println(name.startsWith("bert"));
//
//        String space = " ";
//        String lastName = "Stevens";
//        System.out.println(name + space + lastName);

//        System.out.println(name.equals("Robert"));
//        System.out.println(name == "Robert");
//        String newName = new String("Robert");
//        System.out.println(newName == "Robert");
//        System.out.println(newName.equals("Robert"));

//        String str1 ="Hello";
//        String str2 ="Hello";
//        String str3 = new String("Hello");
//        String str4 = new String("Hello");
//        String str5 = str4;
//
//
//        System.out.println(str1 == str2);//
//        System.out.println(str2 == str3);//
//        System.out.println(str3 == str4);//
//        System.out.println(str4 == str5);//

//        System.out.println("a".compareTo("b"));
//        System.out.println("b".compareTo("a"));
//        System.out.println("a".compareTo("a"));

        int sales = RandomNumbers.getRandomInt();
        int target = RandomNumbers.getRandomInt();
        String performance;
        int bonus;


        if (sales >= 2 * target) {
            performance = "Excellent";
            bonus = 100;
        } else if (sales >= target) {
            performance = "Satisfactory";
            bonus = 50;
        } else {
            performance = "Unsatisfactory";
            bonus = 0;
        }

        System.out.println(performance);
        System.out.println(bonus);


    }
}
