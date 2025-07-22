package day5;

import java.util.Scanner;

public class MatrixAdd {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String args[]) {
		int[][] matrixA = new int[3][3];
		int[][] matrixB = new int[3][3];
		
		matrixA = AcceptMatrix(matrixA);
		matrixB = AcceptMatrix(matrixB);
	}
	
	public static int[][] AcceptMatrix(int[][] matrix) {
		System.out.println("Enter Elements for Matrix: ");
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(String.format("matrix[%d][%d]=", i,j));
				matrix[i][j] = scanner.nextInt();
			}
		}
		return matrix;
	}

	

}
