// Take Numbe From user and Give Fibonocci Number Series


import java.util.*;

class Logic{
	static ArrayList fibonoccimeth(int n)
	{
		 ArrayList al =new ArrayList();
		int a=0;
		int b=1,i;
		al.add(a,b);
		for(i=1;i<=n-2;i++)
		{
			int c=a+b;
			al.add(c);
			a=b;
			b=c;
		}
		return al;
	}
}
class Fibonocci{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scan.nextInt();
		System.out.println("Fibonocci :"+ Logic.fibonoccimeth(n));
	}
}