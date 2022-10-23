package Lab4.Bai2;

import java.util.Scanner;

public class NhanVien extends Person {
    private String phongBan;
    private String chucVu;

    public String getPhongBan() {
        return this.phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getChucVu() {
        return this.chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void nhapThongTin(Scanner scanner) {
        super.nhapThongTin(scanner);
        System.out.print("Phong ban: ");
        this.phongBan = scanner.nextLine();
        System.out.print("Chuc vu: ");
        this.chucVu = scanner.nextLine();
    }

    public String getThongTin() {
        return super.getInformation() + "\n"
                + "Phong ban: " + this.phongBan + "\n"
                + "Chuc vu: " + this.chucVu;
    }
}
