package Programs;

public class DuplecateCharacterinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplecateCharacterinaString obj = new DuplecateCharacterinaString();
		obj.method();
       
	}
	public void method() {
		
		int a = 10, b=20;
		
		a= a + b;
		b= a-b;
		a= a-b;
		System.out.println("a="+a);
		System.out.println("b=" +b);
		
	}

}
////////////////////////////////output///////////////////
    //a=20
    //b=10
