// take number fromm user and give factorial of the number

import java.util.*;

class Logic
{
	static int factorial_l1(int n)
	{
		int fact=1;
		for(int i=0;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	static int factorial_l2(int n)
	{
		if (n==0)
			return 0;
		else
			return n*factorial_l2(n-1);
	}
}

class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=scan.nextInt();
		System.out.println("1- factorial: "+Logic.factorial_l1(n));
		System.out.println("2- factorial: "+Logic.factorial_l2(n));
	}
}
