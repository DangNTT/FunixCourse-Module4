package Bai_1;
// Tạo một class có tên: CalculateUtils

// Tạo 4 phương thức tĩnh sau (static): 
// tinhTong(double x, double y) trả về giá trị x + y
// tinhNhan(double x,double y) trả về giá trị x*y
// tinhHieu(double x, double y) trả về giá trị x –y
// tinhChia(doublex, double y) trả về giá trj x/y

public class CalculateUtils {
    public double tinhTong(double x, double y) {
        return x + y;
    }

    public double tinhNhan(double x, double y) {
        return x * y;
    }

    public double tinhHieu(double x, double y) {
        return x - y;
    }

    public double tinhChia(double x, double y) {
        return x / y;
    }

}
