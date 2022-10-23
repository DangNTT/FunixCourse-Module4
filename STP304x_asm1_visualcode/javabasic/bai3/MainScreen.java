package ASSIGNMENT_1_JAVA.javabasic.bai3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

import javax.lang.model.element.Element;
import javax.lang.model.util.ElementScanner6;

public class MainScreen {
    public static void main(String[] args) {
        Student a = new Student();
        ArrayList<Student> listStudent = new ArrayList<>();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            Student b = new Student();
            System.out.println("Vui long nhap cac thong tin sau: ");
            System.out.print("Full name: ");
            b.setFullNam(scanner.nextLine());
            System.out.print("Address: ");
            b.setAddress(scanner.nextLine());
            System.out.print("Dob: ");
            b.setDob(scanner.nextLine());
            System.out.print("Gender: ");
            b.setGender(scanner.nextLine());
            System.out.print("Final Grade: ");
            b.setFinalGrade(Float.parseFloat(scanner.nextLine()));
            listStudent.add(b);
            System.out.println("Do you want to continue (Y/N)?");
            String choose = scanner.nextLine();
            if (choose.equals("Y") || choose.equals("y")) {
                System.out.println("moi nhap tiep: ");
            } else {
                System.out.println("Xin cam on!");
                break;
            }
        }
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println(listStudent.get(i).getInformation());

        }
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).finalGrade < 4) {
                System.out.println("Hoc sinh " + listStudent.get(i).fullName + " hoc luc kem.");
            } else if (listStudent.get(i).finalGrade >= 4 && listStudent.get(i).finalGrade < 5) {
                System.out.println("Hoc sinh " + listStudent.get(i).fullName + " hoc luc yeu.");
            } else if (listStudent.get(i).finalGrade >= 5 && listStudent.get(i).finalGrade < 5.5) {
                System.out.println("Hoc sinh " + listStudent.get(i).fullName + " hoc luc trung binh yeu.");
            } else if (listStudent.get(i).finalGrade >= 5.5 && listStudent.get(i).finalGrade < 6.5) {
                System.out.println("Hoc sinh " + listStudent.get(i).fullName + " hoc luc trung binh.");
            } else if (listStudent.get(i).finalGrade >= 6.5 && listStudent.get(i).finalGrade < 7) {
                System.out.println("Hoc sinh " + listStudent.get(i).fullName + " hoc luc trung binh kha.");
            } else if (listStudent.get(i).finalGrade >= 7 && listStudent.get(i).finalGrade < 8) {
                System.out.println("Hoc sinh " + listStudent.get(i).fullName + " hoc luc kha.");
            } else if (listStudent.get(i).finalGrade >= 8 && listStudent.get(i).finalGrade < 8.5) {
                System.out.println("Hoc sinh " + listStudent.get(i).fullName + " hoc luc kha gioi.");
            } else {
                System.out.println("Hoc sinh " + listStudent.get(i).fullName + " hoc luc gioi");
            }
        }
        float sum = 0;
        System.out.println("Diem tong ket trung binh cua danh sach hoc sinh la: ");
        for (int i = 0; i < listStudent.size(); i++) {
            sum = sum + listStudent.get(i).finalGrade;
        }
        System.out.println(sum / listStudent.size());
    }

}
