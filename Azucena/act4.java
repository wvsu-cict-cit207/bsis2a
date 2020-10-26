package activity;
import java.util.Scanner;

public class act4 {

  public static void main(String[] args) {
   Scanner get= new Scanner(System.in);
   System.out.println(" enter 1 for c->f \n enter 2 for f->c");
   
   int num;
   num= get.nextInt();
   
   
   switch (num){
     case 1: System.out.println("c->f");
     break;
     
    case 2: System.out.println("f->c");
    break;
   }
   if (num==1){
     double fahrenheit,celcius;
     System.out.println("enter your temperature in celcius");
     celcius=get.nextFloat();
     fahrenheit=((celcius*9)/5)+32;
     System.out.println("\n "+celcius+" degree in celcius= "+fahrenheit+" degrees fahrenheit");
      
   }else if(num==2);
   {
     double fahrenheit,celcius;
     System.out.println(" enter your temperature in fahreheit:");
     fahrenheit=get.nextFloat();
     celcius=((fahrenheit-32)*0.5556);
     System.out.println("\n "+fahrenheit+" degree in celcius = "+celcius+" degree in fahrenheit");
   }
   
  }
}
