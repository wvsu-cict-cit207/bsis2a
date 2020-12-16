
package arrayinput;
import java.util.Scanner;
public class Arrayinput {

    public static void main(String[] args) {
        int large,small;
       System.out.print("Enter no. of array: ");
       Scanner ni = new Scanner(System.in);
       int size = ni.nextInt();
       int array[]= new int[size];
       System.out.print("enter "+size+" integers: "+"\n");
       
       for ( int i=0;i<size;i++)
       {
           array[i]=ni.nextInt();
       }
       large = array[0];
       
       for (int j=0;j<size;j++)
       {
           if (large<array[j])
           {
               large = array[j];
           }
       }
       small = array[0];
       for(int e=1;e<size;e++)
       {
           if(array[e]<small)
           {
               small = array[e];
           }
       }
       
        System.out.print("Largest element: "+large);
        System.out.print("\nSmallest: "+small);
    }
    
}
