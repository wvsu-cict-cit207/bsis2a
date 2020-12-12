/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestandsmallestvalues;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class LargestAndSmallestValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Enter the size of the Array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("\nEnter " + n + " Integers: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 0; i < n; i++)
        {
            if (arr[i] > largest)
            {
                largest = arr[i];
            }
            if (arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }
        System.out.println(" The Largest element in an array is: " + largest);
        System.out.println("the Smallest element in an array is: " + smallest);
    }
} 