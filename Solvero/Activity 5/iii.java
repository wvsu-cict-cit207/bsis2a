/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lefttriangle;

/**
 *Looping Pattern 3
 * @author Dee Marie Solvero
 */
public class iii {
    public static void leftTriangle(int n){
     for(int i = 0; i < n; i++){
        for(int j=2*(n-i); j>=0;j--){
           System.out.print(" ");
        }
        for(int k = 0; k <= i; k++){
           System.out.print("* ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
       int n = 5;
       leftTriangle(n);
    }
    
}

