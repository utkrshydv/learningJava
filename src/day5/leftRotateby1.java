package day5;
import java.util.Scanner;
import java.util.Arrays;

public class leftRotateby1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int[] array = {5,3,4,6,1};
        System.out.println("Original Array: "+Arrays.toString(array));
        array = Rotateby1(array);
        System.out.println("Original Array: "+Arrays.toString(array));
    }

    public static int[] Rotateby1(int[] array){
        int value = array[0];
        int n = array.length;

        for(int i=1; i<n; i++){
            array[i-1] = array[i];
        }

        array[n-1] = value;

        return array;
    }
}
