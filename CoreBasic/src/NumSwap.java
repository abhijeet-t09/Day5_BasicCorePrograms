import java.util.Scanner;

public class NumSwap {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=in.nextInt();

        System.out.println("Enter second number: ");
        int num2=in.nextInt();

        int temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("Values after swap :: ");
        System.out.println("Num1="+num1);
        System.out.println("Num2="+num2);

    }
}
