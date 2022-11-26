//take parameterized constructor and find the greatest among two 
package control_statements;

public class Gretest {
	Gretest(int a,int b){
		if(a>b)
			System.out.println(a+" is Bigger than "+b);
		else
			System.out.println(b+" is Bigger than "+a);
	}
	public static void main(String[] args) {
		new Gretest(50,20);
	}
}
