package Lesson6.InnerClassExample;

public class Child extends Parent{
    Child(){
        super("Hi");
    }
    @Override
    public void methodA(){
        System.out.println("Child class version A");
    }
    @Override
    public void methodB(){
        System.out.println("Child class version B");
    }
}
