package Assignment5.Prog5;

import java.util.Objects;

public class Computer {

    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }


    public double computePower() {
        return ramSize * processorSpeed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Computer computer = (Computer) obj;
        return ramSize == computer.ramSize &&
                Double.compare(computer.processorSpeed, processorSpeed) == 0 &&
                Objects.equals(manufacturer, computer.manufacturer) &&
                Objects.equals(processor, computer.processor);
    }


    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
    }

    public static void main(String[] args) {

        Computer computer1 = new Computer("Apple", "Macbook Pro", 8, 2.5);
        Computer computer2 = new Computer("Intel", "Dell", 16, 3.0);


        System.out.println("Are the computers equal? " + computer1.equals(computer2));

        System.out.println("HashCode of computer1: " + computer1.hashCode());
        System.out.println("HashCode of computer2: " + computer2.hashCode());
    }
}
