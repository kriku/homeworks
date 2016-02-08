package lab_01;

public class Chrome {
	public static void main(String args[]) {
		X x1 = new X();
		X x2 = new Y();

		Y y1 = new Y();
		//insert code here

//		x2.do2();
//		The method do2() is undefined for the type X
//		x2 is instance of X class, so when we call Y constructor, we create Y instance, but cast it to X class (we can do it because Y extends X)
//		But X class haven't got do2 method.

//		apply
//		((Y)x2).do2();
//		This is legal call of do2 method, Y class, because we create x2 object with Y constructor

//		(Y)x2.do2();
//		Cast priority less than methods call.
//		So we can't call method before cast to Y type.
//		The method do2() is undefined for the type X
//		Y cannot be resolved to a variable
	}
}
