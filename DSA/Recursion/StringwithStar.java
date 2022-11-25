// take string from user and print it separated by adjcent star. 25-11-2022

import java.util.*;

class Logic {
	static String stringMeth(String s,int index){
		if(index<1)
			return ""+s.charAt(index);
		else
			return stringMeth(s,index-1)+"*"+s.charAt(index);
	}
}
public class StringwithStar{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=sc.nextLine();
		System.out.print("\nString With Star is: "+Logic.stringMeth(s,s.length()-1));
	}
}