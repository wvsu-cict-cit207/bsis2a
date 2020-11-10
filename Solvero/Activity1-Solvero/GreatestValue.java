/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greatestvalue;

import java.util.Scanner;

/**
 *
 * @author Dee Marie Solvero
 */
public class GreatestValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      
        int highestValue, temporary;
        int num1 = 10, num2 = 23, num3 = 5;
       

          
        temporary = num1>num2?(num1):(num2);
        highestValue = num3>temporary ?(num3):(temporary);
        
        System.out.print("Number 1:" + num1 + "\n");
        System.out.print("Number 2:" + num2 + "\n");
        System.out.print("Number 3:" + num3 + "\n");
        System.out.print("The highest number is = " + highestValue);
    }
    
}
  