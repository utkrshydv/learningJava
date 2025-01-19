package day7;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(String.format("%d x %d" , n, i)+" = "+n*i);
        }
    }
}
