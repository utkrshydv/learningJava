package day3;

public class secondLargestElement {
    public static void main(String[] args) {
        int[] array = {11, 12, 4, 15, 13};

        int largest = array[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        System.out.println("Second Largest: " + secondLargest);
    }
}
