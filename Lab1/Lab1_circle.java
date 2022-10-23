import java.util.Scanner;

public class Lab1_circle {
    int R;
    final float PI = 3.14f;

    public Lab1_circle() {

    }

    public float tinhchuvi() {
        float chuvi = (float) (2 * PI * R);
        return chuvi;
    }

    public float dientichhinhtron() {
        float dientich = (PI * R * R);
        return dientich;
    }

    public static void main(String[] args) {
        Lab1_circle circle = new Lab1_circle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("vui long nhap ban kinh hinh tron: ");
        circle.R = scanner.nextInt();
        System.out.println("Chu vi cua hinh tron la : " + circle.tinhchuvi());
        System.out.println("Dien tich cua hinh tron la : " + circle.dientichhinhtron());

    }

}
