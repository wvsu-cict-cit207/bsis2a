package temperatureconvertion;
import java.util.Scanner;

public class TemperatureConvertion {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float temp;
        float fheit;
        
        System.out.print("Enter temperature: ");
        temp = input.nextInt();
        
        fheit = (temp * 9/5) + 32;
        
        System.out.print("Temperature in fahrenheit is: " + fheit); 
    }
    
}
