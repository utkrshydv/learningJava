package lab8;

import java.util.Scanner;

class TwoD {
    double length, width;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and width of 2D sheet: ");
        length = sc.nextDouble();
        width = sc.nextDouble();
    }

    double calculateCost() {
        return length * width * 40;
    }
}

class ThreeD extends TwoD {
    double height;

    void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of 3D box: ");
        height = sc.nextDouble();
    }

    double calculateCost() {
        return length * width * height * 60;
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        ThreeD obj = new ThreeD();
        obj.input();
        System.out.println("Cost of plastic: Rs " + obj.calculateCost());
    }
}


