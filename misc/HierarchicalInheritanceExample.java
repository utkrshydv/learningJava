package day7;

class Shape{
	void display() {
		System.out.println("This is a shape");
	}
}

class Circle extends Shape{
	void area() {
		System.out.println("Area of circle is πr²");
	}
}

class Rectangle extends Shape{
	void area() {
		System.out.println("Area of rectangle is length x breadth");
	}
}

public class HierarchicalInheritanceExample {
  public static void main(String[] args) {
	  Circle circle = new Circle();
	  circle.display();
	  circle.area();
	  
	  Rectangle rectangle = new Rectangle();
	  rectangle.display();
	  rectangle.area();
	  
  }

}
