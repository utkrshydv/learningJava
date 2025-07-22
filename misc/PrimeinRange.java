package day3;

class checkPrime{
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2; i<n; i++) {
			if(n%i == 0) {
				return false; 
			}
		}
		return true;
	}
}

public class PrimeinRange {
	public static void main(String[] args) {
	   for(int i=1; i<=30; i++) {
		   if(checkPrime.isPrime(i)) {
			   System.out.println(i);
		   }
	   }
	}

}
