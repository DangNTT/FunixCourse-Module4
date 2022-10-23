public class Student {
    String name;
    int age;
    String lop;
    String hocluc;
    String truong;

    public Student(String name, int age, String lop, String hocluc, String truong) {
        this.name = name;
        this.age = age;
        this.lop = lop;
        this.hocluc = hocluc;
        this.truong = truong;
    }

    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    //////////
    public int getage() {
        return this.age;
    }

    public void setage(int age) {
        this.age = age;
    }

    /////////
    public String getlop() {
        return this.lop;
    }

    public void setlop(String lop) {
        this.lop = lop;
    }

    /////////
    public String gethocluc() {
        return this.hocluc;
    }

    public void sethocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    //////////
    public String gettruong() {
        return this.truong;
    }

    public void settruong(String truong) {
        this.truong = truong;
    }

    public String getinformation() {
        String infor = this.name + this.age + this.lop + this.hocluc + this.truong;
        return infor;
    }

}