// program to remove character from string 

import java.util.*;

class Logic{
	static String strRemove(String s,int index,char ch){
		if(index<0)
			return "";
		else if(s.charAt(index)==ch)
				return strRemove(s,index-1,ch);
			else
				return strRemove(s,index-1,ch)+s.charAt(index);
	}
}
public class RemoveChar{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s=sc.nextLine();
		System.out.print("\nEnter Character to remove: ");
		char ch=sc.next().charAt(0);
		System.out.println("\nString without "+ch+" is: "+Logic.strRemove(s,(s.length()-1),ch));
	}
}