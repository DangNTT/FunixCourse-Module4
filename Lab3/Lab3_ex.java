import java.util.Scanner;

//1. Viết chương trình nhập vào một mảng số nguyên. Tìm giá trị lớn nhất của mảng.
public class Lab3_ex {
    public int solonnhat(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Lab3_ex arr = new Lab3_ex();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui long nhap vao so phan tu: ");
        int a = scanner.nextInt();
        int[] n = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Vui long nhap phan tu thu " + (i + 1) + " :");
            n[i] = scanner.nextInt();
        }
        System.out.println("Phan tu lon nhat la: " + arr.solonnhat(n));
    }
}