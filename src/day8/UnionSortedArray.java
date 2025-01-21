package day8;

import java.util.Arrays;

public class UnionSortedArray {
    public static void main(String[] args) {
        int[] arrayA  = {1,2,3,4,5};
        int[] arrayB = {1,1,1,1,2,3,4,4,4,4,4,4,5,7,8};

        int a = arrayA.length;
        int b = arrayB.length;

        int[] sortedArray = new int[a+b];
        int i=0, j=0, k=0;

        while(i<a && j<b){
            if(arrayA[i] > arrayB[j]){
                if(k==0 || sortedArray[k-1]!=arrayB[j]){
                    sortedArray[k++] = arrayB[j];
                  }
                  j++;
                } else if(arrayA[i] < arrayB[j]){
                 if(k==0 || sortedArray[k-1]!=arrayA[i]){
                     sortedArray[k++] = arrayA[i];
                  }
                  i++;
                } else {
                if(k==0 || sortedArray[k-1]!=arrayA[i]){
                    sortedArray[k++] = arrayA[i];
                 }
                 i++;
                 j++;
            }
        }
        while(j<b){
            sortedArray[k++] = arrayB[j++];
        }

        while(i<a){
            sortedArray[k++] = arrayA[i++];
        }

        int[] result = Arrays.copyOf(sortedArray, k);
        System.out.println(Arrays.toString(result));
    }
}


