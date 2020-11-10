package operators;
import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int num1;
        int sum, diff, multi, div, rmndr;
        
        System.out.print("Please enter number: ");
        num = input.nextInt();
        System.out.print("Please enter number: ");
        num1 = input.nextInt();
        
        sum = num + num1;
        diff = num - num1;
        multi = num * num1;
        div = num / num1;
        rmndr = num % num1;
        
        System.out.println(num + " + " + num1 + " = " + sum);
        System.out.println(num + " - " + num1 + " = " + diff);
        System.out.println(num + " * " + num1 + " = " + multi);
        System.out.println(num + " / " + num1 + " = " + div);
        System.out.println(num + " % " + num1 + " = " + rmndr);
    }
    
}
