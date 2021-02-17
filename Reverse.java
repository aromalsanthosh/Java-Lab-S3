import java.util.Scanner;

class ReverseNumber {
	public int reverseNum(int num) {
		int org,rev=0,rem;
		org=num;
		while (org!=0) {
			rem=org%10;
			rev=(rev*10)+rem;
			org/=10;
		}
		return rev;
		
	}
	
}

class CheckPalindrome extends ReverseNumber{
	public void checkPalindrome(int num,int reverse) {
		if(num==reverse) {
			System.out.println("Number is Palindrome");
		}
		else{
			System.out.println("Number is Not Palindrome");
		} 
	}
}

public class Reverse{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CheckPalindrome ob =new CheckPalindrome();
		System.out.println("Enter a number :");
		int num =sc.nextInt();
		int reverse= ob.reverseNum(num);
		System.out.println("Reversed Number : "+reverse);
		ob.checkPalindrome(num, reverse);
	}
}
