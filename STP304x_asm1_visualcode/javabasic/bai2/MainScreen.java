package ASSIGNMENT_1_JAVA.javabasic.bai2;

import java.util.Scanner;

// Tạo một class có tên MainScreen
// Nhập vào một số nguyên bất kỳ từ bàn phím N>0. 
// Nếu N>0 thì mới thực hiện các bước tiếp theo
// Tính tổng các số chẵn và tổng các số lẻ từ 0 đến N.
// Đếm xem  từ 0 đến N có bao nhiều số chia hết cho 3 nhưng không chia hết cho 2
// In kết quả ra màn hình.

public class MainScreen {
    public static void main(String[] args) {
        int tongchan = 0;
        int tongle = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Vui long nhap vao 1 so nguyen n: ");
            int n = scanner.nextInt();
            if (n > 0) {
                for (int i = 0; i <= n; i++) {
                    if (i % 2 == 0) {
                        tongchan = tongchan + i;
                    } else {
                        tongle = tongle + i;
                    }
                    if (i % 3 == 0 & i % 2 != 0) {
                        count = count + 1;
                    }
                }
                System.out.println("Tong cac so chan tu 0 den " + n + " la: " + tongchan);
                System.out.println("Tong cac so le tu 0 den " + n + " la: " + tongle);
                System.out.println("So luong cac so chia het cho 3 va khong chia het cho 2 la: " + count);
                break;
            } else {
                System.out.println("So vua nhap khong hop le, vui long nhap lai!");
            }

        }
    }

}
