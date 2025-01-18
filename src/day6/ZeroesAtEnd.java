package day6;

public class ZeroesAtEnd {
    public static void main(String[] args) {
        int[] array = {0, 0, 1,0,2,3,4,0,0,4,5,0,0, 5,0};
        int k=0;
        for(int i=0; i<array.length; i++){
            if(array[i]!=0){
                array[k] = array[i];
                k++;
            }
        }
        while(k< array.length){
            array[k] = 0;
            k++;
        }
        System.out.println(java.util.Arrays.toString(array));
    }
}
