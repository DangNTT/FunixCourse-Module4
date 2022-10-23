import java.util.Scanner;

public class Lab1_triangle {
    int a;
    int b;
    int c;

    public Lab1_triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Lab1_triangle() {

    }

    public int tinhchuvi() {
        int chuvi = (this.a + this.b + this.c);
        return chuvi;
    }

    public float tinhdientich() {
        float p = (float) (a + b + c) / 2;
        float m = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return m;
    }

    public static void main(String[] args) {
        Lab1_triangle tg = new Lab1_triangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("vui long nhap canh a: ");
        tg.a = scanner.nextInt();
        System.out.println("vui long nhap canh b: ");
        tg.b = scanner.nextInt();
        System.out.println("vui long nhap canh c: ");
        tg.c = scanner.nextInt();
        System.out.println("Chu vi cua hinh tam giac la: " + tg.tinhchuvi());
        System.out.println("Dien tich cua hinh tam giac la: " + tg.tinhdientich());
    }
}
