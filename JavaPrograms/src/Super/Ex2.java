package Super;
class A1 
{
	public A1(int a) {
	//super();    // Dila nahi tari chalato kiva dila tari chalasto karan 
		// default hidden keyword ahe.
		
	System.out.println("A1 Default con");}
	}
class B1 extends A1
{
	public B1(float a) {
	super((int)a);
	System.out.println("B1 Default con");}
	}
class C1 extends B1
{
	public C1() {
	super(10.44f);
	System.out.println("C Default con");}
	}

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		//C1 obj= new C1(99);
        System.out.println("End");
	}
	
	//if user writes only parameterized constructor in class then java won't write default con
////////////op///////////
//	Start
//	A Default con
//	B Default con
//	C Default con
//	End

}
