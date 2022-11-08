//Take data from user & perform Additon of two Numbers 

import java.util.*;
class Addition
{
	static int meth1(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args) 
	{
		Scanner aobj= new Scanner(System.in);
		System.out.println("\nAddition of Two Numbers");
		System.out.println("-------------------------");
		System.out.print("Enter First Digit ");
		int a=aobj.nextInt();
		System.out.print("\nEnter Second Digit ");
		int b=aobj.nextInt();
		System.out.println("--------------------------");
		System.out.println("Output :"+meth1(a,b));
	}
}
