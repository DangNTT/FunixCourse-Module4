package lab3;

import java.util.Scanner;

public class User_ex {
    private int id;
    private String firstName;
    private String lastName;

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
/////////////////////////
    public String getInformation(){
        return "Thong tin cua user nay la: "+"\n"
                +"ID: "+this.id+"\n"
                +"First name: "+this.firstName+"\n"
                +"Last name: "+this.lastName;
    }
////////////////////////
    public void nhapThongTin(Scanner scanner){
        System.out.print("ID: ");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.print("First name: ");
        this.firstName = scanner.nextLine();
        System.out.print("Last name: ");
        this.lastName = scanner.nextLine();
    }

    public static void main(String[] args) {
        User_ex u = new User_ex();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap thong tin user: ");
        u.nhapThongTin(scanner);
        System.out.println(u.getInformation());


    }

}
