package day5;
import java.util.Scanner;
import java.util.Arrays;

public class leftRotatebyK {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = {5,6,7,8,9};

        System.out.println("Enter k: ");
        int n = scanner.nextInt();

        System.out.println("Original Array: "+Arrays.toString(array));
        RotatebyD(array, n);
        System.out.println("Rotated Array: "+Arrays.toString(array));


    }
   //time complexity O(n^2)
    public static void RotatebyK(int[] array, int n){
        int k = n % array.length;
        for(int i=0; i<k; i++){
            int value = array[0];
            int size = array.length;
            for(int j=1; j<size; j++){
                array[j-1] = array[j];
            }
            array[size-1] = value;
        }
    }

    public static void RotatebyD(int[] array, int n){
        int size = array.length;
        int d = n % size;

        if(d == 0) return;

        reverse(array, 0, d-1);
        reverse(array, d, size-1);
        reverse(array, 0, size-1);
    }

    public static void reverse(int[] array, int start, int end){
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            end--;
            start++;
        }
    }
}
