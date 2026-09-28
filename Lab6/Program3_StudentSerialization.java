import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int rollNo;
    private String name;
    private double percentage;

    public Student(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "Student [RollNo=" + rollNo + ", Name=" + name + ", Percentage=" + percentage + "%]";
    }
}

public class Program3_StudentSerialization {
    public static void main(String[] args) {
        String filename = "students.dat";

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "Alice", 88.5));
        studentList.add(new Student(102, "Bob", 92.0));
        studentList.add(new Student(103, "Charlie", 79.4));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(studentList);
            System.out.println("3 student records written to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number to retrieve: ");
        int rollToFind = scanner.nextInt();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            @SuppressWarnings("unchecked")
            List<Student> retrievedList = (List<Student>) ois.readObject();
            boolean found = false;
            for (Student s : retrievedList) {
                if (s.getRollNo() == rollToFind) {
                    System.out.println("Student Found: " + s.toString());
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Student with RollNo " + rollToFind + " not found.");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
