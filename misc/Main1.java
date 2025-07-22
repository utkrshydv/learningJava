package lab9;


import java.util.Scanner;

abstract class student {
    int rollno;
    long regno;

    void getinput(int r, long reg) {
        rollno = r;
        regno = reg;
    }

    abstract void course();
}

class kiitian extends student {
    void course() {
        System.out.println("Rollno - " + rollno);
        System.out.println("Registration no - " + regno);
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rollno: ");
        int rollno = sc.nextInt();
        System.out.print("Enter Registration no: ");
        long regno = sc.nextLong();
        
        kiitian obj = new kiitian();
        obj.getinput(rollno, regno);
        obj.course();
    }
}
