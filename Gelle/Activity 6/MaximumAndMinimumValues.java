/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximumandminimumvalues;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MaximumAndMinimumValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        //Receiving Input
        System.out.println("* * PRINT 10 INTEGERS * *\n");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("Please Enter Integer Number " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        //Output
        System.out.println("\nMinimum Value of the Array is : " + array[0]);
        System.out.println("Maximum Value of the Array is: " + array[array.length-1]);
    }
}


