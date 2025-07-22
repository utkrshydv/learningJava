package day6;


import java.util.Scanner;

class Rectangle{
	private double length, breadth;
	
	public void read(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;	
	}
	
	public double calculateArea() {
		return length*breadth;
	}
	
	public double calculatePerimeter() {
		return 2*(length+breadth);
	}
	
	public void display() {
		System.out.println("Length: "+ length);
		System.out.println("Breadth: "+ breadth);
		System.out.println("Area: "+ calculateArea());
        System.out.println("Perimeter: "+ calculatePerimeter());
	}
	
}

public class Program2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter length: ");
		double length = scanner.nextDouble();
		System.out.print("Enter breadth: ");
		double breadth = scanner.nextDouble();
		
		Rectangle rectangle = new Rectangle();
		rectangle.read(length, breadth);
		rectangle.display();

	}

}
