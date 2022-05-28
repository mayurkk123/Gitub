package Constrctor3;
// Default with parameterized constructore example....
public class Paracon4 {
	int a;
	
	public Paracon4()// By default hidden constructor.
	{
		
		System.out.println("default constructor");
	}
	public Paracon4(boolean flag, double d)
	{
		this('a',5.5f);
		System.out.println("parameterized constructor boolean double");
	}
	public Paracon4(int a) {
		this();
		System.out.println("parameterized constructor int");
	}
	public Paracon4(char ch, float f) {
	this((int)f);
	System.out.println("parameterized constructor char, float");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		Paracon4 obj = new Paracon4(true, 3.5);//para constructor calling
		System.out.println("end");
		
		
	

}
}