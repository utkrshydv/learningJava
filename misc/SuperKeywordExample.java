package day7;

class Vehicle2{
	int maxSpeed = 120;
	
}

class Car2 extends Vehicle2{
	int maxSpeed = 180;
	
	void display() {
		
		System.out.println("Maximum Speed: " + maxSpeed);
		System.out.println("Maximum Speed: " + super.maxSpeed);
	}
}

public class SuperKeywordExample {

	public static void main(String[] args) {
		Car2 small = new Car2(); 
        small.display(); 
	}
}
