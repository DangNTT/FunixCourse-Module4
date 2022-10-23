import java.util.Scanner;

public class Lab1ex_rectangle {
    int dai;
    int rong;

    public Lab1ex_rectangle(int dai, int rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public Lab1ex_rectangle() {

    }

    public int tinhchuvi() {
        int chuvi = (this.dai + this.rong) * 2;
        return chuvi;
    }

    public int tinhdientich() {
        int dientich = (this.dai * this.rong);
        return dientich;
    }

    public static void main(String[] args) {
        Lab1ex_rectangle rectangle = new Lab1ex_rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui long nhap chieu dai : ");
        rectangle.dai = scanner.nextInt();
        System.out.print("vui long nhap chieu rong : ");
        rectangle.rong = scanner.nextInt();
        System.out.println("Chu vi cua hinh chu nhat la : " + rectangle.tinhchuvi());
        System.out.println("dien tich cua hinh chu nhat la : " + rectangle.tinhdientich());
    }

}
