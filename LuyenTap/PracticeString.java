public class PracticeString {
    public static void main(String[] args) {
        String s = "hello everyone i'm study java";
        String[] arr = s.split("\\s");
        for (String item : arr) {
            System.out.print(item + " ");
        }
        ///////////////////////////
    }

}
