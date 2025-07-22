package day6;

import java.util.Scanner;

class Student{
	int roll;
	String name;
	double cgpa;
	
	public Student(int roll, String name, double cgpa) {
		this.roll = roll;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public void display() {
		System.out.println("Roll No: "+roll+", Name: "+name+", CGPA: "+cgpa);
	}
}

public class Program3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = scanner.nextInt();
		Student[] students = new Student[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Enter roll number: ");
			int roll = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter name: ");
			String name = scanner.nextLine();
			System.out.print("Enter CGPA: ");
			double cgpa = scanner.nextDouble();
		    students[i] = new Student(roll, name, cgpa);	
		}
		
		double minCGPA = Double.MAX_VALUE;
		String lowestCGPAStudent = "";
		
		System.out.println("\nStudent Details: ");
		for(Student student : students) {
			student.display();
			if(student.cgpa < minCGPA) {
				minCGPA = student.cgpa;
				lowestCGPAStudent = student.name;
			}
		}
		
		  System.out.println("\nStudent with the lowest CGPA: " + lowestCGPAStudent);

	}

}
