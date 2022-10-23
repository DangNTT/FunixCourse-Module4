package OOP.dir6;

public class Byke extends Vehicle {
    void run() {
        System.out.println("Byke running");
    }

    float getprice() {
        return 20;
    }

    public static void main(String[] args) {
        Byke b = new Byke();
        System.out.println(b.getprice());
    }
}
