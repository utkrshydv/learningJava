package day10;

class Calculator2{
    int add(int a, int b) {
        return a+b;
    }

    int add(int a, int b, int c) {
        return a+b+c;
    }

    double add(double a, double b) {
        return a+b;
    }
}

public class MethodOverloadingExample {

    public static void main(String[] args) {

        Calculator2 calculator2 = new Calculator2();

        System.out.println("Sum of two integers: " + calculator2.add(5, 10));
        System.out.println("Sum of three integers: "+ calculator2.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + calculator2.add(5.5, 10.5));
    }

}
