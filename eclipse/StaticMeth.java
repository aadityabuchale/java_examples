// we can call static method using a className also without creating an object


package basicprograms;

public class StaticMeth {
	void meth1() {
		System.out.println("Meth1()");
	}
	static void meth2() {
		System.out.println("Meth2()");
	}
	public static void main(String[] args) {
		StaticMeth obj=new StaticMeth();
		obj.meth1();    //method 1 calling using object
		StaticMeth.meth2();   //method 2 calling using class
		
	}
}
