// program for returning value 4-11-22
// return should not be the last statement of program but it should be the last execute=able statement of the program

package basicprograms;

public class ReturnValue {
	
	void meth1() {	                   // void method can also have return statement without value
		System.out.println("10");
		System.out.println("20");
		System.out.println("30");
		return;
	}
	int meth2(){
		System.out.println("Method 2() called "); // int and char are compatible data types
		return 'a';
	}
	
	int meth3() {
		System.out.println("method 3() called"); 
		int i=10;
		if(i<=10) {
			System.out.println("If Block executed");
			return 10;
		}
		else {
			System.out.println("Else block executed");
			return 10;
		}
	}
	public static void main(String[] args) {
		ReturnValue obj=new ReturnValue();
		obj.meth1();
		int a= obj.meth2();
		System.out.println(a);
		int i =obj.meth3();
		System.out.println(i);
	}
}
