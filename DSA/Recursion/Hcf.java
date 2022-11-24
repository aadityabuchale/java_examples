// take two numbers form user and calculate HCF of two

import java.util.*;

class Logic{

	static int hcfMethod(int n1,int n2)
	{
		while(n1!=n2)
		{
			if(n1>n2)
				return hcfMethod((n1-n2),n2);		
			else
				return hcfMethod(n1,(n2-n1));
		}
		return n1;
	}
}

public class Hcf{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one Number :");
		int n1=sc.nextInt();
		System.out.println("Enter Second Number");
		int n2=sc.nextInt();
		System.out.println("HCF of two is :"+Logic.hcfMethod(n1,n2));
	}
}

