package day3;

public class secondLargestElement {
    public static void main(String[] args) {
        int[] array = {11, 7, 4, 9, 10};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element exists.");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }
    }
}
