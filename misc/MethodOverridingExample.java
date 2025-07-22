package day7;

class Animal2{
	void sound() {
		System.out.println("Animals make sounds");
	}
}

class Dog2 extends Animal2{
	@Override
	void sound() {
		System.out.println("Woof Woof");
	}
}

class Cat2 extends Animal2{
	@Override
	void sound() {
		System.out.println("Meow Meow");
	}
}

public class MethodOverridingExample {
	public static void main(String[] args) {
		Animal2 animal2; 
		
		animal2 = new Dog2();
		animal2.sound();
		
		animal2 = new Cat2();
		animal2.sound();
		
		animal2 = new Animal2();
		animal2.sound();
		

	}

}
