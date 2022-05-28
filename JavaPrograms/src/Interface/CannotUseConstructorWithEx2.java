package Interface;

public interface CannotUseConstructorWithEx2 

{
	public void test1();// abstract method
	public void test2();
	public CannotUseConstructorWithEx2() 
	{
		//Error has come because can't use constructor in interface....
	}
	