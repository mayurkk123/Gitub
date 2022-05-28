package Interface;

public interface Ex1 // here abstract keyword is hidden........
                     // constructor is not present in interface...
                     // We can't create obj of interface
                     // But We can create annamynous function 

{
	public void test1();// abstract method
	public void test2();
	public default int addition(int a, int b)
	{
		return a+b;
		
	}
	
	public static int sub(int a, int b) {
		return a-b;
	}
	abstract public int addtion(int a, int b);
	// hi line la normal public class madhe lihilyavar error yeto ahe
	// pan interface madhe error yenar nahi...

}

