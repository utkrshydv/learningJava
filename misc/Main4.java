package lab9;

import java.util.Scanner;

interface Emploee {
    void getDetails(int id, String name);
}

interface Manager1 extends Emploee {
    void getDeptDetails(int did, String dname);
}
                  
class Head implements Manager1 {
    int empid, deptid;
    String ename, deptname;

    public void getDetails(int id, String name) {
        empid = id;
        ename = name;
    }

    public void getDeptDetails(int did, String dname) {
        deptid = did;
        deptname = dname;
    }

    void showDetails() {
        System.out.println("Employee id - " + empid);
        System.out.println("Employee name - " + ename);
        System.out.println("Department id - " + deptid);
        System.out.println("Department name - " + deptname);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter employee id: ");
        int empid = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter employee name: ");
        String ename = sc.nextLine();
        System.out.print("Enter department id: ");
        int deptid = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter department name: ");
        String deptname = sc.nextLine();
        
        Head obj = new Head();
        obj.getDetails(empid, ename);
        obj.getDeptDetails(deptid, deptname);
        obj.showDetails();
    }
}
