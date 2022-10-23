import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lab3_arr {
    public static void main(String[] args) {
        // Viết chương trình nhập vào một mảng số nguyên. Sắp xếp dãy số vừa nhập theo
        // thứ tự tăng dần và in kết quả ra màn hình.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui long nhap vao 1 mang so nguyen n: ");
        int n = scanner.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Hay nhap phan tu thu " + (i + 1) + ": ");
            m[i] = scanner.nextInt();
        }
        Arrays.sort(m);
        System.out.println("Day so giam dan trong mang la: ");
        for (int i = 0; i < n; i++) {
            System.out.println(m[i]);
        }

    }

}
