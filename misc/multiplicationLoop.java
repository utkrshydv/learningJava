package tryingToLearnJava;

import java.util.Scanner;

public class multiplicationLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Multiplication Table of: ");
		int number = scanner.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(number+" x "+i+" = "+number*i);
		}
	}

}
