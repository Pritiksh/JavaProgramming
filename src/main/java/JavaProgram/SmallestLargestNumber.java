package JavaProgram;

public class SmallestLargestNumber {

	public static void main(String[] args) {
		//Without 3rd variable
		String a = "Hello";
		String b = "World";
		//1 append a and b
		a=a+b;
		//2 Store initial string a in String b
		b = a.substring(0,a.length()-b.length());
		//Store initial string b in string a
		a = a.substring(b.length());
		System.out.println(a);
		System.out.println(b);

	}

}
