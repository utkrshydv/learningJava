package lab9;

import java.util.Scanner;

interface salaryDetails {
    double earnings(double basic);

    double deductions(double basic);

    double bonus(double basic);
}

class Manager implements salaryDetails {
    public double earnings(double basic) {
        return basic + (0.8 * basic) + (0.15 * basic);
    }

    public double deductions(double basic) {
        return 0.12 * basic;
    }

    public double bonus(double basic) {
        return 0;
    }
}

class Substaff extends Manager {
    public double bonus(double basic) {
        return 0.5 * basic;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();
        
        Substaff obj = new Substaff();
        System.out.println("Earnings - " + obj.earnings(basic));
        System.out.println("Deduction - " + obj.deductions(basic));
        System.out.println("Bonus - " + obj.bonus(basic));
    }
}
