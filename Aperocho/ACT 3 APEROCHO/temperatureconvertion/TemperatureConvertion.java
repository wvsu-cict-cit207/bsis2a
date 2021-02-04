package temperatureconvertion;
import java.util.Scanner;

public class TemperatureConvertion {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float temperature;
        float fahrenheit;
        
        System.out.print("Enter temperature: ");
        temperature = input.nextInt();
        
        fahrenheit = (temp * 9/5) + 32;
        
        System.out.print("Temperature in fahrenheit is: " + fahrenheit); 
    }
    
}
