package tryingToLearnJava;
import java.util.Scanner;

public class loopForCounting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Upper limit: ");
		int number = scanner.nextInt();
		
		for(int i=1; i<=number; i++) {
			System.out.println(i);
		}
	}

}
