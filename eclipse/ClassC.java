// l10-11-2022 Practice WAP2 Student 
// if no name is passed them Unknown Should Be printed and id if name is passed then that name should be printed 
package practice;

public class ClassC {
	ClassC(){
		System.out.println("Unknown");
	}
	ClassC(String name){
		System.out.println("Student name is\s" +name);
	}
	public static void main(String[] args) {
		ClassC aobj=new ClassC();
		ClassC bobj=new ClassC("Aaditya");
	}
}
