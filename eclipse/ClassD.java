// 10-11-2022 Practice Program 
package practice;

public class ClassD {
	int a=10;
	public String testmethod() {
		new ClassD(100,200,"java");
		System.out.println(40);
		return new ClassD().testmethod3(new ClassD(50).testmethod2())+new ClassD().testmethod4();
	}
	ClassD(){
		System.out.println("hi");
	}
	public int testmethod2() {
		System.out.println(50);
		return 10+15;
	}
	ClassD(int a){
		System.out.println("Java is Awesome");
	}
	public String testmethod3(int a) {
		System.out.println(18);
		return "is";
	}
	ClassD(int a,int b,String s){
		System.out.println(a+b);
		System.out.println(s);
	}
	public String testmethod4() {
		System.out.println(88);
		return"good";
	}
	public static void main(String[] args) {
		ClassD t1=new ClassD();
		t1.a=10;
		ClassD t2=new ClassD();
		t2.a=30;
		System.out.println("Java "+t1.testmethod()+" "+(t1.a+t2.a-30));
	}
}
