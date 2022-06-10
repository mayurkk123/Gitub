package Programs;

public class ReversFirstfourstring {
	
	static int s = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "mayur";
		String rev ="";
		int len = str.length();
		System.out.println(str.charAt(4));
		System.out.println(len);
		for(int i=len-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		}
	
	
	public void test() {
		int x = ReversFirstfourstring.s;
		int y = s;
		
		ReversFirstfourstring obj = new ReversFirstfourstring();
		int z = obj.s;  
		Integer obj1 = Integer.valueOf(x);
	}
	
	}



