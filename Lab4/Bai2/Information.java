package Lab4.Bai2;

import java.util.Scanner;

public class Information {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ////// Lớp học ////////////////
        LopHoc lh = new LopHoc();
        lh.nhapThongTin(scanner);
        System.out.println(lh.getThongTin());

        ////// Giáo viên /////////////////////
        GiaoVien gv = new GiaoVien();
        gv.nhapThongTin(scanner, lh);
        System.out.println(gv.getThongTin());

        /////// Học sinh //////////////
        HocSinh hs1 = new HocSinh();
        hs1.nhapThongTin(scanner, lh, gv);
        System.out.println(hs1.getThongTinHocSinh());

        ////// Nhân viên ////////////////
        // NhanVien nv = new NhanVien();
        // nv.nhapThongTin(scanner);
        // System.out.println(nv.getThongTin());
    }
}
