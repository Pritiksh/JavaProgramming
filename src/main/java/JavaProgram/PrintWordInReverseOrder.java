package JavaProgram;

public class PrintWordInReverseOrder {

	public static void main(String[] args) {
		String str = "My name is Priti";
        String spl[] = str.split(" ");
        System.out.println(spl.length-1);
        for(int i= spl.length-1;i>=0;i--){
            System.out.print(spl[i]+" ");
            System.out.println();
        }
        System.out.println("******Print Reverese each word****");
        //String str = "My name is Priti";
        //String spl[] = str.split(" ");
        for (int i = 0; i < spl.length; i++) {
            StringBuilder sb = new StringBuilder(spl[i]);
            System.out.print(sb.reverse() + " ");

        }

	}

}
