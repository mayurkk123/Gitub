package Programs;

public class ReversFirstfourstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "mayur vishal";
		String rev ="";
		int len = str.length();
		System.out.println(str.charAt(4));
		System.out.println(len);
		for(int i=len-8; i>=0;i--) {
			rev = rev + str.charAt(i);
			
		}
		System.out.println(rev);
		}

	}


