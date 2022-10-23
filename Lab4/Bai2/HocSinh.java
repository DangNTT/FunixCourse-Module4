package Lab4.Bai2;

import java.util.Scanner;

public class HocSinh extends Person {
    private String thoiKhoaBieu;
    private GiaoVien giaoVienChuNhiem;
    private LopHoc lopDangHoc;

    public String getThoiKhoaBieu() {
        return this.thoiKhoaBieu;
    }

    public void setThoiKhoaBieu(String thoiKhoaBieu) {
        this.thoiKhoaBieu = thoiKhoaBieu;
    }

    public GiaoVien getGiaoVienChuNhiem() {
        return this.giaoVienChuNhiem;
    }

    public void setGiaoVienChuNhiem(GiaoVien giaoVienChuNhiem) {
        this.giaoVienChuNhiem = giaoVienChuNhiem;
    }

    public LopHoc getLopDangHoc() {
        return this.lopDangHoc;
    }

    public void setLopDangHoc(LopHoc lopDangHoc) {
        this.lopDangHoc = lopDangHoc;
    }

    public void nhapThongTin(Scanner scanner, LopHoc lopDangHoc, GiaoVien giaoVienChuNhiem) {
        System.out.println("Vui long nhap day du thong tin cua hoc sinh: ");
        super.nhapThongTin(scanner);
        System.out.print("Thoi khoa bieu: ");
        this.thoiKhoaBieu = scanner.nextLine();
        this.giaoVienChuNhiem = giaoVienChuNhiem;
        this.lopDangHoc = lopDangHoc;

    }

    public String getThongTinHocSinh() {
        return "Thong tin cua hoc sinh la: " + "\n"
                + super.getInformation() + "\n"
                + "Thoi khoa bieu: " + this.thoiKhoaBieu + "\n"
                + "Giao vien chu nhiem: " + "\n"
                + this.giaoVienChuNhiem.getInformation() + "\n"
                + this.lopDangHoc.getThongTin();

    }

}
