package Inveritance;

class Parent1
{
	int a=10, b=20;
	public void Test1() {
		System.out.println("Test1");
	}
	public void Test2() {
		System.out.println("Test2");
	}
	
}

public class Ex1 extends Parent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1 obj = new Ex1();
		System.out.println("a= "+ obj.a);
		System.out.println("b= "+ obj.b);
		obj.Test1();
		obj.Test2();
	}

}
