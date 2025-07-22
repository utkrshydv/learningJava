package tryingToLearnJava;

import java.util.Scanner;

public class printTenUsingWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter upper limit: ");
		int number = scanner.nextInt();
		
		while(number>0) {
			System.out.println(number);
			number--;
		}
	}

}
