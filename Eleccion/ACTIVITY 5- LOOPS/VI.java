/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vi;

/**
 *
 * @author asus
 */
public class VI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n=5;
      for(int i=1; i<=n; i++){
          for(int j=1; j<=(n-i)*2; j++){
              System.out.print(" ");
          }
          for(int a=i; a>=1; a--) {
              System.out.print(" "+a);
          }
          for (int k=2; k<=i; k++){
              System.out.print(" "+k);
             
          }
          System.out.println();
      }
    }
    
}
