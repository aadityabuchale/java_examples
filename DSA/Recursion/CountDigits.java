// Take a number from user and Give Number of  digits present  in it

import java.util.*;

class logic{
	static int c;
	static int countMeth(int n){
		if(n!=0){
			c++;
			countMeth(n/10);
		}
		return c!=0?c:1;
	}
}

public class CountDigits{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Numer: ");
		int n=sc.nextInt();
		System.out.println(" Number Of digits are :"+logic.countMeth(n));

	}
}

