public class SingletonClass {
    private static SingletonClass object;
    String key;

    private SingletonClass() {
        key = "124A";
        this.getKey();
    }

    public static SingletonClass getInstance() {
        if (object != null) {
            System.out.println("Your Key is aldy created");
            return null;
        } else {
            System.out.println("Key generate successful");
            object = new SingletonClass();
            return object;
        }

    }

    private String getKey() {
        return this.key;
    }
}
