package tryingToLearnJava;
import java.util.Random;
import java.util.Scanner;

public class numberPuzzle {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int computerNumber = random.nextInt(51);
		
		int difference=0; 
		int flag=0;
		
		while(flag==0) {
			System.out.println("Guess a number between 0 and 50: ");
			int userNumber = scanner.nextInt();
			if(userNumber == computerNumber) {
				System.out.println("You Guessed the number");
				flag=1;
			} else {
					difference = computerNumber - userNumber;
				if(difference > 20) {
					System.out.println("Way too low!");
				} else if(difference <=20 && difference >11) {
					System.out.println("Too low!");
				} else if(difference>0 && difference <=10){
					System.out.println("Almost There! Just a little Higher");		
				} else if(difference<0 && difference >=-10) {
					System.out.println("Almost there! Just a little lower");
				}else if(difference<-10 && difference >=-20) {
					System.out.println("Too high!");
				} else if(difference<-20) {
					System.out.println("Way to low");
				}
				System.out.println("Guess Again"+computerNumber);
			}
			
		}
		

	}

}
