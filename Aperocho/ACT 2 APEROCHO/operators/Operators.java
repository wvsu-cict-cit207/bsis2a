package operators;
import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int sum, diff, multi, div, rmndr;
        
        System.out.print("Please enter number: ");
        num1 = input.nextInt();
        System.out.print("Please enter number: ");
        num2 = input.nextInt();
        
        sum = num1 + num2;
        diff = num1 - num2;
        multi = num1 * num2;
        div = num1 / num2;
        rmndr = num1 % num2;
        
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + diff);
        System.out.println(num1 + " * " + num2 + " = " + multi);
        System.out.println(num1 + " / " + num2 + " = " + div);
        System.out.println(num1 + " % " + num2 + " = " + rmndr);
    }
    
}
