package day3;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] array = {1,4,3,6,7};
        int flag = 0;
        for(int i=0; i<array.length-1; i++){
            if(array[i] > array[i+1]){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
