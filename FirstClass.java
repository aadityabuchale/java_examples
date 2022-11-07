public class FirstClass{

	void Meth1(){
		System.out.println("It is M1");
	}
	void Meth2(){
		System.out.println("It is M2");
	}
	public static void main( String[] args){
		System.out.println("It is Main");
		FirstClass aobj=new FirstClass();
		aobj.Meth1();
		aobj.Meth2();
	}
}