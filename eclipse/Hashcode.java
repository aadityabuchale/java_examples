package basicprograms;

public class Hashcode {
	public static void main(String[] args) {

		Hashcode aobj=new Hashcode();
		Hashcode bobj=new Hashcode();
		int a =aobj.hashCode();
		int b =bobj.hashCode();
		System.out.println("Hashcode 1 return: "+a);
		System.out.println("Hashcode  2 return: "+b);
		
		// Equals method
		System.out.println(aobj.equals(aobj));
		System.out.println(aobj.equals(bobj));
		System.out.println(new Hashcode().equals(new Hashcode()));
		
		// getclass()
		
		Hashcode obj=new Hashcode();
		System.out.println(obj.getClass());
	}
}
