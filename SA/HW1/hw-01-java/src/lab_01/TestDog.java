package lab_01;

public class TestDog {
	public static void main(String[] args) {
		PitBull p1 = new PitBull();
		Dog dog1 = new Dog();
		Dog dog2 = p1;
		// insert code here

//		PitBull p2 = (PitBull) dog1;
//		PitBull p2 = (PitBull) dog2;
//		Reference to dog1 instance

//		PitBull p2 = dog2;
//		Type mismatch: cannot convert from Dog to PitBull
		System.out.println("this");
	}
}
