/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v;

/**
 *
 * @author asus
 */
public class V {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i; j<n;j++)
                System.out.print(" ");
                for(int k=1;k<(i*2);k++)
                    System.out.print(i);
               System.out.println();
    }
       
    }
    
}
