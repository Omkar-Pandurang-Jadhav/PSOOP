// Parent class Shape
class Shape {
    double l, r, b, h; // Variables to store dimensions

    // Method to draw a shape
    public void draw() {
        System.out.println("Draw a shape.");
    }
   
    // Method to calculate area, default implementation returns 1
    double calculateArea(double l, double r, double b, double h) {
        return 1;
    }
}

// Circle class extending Shape
class Circle extends Shape {
   
    // Method to draw a circle
    public void draw() {
        System.out.println("Draw a circle.");
    }
   
    // Method to calculate area of circle
    double calculateArea(double l, double r, double b, double h) {
        return 3.14 * r * r;
    }
}

// Square class extending Shape
class Square extends Shape {

    // Method to draw a Square
    public void draw() {
        System.out.println("Draw a Square.");
    }
   
    // Method to calculate area of square
    double calculateArea(double l, double r, double b, double h) {
        return l * l;
    }
}

// Triangle class extending Shape
class Triangle extends Shape {

    // Method to draw a Triangle
    public void draw() {
        System.out.println("Draw a triangle.");
    }
   
    // Method to calculate area of triangle
    double calculateArea(double l, double r, double b, double h) {
        return 0.5 * h * b;
    }
}

public class Methodoverride {
    public static void main(String args[]) {
        // Creating objects of Circle, Square, and Triangle
        Circle c = new Circle();
        c.draw(); // calling draw method of Circle
        System.out.println("The area of circle is " + c.calculateArea(5, 5, 5, 5)); // calculating and printing area of circle
        
        Square s = new Square();
        s.draw(); // calling draw method of Square
        System.out.println("The area of square is " + s.calculateArea(5, 5, 5, 5)); // calculating and printing area of square
        
        Triangle t = new Triangle();
        t.draw(); // calling draw method of Triangle
        System.out.println("The area of Triangle is " + t.calculateArea(5, 5, 5, 5)); // calculating and printing area of triangle
    }
}
