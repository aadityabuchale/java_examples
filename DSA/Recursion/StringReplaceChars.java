// take string input from user and replace the character with given character

import java.util.*;

class Logic {
	static String repleceMethod(String s,char ch,char rep,int index){
		if(index<0)
			return "";
		else if(s.charAt(index)==ch)
			return repleceMethod(s,ch,rep,index-1)+rep;
		else
			return repleceMethod(s,ch,rep,index-1)+s.charAt(index);
	}
}
public class StringReplaceChars{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter a String : ");
		String s=sc.nextLine();
		System.out.print("Enter a character to replace ");
		char ch=sc.next().charAt(0);
		System.out.print("\nEnter Replaced Character ");
		char rep=sc.next().charAt(0);
		System.out.println("\nString output : "+Logic.repleceMethod(s,ch,rep,s.length()-1));
	}
}