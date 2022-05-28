 package Encapsulation;

class Encap6{
	    private int a,b;
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
		  this.a=x;
	   }
	   public void setB(int b)// Setter Method
        {
			  this.b=b;
		   }
	   
	}
	public class EncapSeeterEx2{
	   public static void main(String[]args){
	        System.out.println("** Program starts **");
	        Encap6 obj=new Encap6();
	        
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
//	   ** Program starts **
//	   Bedfore update : 
//	   a=0
//	   b=0
//	   Aftere update : 
//	   a=50
//	   b=800000
//	   ** Program Ends **

	}