// take input from user and give true or false according to the string nesting "(())"- true "())"-=false 25-11-2022

import java.util.*;

class Logic{
	static boolean stringNested(String s,int i,int j){
		if (i>0)
			return true;
		if (s.charAt(i)=='(' && s.charAt(j)==')')
			return stringNested(s,i+1,j-1);
		else
			return false;
	}
}
public class StringNesting{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string brackets :");
		String s=sc.nextLine();
		System.out.println((Logic.stringNested(s,0,s.length()-1)?"It is Nested String":"It is not nested string"));

	}
}