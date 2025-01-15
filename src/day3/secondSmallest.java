package day3;

public class secondSmallest {
    public static void main(String[] args) {
        int[] array = {5,4,7,2,3};

        int smallest = array[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++){
            if(array[i] < smallest){
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] != smallest && array[i] < secondSmallest){
                secondSmallest = array[i];
            }
        }
        System.out.println("Second smallest: "+secondSmallest);
    }
}
