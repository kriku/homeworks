package lab_01;

public class Minor extends Uber {
	public Minor() { super(y); y = y + 3; }
	
	public static void main(String[] args) {
		new Minor();
		System.out.println(y);
		Uber uber = new Uber();
		System.out.println(uber.y);
		
//		returns 9
//		On first step created static field y, of Uber class, and initialize with value 2
//		Then try create Minor instance, by calling constructor Uber(int x)
//		This constructor call default constructor for Uber(), which multiply value y twice
//		After this evaluation returns to Minor() constructor, which increment value y by three
//		So for static field y we have value 9, and as soon as value public we can access it from other classes
	}
}
