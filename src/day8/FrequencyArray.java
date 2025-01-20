package day8;

import java.util.Arrays;

public class FrequencyArray {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 5, 3, 3, 2, 2, 4};
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        int max = array[array.length - 1];
        System.out.println("Maximum value: " + max);

        int[] freqArray = new int[max + 1];
        for (int num : array) {
            freqArray[num]++;
        }
        System.out.println("Frequency array: " + Arrays.toString(freqArray));

        // Count unique elements
        int nonZero = 0;
        for (int freq : freqArray) {
            if (freq > 0) {
                nonZero++;
            }
        }

        // Create an array of unique elements
        int[] legitFreqArray = new int[nonZero];
        int k = 0;
        for (int i = 0; i <= max; i++) {
            if (freqArray[i] > 0) {
                legitFreqArray[k++] = i;
            }
        }
        System.out.println("Unique elements: " + Arrays.toString(legitFreqArray));
    }
}
