public class P5Parameter1{

	void Meth(int a){
		System.out.println("Method 1 Called");
		System.out.println("Value: "+a);
	}
	public static void main(String[] args){
		System.out.println("Start");
		P5Parameter1 aobj=new P5Parameter1();
		aobj.Meth(87);
		System.out.println("End");
	}
}