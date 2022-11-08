public class SecondProgram{

	void Meth1(){
		System.out.println("Hello This is Method 1");
		System.out.println(10);
		System.out.println(20);
		SecondProgram aobj=new SecondProgram();
		aobj.Meth2();
	}
	void Meth2(){
		System.out.println("Hello This is Method 2");
		System.out.println(30);
		System.out.println(40);
	}
	public static void main(String[] args){
		System.out.println("This is Main Method");
		System.out.println("Java is AWESOME");
		System.out.println(50);
		SecondProgram aobj=new SecondProgram();
		aobj.Meth1();
		System.out.println("End");
	}
}