package OOP.dir6;

abstract class Vehicle {
    int age;
    String name;

    abstract void run();

    abstract float getprice();

    public void setName(String name) {
        System.out.println(name);
    }

}
