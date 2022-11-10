// Take Input form User and Find Maximum of Two

import java.util.*;
import java.lang.*;
class Logic
{
	static int maxoftwo_l1(int a,int b)
	{
		return (a>b)?a:b;
	}
	static int maxoftwo_l2(int a,int b)
	{
		return Math.max(a,b);
	}
}
class  MaxofTwo
{
	public static void main(String[] args) 
	{
		Scanner obj= new Scanner(System.in);
		System.out.println("\nMax Of Two Numbers");
		System.out.println("-------------------------");
		System.out.println("Enter First Number");
		int a= obj.nextInt();
		System.out.println("Enter Second Number");
		int b =obj.nextInt();
		System.out.println("-------------------------");
		System.out.println("Maximum Number is: "+Logic.maxoftwo_l1(a,b));
		System.out.println("-------------------------");
		System.out.println("Maximum Number is: "+Logic.maxoftwo_l2(a,b));
	}
}
