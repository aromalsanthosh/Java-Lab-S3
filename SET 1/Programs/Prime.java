import java.util.*;

public class Prime {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //Scanner for taking inputs from the keyboard
    System.out.println("Enter a Number: ");
    int num,flag=0;
    num = sc.nextInt();
    sc.close();
 
    for(int i=2; i<=num/2; i++)
    {
        if (num%i==0) 
        {
            flag=1;
            break;
        }
    }

    if(flag==0)
        System.out.println(num +" is a Prime Number");
    else
        System.out.println(num +" is not a Prime Number ");

}
}
