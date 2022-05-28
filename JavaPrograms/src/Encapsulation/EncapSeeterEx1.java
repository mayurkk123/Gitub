package Encapsulation;

class Encap5{
	    private int a=10,b=20;
	   public int getA()//Getter Method
	   {
		return a;
	        
	   }
	   public int getB()//Getter Method
	   {
		return b;      
	   }
	   public void setA(int x)// Setter Method 
	   {
		  a=x;
	   }
	   public void setB(int y)// Setter Method
        {
			  b=y;
		   }
	   
	}
	public class EncapSeeterEx1{
	   public static void main(String[]args){
	        System.out.println("** Program starts **");
	        Encap5 obj=new Encap5();
	        
	        System.out.println("Bedfore update : ");
	        System.out.println("a="+ obj.getA());
	        System.out.println("b="+ obj.getB());
	        obj.setA(50);
	        obj.setB(800000);
	        
	        System.out.println("Aftere update : ");
	        System.out.println("a="+ obj.getA());
	        System.out.println("b="+ obj.getB());
	        
	        System.out.println("** Program Ends **");
	}
	}
//	** Program starts **
//	Bedfore update : 
//	a=10
//	b=20
//	Aftere update : 
//	a=50
//	b=800000
//	** Program Ends **
