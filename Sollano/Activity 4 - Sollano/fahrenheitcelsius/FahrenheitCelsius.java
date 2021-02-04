package fahrenheitcelsius;
import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args)	
	{
	    double far,cel;
             	    Scanner input=new Scanner(System.in);
            System.out.println("What type of conversion?"
                    + " \n 1.Celsius to Fahrenheit  "
                    + "\n 2.Fahrenheit to Celsius");
                   int num=input.nextInt();
	    switch(num)
	    {
	    case 1:  System.out.println("Enter the Celsius temperature");
                  cel=input.nextDouble();
	    	  far=((9*cel)/5)+32;
	    	  System.out.println("Fahrenheit temperature is = "+far);
		  break;
	    case 2:  System.out.println("Enter the Fahrenheit temperature");
                  far=input.nextDouble();
	    	  cel=(far-32)*5/9;
	    	  System.out.println("Celsius temperature is = "+cel);
		  break;
	    
	   default:  System.out.println("Try again choosing valid choices");
	   }  
	} 
}