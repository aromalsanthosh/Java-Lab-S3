import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner for taking inputs from the keyboard
        System.out.println("Enter a Number : ");
        int num=0,rem=0,org=0,result=0;
        num = sc.nextInt();
        sc.close();
        org=num;
        while(org!=0)
        {
            rem=org%10;
            result+=(rem*rem*rem);
            org/=10;
        }
        if(num==result)
            System.out.println(num+" is Armstrong Number");
        else
            System.out.println(num+" is Not Amstrong Number");
    

    }
}
