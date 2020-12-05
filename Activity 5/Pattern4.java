/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern4;

/**
 *
 * @author Asus
 */
public class Pattern4 {

    /**
     * @param args
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
                System.out.print("*");
            }
            for(int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}