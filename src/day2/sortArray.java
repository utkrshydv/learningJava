package day2;
import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("No of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }
//Method 2
        sortAscending(array, n);
        sortDescending(array, n);
        sort(array, true);
        sort(array, false);

//Method 3 - built in

        Arrays.sort(array);
        System.out.println("Ascending (built in): "+Arrays.toString(array));

    }

    public static void sortAscending(int[] array, int n){
        int temp;
        for(int j=0; j<n; j++){
            for(int i=0; i<n-1; i++){
                if(array[i]>array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        System.out.println("Ascending: "+java.util.Arrays.toString(array));
    }

    public static void sortDescending(int[] array, int n){
        int temp;
        for(int j=0; j<n; j++){
            for(int i=0; i<n-1; i++){
                if(array[i]<array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        System.out.println("Descending: "+java.util.Arrays.toString(array));
    }

    public static void sort(int [] array, boolean ascending){
        int n = array.length;
        int temp;
        for(int j=0; j<n; j++){
            for(int i=0; i<n-1; i++){
                if((ascending && array[i] > array[i+1]) || (!ascending && array[i] < array[i+1])){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }

        if(ascending) {
            System.out.println("Ascending: " + java.util.Arrays.toString(array));
        } else {
            System.out.println("Descending: " + java.util.Arrays.toString(array));
        }
    }
}
