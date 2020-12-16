/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconversion;

import java.util.Scanner;


/**
 *
 * @author Dee Marie Solvero
 */
public class TemperatureConversion {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperature;
        double fahrenheit;
        
        
        System.out.print("Enter the temperature in celcius: ");
        temperature = input.nextDouble();
                
        fahrenheit = (temperature * 9/5) + 32;
        
        System.out.print("Temperature in fahrenheit is: " + fahrenheit );
    }
    
}
