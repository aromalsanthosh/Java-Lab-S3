//Java Program to Print Prime Numbers upto N
import java.util.Scanner;

class PrintPrime{

	
	PrintPrime(int maxNumber){
		
		System.out.println("List of the prime number between 1 - " + maxNumber);
 
        for (int num = 2; num <= maxNumber; num++)
        {
            boolean isPrime = true;
            for (int i=2; i <= num/2; i++)
            {
                if ( num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
 
            if ( isPrime == true )
                System.out.println(num);
        }
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter value Of N upto which prime numbers are to be printed :");
		num = sc.nextInt();
		new PrintPrime(num);
	}
}
