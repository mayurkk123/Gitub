package Encapsulation;

class encap1{
private int a;
private void test() {
	System.out.println("test1");
	System.out.println("a="+a);
	
}
}
public class Encapsulation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("programme start");
	encap1 obj = new encap1();
	System.out.println("a="+obj.a);
	obj.test();
	System.out.println("programme endf");	
		
		
			
		

	}

}
