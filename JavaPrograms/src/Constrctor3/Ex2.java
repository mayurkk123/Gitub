package Constrctor3;
// Default with parameterized constructore example....
public class Ex2 {
	int a;
	
	public Ex2()// By default hidden constructor.
	{
		
		System.out.println("default constructor");
	}
	public Ex2(int a)
	{
		this.a= a;
		System.out.println("parameterized constructor");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2 obj = new Ex2();//Default constructor calling
		System.out.println("obj.a="+ obj.a);
		
		Ex2 obj1 = new Ex2(50);//paremetrized constructor calling
		System.out.println("Parameterized obj1.a="+ obj1.a);
		
		Ex2 obj2 = new Ex2(100);//Paramerized constructor calling
		System.out.println("obj2.a="+ obj2.a);
		
		Ex2 obj3 = new Ex2();//Default constructor calling
		System.out.println("obj3.a="+ obj3.a);
	}
//	default constructor
//	obj.a=0
//	parameterized constructor
//	Parameterized obj1.a=50
//	parameterized constructor
//	obj2.a=100
//	default constructor
//	obj3.a=0

	

}
