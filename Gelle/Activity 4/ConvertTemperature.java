/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttemperature;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ConvertTemperature {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
        
            System.out.println("_ _ TEMPERATURE CONVERTER _ _\n");
            System.out.println("Options:");
            System.out.println("1 - Celsius to Fahrenheit");
            System.out.println("2 - Fahrenheit to Celsius");
            System.out.print("\nEnter Choice: ");
            
            //variables
            int ConTemp = Integer.parseInt(input.nextLine());
            double celsius, fahrenheit;
        
        switch(ConTemp){
            
            case 1:
                System.out.print("Please Enter Value in  Celsius (Â°C): ");
                celsius = Double.parseDouble(input.nextLine());
                fahrenheit = (((9*celsius)/5) + 32);
                System.out.println(celsius + " Â°C = " + fahrenheit + " Â°F");
                break;
                
            case 2:
                System.out.print("Please Enter Value in Fahrenheit (Â°F): ");
                fahrenheit = Double.parseDouble(input.nextLine());
                celsius = (((fahrenheit - 32)*5)/9);
                System.out.println(fahrenheit + " Â°F = "+ celsius + " Â°C");
                break;
                
            default:
                System.out.println("Invalid Input");
        }

    }
    
}
    

