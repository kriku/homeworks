package lab_01;

//Question 1

//a - correct

//public abstract class Square implements Shape {
//	public abstract void setColor(String s);
//}


//In this case defined public abstract class with public abstract method setColor(String s)
//This method defined without body, and don't violate syntax. 


//b - Abstract methods do not specify a body

//public abstract class Square implements Shape {
//	public abstract void setColor(String s) {}
//}

//This variant trying define abstract method with empty body.
//But for abstract methods we can't define body, ever.

//c - The type Shape cannot be the superclass of Square; a superclass must be a class

//public abstract class Square extends Shape {
//	public void setColor(String s) {}
//}

//For inheritance in Java we can extends some classes, but not interfaces.
//We can implement interfaces or extend interfaces by another, but can't extend class with interface.

//d - correct

//public abstract class Square implements Shape {
//	public void setColor(Integer i) {}
//}

//In this implementation we have correct definition of class Square, which implements interface Shape.


//e - correct

//public abstract class Square implements Shape {
//	public void setColor(String s) {}
//	public void setColor(Integer i) {}
//}

//For overloading methods in Java we can define different methods with same name, for different types and arity of parameters
