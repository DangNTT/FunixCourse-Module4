import java.util.Scanner;

public class Lab2_ex {
    public static void main(String[] args) {

        //// Yêu cầu nhập vào từ bàn phím một số nguyên N, kiểm tra số vừa nhập là số
        //// chẵn hay số lẻ.
        System.out.print("Vui long nhap 1 so nguyen n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("Day la so chan!");
        } else {
            System.out.println("Day la so le!");
        }

        /////// Nhập vào từ bàn phím một số nguyên dương N > 0. In ra màn hình dãy số
        //// theo thứ tự giảm dần từ N → 1.
        System.out.print("Vui long nhap vao so nguyen duong n1: ");
        Scanner scanner1 = new Scanner(System.in);
        int n1 = scanner1.nextInt();
        System.out.print("Day so giam dan tu n1 den 1 la: ");
        while (n1 > 0) {
            System.out.print(n1 + " ");
            n1--;
        }

        //////////// nhập vào một số nguyên dương a > 0, Nếu a < 0 hoặc a = 0 thì yêu
        //////////// cầu nhập lại.
        Scanner scanner2 = new Scanner(System.in);
        int a;
        do {
            System.out.print("Vui long nhap so nguyen duong a: ");
            a = scanner2.nextInt();
        } while (a <= 0);
        System.out.println("a = " + a);

        ////////////// Yêu cầu nhập vào một số nguyên dương x > 0. Tính tổng các số chẵn
        ////////////// và các số lẻ từ 1→ x. In kết quả ra màn hình.
        int tongchan = 0;
        int tongle = 0;
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Vui long nhap vao so nguyen duong X: ");
        int x = scanner3.nextInt();
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                tongchan = tongchan + i;
            } else {
                tongle = tongle + i;
            }
        }
        System.out.println("Tong cac so chan tu 1 den " + x + " la: " + tongchan);
        System.out.println("Tong cac so le tu 1 den " + x + " la: " + tongle);

/// Nhập vào 1 số bất kì từ bàn phím. Nếu số đó có giá trị bằng 2 → in ra màn hình
///////// “Monday. Nếu = 3 thì in ra “Tuesday … 8→ “Sunday”
//////// Nếu nằm ngoài giá trị từ 2→ 8, in ra “Giá trị không hợp lệ”
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Nhap 1 so bat ki: ");
        int y = scanner4.nextInt();
        switch (y) {
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            case 8:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Gia tri khong hop le!");
        }

        /////////////// Cho chuỗi sau : "Xi nc hao c a cba n";
        /////////////// ● Đếm số dấu cách (khoảng trắng) trong chuỗi.
        /////////////// ● Xóa bỏ toàn bộ khoảng trắng
        /////////////// ● Chuyển tất cả chữ cái về in hoa.
        /////////////// ● In kết quả ra màn hình.
        String string = "xi   nc  hao  c a   cba    n";
        int space = 0;
        for (int i = 0; i < string.length(); i++) {
            char kitu = string.charAt(i);
            if (kitu == ' ') {
                space++;
            }
        }
        System.out.println("So luong khoang trang la: " + space);
        string = string.replaceAll(" ", "");
        System.out.println("Chuoi sau khi xoa khoang trang la: " + string);
        string = string.toUpperCase();
        System.out.println("Chuoi sau khi chuyen ve in hoa la :" + string);
    }
}
