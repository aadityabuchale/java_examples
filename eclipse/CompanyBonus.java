// 22-08-2022 program no-  if else statement

package control_statements;

public class CompanyBonus {
	
		 static void Bonus(int sal,int years) {
			int bamount = (int)(sal*0.05);
			if(years>5) {
				System.out.println("Congrats You are eligible for bonus,\n your bonus amount is "+bamount+"Rs");
				System.out.println("Your Total Salary is- "+(sal+bamount)+"Rs");
			}
			else
				System.out.println("Your Total Salar is- "+sal);
			
		}
	public static void main(String[] args) {
		Bonus(50000,6);
	}
}
