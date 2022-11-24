// take two numbers form user and calculate lcm of them.

import java.util.*;

class Logic {
	static int com=1;
	static int method(int n1,int n2)
	{
		if(com%n1==0 && com%n2==0)
		return com;
		com++;
		 return method(n1,n2);
	}
}

public class Lcm{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number ");
		int n1=sc.nextInt();
		System.out.println("Enter Second Number ");
		int n2=sc.nextInt();
		System.out.println("LCM of Two is: "+Logic.method(n1,n2));
	}
}

