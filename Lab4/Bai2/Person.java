package Lab4.Bai2;

import java.util.Scanner;

public class Person {
    private String hoTen;
    private String gioiTinh;
    private String queQuan;
    private int namSinh;

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return this.gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return this.queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getNamSinh() {
        return this.namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getInformation() {
        return "Ho ten: " + this.hoTen + "\n"
                + "Gioi tinh: " + this.gioiTinh + "\n"
                + "Que quan: " + this.queQuan + "\n"
                + "Nam sinh: " + this.namSinh;
    }

    public void nhapThongTin(Scanner scanner) {

        System.out.print("Ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Gioi tinh: ");
        this.gioiTinh = scanner.nextLine();
        System.out.print("Que quan: ");
        this.queQuan = scanner.nextLine();
        System.out.print("Nam sinh: ");
        this.namSinh = Integer.parseInt(scanner.nextLine());
    }

}
