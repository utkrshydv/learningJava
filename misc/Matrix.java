package day5;
import java.util.Scanner;


public class Matrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		
		System.out.println("Enter elements: ");
		  for(int i=0; i<3; i++) {
			  for(int j=0; j<3; j++) {
				 System.out.print(String.format("matrix[%d][%d]=", i,j));
		 matrix[i][j] = scanner.nextInt();
    	  }
      }
	printMatrix(matrix);
	System.out.println("Left Diagonal Sum: "+findDiagonalSumLeft(matrix));
	System.out.println("Right Diagonal Sum: "+findDiagonalSumRight(matrix));
	
	}
	
	public static void printMatrix(int[][] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public static int findDiagonalSumLeft(int[][] array){
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[0].length; j++) {
				if(i==j) {
					sum +=array[i][j];
				}
			}
		}
		return sum;
	}
	
	public static int findDiagonalSumRight(int[][] array) {
	    int sum = 0;
	    int n = array.length; 
	    for (int i = 0; i < n; i++) {
	        sum += array[i][n - 1 - i]; 
	    }
	    return sum;
	}


}
