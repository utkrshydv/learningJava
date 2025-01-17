package day5;
import java.util.Scanner;
import java.util.Arrays;

public class RightRotatebyK {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6};
        System.out.print("Enter K: ");
        int k = scanner.nextInt();
        System.out.println("Original Array: "+Arrays.toString(array));
        rotatebyK(array, k);
        System.out.println("Rotated Array: "+Arrays.toString(array));
    }

    public static void rotatebyK(int[] array, int k){
        int size = array.length;
        int d = k % size;

        if(d==0) return;

        reverse(array, 0, size-1);
        reverse(array, 0, d-1);
        reverse(array, d, size-1);
    }

    public static void reverse(int[] array, int start, int end){
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
