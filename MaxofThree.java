// Take input form User and Find Maximum of Three

import java.util.*;

class Logic
{
	static int maxofthree_l1(int a,int b,int c)
	{
	return (a>b && a>c)?a:(b>c)?b:c;
	}
	static int maxofthree_l2(int a,int b,int c)
	{
	return Math.max(a,Math.max(b,c));
	}
}
class MaxofThree
{
	public static void main(String[] args)
	{
	Scanner obj= new Scanner(System.in);
	System.out.print("Enter First Number ");
	int a= obj.nextInt();
	System.out.print("\nEnter Second Number ");
	int b=obj.nextInt();
	System.out.print("\nEnter Third Number ");
	int c=obj.nextInt();
	System.out.println("---------------------------");
	System.out.println("1 Maximum Among Three is:"+ Logic.maxofthree_l1(a,b,c));
	System.out.println("---------------------------");
	System.out.println("2 Maximum Among Three is:"+ Logic.maxofthree_l2(a,b,c));
	}
}