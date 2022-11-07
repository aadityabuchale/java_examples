public class FourthProgram{

	void Meth1(){
		System.out.println("Method 1 called");
		System.out.println(10);
		FourthProgram aobj=new FourthProgram();
		aobj.Meth2();
		System.out.println(25);
	}
	void Meth2(){
		System.out.println("Method 2 called");
		System.out.println(30);
	}
	void Meth3(){
		System.out.println("Mehtod 3 Called");
		FourthProgram aobj=new FourthProgram();
		aobj.Meth1();
		System.out.println(40);
	}
	public static void main(String[] args){
		System.out.println("Start");
		FourthProgram aobj= new FourthProgram();
		aobj.Meth3();
		System.out.println("Java is AWESOME");
		System.out.println("End");
	}
}