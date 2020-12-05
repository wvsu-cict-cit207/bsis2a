/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern2;

/**
 *
 * @author Asus
 */
public class Pattern2 {

    /**
     * @param n
     */
   
         public static void pattern2(int n) 
    { 
        int i, j;  
        for(i=0; i<n; i++)  
        {
        for(j=0; j<=0; j++)  
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
        pattern2(n); 
    } 
}
    
    

