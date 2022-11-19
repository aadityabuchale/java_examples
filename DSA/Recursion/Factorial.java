// take input from user and Give Factorial of it

import java.util.*;

class logic{
	static int factMethod(int n)
	{
		if(n==1)
			return 1;
		else
			return n*factMethod(n-1);
	}
}

public class Factorial{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a Number ");
		int n=scan.nextInt();
		System.out.println("Factorial :" +logic.factMethod(n));
	}
}