package actsix;
import java.util.*;

public class ActSix {

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Print the ten(10) integers\n");
        for (int i=0;i<array.length;i++)
        {
            System.out.print("Enter the integer number"+(i+1)+":");
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("\nThe minimum value of array:"+array[0]);
        System.out.println("Them maximum value of array is:"+array[array.length-1]);
    }
}