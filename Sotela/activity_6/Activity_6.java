
package activity_6;
import java.util.Scanner;
public class Activity_6 {

    public static void main(String[] args) {
       int max,min;
       System.out.print("enter 10 elements: "+"\n");
       Scanner ni = new Scanner(System.in);
       int n = 10;
      int array[]= new int[n];
      
      for (int i = 0; i<n;i++)
      {
          array[i]=ni.nextInt();
      }
       max = array[0];
       
       for (int j=0;j<n;j++)
       {
           if (max<array[j])
           {
               max = array[j];
           }
       }
       min = array[0];
       for(int e = 0;e<n;e++)
       {
          if(array[e]<min)
           {
               min = array[e];
           }
       }
       
       System.out.println("Maximum value is: "+max);
        System.out.println("Minimum value is: "+min);
      
    }
    
}
