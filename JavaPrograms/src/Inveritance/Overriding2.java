package Inveritance;

class Parent2
{
	int a=10, b=20;
	public int Test1(int x, int y) {
		System.out.println("Test1");
		return x+y;
	}
	public int Test2(int z, int g) {
		System.out.println("Test2");
		return z-g;
	}
	
}

public class Overriding2 extends Parent2 {
	public int Test1(int x, int y) {
		System.out.println("addition= "+(a+b));
		return x+y;
	}
	public int Test2(int z, int g) {
		System.out.println("sub= "+(a-b));
		return z-g;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding2 obj = new Overriding2();
//		System.out.println("a= "+ obj.a);
//		System.out.println("b= "+ obj.b);
		obj.Test1(10, 20);
		obj.Test2(20, 30);
	}

}