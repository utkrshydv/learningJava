package day6;

import java.util.Scanner;

class Rectangle2 {
    private double length;
    private double breadth;

    // Default constructor
    public Rectangle2() {
        this.length = 0;
        this.breadth = 0;
    }

    // Parameterized constructor
    public Rectangle2(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * breadth;
    }

  
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
    }
}

public class Program6 {
    public static void main(String[] args) {
        // Using the default constructor
        Rectangle rectDefault = new Rectangle();
        System.out.println("Using Default Constructor:");
        rectDefault.display();

        Scanner scanner = new Scanner(System.in);
        try {
          
            System.out.print("\nEnter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the breadth of the rectangle: ");
            double breadth = scanner.nextDouble();

            Rectangle2 rectParameterized = new Rectangle2(length, breadth);
            System.out.println("\nUsing Parameterized Constructor:");
            rectParameterized.display();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numerical values for length and breadth.");
        } finally {
            // Closing the scanner to prevent resource leaks
            scanner.close();
        }
    }
}
