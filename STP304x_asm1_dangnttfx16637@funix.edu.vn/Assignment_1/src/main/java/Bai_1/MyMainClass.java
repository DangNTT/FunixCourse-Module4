package Bai_1;

import java.util.Scanner;
// Tạo một class có tên: MyMainClass
// Sử dụng dụng hàm main viết đoạn mã lệnh thực hiện nhập ký tự từ bàn phím:
// Nhập số thứ nhất x =
// Nhập số thứ hai y =
// Nhập lệnh ACTION = 
// Trong đó số thứ nhất và số thứ 2 là kiểu số, nhập lệnh ACTION là một chuỗi, 
// chuỗi nhập vào có giá trị một trong danh sách sau:  “CONG” , “TRU”,  “NHAN”, “CHIA”. 
// So sánh chuỗi vừa nhập:
// Nếu nhập vào chuỗi:
// CONG thì thực hiện gọi hàm tinhTong()
// TRU thì thực hiện gọi hàm tinhHieu()
// NHAN thì gọi hàm tinhNhan() 
// CHIA  thì gọi hàm tinhChia() trong class CalculateUtils
// Nếu người dùng nhập vào action không phải là các giá trị trên thì in ra thông báo: 
// “Giá trị ACTION không hợp lệ” và kết thúc chương trình.

// In kết quả vừa thực hiện được ra màn hình.

public class MyMainClass extends CalculateUtils {
    public static void main(String[] args) {
        MyMainClass m = new MyMainClass();

        boolean flag = true;
        while (flag) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Vui long nhap so X: ");
                double x = scanner.nextDouble();
                System.out.print("Vui long nhap so Y: ");
                double y = scanner.nextDouble();
                System.out.println("Ban muon thuc hien phap tinh nao?" + "\n"
                        + "1. Cong" + "\n" + "2. Tru" + "\n" + "3. Nhan" + "\n" + "4. Chia");
                System.out.print("Vui long nhap ACTION: ");
                int action = scanner.nextInt();
                switch (action) {
                    case 1:
                        System.out.println("Ket qua cua phep cong la: " + m.tinhTong(x, y));
                        flag = false;
                        break;
                    case 2:
                        System.out.println("Ket qua cua phep tru la: " + m.tinhHieu(x, y));
                        flag = false;
                        break;
                    case 3:
                        System.out.println("Ket qua cua phep nhan la: " + m.tinhNhan(x, y));
                        flag = false;
                        break;
                    case 4:
                        System.out.println("Ket qua cua phep chia la: " + m.tinhChia(x, y));
                        flag = false;
                        break;
                    default:
                        System.out.println("Gia tri action khong hop le!");
                }
            } catch (Exception e) {
                System.out.println("Loi");
                // TODO: handle exception
            }
        }

    }
}
