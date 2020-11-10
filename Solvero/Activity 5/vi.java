/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidpatternnumber6;

/**
 *Looping Pattern 6
 * @author Dee Marie Solvero
 */
public class vi {

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
            for(int k=0; k<i; k++)
            {
                System.out.print(i-k);
            }
            for(int l=0; l<i-1; l++)
            {
                System.out.print(2+l);
            }
            System.out.print("\n");
        }
    }
    
}
