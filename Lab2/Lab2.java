import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        /// Nhập vào từ bàn phím số nguyên x là số năm tương ứng.
        /// Kiểm tra năm đó có phải là năm nhuận hay không?. In kết quả ra màn hình
        /// Năm nhuận là: Năm chia hết cho 400. Năm chia hết cho 4 nhưng không chia
        //// hết cho 100.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui long nhap nam vao: ");
        int x = scanner.nextInt();
        if (x % 400 == 0) {
            System.out.println(x + " la nam nhuan!");
        } else if (x % 4 == 0 && x % 100 != 0) {
            System.out.println(x + " la nam nhuan!");
        } else {
            System.out.println(x + " khong phai la nam nhuan!");
        }

        ////////// Viết chương trình giải phương trình bậc 2 có dạng: ax2+ bx + c = 0
        //////////// Với tham số a,b,c nhập từ bàn phím.
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Vui long nhap tham so a: ");
        float a = scanner1.nextFloat();
        System.out.print("Vui long nhap tham so b: ");
        float b = scanner1.nextFloat();
        System.out.print("Vui long nhap tham so c: ");
        float c = scanner1.nextFloat();
        float delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem !");
        } else if (delta == 0) {
            System.out.println("Phuong trinh co 1 nghiem" + " x1 = x2 = " + (-b / 2 * a));
        } else {
            System.out.println("Phuong trinh co 2 nghiem phan biet la: ");
            float x1 = (float) (-b - Math.sqrt(delta)) / (2 * a);
            float x2 = (float) (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        // Viết chương trình nhập vào số nguyên y từ bàn phím, việc này sẽ tiếp tục
        // cho đến khi tổng các giá trị nhập vào >= 100.
        // Thực hiện in ra giá trị N sau cùng thỏa mãn điều kiện:
        // Nếu N là một số lẻ :
        // In ra màn hình “Dãy số lẻ giảm dần : ” và kèm theo dãy số lẻ giảm dần từ N về
        // 1
        // Ngược lại, nếu N là một số chẵn thì In ra màn hình “Dãy số chẵn giảm dần : ”
        // và kèm theo dãy số chẵn giảm dần từ N về 2
        int sum = 0;
        Scanner scanner2 = new Scanner(System.in);
        int y;
        do {
            System.out.print("Vui long nhap so nguyen y: ");
            y = scanner2.nextInt();
            sum += y;
            if (sum >= 100) {
                if (y % 2 == 0) {
                    System.out.println("Day so chan giam dan tu " + y + " toi 1 la: ");
                    for (int i = y; i > 0; i -= 2) {
                        System.out.print(i + " ");
                    }
                } else {
                    System.out.println("Day so le giam dan tu " + y + " toi 1 la: ");
                    for (int i = y; i > 0; i -= 2) {
                        System.out.print(i + " ");
                    }
                }
                break;
            }
        } while (true);

        // Viết chương trình cho phép người dùng chọn đáp án chính xác từ câu hỏisau:
        // Gói nào trong java chứa lớp Scanner dùng để nhập dữ liệu từ bàn phím ?
        // A. java.net B. java.io C. java.util D. java.awt, Câu trả lời của bạn : C
        // Đáp án in hoa hay in thường đều được chấp nhận.
        // Sau khi người dùng chọn đáp án , Chương trình sẽ thông báo đáp án là đúng
        // hoặc sai.
        System.out.println("Goi nao trong java chua lop Scanner dung de nhap du lieu tu ban phim?");
        System.out.println("A: java.net");
        System.out.println("B: java.io");
        System.out.println("C: java.utill");
        System.out.println("D: java.awt");
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Hay chon dap an dung: ");
        String e = scanner3.next();
        e = e.toUpperCase();
        switch (e) {
            case "A":
                System.out.println("Dap an sai");
                break;
            case "B":
                System.out.println("Dap an sai");
                break;
            case "C":
                System.out.println("Dap an dung");
                break;
            case "D":
                System.out.println("Dap an sai");
                break;
            default:
                System.out.println("Dap an khong hop le!");
        }
    }

}
