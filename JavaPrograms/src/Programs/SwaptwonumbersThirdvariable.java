package Programs;

public class SwaptwonumbersThirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwaptwonumbersThirdvariable obj = new SwaptwonumbersThirdvariable();
		obj.method();
       
	}
	public void method() {
		
		String s ="mmheshbabu";
		int length = s.length();
		
		System.out.println(length);
		char[] ch = s.toCharArray();
		
		for(int i=0; i<length;i++)
		{
			for(int j=i+1;j<length;j++) {
				
				if(ch[i] == ch[j]) {
					System.out.println("Duplecate char are" +  ch[j]);
					
				}
				
			}
		}
	}

}
////////////////////////////////output///////////////////
    //a=20
    //b=10
