package control_statements;

public class SquareorNot {
	String verify(int l,int b) {
		if(l==b)
			return "It is Square";
		else
			return "It is Not a square";
	}
	public static void main(String[] args) {
		System.out.println(new SquareorNot().verify(5,2)); 
	}
}
