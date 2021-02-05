import java.util.Scanner;

public class  number2{
    public static void main(String[]args){
        System.out.println("Input:");
        Scanner scan = new Scanner(System.in);
        int digit  = scan.nextInt();

        System.out.println("radix::");
        int radix= scan.nextInt();

        System.out.println(Character.forDigit(digit,radix));

    }
}