package Abstraction;

abstract class Abs5// abs class
   {
	public Abs5()// constructor
	{
		System.out.println("Default Con Abs5");
	}
	
	abstract public int addition(int a, int y); // abs method
	abstract public int sub(int a, int y);
}
public class AbsAnnonymusWithDefaultCon3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("start");
		Abs5 obj=new Abs5() //anonymous class
		{
			public int addition(int a,int y) {
				return a+y;
				
			}
			public int sub(int a,int y) {
				return a-y;
				
			}
		};
		System.out.println("sum="+obj.addition(10, 1));
		System.out.println("sub="+obj.sub(13, 7));
	}
//	start
//	Default Con Abs5
//	sum=11
//	sub=6

}

