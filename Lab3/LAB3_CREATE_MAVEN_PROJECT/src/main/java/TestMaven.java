package lab3;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TestMaven {
    public static void writeToExcelFile(ArrayList<lab3.User_ex> data) {
        ///// Khởi tạo workbook cho tệp xlsx
        XSSFWorkbook workbook = new XSSFWorkbook();
        // Khởi tạo một worksheet mới từ workbook
        XSSFSheet sheet = workbook.createSheet("User Details");


    }

    public static void main(String[] args) {
        //create data
        ArrayList<lab3.User_ex> data=new ArrayList<>();
        while (true){
            Scanner scanner = new Scanner(System.in);
            lab3.User_ex us = new lab3.User_ex();
            us.nhapThongTin(scanner);
            data.add(us);
            System.out.println("Ban co muon nhap them user moi khong (Y/N)? ");
            String x = scanner.nextLine();
            if(x.equals("Y")||x.equals("y")){
            }else {
                break;
            }
        }
        XSSFWorkbook workbook = new XSSFWorkbook();
        // Khởi tạo một worksheet mới từ workbook
        XSSFSheet sheet = workbook.createSheet("User Details");
        //Create title ID|FIRSTNAME|LASTNAME
        Row titleRow = sheet.createRow(0);
        Cell cell = titleRow.createCell(0);
        cell.setCellValue("ID");
        cell = titleRow.createCell(1);
        cell.setCellValue("FIRSTNAME");
        cell = titleRow.createCell(2);
        cell.setCellValue("LASTNAME");
        for (int i = 0; i < data.size(); i++) {
            lab3.User_ex u = data.get(i);
            Row localRow = sheet.createRow(i+1);//row 0 for title;
            Cell localCell = localRow.createCell(0);
            localCell.setCellValue(String.valueOf(u.getId()));
            localCell = localRow.createCell(1);
            localCell.setCellValue(u.getFirstName());
            localCell = localRow.createCell(2);
            localCell.setCellValue(u.getLastName());
        }
        try {
            // ghi dữ liệu xuống file
            FileOutputStream out = new FileOutputStream(new File("D:/demo/data.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("data.xlsx written successfully on disk.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
