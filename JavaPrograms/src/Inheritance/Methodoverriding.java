package Inheritance;


	
	class child {

		  int addition(int a, int b) {
			return a +b;
		}
		
		public int substraction(int a, int b) {
			return a-b;
		}
	}
		
		public class Methodoverriding extends child{
			protected int addition(int a, int b) {
				
				int res = a + b+ 10;
//				return a+b;
				return res;
				
			}
			public int substraction(int a, int b) {
				return a-b;
			}
			
			
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Methodoverriding obj = new Methodoverriding();
			System.out.println(obj.addition(10, 20));
			obj.addition(10,20);
			obj.substraction(10,20);
		}

		}



	