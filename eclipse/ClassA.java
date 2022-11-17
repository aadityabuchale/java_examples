// 16-01-2022 Homework 

package homework;

public class ClassA {
	int c;
	static int e;
	ClassA(){
		System.out.println(++c);
		System.out.println(++e);
	}
	public static void main(String[] args) {
		int a=34;
		int b=21;
		new ClassA().c -= a++ + ++b;
		int d = --a + --b + new ClassA().c--;
		e=a + +b + +new ClassA().c +d--;
		int f= -a +b-- + -new ClassA().c -d++;
		int sum = a+b+new ClassA().c+d+e+f;
		System.out.println("Sum ="+sum);
	}
}
