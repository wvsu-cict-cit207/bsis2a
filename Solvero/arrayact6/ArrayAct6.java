/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayact6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dee Marie Solvero
 */
public class ArrayAct6 {

    /**
     * @param args the command line arguments
     */
   public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++)
        {
            System.out.print("Please enter an integer number " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        
        System.out.println("\nThe minimum value of the array is : " + array[0]);
        System.out.println("The maximum value of the array is: " + array[array.length-1]);
    }
}
