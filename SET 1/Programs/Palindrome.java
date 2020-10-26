import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner for taking inputs from the keyboard
        System.out.println("Enter a Number : ");
        int n=0,rem=0,org=0,rev=0;
        n = sc.nextInt();
        sc.close();
        org=n;
        while(n!=0)
        {
            rem=n%10;
            rev=(rev*10)+rem;
            n/=10;
        }
        if(org==rev)
            System.out.println(org+" is Palindrome");
        else
            System.out.println(org+" is Not Palindrome");
    

    }
}
