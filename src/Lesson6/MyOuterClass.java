package Lesson6;

public class MyOuterClass {
    MyInnerClass inner;

    private String param;

    MyOuterClass(String param) {
        inner = new MyInnerClass("innerStr");
        this.param = param;
    }

    void outerMethod() {
        System.out.println(inner.innerParam);
        inner.innerMethod();
//        String t = inner.this.innerParam; //compiler error
    }

    class MyInnerClass {
        private String innerParam;

        MyInnerClass(String innerParam) {
            this.innerParam = innerParam;
        }

        void innerMethod() {
            System.out.println(MyOuterClass.this.param);
            System.out.println(param);
        }
    }

    public static void main(String[] args) {
        (new MyOuterClass("outStr")).outerMethod();
        ;
    }
}
