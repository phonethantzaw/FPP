package Lesson3;

public final class Immutable {
    private final String value;
    private final int num;

    Immutable(String value, int num) {
        this.value = value;
        this.num = num;
    }

    public String getValue() {
        return value;
    }

    public int getNum() {
        return num;
    }

//    1. Make the class final
//    2. Make all the class fields PRIVATE & FINAL
//    3. Remove all SETTER methods and
//    other methods that updates the values of the class fields

}
