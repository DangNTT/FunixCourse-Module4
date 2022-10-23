package OOP.dir1;

public class Demo2 {
    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println("Tong hai so la: " + demo.sum(3, 4));
        System.out.println("Tong hai so la: " + demo.sum(5, 4));
    }

}
