import java.rmi.server.SocketSecurityException;

public class Lab2_string {
    public String chuoi(String string1) {
        String string2 = string1.substring(0, 1);
        String string3 = string1.substring(1, string1.length());
        string2 = string2.toUpperCase();
        string3 = string2 + string3;
        return string3;
    }

    // Cho chuỗi sau : "xinchao"
    // Viết chương trình để viết hoa chữ cái đầu tiên của chuỗi trên.
    // Kết quả mong muốn: “Xinchao”
    public static void main(String[] args) {
        Lab2_string sl = new Lab2_string();
        String string1 = "xinchao";
        System.out.println(sl.chuoi(string1));

    }

}
