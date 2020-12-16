/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity2;

import java.util.Scanner;

/**
 *
 * @author Dee Marie Solvero
 */
public class Operations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
               
        int sum,diff,times, divide, remainder;
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        
        sum = num + num1;
        diff = num - num1;
        times = num * num1;
        divide = num/num1;
        remainder = num % num1;
        
        System.out.println("Addition");
        System.out.println(num + " + " + num1 + " = " + sum);
        System.out.println("Subtraction");
        System.out.println(num + " - " + num1 + " = " + diff);
        System.out.println("Multiplication");
        System.out.println(num + " * " + num1 + " = " + times);
        System.out.println("Division");
        System.out.println(num + " / " + num1 + " = " + divide);
        System.out.println("Remainder");
        System.out.println(num + " % " + num1 + " = " + remainder);
        
        
        
        
    }
    
}
