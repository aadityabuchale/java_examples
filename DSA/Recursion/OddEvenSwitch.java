package homework;

public class OddEvenSwitch {
	static void Verify(int no,String s) {
		switch(no%2) {
			case 0:System.out.println("It is Even Number");
				break;
			case 1:System.out.println("It is Odd Number");
				break;
		}
		
	}
	public static void main(String[] args) {
		Verify(31,"Even");
	}
}
