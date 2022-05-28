package Encapsulation;

class encap2{
private int a=10, b=20;
private int addition(int x, int y) {
	return x+y;
}

protected void test() {
	System.out.println("test 1");
	System.out.println("a"+ a);
	System.out.println("b"+ b);
	System.out.println("sum ="+ addition(a,b));
}
//addition(a,b)= it will print addition of both value.
}
public class EncapsulationEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("programme start");
	encap2 obj = new encap2();
	//System.out.println("a="+obj.a);
	obj.test();
	System.out.println("programme endf");	

	}

}
