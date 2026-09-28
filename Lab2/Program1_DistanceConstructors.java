class Distance {
    private int feet;
    private double inches;

    public Distance(int feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public Distance(int feet) {
        this(feet, 5.0);
    }

    public Distance() {
        this(5);
    }

    public Distance(Distance other) {
        this(other.feet, other.inches);
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    @Override
    public String toString() {
        return feet + " feet " + inches + " inches";
    }
}

public class Program1_DistanceConstructors {
    public static void main(String[] args) {
        Distance dDefault = new Distance();
        System.out.println("Default Constructor: " + dDefault);

        Distance dOneArg = new Distance(12);
        System.out.println("One Argument Constructor (feet=12): " + dOneArg);

        Distance dTwoArgs = new Distance(8, 11.5);
        System.out.println("Two Arguments Constructor (feet=8, inches=11.5): " + dTwoArgs);

        Distance dCopy = new Distance(dTwoArgs);
        System.out.println("Copy Constructor (clone of Distance 2): " + dCopy);
    }
}
