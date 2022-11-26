// Explain program 25-11-2022

package control_statements;

public class ForExplain {
	void meth1() {
		System.out.println("----meth1()----");
		for(int i=1;i<=5;i++)
			System.out.println("i value: "+i);
		System.out.println("Meth1() execution completed");
	}
	void meth2() {
		System.out.println("----meth2()----");
		for(int i=1;i<=10;i++)
			System.out.println("i value: "+ ++i);
		System.out.println("Meth2() execution completed");
	}
	void meth3() {			//we can write initialization and inc dec in another place also 
		System.out.println("----meth3()----");
		int i=1;
		for(;i<=5;) {
			System.out.println("i value: "+i);
			i++;
		}
		System.out.println("Meth3() execution completed");
	}
	void meth4() {
		int i=1;
		System.out.println("----meth4()----");
		for(;true;) {
			System.out.println("i value: "+i);
			i++;
			break; // when compiler come across return statement it will come out of the for loop
		}
		System.out.println("Meth4 execution completed");  // CE because unreachable code condition always true
	}
	void meth5() {
		System.out.println("----meth5()----");
		for(int i=1;i<=5;i++)
			// int j=10;      // CE becaue we cannot write declaration statement in this line
			System.out.println("i value"+i);
		System.out.println("Meth5() execution completed");
	}
	public static void main(String[] args) {
		ForExplain obj=new ForExplain();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();
		obj.meth5();
	}
}
