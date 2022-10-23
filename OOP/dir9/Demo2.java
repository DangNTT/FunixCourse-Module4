package OOP.dir9;

public class Demo2 {
    public int getsum(int a, int b) {
        if (a < 0 || b < 0) {
            throw new ArithmeticException("Nhap so lon hon 0");
        } else {
            System.out.println("so thoa man");
        }
        return a + b;
    }

    public static void main(String[] args) {
        // int[] a = { 2, 3, 8, 10, 11, 87 };
        // try {
        // // System.out.println(a[6]);
        // System.out.println(5 / 0);
        // } catch (ArithmeticException e) {
        // System.out.println("Loi toan hoc");
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Phan tu nay khong thuoc trong mang");
        // } catch (Exception e) {
        // System.out.println(" loi");
        // } finally {
        // System.out.println("Complete");
        // }
        Demo2 d = new Demo2();
        int a = 3;
        int b = -3;

        try {
            System.out.println(d.getsum(3, -2));
        } catch (Exception e) {
            System.out.println("gia tri khong duoc < 0");
        }
    }

}
