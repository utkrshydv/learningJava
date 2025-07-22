package lab9;

import general.Employee;
import marketing.Sales;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter employee id: ");
        int empid = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter employee name: ");
        String ename = sc.nextLine();
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();
        
        Sales obj = new Sales();
        obj.setDetails(empid, ename);
        double totalEarnings = obj.earnings(basic);
        
        System.out.println("The emp id of the employee is " + obj.getEmpid());
        System.out.println("The total earning is " + totalEarnings);
    }
}

