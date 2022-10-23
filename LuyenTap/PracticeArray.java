import java.util.Scanner;

public class PracticeArray {
    public static void main(String[] args) {
        ///////////////// khai bao bien chua biet gia tri cu the
        String[] cars = new String[4];
        ///////////////// yeu cau nguoi dung nhap gia tri vao
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < cars.length; i++) {
            System.out.print("vui long nhap vao gia tri thu " + (i + 1) + " cua mang : ");
            cars[i] = scanner.next();
        }
        ///////////////// in ra gia tri mac dinh
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }

        ///////////////////////////////////// doi vi tri phan tu trong mang
        int[] arr = { 1, 2, 3, 4, 5 };
        int arr2 = arr[0];
        arr[0] = arr[1];
        arr[1] = arr2;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
