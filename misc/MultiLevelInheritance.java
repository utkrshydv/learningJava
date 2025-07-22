package lab8;

import java.util.Scanner;

class Plate {
    double length, width;

    Plate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and width of plate: ");
        length = sc.nextDouble();
        width = sc.nextDouble();
    }

    void display() {
        System.out.println("Plate dimensions: " + length + " x " + width);
    }
}

class Box extends Plate {
    double height;

    Box() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of box: ");
        height = sc.nextDouble();
    }

    void display() {
        super.display();
        System.out.println("Box height: " + height);
    }
}

class WoodBox extends Box {
    double thickness;

    WoodBox() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thickness of woodbox: ");
        thickness = sc.nextDouble();
    }

    void display() {
        super.display();
        System.out.println("Woodbox thickness: " + thickness);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        WoodBox obj = new WoodBox();
        obj.display();
    }
}
