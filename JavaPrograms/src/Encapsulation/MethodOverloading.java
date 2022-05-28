package Encapsulation;

public class MethodOverloading {
	//number of parameters
	public void test1() {
		System.out.println("test1");
	}
	
	public void test1(int a ) {
		System.out.println("test 1 - int");
	}
	
	public void test1(int a, int b) {
		System.out.println("test 1 - int, int");
	}
	
	//changing data type
	public void test2(int a, int b) {
		System.out.println("test2 - int, int");
	}
	
	public void test2(float a, float b ) {
		System.out.println("test 2- float, float");
	}
	
	public void test2(char a, boolean b) {
		System.out.println("test 1- char, boolean");
	}
	
	//position of parameters
		public void test3(float a, char b) {
			System.out.println("test3 -float , char");
		}
		
		public void test3(char x, float y ) {
			System.out.println("test 3- char , float");
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//compile time polymorphism
		
		MethodOverloading obj = new MethodOverloading();
		obj.test1();
		obj.test1();
		obj.test1()
			
		

	}

}
