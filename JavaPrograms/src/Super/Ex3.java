package Super;
class A3 // class
{
	public A3() {
	//super();    // Dila nahi tari chalato kiva dila tari chalasto karan 
		// default hidden keyword ahe.
		
	System.out.println("A3 Default con");}
	
	public A3(int a) {
		this();
		System.out.println("A3 para con int");
		
	}
	
	public A3(char ch, float b) {
		this((int)b);// expliciltely 
		System.out.println("A3 para con-char, float");
	}
	
}


class B3 extends A3
{
	public B3() {
	super('r', 44.77f);
	System.out.println("B3 Default con");}
	
	public B3(short s) {
	this();
	System.out.println("B3 para con- short");
	
	}
	
	public B3(boolean flag) {
		this((short)10);
		System.out.println("B3 para con-boolean");
	}
}


class C3 extends B3
{
	public C3() {
	super(true);
	System.out.println("C3 Default con");}
	
	public C3(byte b) {
		this();
		System.out.println("C3 paracon- byte");
	}
	
	public C3(char ch, int b) {
		this((byte)50);
		System.out.println("C3 paracon-char,byte");
	}
}



public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		C3 obj= new C3('m',10);
        System.out.println("End");
	}
	
	
////////////op///////////
//	Start
//	A3 Default con
//	A3 para con int
//	A3 para con-char, float
//	B3 Default con
//	B3 para con- short
//	B3 para con-boolean
//	C3 Default con
//	C3 paracon- byte
//	C3 paracon-char,byte
//	End


}
