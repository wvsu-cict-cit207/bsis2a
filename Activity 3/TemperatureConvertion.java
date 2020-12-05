/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconvertion;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TemperatureConvertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float celcius;
        float fahrenheit;
        
        System.out.print("Enter the temperature(Celcius): ");
        celcius = input.nextInt();
        
        fahrenheit = (celcius * 9/5) + 32;
        
        System.out.print("Teamperature in fahrenheit is: " + fahrenheit);
        System.out.println();
    }
    
}
