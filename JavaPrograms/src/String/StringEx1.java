package String;

public class StringEx1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = new String("Pune");
		String str2 = "Pune";
		
		String str3 = new String("Pune");
		String str4= "Pune";
		
		System.out.println("str1 == str2 : "+(str1 == str2));
		System.out.println("str1.equals(str2) : "+(str1.equals(str2)));
		
		System.out.println("str1 == str3 : "+(str1 == str3));
		System.out.println("str1.equals(str3) : "+(str1.equals(str3)));
		
		System.out.println("str2 == str4 : "+(str2 == str4));
		System.out.println("str2.equals(str4) : "+(str2.equals(str4)));
		
//		str1 == str2 : false
//				str1.equals(str2) : true
//				str1 == str3 : false// here data and type is same but memory adress is different when new keyword
//				str1.equals(str3) : true
//				str2 == str4 : true
//				str2.equals(str4) : true

		

	}

}
