package bai_3;

public class Student {
    String fullName;
    String address;
    String dob;
    String gender;
    float finalGrade;

    public Student(String fullNane, String address, String dob, String gender, float finalGrade) {
        this.fullName = fullNane;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
        this.finalGrade = finalGrade;
    }

    public Student() {

    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullNam(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getFinalGrade() {
        return this.finalGrade;
    }

    public void setFinalGrade(float finalGrade) {
        this.finalGrade = finalGrade;
    }

    public String getInformation() {
        return "Thong tin cua hoc sinh nay la: " + "\n"
                + "Full name: " + this.fullName + "\n"
                + "Address: " + this.address + "\n"
                + "Dob: " + this.dob + "\n"
                + "Gender: " + this.gender + "\n"
                + "Final Grade: " + this.finalGrade;
    }

}
