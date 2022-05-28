package Interface;

// interface 1
interface F5
{
	public void Test1();
}

// interface 2
interface F5a
{
	public void Test2();
}



// class 1
class Parent2
{
	public void Test3() {
		System.out.println("Test 3");}
}



// public class
public class InterfaceWithExtend7 extends Parent2 implements  F5,F5a
{
	public void Test1(){
    	System.out.println("Test1");}
 	public void Test2(){
    	System.out.println("Test2");}
	
	
 	
 	
 	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceWithExtend7 obj = new InterfaceWithExtend7();
		obj.Test1();
		obj.Test2();
	}
	/////op////
//	Test1
//	Test2


}
