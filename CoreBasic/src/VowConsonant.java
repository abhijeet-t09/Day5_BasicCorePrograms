import java.util.Scanner;

public class VowConsonant {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Alphabet ::");
        char ch=in.next().charAt(0);

        if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U'){
            System.out.println(ch+" is a Vowel");
        }
        else {
            System.out.println(ch + " is a Consonant");
        }
    }
}
