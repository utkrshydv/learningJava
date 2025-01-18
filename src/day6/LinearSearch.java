package day6;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {2,4,5,6,7,8,9};
        int key = 5;

        int found = LinearSearch(array, key);

        System.out.println(found);

    }

    public static int LinearSearch(int[] array, int key){
        for(int i=0; i<array.length; i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
}
