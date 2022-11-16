// 15-11-2022 CW 
//Difference between storing the values of static variables and instance variables
// there is only one copy of static variable present in the program,so the value of static variable is updated
// when we perform operations on it.

package basicprograms;

public class StaticVariable {
	int a;
	static int b;
	StaticVariable(){
		a++;
		b++;
		System.out.println("Instance Variable :"+a);
		System.out.println("Static Variable :"+b);
	}
	public static void main(String[] args) {
		new StaticVariable();
		System.out.println("-------------------");
		new StaticVariable();
		System.out.println("-------------------");
		new StaticVariable();
	}
}
