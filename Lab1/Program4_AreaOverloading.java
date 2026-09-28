import java.util.Scanner;

public class Program4_AreaOverloading {

    public double findArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double findArea(double length, double breadth) {
        return length * breadth;
    }

    public double findArea(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Program4_AreaOverloading demo = new Program4_AreaOverloading();

        System.out.print("Enter radius of circle: ");
        double r = scanner.nextDouble();
        System.out.println("Area of Circle: " + demo.findArea(r));

        System.out.print("Enter length and breadth of rectangle: ");
        double l = scanner.nextDouble();
        double w = scanner.nextDouble();
        System.out.println("Area of Rectangle: " + demo.findArea(l, w));

        System.out.print("Enter 3 sides of triangle: ");
        double s1 = scanner.nextDouble();
        double s2 = scanner.nextDouble();
        double s3 = scanner.nextDouble();
        System.out.println("Area of Triangle: " + demo.findArea(s1, s2, s3));

        scanner.close();
    }
}
