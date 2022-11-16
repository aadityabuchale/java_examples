// assigning the values to instance variable using constructor

package basicprograms;

public class Variables {
	String empName;
	int empSal;
	String empDept;
	static String empCompany;
	
	Variables(int sal,String name,String dept,String company)
	{
		empName=name;
		empSal=sal;
		empDept=dept;
		empCompany=company;
		
	}
	public static void main(String[] args) {
		Variables  aobj1= new Variables(90000,"Aaditya","Java BackEnd","Deolitte");
		System.out.println(aobj1.empName+" "+aobj1.empSal+" "+aobj1.empDept+" "+Variables.empCompany);
	}
}
