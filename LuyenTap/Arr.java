import javax.xml.transform.Source;

public class Arr {
    public boolean kiemtra(String[] arr, String n) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                flag = true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Arr array = new Arr();

        String[] arr = { "Dog", "Cat", "Pig", "Tiger", "Chicken" };
        System.out.println(array.kiemtra(arr, "Cat"));
        // for (int a = 0; a < arr.length; a++) {
        // System.out.println(arr[a]);
        // }
        ////// thay doi phan tu cua mang
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] == "Pig") {
                arr[a] = "Bear";
            }
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }

    }
}
