package day4;

public class RemoveDuplicatesInPlace {
    public static void main(String[] args) {
        int[] array = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,5};

        int i=0;
        for(int j=1; j<array.length; j++){
            if(array[j] != array[i]){
                array[i+1] = array[j];
                i++;
            }
        }
        System.out.println("Array: "+java.util.Arrays.toString(array));
        System.out.println("Unique Elements: "+(i+1));

    }
}
