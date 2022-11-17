// 10-11-2022 Practice WAP3
// Classname - AddAmmount,data member amount=500rs,two constructors 
//1- no amount added display balance 2 if amount added then add amount and display 

package practice;

public class AddAmmount {
	int amm=500;
	
	AddAmmount()
	{
		System.out.println("Balance is "+ amm);
	}
	AddAmmount(int addAmm)
	{
		System.out.println("Balance is "+ (amm+addAmm));
	}
	public static void main(String[] args) {
		 new AddAmmount();
		new AddAmmount(100);
	}
}
