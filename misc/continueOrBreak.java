package tryingToLearnJava;

import java.util.Scanner;

public class continueOrBreak {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter upper limit 1: ");
			int number1 = scanner.nextInt();
			
			System.out.print("Enter upper limit 2: ");
			int number2 = scanner.nextInt();
			
			
			System.out.println("Example of Continue: ");
			while(number1>0) {
				if(number1==3) {
					number1--;
					continue;
				} else {
				System.out.println(number1);
				number1--;
				}
			}
			System.out.println("Example of Break: ");
			while(number2>0) {
				if(number2==3) {
					break;
				} else {
				System.out.println(number2);
				number2--;
				}
			}
	}

}
