import java.util.*;

public class PowerTwo {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=in.nextInt();

        System.out.println("2 ^ "+n+" = "+(Math.pow(2, n)));
        System.out.println("\nTable of 2^"+n+" is....");

        for(int i=1;i<=n;i++)
        {
            System.out.println("2^"+i+" = "+(Math.pow(2, i)));
        }
    }
}
