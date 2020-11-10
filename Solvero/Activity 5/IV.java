/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramid;

/**
 *LOOPING PATTERN 4
 * @author Dee Marie Solvero
 */
public class IV {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args)
    {
        for(int i=0; i<5; i++)
        {
            for(int j=4; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++)
            {
                System.out.print("*");
            }
            for(int l=0; l<i; l++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

