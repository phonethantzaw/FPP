package Lesson12;

public class FinallyTest {
    public static void test() throws Exception {
        try {
            System.out.println("Inside test.");
//            return;              // 1
            System.exit(0);      // 2
//            throw new Exception("first"); //3a

        } catch (Exception x) {
            System.out.println(x.getMessage());
         throw new Exception("second");   //3b
        } finally {
//         System.exit(0);
            System.out.println("finally!");
        }
//        System.out.println("last statement");
//        System.exit(0);
    }

    public static void main(String[] args) {
        try {
            System.out.println("Hi");
            test();
        } catch (Exception x) {
            System.out.println("Inside main method: " + x.getMessage());
        }
        System.out.println("END");
    }
}
