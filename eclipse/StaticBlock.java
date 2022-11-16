// 15-08-2022
// Static Block , Assigning the value to final static variable 
package basicprograms;

public class StaticBlock {
	final static int a;
	void meth1() {
		System.out.println("Method 1 Called");
		// a=50 // we can't initialize final static variable in normal method 
	}
	static void meth2() {
		System.out.println("Method 2 called");
		// a=20; //we can't initialize  final static variable in static method
	}
	
	static {
		System.out.println("Static block 1 executed");
		new StaticBlock().meth1();
	}
	StaticBlock(){
		System.out.println("hi");
	}
	
public static void main(String[] args) {
	System.out.println("Main Method Executed");
}

static {
	a=50;
	System.out.println("Static Block 2 executed");
}
}
