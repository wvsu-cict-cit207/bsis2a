import java.util.Scanner;
public class Act9_No2 {
    public static void main(String[] args) {
        System.out.print("Enter an input: ");
        Scanner s = new Scanner(System.in);
        int digit = s.nextInt();

        System.out.print("Enter the radix: ");
        int radix = s.nextInt();

        char c1 = Character.forDigit(digit,radix);
        System.out.println("The char representation of " + digit + " in radix " + radix + " is " + c1);

    }
}
