public class Fifth{

	void Meth1(){
		Fifth aobj= new Fifth();
		aobj.Meth5();
		int a=10;
		System.out.println(10);
		System.out.println(54+a);
	}
	void Meth2(){
		int a=20;
		System.out.println(78-a);
	}
	void Meth3(){
		int a=30;
		System.out.println(89+1);
		Fifth aobj=new Fifth();
		aobj.Meth1();
		System.out.println(10);
	}
	void Meth4(){
		int a=10;
		System.out.println(89);
		System.out.println(90);
		System.out.println(91);
	}
	void Meth5(){
		System.out.println(77);
		Fifth aobj=new Fifth();
		aobj.Meth2();
		System.out.println(99);
	}
	public static void main(String[] args){
		System.out.println("Start");
		Fifth aobj=new Fifth();
		aobj.Meth3();
		System.out.println("End");
	}
}