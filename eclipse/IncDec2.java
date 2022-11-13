// 12-11-22 Increment Decrement Operator HW
	 

	package basicprograms;

	public class IncDec2 {
		public static void main(String[] args) {
			int a=34;
			int b=21;
			int c= a++ + ++b;
			int d= --a + --b + c--;
			int e= a + +b +c + d--;
			int f= -a +b-- + -c -d++;
			int sum= a+b+c+d+e+f;
			System.out.println("Sum: " +sum);
			
		}
	}
