package OOP.dir4;

public class Triangle extends Shape {
    public float getArea(int a, int b, int c) {
        float p = (float) (a + b + c) / 2;
        float m = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return m;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("Dien tich tam giac la: " + t.getArea(5, 6, 7));

    }

}
