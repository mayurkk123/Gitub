package Constrctor3;
// Default with parameterized constructore example....
public class ParaCon3 {
	int a;
	
	public ParaCon3()// By default hidden constructor.
	{
		
		System.out.println("default constructor");
	}
	public ParaCon3(int a)
	{
		
	    this();
	    this.a=a;
		System.out.println("parameterized constructor");
		//this(); // pn this lineit will show an error because this() must be first
		//staztement of constructor
		
	}
	public ParaCon3(float f) {
		this((int )f);
		System.out.println("para con float");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program start");
		ParaCon3 obj = new ParaCon3(77);//Default constructor calling
		System.out.println(obj.a);
		System.out.println("program end");
		
//		program start
//		default constructor // this(); mule call zlay default con
//		parameterized constructor
//		77
//		program end

	

}
}
