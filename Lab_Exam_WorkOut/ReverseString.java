//Java program with a constructor to Reverse a string
public class ReverseString {
	public ReverseString(String str) {
		char ch[]=str.toCharArray();
		String rev ="";
		
		for (int i = ch.length-1; i >= 0; i--) {
			rev+=ch[i];
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		String name="Aromal";
		new ReverseString(name);
	}
}
