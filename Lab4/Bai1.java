package Lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

// Viết chương trình nhập vào 2 số thực a và b. 
// Bắt ngoại lệ nếu người dùng nhập vào không phải là số.
// Cài đặt hàm chia để lấy ra phần nguyên kết quả phép chia a /b , 
// trong đó bắt ngoại lệ nếu số chia b là 0 thì thông báo phép chia 
// không hợp lệ và kết thúc chương trình.

public class Bai1 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhap so thuc a: ");
                int a = scanner.nextInt();
                System.out.print("Nhap so thuc b: ");
                int b = scanner.nextInt();
                float c = a / b;
                System.out.println("Ket qua phep chia la: " + (c));
                break;
            } catch (InputMismatchException e) {
                // TODO: handle exception
                System.err.println("Day khong phai la so!");
            } catch (ArithmeticException e) {
                System.err.println("Phep chia khong hop le, b phai khac 0!");
                break;
            }
        }

    }
}
