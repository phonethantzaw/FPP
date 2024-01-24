public class EE {
    static int count = 0;

    EE() {
        ++count;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {

        EE instance = null;
        for (int i = 0; i < 10; ++i) {
            instance = new EE();
        }
        System.out.println("Number of instances so far= " + instance.getCount());
    }
}
