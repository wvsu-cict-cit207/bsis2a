/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farenheit.celsiusviceversa;

import java.util.Scanner;

/**
 *
 * @author Dee Marie Solvero
 */
public class FarenheitCelsiusViceVersa {

     /**
     * @param args
     */
    public static void main(String[] args)	
	{
	    double farenheit,celsius;
             	    Scanner input=new Scanner(System.in);
	    System.out.println("What type of conversion? \n 1.Celsius to Fahrenheit  \n 2.Fahrenheit to Celsius");
                   int num=input.nextInt();
	    switch(num)
	    {
	    case 1:  System.out.println("Enter the Celsius temperature");
                  celsius=input.nextDouble();
	    	  farenheit=((9*celsius)/5)+32;
	    	  System.out.println("Fahrenheit temperature is = "+farenheit);
		  break;
            case 2:  System.out.println("Enter the Fahrenheit temperature");
                  farenheit=input.nextDouble();
	    	  celsius=(farenheit-32)*5/9;
	    	  System.out.println("Celsius temperature is = "+celsius);
		  break;
	    
	   default:  System.out.println("Try again to choose valid choice");
	   }  
	} 
}