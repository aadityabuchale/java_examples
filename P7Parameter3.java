public class P7Parameter3{

	void Meth1(int a,int b){
		System.out.println(a+b);
		System.out.println(b);
	}
	void Meth2(int a,String s){
		System.out.println(s);
		new P7Parameter3().Meth3(10);
		System.out.println(a*2);
	}
	void Meth3(int c){
		System.out.println(c/2);
		new P7Parameter3().Meth1(99,1);
		System.out.println(c);
	}
	public static void main(String[] args){
		new P7Parameter3().Meth2(10,"Hi");
	}
}