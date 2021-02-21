import java.util.*;
public class sum {

		public sum(int n){
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
		
		public sum(int a,int b){
			int sum2=(a*a)+(b*b);
			System.out.println("the sum of square of two numbers is"+sum2);
}
public static void main(String[] args){
	sum a=new sum(54);
	sum b=new sum(3,4);
}
}