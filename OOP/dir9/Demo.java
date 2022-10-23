package OOP.dir9;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Vui long nhap so a: ");
        int a = Scanner.nextInt();
        System.out.print("Vui long nhap so b: ");
        int b = Scanner.nextInt();
        try {
            System.out.println("Ket qua phep chia cua so " + a + " & " + b + " la : " + (a / b));
        } catch (Exception e) {
            System.out.println("vui long nhap b khac 0");
        }
    }

}
