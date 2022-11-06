public class ArithematicOP{

	void Meth1(){
		int a=10;
		int b=20;
		System.out.println("Addition :"+(a+b));
	}	
	void Meth2(){
		int a=40;
		int b=20;
		System.out.println("Substraction :"+(a-b));
	}
	void Meth3(){
		int a=10;
		int b=5;
		System.out.println("Multiplication :"+(a*b));
	}
	void Meth4(){
		int a=20;
		int b=5;
		System.out.println("Division :"+(a/b));
	}
	public static void main(String[] args){
		System.out.println("Arithematic Operations");
		ArithematicOP aobj=	new ArithematicOP();
		aobj.Meth1();
		aobj.Meth2();
		aobj.Meth3();
		aobj.Meth4();
		System.out.println("Thank You..!");
		System.out.println("Java is AWESOME");
	}
}	