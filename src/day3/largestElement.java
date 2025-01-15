package day3;

public class largestElement {
    public static void main(String[] args) {
        int[] array = {5, 8, 9, 10, 11};

        int largest = array[0];

        for(int i=1; i<array.length; i++){
            if(array[i]>largest){
                largest = array[i];
            }
        }

        System.out.println("Largest Element: "+largest);
    }
}
