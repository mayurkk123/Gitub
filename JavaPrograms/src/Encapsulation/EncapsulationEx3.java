package Encapsulation;

class Encap3{
	    private int a=10,b=20;
	   public void test1(){
	        System.out.println("Test1");
	        System.out.println("a="+a);
	   }
	   public void test2(){
	        System.out.println("Test2");
	        System.out.println("b="+b);
	   }
	}
	public class EncapsulationEx3{
	   public static void main(String[]args){
	        System.out.println("** Program starts **");
	        Encap3 obj=new Encap3();
	 System.out.println("a="+obj.a);// ERROR
	        obj.test1();
	        obj.test2();
	        System.out.println("** Program Ends **");
	}
	}