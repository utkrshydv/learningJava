package day5;
import java.util.Arrays;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Elements: ");
		for(int i=0; i<5; i++) {
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Element to search for: ");
		int key = scanner.nextInt();
		
		boolean foundLinear = LinearSearch(array, 5, key);
		
		if(foundLinear) {
			System.out.println("Element is present in the array(Linear Search)");
		} else {
			System.out.println("Element is not present in the array(Linear Search)");
		}
		
		boolean foundBinary = BinarySearch(array, 5, key);
		
		if(foundBinary) {
			System.out.println("Element is present in the array(Binary Search)");
		} else {
			System.out.println("Element is not present in the array(Binary Search)");
		}
	
	}
	
	public static boolean LinearSearch(int[] array, int n, int key) {
		for(int i=0; i<n; i++) {
			if(array[i] == key) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean BinarySearch(int[] array, int n, int key) {
		Arrays.sort(array);
		int low = 0;
		int high = n-1;
		
		while(low <= high) {
			int middleElement = (low + high)/2;
			if(key < array[middleElement]) {
				high = middleElement-1;
			} else if( key == array[middleElement]) {
				return true;
			}else {
				low = middleElement+1;
			}
		}
		return false;
	}

}
