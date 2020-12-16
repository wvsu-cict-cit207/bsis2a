/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxminarray;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class MaxMinArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner ton=new Scanner(System.in);
       int array[]=new int[10];
       System.out.println("Enter 10 Numbers: ");
       
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<=9;i++)
       {
         array[i]=ton.nextInt();
         if(array[i]<min)
           {
           min=array[i];
           }
         if(array[i]>max)
         {
           max=array[i];
         }
       }
       System.out.println("Maximum element is "+max);
       System.out.println("Minimum element is "+min);
    }
    
}
