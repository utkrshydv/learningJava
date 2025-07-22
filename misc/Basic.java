package learningArrays;
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number of elements: ");
		int n = scanner.nextInt();
		
		int[] dynamicArray = new int[n];
		
		System.out.println("Enter elements: ");
		for(int i =0; i<n; i++) {
			dynamicArray[i] = scanner.nextInt();
		}
		
		for(int num : dynamicArray) {
			System.out.println(num);
		}
		
		int max = findMax(dynamicArray);
		System.out.println("Max = "+max);
		
		int min = findMin(dynamicArray);
		System.out.println("Min = "+min);
	}
	
	public static int findMax(int[] array) {
		int max = array[0];
		for(int num: array) {
			if(num>max) {
				max = num;
			}
		}
		return max;
	}
	
	public static int findMin(int[] array) {
		int min = array[0];
		for(int num: array) {
			if(num<min) {
				min = num;
			}
		}
		return min;
	}

}
