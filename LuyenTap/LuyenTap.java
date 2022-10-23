import java.rmi.server.RemoteStub;
import java.util.PropertyResourceBundle;

import javax.xml.transform.Source;

public class LuyenTap {
    /////////////////////////////////// phuong thuc kieu co return
    public int[] checkArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 4) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    //////////////////// viet phuong thuc Kiem tra nhung phan tu trong mang chia het
    //////////////////// cho 5 thi in ra(kieu khong return)
    public void CheckPhepChia(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    ////////////////////////////////// tim so lon nhat trong mang
    public int checkMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    ///////////////////////////////////////// tim so nho nhat trong mang
    public int checkMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //////////////////////////////////// Kiem tra trong mang co bao nhieu so chia
    //////////////////////////////////// het cho 2
    public int checkCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count += 1; //// count ++;
            }
        }
        return count;
    }

    /////////////////////////////////////////// Kiem tra tong cac so chia het cho 2
    public int checkSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    //////////////////////////////////////////// kiem tra tich(nhan) cac so chia het
    //////////////////////////////////////////// cho 2
    public int checkTich(int[] arr) {
        int tich = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                tich = tich * arr[i];
            }
        }
        return tich;
    }
    ////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        LuyenTap luyenTap = new LuyenTap();
        // int[] a2 = luyenTap.checkArray(a);
        // for (int i = 0; i < a2.length; i++) {
        // System.out.println(a2[i]);
        // }
        ////////////////////////////////////////////////////////////////////////
        luyenTap.CheckPhepChia(a);

        ////////////////////////////////////////////////////////////////////////
        int[] b = { 3, 6, 10, 45, 2 };
        System.out.println("So lon nhat trong mang b la: " + luyenTap.checkMax(b));
        System.out.println("so nho nhat trong mang b la: " + luyenTap.checkMin(b));
        System.out.println("So luong cac so chia het cho 2 la: " + luyenTap.checkCount(b));
        System.out.println("Tong cac so chia het cho 2 la: " + luyenTap.checkSum(b));
        System.out.println("Tich cac so chia het cho 2 la: " + luyenTap.checkTich(b));

    }
}