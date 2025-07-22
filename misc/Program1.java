package day6;

import java.util.Scanner;

class Box{
	private double length, width, height;
	
	public Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public double volume() {
		return length*width*height;
	}
}

public class Program1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter length: ");
		double length = scanner.nextDouble();
		System.out.print("Enter width: ");
		double width = scanner.nextDouble();
		System.out.print("Enter height: ");
		double height = scanner.nextDouble();
		
		Box box = new Box(length, width, height);
		double volume = box.volume();
		
	System.out.print("The volume of the box is: "+volume+" cm^3");
	;}

}
