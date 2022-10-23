package Lab4.Bai2;

import java.util.Scanner;

public class LopHoc {
    private String tenLop;
    private int siSo;
    private int khoi;

    public LopHoc(String tenLop, int siSo, int khoi) {
        this.tenLop = tenLop;
        this.siSo = siSo;
        this.khoi = khoi;
    }

    public LopHoc() {

    }

    public String getTenLop() {
        return this.tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getSiSo() {
        return this.siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }

    public int getKhoi() {
        return this.khoi;
    }

    public void setkhoi(int khoi) {
        this.khoi = khoi;
    }

    public void nhapThongTin(Scanner scanner) {
        System.out.println("Hay nhap thong tin lop hoc: ");
        System.out.print("Ten lop: ");
        this.tenLop = scanner.nextLine();
        System.out.print("Si so: ");
        this.siSo = Integer.parseInt(scanner.nextLine());
        System.out.print("Khoi: ");
        this.khoi = Integer.parseInt(scanner.nextLine());
    }

    public String getThongTin() {
        return "Thong tin lop hoc la: " + "\n"
                + "Ten lop: " + this.tenLop + "\n"
                + "Si so: " + this.siSo + "\n"
                + "Khoi: " + this.khoi;
    }
}
