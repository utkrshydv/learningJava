package lab8;

import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number and balance: ");
        acc_no = sc.nextInt();
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name and Aadhar number: ");
        name = sc.next();
        aadhar_no = sc.next();
    }

    void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class AccountPerson {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input();
        }
        System.out.println("\nDetails of three persons:");
        for (Person person : persons) {
            person.disp();
            System.out.println();
        }
    }
}

