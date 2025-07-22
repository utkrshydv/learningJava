package day6;

class Calculator {
    // Subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Subtract three integers
    public int subtract(int a, int b, int c) {
        return a - b - c;
    }

    // Subtract two doubles
    public double subtract(double a, double b) {
        return a - b;
    }

    // Subtract an array of integers
    public int subtract(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result -= arr[i];
        }
        return result;
    }
}

public class Program4 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Subtract two integers: " + calculator.subtract(10, 5));
        System.out.println("Subtract three integers: " + calculator.subtract(20, 5, 3));
        System.out.println("Subtract two doubles: " + calculator.subtract(15.5, 4.2));
        System.out.println("Subtract an array of integers: " + calculator.subtract(new int[]{50, 20, 10, 5}));
    }
}
