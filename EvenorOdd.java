import java.util.*;

class Logic
{
	static String evenorodd(int n)
	{
		return(n%2==0)?"Even Number":"Odd Number";
	}
}

class  EvenorOdd
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=obj.nextInt();
		System.out.println("\n--------------------------------");
		System.out.println("The Number is: "+Logic.evenorodd(n));
	}
}
