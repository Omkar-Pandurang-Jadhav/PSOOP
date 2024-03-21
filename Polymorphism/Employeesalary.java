import java.util.Scanner;

// Parent class Employee
class Employee {
    // Properties of Employee
    int hours, salary, experience;

    // Method to calculate salary, returns 0 by default
    public int calculateSalary(int hours, int experience) {
        return 0;
    }
}

// Manager class extending Employee
class Manager extends Employee {
    // Method to calculate salary for a Manager
    public int calculateSalary(int hours, int experience) {
        int p = hours * 1000 * 30; // Calculate salary based on hours worked
        int q = hours * 2000 * 30; // Calculate salary based on hours worked with overtime

        int r = 0; // Initialize salary variable

        if (p < 40000) {
            return r = p; // Return regular salary if less than 40000
        } else if (p > 40000) {
            return r = p - (p / 100) * 5; // Return reduced salary by 5% if more than 40000
        } else {
            if (q < 40000) {
                return r = p; // Return regular salary if less than 40000
            } else if (q > 40000) {
                return r = q - (q / 100) * 5; // Return reduced salary by 5% if more than 40000
            }
        }
        return r; // Return calculated salary
    }
}

// Programmer class extending Employee
class Programmer extends Employee {
    // Method to calculate salary for a Programmer
    public int calculateSalary(int hours, int experience) {
        int p = hours * 500 * 30; // Calculate salary based on hours worked
        int q = hours * 1000 * 30; // Calculate salary based on hours worked with overtime

        int r = 0; // Initialize salary variable

        if (experience < 15) {
            if (p < 30000) {
                return r = p; // Return regular salary if less than 30000
            } else if (p > 30000) {
                return r = p - (p / 100) * 5; // Return reduced salary by 5% if more than 30000
            }
        } else {
            if (q < 30000) {
                return r = p; // Return regular salary if less than 30000
            } else if (q > 30000) {
                return r = q - (q / 100) * 5; // Return reduced salary by 5% if more than 30000
            }
        }
        return r; // Return calculated salary
    }
}

public class Employeesalary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Manager and 2 for Programmer");
        int n = sc.nextInt(); // Read user's choice

        // Prompt user to enter hours worked and years of experience
        System.out.println("Enter number of hours you work: ");
        int hours = sc.nextInt();
        System.out.println("Enter the years of experience: ");
        int exp = sc.nextInt();

        // Create objects based on user's choice and calculate salary
        if (n == 1) {
            Manager m = new Manager();
            System.out.println("The salary of Manager is: " + m.calculateSalary(hours, exp));
        } else if (n == 2) {
            Programmer p = new Programmer();
            System.out.println("The salary of Programmer is: " + p.calculateSalary(hours, exp));
        } else {
            System.out.println("Error: Invalid choice"); // Display error message for invalid input
        }
    }
}
