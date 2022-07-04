import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Dividend:");
        int dividend=in.nextInt();

        System.out.println("Enter the Divisor:");
        int divisor=in.nextInt();

        float quotient=(dividend/divisor);
        float remainder=(dividend%divisor);

        System.out.println("The Quotient is = "+quotient);
        System.out.println("The Remainder is = "+remainder);
    }
}
