package tryingToLearnJava;
import java.util.Scanner;


public class Bio {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name = myObj.nextLine();
		System.out.print("Enter Your Age: ");
		String age = myObj.nextLine();
		System.out.print("Enter Your Height: ");
		String height = myObj.nextLine();
		System.out.println("Hey! I'm " +name);
		System.out.println("I'm "+age+" years old");
		System.out.println("I'm " +height+"cm tall");
	}

}
