package day7;

import java.util.Scanner;

public class FiboNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of digits: ");
        int n = scanner.nextInt();
        Fibo(n);

    }

    public static void Fibo(int n){
        int temp;
        int a = 0;
        int b = 1;

        for(int i=0; i<n; i++){
            System.out.print(a+" ");
            temp = a+b;
            a = b;
            b = temp;
        }
    }
}
