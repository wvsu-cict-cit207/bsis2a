package activity3;

import java.util.Scanner;

public class Activity3 {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double celsius;
    double fahrenheit;
    
    System.out.print("Enter temperature in Celsius: ");
    
    celsius = input.nextDouble();
    
    fahrenheit = (celsius * 9 / 5) + 32;
    
    System.out.println();
    System.out.println("Results: ");
    
    System.out.print(celsius + "°C = " + fahrenheit + "°F");
    
    System.out.println();
    System.out.println();
    }
    
}
