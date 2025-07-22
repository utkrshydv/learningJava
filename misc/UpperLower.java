package day3;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter a string: ");
			String input = scanner.nextLine();
			System.out.println("Upper Case: "+input.toUpperCase()+"\nLower Case: "+input.toLowerCase());
			System.out.println("Length: "+input.length());
			System.out.print("Letter to look for: ");
			String letter = scanner.nextLine();
			int location = input.indexOf(letter)+1;
			System.out.println("Location: "+location);
			System.out.print("Enter 2nd word: ");
			String input2 = scanner.nextLine();
			System.out.println("Concatenated: "+input.concat(" ").concat(input2));
			scanner.close();
	}

}
