/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package declaringandprintingvariables;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class DeclaringAndPrintingVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = 10;
        char letter = 'a';
        boolean result = true;
        String str = "hello";
        
        System.out.println("Number = " + num);
        System.out.println("letter = " + letter);
        System.out.println("result = " + result);
        System.out.println("str = " + str);          
        
    }
    
}
