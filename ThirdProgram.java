public class ThirdProgram {

	void Meth1(){
		System.out.println("Method 1 Called");
		int a=10;
		System.out.println(a);
		System.out.println("a");
		System.out.println("Addition: "+(a+20));
	}
	void Meth2(){
		System.out.println("Method 2 Called");
		int a=30;
		int b=20;
		System.out.println("Substraction: "+(a-b));
	}
	public static void main(String [] args){
		System.out.println("Start");
		ThirdProgram aobj= new ThirdProgram();
		aobj.Meth1();
		aobj.Meth2();
		System.out.println("End");
	}
}