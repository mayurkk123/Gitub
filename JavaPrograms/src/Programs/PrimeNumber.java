package Programs;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber obj = new PrimeNumber();
		obj.method();
       
	}
	public void method() {
		
		int a = 13;
		int c = 0;
		
		for(int i=1; i<=a; i++) {
			
			if(a%i==0) {
				c++;
			}
		}
		
		if(c==2) {
			System.out.println("right");
		}
		
		else {
			System.out.println("wrong");
		}
//////////////////////////output///////////////////
           //a=20
           //b=10
		
	}

}
