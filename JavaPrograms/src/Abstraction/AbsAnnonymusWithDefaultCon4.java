package Abstraction;

abstract class mmk// abs class
{
	public mmk()// constructor
	{
		System.out.println("Default Con Abs5");
	}
	
	abstract public void addition(); // abs method
	abstract public int sub(int a, int y);
}
public class AbsAnnonymusWithDefaultCon4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("start");
		mmk obj=new mmk() //anonymous class
		{
			public void addition() {
				System.out.println("m");
				
			}
			public int sub(int a,int y) {
				return a-y;
				
			}
		};
		//System.out.println("sum="+obj.addition());
		//System.out.println("sub="+obj.sub(13, 7));
		obj.addition();
	}
//	start
//	Default Con Abs5
//	m

}