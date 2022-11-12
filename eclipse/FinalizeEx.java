package basicprograms;

public class FinalizeEx {
	
	void meth1() {
		System.out.println("Method1() Called");
	}
	protected void finalize() {
		System.out.println("Finalize Method() Called");
	}
	public static void main(String[] args) {
		FinalizeEx aobj= new FinalizeEx();
		FinalizeEx bobj=new FinalizeEx();
		//aobj.meth1();
		
		System.gc();
		
	}
}
