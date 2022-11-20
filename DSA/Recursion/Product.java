// take numbers from user and calculate product of two numbers

import java.util.*;

class logic{
	static int productMethod(int a,int b)
	{
		// if(a<b){
		// 	return productMethod(b,a);
		// }
		if(b!=0)
				return a+(productMethod(a,b-1));
			else
				return 0;
		
	}
}

public class Product{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter one Number");
		int a= scan.nextInt();
		System.out.println("Enter another Number");
		int b=scan.nextInt();
		System.out.println("Multipliction :" +logic.productMethod(a,b));
	}
}