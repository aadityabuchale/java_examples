// take input from user and print sum of natural numbers

import java.util.*;

class logic{
	static int sum(int n){
		if(n==1)
			return 1;
		else
			return n+sum(n-1);
	}
}

public class SumofNatural{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scan.nextInt();
		System.out.println("Sum :"+logic.sum(n));
	}
}