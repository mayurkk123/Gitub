package Programs;

import java.util.Arrays;

public class SecondHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondHighestNumber obj = new SecondHighestNumber();
		obj.method();
       
	}
	public void method() {
		int array[]= {1,20,5,6,16,10};
		Arrays.sort(array);//
		
		System.out.println(array[array.length -2]);
		System.out.println(array[array.length-1]);
	}

}
