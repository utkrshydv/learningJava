package day2;
import java.util.Scanner;

public class occurencesArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("No. of elements: ");

        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements: ");

        for(int i=0; i<n; i++){
            array[i] =  scanner.nextInt();
        }
        countOccurences(array, n);
    }

    public static void countOccurences(int[] array, int n){
        boolean[] processed = new boolean[n];
        for(int i=0; i<n; i++){
            if(processed[i])
                continue;
            int num = array[i];
            int count = 0;
            for(int j=0; j<n; j++){
                if(num==array[j]){
                    count++;
                    processed[j] = true;
                }
            }
            System.out.println(array[i]+" occured "+count+" times");
        }
    }
}
