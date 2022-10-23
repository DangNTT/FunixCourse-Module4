import java.util.Arrays;

import javax.annotation.processing.SupportedOptions;

public class SortArray {
    public static void main(String[] args) {
        int[] a = { 5, 2, 8, 1, 15, 30, 4, 6 };
        // Arrays.sort(a);
        // for (int i = 0; i < a.length; i++) {
        // System.out.print(a[i] + " ");
        // }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println(i + "_" + j);
            }
        }
    }

}
