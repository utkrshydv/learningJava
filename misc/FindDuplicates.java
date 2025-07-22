package day2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                duplicates.add(index + 1);
            } else {
                nums[index] = -nums[index];
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

      
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

       
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println("Duplicates: " + duplicates);

        scanner.close();
    }
}
