
import java.util.Scanner;

// Interface for calculating volume
interface Volume {
    double getVolume();
}

// Interface for calculating surface area
interface SurfaceArea {
    double getSurfaceArea();
}

// Class representing a cylinder implementing both Volume and SurfaceArea interfaces
class Cylinder implements Volume, SurfaceArea {
    // Data members for dimensions of the cylinder
    private double radius;
    private double height;

    // Constructor to initialize dimensions
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate volume of the cylinder
    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    // Method to calculate surface area of the cylinder
    @Override
    public double getSurfaceArea() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
    }
}

public class CylinderArea {
    public static void main(String[] args) {
        // Creating Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter dimensions of the cylinder
        System.out.print("Enter radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        double height = scanner.nextDouble();

        // Closing the Scanner object to prevent resource leak
        scanner.close();

        // Creating a Cylinder object with the provided dimensions
        Cylinder cylinder = new Cylinder(radius, height);

        // Printing volume and surface area of the cylinder
        System.out.println("Volume of the cylinder: " + cylinder.getVolume());
        System.out.println("Surface Area of the cylinder: " + cylinder.getSurfaceArea());
    }
}
