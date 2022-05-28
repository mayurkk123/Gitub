package IfElse;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program start");
		int a=-150;
		if(a<40 && a>=0)// first condition is true &&
		{
			System.out.println("a<40 && a>=0 Fail");
		}
//		op
//		-Program start
		if(a>=0 && a<40) // first con is false &&
		{
			System.out.println("a>=0 && a<40 Fail");
		}
//		Program start
		
			
		if(a<40 & a>=0)// first con tru single & 
		{
			System.out.println("a<40 & a>=0 Fail");
		}
		//-Program start
		if(a>=0 & a<40)// first con false single & 
		{
			System.out.println("a>=0 & a<40 Fail");
		}
//		Program start
		
		
		if(a<40 || a>=0)// first condition is true ||
		{
			System.out.println("a<40 || a>=0 Fail");
		}
//       a<40 || a>=0 Fail

		if(a>=0 || a<40)// first condition is false ||
		{
			System.out.println("a>=0 || a<40 Fail");
		}
//		a>=0 || a<40 Fail
		
		
		if(a<40 | a>=0)// first con tru single | 
		{
			System.out.println("a<40 | a>=0 Fail");
		}
//		a<40 | a>=0 Fail
		if(a>=0 | a<40)// first con false single | 
		{
			System.out.println("a>=0 | a<40 Fail");
		}
//		a>=0 | a<40 Fail
}
}
