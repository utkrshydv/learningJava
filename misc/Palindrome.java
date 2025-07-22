package day3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

       
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

   
    public static boolean isPalindrome(int num) {
        int original = num; 
        int reverse = 0;

        
        while (num != 0) {
            int digit = num % 10;   
            reverse = reverse * 10 + digit;
            num /= 10;            
        }

       
        return original == reverse;
    }
}
