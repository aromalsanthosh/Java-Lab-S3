/* Java Program with
  i) parent class having method named Fibanocci which displays Fibanocci series upto a given limit 
  ii) child class having method named check to check whether the largest number of series id\s divisible by 3  */

import java.util.Scanner;

class FibanocciSeries{
	public int Fibanocci(int limit) {
		int large=0;
		int first=0,second=1,third;
		for (int i = 1; first <=limit; i++) {
					
			large=first;
			System.out.print(first+" ");
			third=first+second;
			first=second;
			second=third;
			
		}
		System.out.printf("\n");
		
		return large;
	}
}

class CheckDivisibility extends FibanocciSeries{
	public void Check(int num) {
		if (num%3==0) {
			System.out.println(num+" is divisible by 3");
		}
		else {
			System.out.println(num+" is not divisible by 3");
		}
		
	}
	
}
public class Fibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CheckDivisibility ob = new CheckDivisibility();
		int large=0;
		System.out.print("Enter Limit Upto Which Fibanocci Series is to be printed : ");
		int num= sc.nextInt();

		
		large=ob.Fibanocci(num);
		System.out.println("Largest no in this fibanocci series: "+large);
		ob.Check(large);
	}
	

}
