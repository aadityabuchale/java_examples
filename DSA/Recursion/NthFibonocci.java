import java.util.*;

class logic{
	static int fibMethod(int n){
		if(n==0||n==1)
			return n;
		else
			return fibMethod(n-1)+fibMethod(n-2);
	}
}

public class NthFibonocci{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=sc.nextInt();
		System.out.println("Fobonocci Number of "+n+" is "+logic.fibMethod(n));
	}
}