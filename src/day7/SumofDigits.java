package day7;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
}
