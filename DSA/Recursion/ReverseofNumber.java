// take input from user and find mreverse of given number 

import java.util.*;

class Logic{
	static int revMethod(int n,int len){
		if(n==0)
			return 0;
		else
			return ((n%10)*(int)Math.pow(10,len-1))+revMethod(n/10,--len);
	}
}
public class ReverseofNumber{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		String s= sc.nextLine();
		System.out.println("\nReverse of "+Integer.parseInt(s)+" is: "+Logic.revMethod(Integer.parseInt(s),s.length()));
	}
}