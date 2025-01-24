package day9;
import java.util.Scanner;

class Box{
    double length;
    double width;
    double height;

    double volume(){
        return length * width * height;
    }
}

public class Volume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box box = new Box();

        System.out.print("Enter length of the box: ");
        box.length = scanner.nextDouble();

        System.out.print("Enter width of the box: ");
        box.width = scanner.nextDouble();

        System.out.print("Enter height of the box: ");
        box.height = scanner.nextDouble();

        double volume = box.volume();
        System.out.println("The volume of the box is: " + volume + " square units");

        scanner.close();

    }
}
