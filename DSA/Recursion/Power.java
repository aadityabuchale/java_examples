// take a,b from user and give b power

import java.util.*;

class logic
{
	static int method(int a,int b)
	{
		if(b<=0)        // Base Condidion
			return 1;
		else
			return a*method(a,(b-1));
	}
}

public class Power{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a Number ");
		int a=scan.nextInt();
		System.out.println("Enter Power ");
		int b=scan.nextInt();
		System.out.println("Power :"+logic.method(a,b));

	}
}