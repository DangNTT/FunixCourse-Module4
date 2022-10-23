package OOP.dir3;

import javax.sound.sampled.SourceDataLine;

public class Teacher extends Person {
    String chuyennganh;
    String chunhiem;
    String phone;

    public Teacher(String name, int age, String chuyennganh, String chunhiem, String phone) {
        this.name = name;
        this.age = age;
        this.chuyennganh = chuyennganh;
        this.chunhiem = chunhiem;
        this.phone = phone;
    }

    public String getinformation() {
        String infor = "Name is " + this.name + " age is " + this.age + " chuyennganh is " + this.chuyennganh
                + " chunhiem is " + this.chunhiem + " phone is " + this.phone;
        return infor;
    }

    public static void main(String[] args) {
        Teacher DangTeacher = new Teacher("Dang", 16, "Tester",
                "11A", "0945365433");
        System.out.println("Thong tin cua co Dang xinh dep: " +
                DangTeacher.getinformation());
        System.out.println("   " + DangTeacher.getname());
    }

}
