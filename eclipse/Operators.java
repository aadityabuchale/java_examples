package basicprograms;

public class Operators {
	
	void meth1(int a) {
		if((a!=70))
		{
			System.out.println("If Block Executed");
		}
		else
		{
		System.out.println("Else Block Executed");
		}
	}
	void examEligibility(int a,String name)
	{
		if(a>=21 && a<=35){
			System.out.println(name+" is Eligible for Exams");
		}
		else 
		{
			System.out.println(name+"is Not Eligible for Exam");
		}
	}
	void meth2(String gender)
	{
		if( gender=="m" || gender=="M" ) {
			System.out.println("Gender is Male");
		}
		else
		{
			System.out.println("Invalid Gender");
		}
	}
	public static void main(String[] args) {
		Operators obj =new Operators();
		obj.meth1(100);
		System.out.println("----------------------");
		obj.examEligibility(35,"Aaditya");
		System.out.println("----------------------");
		obj.meth2("M");
		System.out.println("----------------------");	
	}
}
