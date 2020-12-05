/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern6;

/**
 *
 * @author Asus
 */
public class Pattern6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        for(int i=1; i<=5; i++)
        {
            for(int j=5; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int j=0; j<i; j++)
            {
                System.out.print(i-j);
            }
            for(int j=0; j<i-1; j++)
            {
                System.out.print(2+j);
            }
            System.out.print("\n");
        }
    }
}
