package OOP.dir7;

abstract class Teacher implements Person {
    public void a() {
        System.out.println("I'm Dang");
    }

    public void b() {
        System.out.println("I'm 16 years old");
    }

    public void c() {
        System.out.println("I'm a student");
    }

    public static void main(String[] args) {
        Teacher t = new Teacher() {

        };
    }
}
