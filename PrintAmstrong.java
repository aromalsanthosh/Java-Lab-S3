//Java Program to Print Amstrong Numbers upto N
import java.util.Scanner;

class PrintAmstrong{

	
	PrintAmstrong(int maxNumber){
		
		System.out.println("List of the Amstrong number between 1 - " + maxNumber);
 
        for (int num = 001; num <= maxNumber; num++){
        int rem=0,org=0,result=0;
    
        org=num;
        while(org!=0)
        {
            rem=org%10;
            result+=(rem*rem*rem);
            org/=10;
        }
        if(num==result)
            System.out.print(num+"  ");
        }
    }

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter value Of N upto which Amstrong numbers are to be printed :");
		num = sc.nextInt();
		new PrintAmstrong(num);
	}
}