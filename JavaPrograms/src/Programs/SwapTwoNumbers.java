package Programs;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapTwoNumbers obj = new SwapTwoNumbers();
		obj.method();
       
	}
	public void method() {
		
		int a = 10, b=20, t;
		
		t=a;
        a=b;
        b=t;
		System.out.println("a="+a);
		System.out.println("b=" +b);
		
//////////////////////////output///////////////////
           //a=20
           //b=10
		
	}

}
