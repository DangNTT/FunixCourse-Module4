package OOP.dir8;

abstract class PhuongTienDiChuyen {
    String loaiPhuongTien;
    HangSanXuat hangSanXuat;

    public String layTenHangSanXuat() {
        return this.hangSanXuat.gettenHangSanXuat();
    }

    public void batDau() {
        System.out.println("Bat dau truoc 1 gio");
    }

    public void tangToc() {
        System.out.println("Tang toc sau 15 phut");
    }

    public void dungLai() {
        System.out.println("Dung lai truoc 1 gio 30 phut");
    }

    abstract double layVanToc();
}
