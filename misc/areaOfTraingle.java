package tryingToLearnJava;
import java.util.Scanner;

public class areaOfTraingle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Base: ");
		int base = scanner.nextInt();
		System.out.println("Enter Height: ");
		int height = scanner.nextInt();	
		double area = 0.5*base*height;
		System.out.println("Area is: "+area);
		
		

	}

}
