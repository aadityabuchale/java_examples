// Swapping of two numbers With 5 logic

import java.util.*;

class Logic
{
	// Using temp variable

	static void swap_l1(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("1 - Numbers After Swapping are: "+ a,b);
	}

	// without using temp variable using addition and substraction

	static void swap_l2(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("2 - Numbers After Swapping are: "+ a,b);

	}
	
	// using multiplication and division
		
	static void swap_l3(int a,int b)
	{
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("3 - Numbers After Swapping are: "+ a,b);
	}

}

class SwapofTwo
{
	public static void main(String[] args) 
	{
		Scanner obj= new Scanner(System.in);
		System.out.print("Enter First Digit: ");
		int a=obj.nextInt();
		System.out.print("\nEnter Second Digit: ");
		int b=obj.nextInt();
		System.out.println("Numbers Before Swappping are: "+a,b);
		System.out.println("---------------------------------------");
		Logic.swap_l1(a,b);
		Logic.swap_l2(a,b);
		Logic.swap_l3(a,b);
	}
}
