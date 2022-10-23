public class NumberArray {
    public int[] checkArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 4) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        NumberArray number = new NumberArray();
        int[] arr2 = number.checkArr(a);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

}
