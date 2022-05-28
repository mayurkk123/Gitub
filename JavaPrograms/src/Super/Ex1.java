package Super;
class A extends Object
{
	public A() {
	//super();    // Dila nahi tari chalato kiva dila tari chalasto karan 
		// default hidden keyword ahe.
	System.out.println("A Default con");}
	}
class B extends A
{
	public B() {
	//super();
	System.out.println("B Default con");}
	}
class C extends B
{
	public C() {
	//super();
	System.out.println("C Default con");}
	}

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
        C obj= new C();
        System.out.println("End");
	}
////////////op///////////
//	Start
//	A Default con
//	B Default con
//	C Default con
//	End

}
