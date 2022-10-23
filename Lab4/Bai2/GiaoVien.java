package Lab4.Bai2;

import java.util.Scanner;

public class GiaoVien extends Person {
    private LopHoc lopDangChuNhiem;
    private String tenBoMon;
    private String thoiKhoaBieu;

    public String getThoiKhoaBieu() {
        return this.thoiKhoaBieu;
    }

    public void setThoiKhoaBieu(String thoiKhoaBieu) {
        this.thoiKhoaBieu = thoiKhoaBieu;
    }

    public String getTenBoMon() {
        return this.tenBoMon;
    }

    public void setTenBoMon(String tenBoMon) {
        this.tenBoMon = tenBoMon;
    }

    public LopHoc getLopDangChuNhiem() {
        return this.lopDangChuNhiem;
    }

    public void setLopDangChuNhiem(LopHoc lopDangChuNhiem) {
        this.lopDangChuNhiem = lopDangChuNhiem;
    }

    public void nhapThongTin(Scanner scanner, LopHoc lopDangChuNhiem) {
        System.out.println("Vui long nhap day du thong tin cua giao vien: ");
        super.nhapThongTin(scanner);
        this.lopDangChuNhiem = lopDangChuNhiem;
        System.out.print("Ten bo mon: ");
        this.tenBoMon = scanner.nextLine();
        System.out.print("Thoi khoa bieu: ");
        this.thoiKhoaBieu = scanner.nextLine();
    }

    public String getThongTin() {

        return "Thong tin cua giao vien la: " + "\n"
                + super.getInformation() + "\n"
                + this.lopDangChuNhiem.getThongTin() + "\n"
                + "Ten bo mon: " + this.tenBoMon + "\n"
                + "Thoi khoa bieu: " + this.thoiKhoaBieu;
    }

}
