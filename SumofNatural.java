// take input number from user and give sum of n natural numbers -l3

import java.util.*;

class Logic
{
	static int sum_l1(int n)
	{
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
	static int sum_l2(int n)
	{
		if (n==0)
			return 0;
		else
			return n+sum_l2(n-1);
	}
	static int sum_l3(int n)
	{
		n=n*(n+1)/2;
		return n;
	}
}

class SumofNatural 
{
	public static void main(String[] args) 
	{
	
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a Number");
		int n=scan.nextInt();
		System.out.println("---------------------------");
		System.out.println("1- Sum of Number: "+Logic.sum_l1(n));
		System.out.println("2- Sum of Number: "+Logic.sum_l2(n));
		System.out.println("3- Sum of Number: "+Logic.sum_l3(n));
	}
}
