package basicprograms;

public class VerifyAge {
	void Age(int age1,String name)
	{
		if(age1>=18){
			System.out.println(name+" is Eligible for Vote");
		}
		else 
		{
			System.out.println(name+"is Not Eligible for Vote");
		}
	}
	public static void main(String[] args) {
		new VerifyAge().Age(21,"Aaditya");
	}
}
