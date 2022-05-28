package Interface;

interface F1{
	public void Test1();
	public int addition(int a, int b);
	public int sub(int a, int b);
}
public class Ex3AnnanomousWithIZnterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//F1 obj = new F1();// error ala karan obj nahi banawu shakat so we will 
		// do by annanomous class by following steps..
		F1 obj = new F1()
		{
			public void Test1(){
				System.out.println("Test1");
			}
			public int addition(int a, int b) {
				return a +b;
			}
			public int sub(int a, int b) {
				return a-b;
			}
		};// annamynous class
		
		obj.Test1();
		System.out.println(obj.addition(10, 90));
		System.out.println(obj.sub(10, 90));

	}

}
