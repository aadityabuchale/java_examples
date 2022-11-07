public class P6Parameter2{

	void Meth1(int a,int b){
		System.out.println("Method 1  Starts");
		System.out.println(a);
		System.out.println(a+b);
		new P6Parameter2().Meth2("Java is AWESOME");
	}
	void Meth2(String a){
		System.out.println(a);
	}
	public static void main(String[] args){
		new P6Parameter2().Meth1(40,10);
	}
}
		
	