class Four{
	void M1(){
	System.out.println("10");
	Four aobj=new Four();	
	aobj.M2();
	
	}
	void M2(){
	System.out.println("20");
	
	}
	
	void M3(){
	System.out.println("40");
	Four cobj=new Four();
	cobj.M1();
	}
	public static void main(String args[])
	{
		Four f=new Four();
		f.M3();
	}
}