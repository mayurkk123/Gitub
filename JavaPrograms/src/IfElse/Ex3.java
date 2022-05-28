package IfElse;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=150;
		if(marks<40 && marks>=0){
		    System.out.println("Fail");
		}else if(marks<50 && marks>=40){
		    System.out.println("Pass class");
		}else if(marks<60 && marks>=50){
		    System.out.println("Second class");
		}else if(marks<66 || marks>=60){
		    System.out.println("marks<66 || marks>=60 First class");
		}else if(marks<=100 && marks>=66){
		    System.out.println("Distinction");
		}else{
		    System.out.println("Invalid marks");
		    }
	}
//	marks<66 || marks>=60 First class
}
