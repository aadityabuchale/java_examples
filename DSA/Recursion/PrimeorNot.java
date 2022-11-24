// take n input from user and show which numbers are prime numbers or not

import java.util.*;

class Logic{
	static boolean verifyPrime(int n,int i){
		if (i==1){
			return true;
		}
		else if (n%i==0)
			return false;
		else
		return verifyPrime(n,--i);
	}
}
public class PrimeorNot{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++){
		System.out.println("--->"+(Logic.verifyPrime(i,i/2)));
		}
	}
}