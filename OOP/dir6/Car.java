package OOP.dir6;

import java.security.spec.PSSParameterSpec;

public class Car extends Vehicle {
    void run() {
        System.out.println("Car running ");
    }

    float getprice() {
        return 10;
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.run();
        c.age = 2;
        c.setName("Dang");
        System.out.println(c.age);
    }
}
