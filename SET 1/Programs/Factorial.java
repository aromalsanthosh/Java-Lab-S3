import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner for taking inputs from the keyboard
        System.out.println("Enter a value for N: ");
        int n,fact=1;
        n = sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++)
        {
            fact*=i;
            System.out.println("Factorial Of "+i+" is "+fact);
        }

    }
}
