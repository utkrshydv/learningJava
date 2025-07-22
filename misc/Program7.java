package day6;

import java.util.Scanner;

class Shape {

    // Overloaded method for circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Overloaded method for triangle
    public double area(double base, double height) {
        return 0.5 * base * height;
    }

    // Overloaded method for square
    public double area(int side) {
        return side * side;
    }
}

public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Circle\n2. Triangle\n3. Square");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of the circle: " + shape.area(radius)); // Calls area(double)
                break;

            case 2:
                System.out.print("Enter base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of the triangle: ");
                double height = scanner.nextDouble();
                System.out.println("Area of the triangle: " + shape.area(base, height)); // Calls area(double, double)
                break;

            case 3:
                System.out.print("Enter side of the square: ");
                int side = scanner.nextInt();
                System.out.println("Area of the square: " + shape.area(side)); // Calls area(int)
                break;

            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}
