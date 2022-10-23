package bai_3;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        a.add("C");
        a.add("D");
        a.add("E");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        Student student1 = new Student("Hung", "Hue", "Yeu", "Tot", 2);
        Student student2 = new Student("Hai", "Hue", "Kha", "Tot", 7);
        ArrayList<Student> b = new ArrayList<>();
        b.add(student1);
        b.add(student2);
        System.out.println(b.get(0).getFullName());
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i).finalGrade > 5) {
                System.out.println(b.get(i).fullName + " Co phan thuong");
            } else {
                System.out.println(b.get(i).fullName + " Khong co phan thuong");
            }
        }

    }

}
