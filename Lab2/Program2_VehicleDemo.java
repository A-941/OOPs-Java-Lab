class Vehicle {
    private static int count = 0;

    private int numberOfTyres;
    private String engineNo;
    private String bodyColor;
    private String rtoName;

    {
        count++;
        this.rtoName = "Ahmedabad";
        System.out.println("Till now the objects created are " + count);
    }

    public Vehicle(int numberOfTyres, String engineNo, String bodyColor) {
        this.numberOfTyres = numberOfTyres;
        this.engineNo = engineNo;
        this.bodyColor = bodyColor;
    }

    public static int getCount() {
        return count;
    }

    public String getRtoName() {
        return rtoName;
    }

    public void setRtoName(String rtoName) {
        this.rtoName = rtoName;
    }

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    @Override
    public String toString() {
        return "Vehicle [Tyres=" + numberOfTyres + ", EngineNo=" + engineNo +
               ", BodyColor=" + bodyColor + ", RTOName=" + rtoName +
               ", TotalObjectsCreated=" + count + "]";
    }
}

public class Program2_VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(4, "ENG1001", "Red");
        Vehicle v2 = new Vehicle(2, "ENG1002", "Black");
        Vehicle v3 = new Vehicle(6, "ENG1003", "White");

        v2.setRtoName("Gandhinagar");

        System.out.println("\nVehicle Details:");
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
    }
}
