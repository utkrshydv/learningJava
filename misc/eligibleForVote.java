package tryingToLearnJava;
import java.util.Scanner;

public class eligibleForVote {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		
		if(age>=18) {
			System.out.println("You are eligible for electing the next corrupt person");
		} else {
			System.out.println("Country doesn't care about your opinion");
		}


	}

}
