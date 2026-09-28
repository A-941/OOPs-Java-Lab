import java.util.Scanner;

class Distance {
    private int feet;
    private double inches;

    public Distance() {
        this.feet = 0;
        this.inches = 0.0;
    }

    public Distance(int feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public int getFeet() {
        return this.feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public double getInches() {
        return this.inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    @Override
    public String toString() {
        return this.feet + " feet " + this.inches + " inches";
    }
}

public class Program3_DistanceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Distance d1 = new Distance();
        System.out.print("Enter feet for distance: ");
        int f = scanner.nextInt();
        System.out.print("Enter inches for distance: ");
        double in = scanner.nextDouble();

        d1.setFeet(f);
        d1.setInches(in);

        System.out.println("Distance 1: " + d1.toString());
        System.out.println("Feet: " + d1.getFeet() + ", Inches: " + d1.getInches());

        Distance d2 = new Distance(10, 8.5);
        System.out.println("Distance 2: " + d2);

        scanner.close();
    }
}
