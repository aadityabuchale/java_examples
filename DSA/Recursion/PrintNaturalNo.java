// take input from user and print natural numbers form that number

import java.util.*;

class Logic{
	static void print(int n)
	{
		if (n>=1) {
			System.out.print(n+" ");
			print(n-1);
		}
	}
}
public class PrintNaturalNo
{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr a Number");
		int n= scan.nextInt();
		Logic.print(n);
	}
}