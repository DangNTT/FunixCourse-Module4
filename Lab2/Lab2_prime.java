import java.util.Scanner;

/////////Viết chương trình nhập vào một số nguyên dương a từ bàn phím.
/////////Đếm và In ra màn hình tất cả các số nguyên tố từ 1 đến a.
public class Lab2_prime {
    public boolean songuyento(int a) {
        boolean isPrime = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public void insongto(int a) {
        System.out.println("cac so nguyen to tu 1 den " + a + " la:");
        for (int x = 1; x <= a; x++) {
            if (songuyento(x)) {
                System.out.print(x + " ");
            }
        }
    }

    public static void main(String[] args) {
        Lab2_prime pr = new Lab2_prime();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui long nhap 1 so nguyen duong a: ");
        int a = scanner.nextInt();
        System.out.println(pr.songuyento(a));
        pr.insongto(a);
    }

}
