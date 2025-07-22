package tryingToLearnJava;

public class Calculator {
   public int add(int num1, int num2) {
	   return num1+num2;
   }
}


class playground{
  public static void main(String[] args) {
	  Calculator calc = new Calculator();
	  
	  int result = calc.add(5, 6);
	  System.out.print(result);
	
  }
}
