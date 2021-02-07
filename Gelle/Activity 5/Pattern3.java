/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern3;

/**
 *
 * @author Asus
 */
public class Pattern3 {

    /**
     * @param n
     */
 public static void pattern3(int n) 
    { 
        int i, j;  
        for(i=0; i<n; i++)  
        {
        for(j=2*(n-i); j>=0; j--)  
            {           
                System.out.print(" "); 
            } 
            for(j=0; j<=i; j++) 
            {       
                System.out.print("* "); 
            }           
            System.out.println();
        } 
    } 
    public static void main(String args[]) 
    { 
        int n = 5; 
        pattern3(n); 
    } 
}
