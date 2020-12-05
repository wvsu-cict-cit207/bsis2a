/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greatestvalue;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class GreatestValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int highestValue, temporary;
        
        System.out.print("number 1 = ");
        int num1 = sc.nextInt();
        System.out.print("number 2 = ");
        int num2 = sc.nextInt();
        System.out.print("number 3 = ");
        int num3 = sc.nextInt();
        
        temporary = num1>num2 ? (num1):(num2);
        highestValue = num3>temporary ? (num3):(temporary);
        
        System.out.print("The highest number is = " + highestValue);
        System.out.println();
        
    }
    
}
