/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optionscelfah;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class OptionsCelFah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Options");
        System.out.println("1. Celcius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celcius");

        System.out.print("Enter option: ");
        int value = Integer.parseInt(scanner.nextLine());

        switch (value) {
            case 1:
                System.out.print("Enter number to convert:");
                float num = Float.parseFloat(scanner.nextLine());
                float convert = (num * 9/5) + 32;
                System.out.print(num + " degree celcius = " + convert + "degree fahrenheit");
                break;

            case 2:
                System.out.print("Enter number to convert:");
                float num1 = Float.parseFloat(scanner.nextLine());
                float convert1 = (num1 - 32) * 5/9;
                System.out.print(num1 + " degree fahrenheit = " + convert1 + "degree celcius");
                break;

            default:
                System.out.print("CANNOT CONVERT");
                break;
        }
    }
    
}
