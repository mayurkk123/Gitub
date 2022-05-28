package Encapsulation;

class Encap4{
	    private int a=10,b=20;
	   public int getA()//Getter Method
	   {
		return a;
	        
	   }
	   public int getB()//Getter Method
	   {
		return b;      
	   }
	   public int test1() {
		   return a;
	   }
	}
	public class EncapGetterEx1{
	   public static void main(String[]args){
	        System.out.println("** Program starts **");
	        Encap4 obj=new Encap4();
	        System.out.println("a="+ obj.getA());
	        System.out.println("b="+ obj.getB());
	
	        System.out.println("** Program Ends **");
	}
	}
//	** Program starts **
//	a=10
//	b=20
//	** Program Ends **
