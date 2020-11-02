
package ftocpart2;
import java.util.Scanner;
public class Ftocpart2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ey = new Scanner(System.in);
        System.out.print("1. c->f ");
         System.out.print("\n2. f->c:  \n");
        int num;
        num = ey.nextInt();
        
        switch (num){
           case 1: System.out.print("c->f");
               break;
           case 2: System.out.print("f->c");
               break;
       }
        if(num==1)
        {
            
            double fahrenheit,celsius;
            System.out.print("\nenter your temp in celsius: ");
            celsius = ey.nextFloat();
            fahrenheit= ((celsius*9)/5)+32;
            System.out.println("\n"+celsius+" degress celcius = "+fahrenheit+" degrees Fahrenheit");
        }
        else if(num==2)
        {
            
            double fahrenheit,celsius;
            System.out.print("\nenter your temp in fahrenheit: ");
            fahrenheit=ey.nextFloat();
            celsius = ((fahrenheit-32)*0.5556);
            System.out.println("\n"+fahrenheit+" degress Fahrenheit = "+celsius+" degrees Celsius");
        }
    }
    
}
