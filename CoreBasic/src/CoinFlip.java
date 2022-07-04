import java.util.*;
public class CoinFlip {
    public static void main(String[] args) {

        int heads=0,tails=0;
        float percentH, percentT;

        Random in = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of times the coin is to be tossed :: ");
        int flip=sc.nextInt();

        for (int i=0; i < flip; i++) {
            double random = Math.random();
            if (random < 0.5)
                tails++;
            else
                heads++;
        }

        percentH = (heads / (float) flip) * 100;
        percentT = (tails / (float) flip) * 100;
        System.out.println("Percentage of heads: " +percentH+ "%");
        System.out.println("Percentage of tails: " +percentT+ "%");
    }
}
