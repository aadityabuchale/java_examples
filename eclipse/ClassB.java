// 10-11-2022 Practice Question WAP1

package practice;

public class ClassB {
	
	ClassB(){
		System.out.println("I Love Programming");
	}
	ClassB(String name){
		System.out.println("I Love\s"+ name);
	}
	public static void main(String[] args) {
		ClassB aobj= new ClassB();
		ClassB bobj=new ClassB("Java");
	}
}
