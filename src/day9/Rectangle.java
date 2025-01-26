package day9;

import java.util.Scanner;

class Calculate{

    double length;
    double breadth;

    void read(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        breadth = scanner.nextDouble();
    }

    double[] calculate(){
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        return new double[]{ area, perimeter };
    }

    void display(double[] results){
        System.out.println("Area of the rectangle: " + results[0]);
        System.out.println("Perimeter of the rectangle: " + results[1]);
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        calculate.read();

        double[] results = calculate.calculate();

        calculate.display(results);
    }
}

