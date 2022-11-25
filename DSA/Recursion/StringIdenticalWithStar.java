// take string from user and print sring with identical alpa=habet separated with star

import java.util.*;

class Logic{
	static String starPrint(String s,int index){
		if(index<1)
			return ""+s.charAt(index);
		if(s.charAt(index)==s.charAt(index-1))
			return starPrint(s,index-1)+"*"+s.charAt(index);
		else
			return starPrint(s,index-1)+s.charAt(index);
	}
}
public class StringIdenticalWithStar{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente a string");
		String s=sc.nextLine();
		System.out.println("Output String is "+Logic.starPrint(s,s.length()-1));
	}
}
