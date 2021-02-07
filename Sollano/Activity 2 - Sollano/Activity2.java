package activity2;

import java.util.Scanner;

public class Activity2 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int firstnum;
        int secondnum;
        
        System.out.print("Enter your first number: ");
        firstnum = input.nextInt();
        
        System.out.print("Enter your second number: ");
        secondnum = input.nextInt();
        
        System.out.print("Results: " + "\n" + "Sum: " + (firstnum + secondnum) + "\n Product: " + (firstnum * secondnum) + "\n Difference: " 
        + (firstnum - secondnum) + "\n Quotient: " + (firstnum / secondnum) + "\n Remainder: " + (firstnum % secondnum));
    }
    
}
