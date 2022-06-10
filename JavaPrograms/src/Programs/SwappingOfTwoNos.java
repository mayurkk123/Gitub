package Programs;

public class SwappingOfTwoNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b= 20;
		
		System.out.println(a);
		System.out.println(b);
		
		int c = a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		
		a=a+b;
		b= a-b;
	}

}
