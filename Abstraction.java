// Abstract class representing a shape
abstract class Shape {
    // Abstract method to calculate area
    abstract double calculateArea();
}

// Concrete subclass representing a circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of abstract method to calculate area for circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Creating an object of the circle class
        Circle circle = new Circle(5);

        // Calculating and displaying the area of the circle
        System.out.println("Area of circle: " + circle.calculateArea());
    }
}