class Employee {
    protected String name;
    protected int employeeId;
    protected double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + salary);
    }

    public double calculateBonus() {
        return salary * 0.10;
    }
}

class Faculty extends Employee {
    private String department;

    public Faculty(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20;
    }
}

class AdministrativeStaff extends Employee {
    private String designation;

    public AdministrativeStaff(String name, int employeeId, double salary, String designation) {
        super(name, employeeId, salary);
        this.designation = designation;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Designation: " + designation);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15;
    }
}

public class Program1_UniversityDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101, 50000);
        Faculty fac = new Faculty("Dr. Bob", 102, 80000, "Computer Science");
        AdministrativeStaff admin = new AdministrativeStaff("Charlie", 103, 40000, "Registrar");

        System.out.println("Employee Details:");
        emp.displayDetails();
        System.out.println("Bonus: " + emp.calculateBonus());

        System.out.println("\nFaculty Details:");
        fac.displayDetails();
        System.out.println("Bonus: " + fac.calculateBonus());

        System.out.println("\nAdministrative Staff Details:");
        admin.displayDetails();
        System.out.println("Bonus: " + admin.calculateBonus());
    }
}
