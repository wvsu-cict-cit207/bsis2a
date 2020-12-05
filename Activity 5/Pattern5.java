/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern5;

/**
 *
 * @author Asus
 */
public class Pattern5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  for(int i=0; i<5; i++)
        {
            for(int j=4; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++)
            {
                System.out.print(i+1);
            }
            for(int j=0; j<i; j++)
            {
                System.out.print(i+1);
            }
            System.out.print("\n");
        }
    }  
}