package day9;

import java.util.Scanner;

class Information {
    int roll;
    String name;
    double cgpa;

    void read(Scanner scanner) {
        System.out.print("Enter Roll No: ");
        roll = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter CGPA: ");
        cgpa = scanner.nextDouble();
    }

    void display() {
        System.out.println("Roll No: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Information[] information = new Information[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            information[i] = new Information();
            information[i].read(scanner);
        }

        System.out.println("\nDetails of all students: ");
        for (Information info : information) {
            info.display();
        }

        double lowestCgpa = information[0].cgpa;
        String lowestCgpaStudent = information[0].name;

        for (int i = 1; i < n; i++) {
            if (information[i].cgpa < lowestCgpa) {
                lowestCgpa = information[i].cgpa;
                lowestCgpaStudent = information[i].name;
            }
        }

        System.out.println("\nStudent with the lowest CGPA: " + lowestCgpaStudent + " (CGPA: " + lowestCgpa + ")");
        scanner.close();
    }
}
