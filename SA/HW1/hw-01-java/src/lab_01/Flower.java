package lab_01;

public class Flower extends Plant {
	// insert code here 

//	a - correct
//	public Flower getType() { return this; }
//	Redefine method from Plant class, which return instance of Plant type
//	but with new one, which return instance of Flower
	
//	b - incorrect
//	public String getType() { return "this"; }
//	We can't override method, what returns incompatible with superclass type
	
//	c - correct
//	public Plant getType() { return this;}
//	This method return Plant instance from Flower, downcast instance to Plant
	
//	d - correct
//	public Tulip getType() { return new Tulip(); }
//	As soon as Tulip inherited from Plant 
	
//	e - incorrect
//	public String getType() { return this; }
//	This variant shows two violations:
//	First one - type String not compatible with Plant type
//	Second one - this - instance of Flower type, but method declared with String return type
	
}
