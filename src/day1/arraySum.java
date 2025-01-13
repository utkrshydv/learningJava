package day1;
import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of elements: ");
        int n = scanner.nextInt();

        int[] dynArray = new int[n];

        System.out.println("Enter elements: ");

        for(int i=0; i<n; i++){
            dynArray[i] = scanner.nextInt();
        }

        int sum = sum(dynArray);

        System.out.println("Sum is: "+sum);
    }

    public static int sum(int[] array){
        int sum = 0;
        for(int num: array){
            sum+=num;
        }
        return sum;
    }
}
