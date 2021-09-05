package JavaProgram;

public class ReverseOfString {
	//Using for loop
	public static void main(String[] args) {
		String str ="Priti Keshari";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		
		System.out.println("*******StringBuffer******");
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}
	
}
