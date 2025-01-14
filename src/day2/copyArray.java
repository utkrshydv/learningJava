package day2;

import java.util.Scanner;

public class copyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("No of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements: ");

        for(int i = 0; i<n; i++){
            array[i] = scanner.nextInt();
        }

        int[] copiedArray = copyArray(array, n);
        System.out.println("Copied Array: ");
        for(int num: copiedArray){
            System.out.println(num);
        }

        //method 2

        int[] copy = new int[n];

        System.arraycopy(array, 0, copy, 0, n);
        System.out.println("Copied Array: "+java.util.Arrays.toString(copy));
    }

    public static int[] copyArray(int[] array, int n){
        int[] copiedArray = new int[n];
        for(int i = 0; i < n; i++){
            copiedArray[i] = array[i];
        }
        return copiedArray;
    }
}
