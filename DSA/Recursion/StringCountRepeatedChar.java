// take input from user and print no of times the given character repeated 25-11-2022

import java.util.*;

class Logic{
	static int countChar(String s,char ch,int index)
	{
		if(index<0)
			return 0;
		else if(s.charAt(index)==ch)
			return 1+countChar(s,ch,(index-1));
		else
			return countChar(s,ch,index-1);

	}
}
public class StringCountRepeatedChar{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=sc.nextLine();
		System.out.print("\nEnter Character to count:");
		char ch=sc.next().charAt(0);
		System.out.print("\n"+ch+" is repeated "+Logic.countChar(s,ch,s.length()-1)+" times.\n");
	}
}


