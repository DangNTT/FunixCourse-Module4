package lab3;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_nhanVien {
    private int maNhanVien;
    private String hoTen;
    private String gioiTinh;
    private String namSinh;
    private String queQuan;
    private String tenPhongBan;
    private String luong;

    public Lab3_nhanVien(int maNhanVien, String hoTen, String gioiTinh, String namSinh,
                         String queQuan, String tenPhongBan, String luong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
        this.tenPhongBan = tenPhongBan;
        this.luong = luong;
    }

    public Lab3_nhanVien() {
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Thong tin cua nhan vien la: " +"\'"+
                "Ma Nhan Vien='" + maNhanVien +"\'"+
                ", Ho Ten='" + hoTen + '\'' +
                ", Gioi Tinh='" + gioiTinh + '\'' +
                ", Nam Sinh='" + namSinh + '\'' +
                ", Que Quan='" + queQuan + '\'' +
                ", Ten Phong Ban='" + tenPhongBan + '\'' +
                ", luong='" + luong + '\'' +
                '}';
    }
    public void nhapThongTin(Scanner scanner){
        System.out.print("Ma nhan vien: ");
        this.maNhanVien = Integer.parseInt(scanner.nextLine());
        System.out.print("Ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Gioi tinh: ");
        this.gioiTinh = scanner.nextLine();
        System.out.print("Nam sinh: ");
        this.namSinh = scanner.nextLine();
        System.out.print("Que quan: ");
        this.queQuan = scanner.nextLine();
        System.out.print("Ten phong ban: ");
        this.tenPhongBan = scanner.nextLine();
        System.out.print("Luong: ");
        this.luong = scanner.nextLine();
    }

    public static void main(String[] args) {
        ArrayList<Lab3_nhanVien> nhanViens = new ArrayList<>();
        while (true){
            Scanner scanner = new Scanner(System.in);
            Lab3_nhanVien nv = new Lab3_nhanVien();
            nv.nhapThongTin(scanner);
            nhanViens.add(nv);
            System.out.println("Ban co muon nhap them nhan vien khong (Y/N)?");
            String a = scanner.nextLine();
            if(a.equals("Y")||a.equals("y")){
            }else {
                break;
            }
        }
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Nhan vien");
        Row titleRow = sheet.createRow(0);
        Cell cell = titleRow.createCell(0);
        cell.setCellValue(String.valueOf("Ma nhan vien"));
        Cell cell1 = titleRow.createCell(1);
        cell1.setCellValue("Ho ten");
        Cell cell2 = titleRow.createCell(2);
        cell2.setCellValue("Gioi tinh");
        Cell cell3 = titleRow.createCell(3);
        cell3.setCellValue("Nam sinh");
        Cell cell4 = titleRow.createCell(4);
        cell4.setCellValue("Que quan");
        Cell cell5 = titleRow.createCell(5);
        cell5.setCellValue("Ten phong ban");
        Cell cell6 = titleRow.createCell(6);
        cell6.setCellValue("Luong");
        for(int i = 0; i<nhanViens.size();i++){
            Lab3_nhanVien nhanVien = nhanViens.get(i);
            Row row = sheet.createRow(i+1);
            Cell localcell = row.createCell(0);
            localcell.setCellValue(String.valueOf(nhanVien.getMaNhanVien()));
            localcell = row.createCell(1);
            localcell.setCellValue(nhanVien.getHoTen());
            localcell = row.createCell(2);
            localcell.setCellValue(nhanVien.getGioiTinh());
            localcell = row.createCell(3);
            localcell.setCellValue(nhanVien.getNamSinh());
            localcell = row.createCell(4);
            localcell.setCellValue(nhanVien.getQueQuan());;
            localcell = row.createCell(5);
            localcell.setCellValue(nhanVien.getTenPhongBan());
            localcell = row.createCell(6);
            localcell.setCellValue(nhanVien.getLuong());
        }
        try{
            FileOutputStream out = new FileOutputStream(new File("D:/1.tester/Bai lab/Automation/Lab3/DSNhanvien.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("data.xlsx written successfully on disk.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
