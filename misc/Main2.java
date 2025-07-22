package lab9;

import java.util.Scanner;

interface Motor {
    void run();

    void consume();
}

class WashingMachine implements Motor {
    int capacity;

    WashingMachine(int c) {
        capacity = c;
    }

    public void run() {
        System.out.println("Motor is running");
    }

    public void consume() {
        System.out.println("Motor is consuming power");
    }

    void showCapacity() {
        System.out.println("Capacity of the motor is " + capacity);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter motor capacity: ");
        int cap = sc.nextInt();
        
        WashingMachine obj = new WashingMachine(cap);
        obj.run();
        obj.consume();
        obj.showCapacity();
    }
}
