// take string data from user and print the reverse of string. 
import java.util.*;

class Logic{
	static String revMethod(String s){
		if(s==null || s.length()<=1){
			return s;
		}
		else
			return revMethod(s.substring(1))+s.charAt(0);
	}
}
public class StringReverse{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		System.out.println("Reverse of String is: "+Logic.revMethod(s));
	}
}


