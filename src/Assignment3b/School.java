package Assignment3b;


public class School {

    private static School instance1 = null;
    private static School instance2 = null;
    private static School instance3 = null;

    private School() {

    }

    public static School getInstance1() {
        if (instance1 == null) {
            instance1 = new School();
        }

        return instance1;
    }

    public static School getInstance2() {
        if (instance2 == null) {
            instance2 = new School();
        }

        return instance2;
    }

    public static School getInstance3() {
        if (instance3 == null) {
            instance3 = new School();
        }

        return instance3;
    }

}
