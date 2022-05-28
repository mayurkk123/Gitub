package Interface;
interface F4
{
	public void Test1();
	public void Test2();
}

public class InterfaceWithImplement6 implements F4 
{
	
    public void Test1(){
    	System.out.println("Test1");
    }
 	public void Test2(){
    	System.out.println("Test2");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceWithImplement6 obj = new InterfaceWithImplement6();
		obj.Test1();
		obj.Test2();
	}
	/////op////
//	Test1
//	Test2


}
