import java.util.Scanner;

import javax.management.relation.RelationSupportMBean;

// Một đối tượng Animal có 2 thuộc tính : name và weight.
// Viết chương trình nhập vào danh sách 5 Animal và sau đó in ra màn hình 
// thông tin Animal có thông số weigh lớn nhất theo cú pháp <name> is <weight>

public class Lab3Animal {
    String name;
    private int weight;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getweight() {
        return weight;
    }

    public void setweight(int weight) {
        this.weight = weight;
    }

    public String getinfomation() {
        String infor = this.name + " is " + this.weight;
        return infor;
    }

    public static void main(String[] args) {
        Lab3Animal[] arr = new Lab3Animal[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Lab3Animal animal = new Lab3Animal();
            System.out.print("Vui long nhap ten animal thu " + (1 + i) + " vao: ");
            String name = scanner.next();
            animal.setname(name);
            System.out.print("Can nang: ");
            int weight = scanner.nextInt();
            animal.setweight(weight);
            arr[i] = animal;
        }
        System.out.println("Cac animal sau khi duoc nhap day du la: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getinfomation());
        }
        Lab3Animal max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getweight() > max.getweight()) {
                max = arr[i];
            }
        }
        System.out.println("Animal co can nang lon nhat la: " + max.getinfomation());
    }
}
