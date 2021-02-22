/*Java program to find sum of squares of two numbers and sum of squares of digit in
a number using consructor overloading*/
import java.util.*;
public class SquareSum {

		public SquareSum(int n){
			int count=0;
			int num=n;
			while(n!=0){
				n/=10;
				count++;
			}
				
			int rem=0;
			int sum1=0;
			System.out.println(count);
			for(int i=0;i<=	count;i++){
				rem=num%10;
				sum1+=rem*rem;
				num/=10;
		
	           }
	           System.out.println("the sum of square of number is"+sum1);
		}
		
		public SquareSum(int a,int b){
			int sum2=(a*a)+(b*b);
			System.out.println("the sum of square of two numbers is"+sum2);
}
public static void main(String[] args){
	sum a=new SquareSum(54);
	sum b=new SquareSum(3,4);
}
}
